package dataStructure;

public class ArraylistImple {

    int[] arr;

    public ArraylistImple(int size) {
        this.arr = new int[size];
    }

    public void insert(int index, int data) {
        if (index < 0 || index > arr.length) {
            System.out.println("index out of bound");
        }
        int[] duplicate = this.arr.clone();
        arr = new int[duplicate.length+1];
        for (int i = 0; i < index; i++) {
            arr[i] = duplicate[i];
        }
        arr[index] = data;

        for (int j = index+1; j < duplicate.length; j++) {
            arr[j] = duplicate[j-1];
        }
    }

    public void remove(int data) {
        int targetindex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data) {
                targetindex = i;
                break;
            }
        }

        if (targetindex == -1) {
            System.out.println("there is no such element");
        }else{
            int[] duplicate = this.arr.clone();
            arr = new int[duplicate.length-1];
            for (int i = 0; i < targetindex; i++) {
                arr[i] = duplicate[i];
            }

            for (int j = targetindex+1; j < duplicate.length; j++) {
                arr[j] = duplicate[j-1];
            }

        }
    }
}
