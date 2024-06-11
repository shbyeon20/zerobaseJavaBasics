package dataStructure.binarySearch;

public class LegCnt {
    int n=80;
    int m=220;

    public static void main(String[] args) {
        System.out.println(binarySearch(0,91090,272240,91090));

    }
    public static int binarySearch(int lt, int rt, int target, int total) {
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            int val = 4*mid+2*(total-mid);
            if (target == val) {
                return mid;
            }else if (target > val) {
                lt = mid +1;
            } else if (target < val) {
                rt = mid - 1;
            }
        }
        return -1;
    }
}


