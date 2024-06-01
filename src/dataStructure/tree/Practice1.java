package dataStructure.tree;

class BinaryTree {
    char[] arr;

    BinaryTree(char[] data) {
        this.arr = arr.clone();
    }

    public void preOrder(int idx){
        System.out.println(this.arr[idx]+" ");

        int left = idx*2+1;
        int right = idx*2+2;
        if(left < this.arr.length){
            preOrder(left);
        }
        if(right < this.arr.length){
            preOrder(right);
        }
    }

    public void inOrder(int idx){

        int left = idx*2 +1;
        int right = idx*2+2;

        if(left < this.arr.length){
            inOrder(left);
        }

        System.out.println(this.arr[idx]+" ");

        if(right < this.arr.length){
            inOrder(right);
        }
    }

}

public class Practice1{
    public static void main(String[] args) {
        char[] arr = new char[10];
        System.out.println(arr);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) ('A' + i);
        }



    }
}
