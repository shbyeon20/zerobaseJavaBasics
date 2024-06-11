package dataStructure.binarySearch;

public class Orangecnt {
    public static void main(String[] args) {
        System.out.println(BinarySearch(1,10000,5500000,10000));


    }

    public static int BinarySearch(int lt, int rt, int target, int n) {
        int res = -1;
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            int val = 700 * mid + 500 * (n - mid);
            if (val == target) {
                return mid;
            } else if (val > target) {
                rt = mid - 1;
            } else if (val < target) {
                res = mid;
                lt = mid + 1;
            }


        }return res;
    }
}
