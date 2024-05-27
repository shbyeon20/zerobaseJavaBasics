package dataStructure.tree;

import java.util.ArrayList;

public class Minheap {
ArrayList<Integer> heap;

    public Minheap() {
        this.heap = new ArrayList<>();
        heap.add(0); // to avoid using zero index
    }

    public void insert (int value ){
        heap.add(value);

        int cur = heap.size()-1;

        while (heap.get(cur) < heap.get(cur/2)&&cur>1){
            int parentval = heap.get(cur/2);

            heap.set(cur/2,heap.get(cur));
            heap.set(cur,parentval);

            cur = cur/2;

        }
    }
    public void printTree(){
        for (int i = 0; i < heap.size(); i++){
            System.out.print(heap.get(i));
            System.out.println();
        }
    }

    public Integer delete(){
        if (heap.size() == 1){
            System.out.println("the tree is empty");
            return null;
        }

        int delete = heap.get(1);
        heap.set(1, heap.get(heap.size()-1));
        heap.set(heap.size()-1, delete);
        int valrtn = heap.remove(heap.size()-1);

        int curidx = 1;
        while (true){
            int leftidx = curidx*2;
            int rightidx = curidx*2+1;
            int targetidx;

            if (rightidx <= heap.size()-1){
                targetidx = heap.get(leftidx)<heap.get(rightidx)?leftidx:rightidx;
            } else if (leftidx <= heap.size()-1) {
                targetidx = curidx*2;
            }else{
                break;
        }

            if (heap.get(curidx) < heap.get(targetidx)){
                break;
            } else if (heap.get(curidx)>heap.get(targetidx)) {
                int parentVal = heap.get(curidx);
                heap.set(curidx, heap.get(targetidx));
                heap.set(targetidx, parentVal);
                curidx = targetidx;
            }


        }
    return valrtn;
    }
}
