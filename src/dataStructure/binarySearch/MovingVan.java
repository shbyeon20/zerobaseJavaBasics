package dataStructure.binarySearch;

public class MovingVan {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[] {200, 240, 250,280, 300, 320, 340},244));

    }

    public static int binarySearch(int[] arr, int target) {
        int lt = 0;
        int rt = arr.length - 1;
        int res = -1;
        while (lt<=rt){
            int mid = (lt + rt) / 2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                rt = mid-1;
            }else if(arr[mid]<target){
                lt = mid+1;
                res = lt;

            }
        }


        return res;
    }

    public static int binarySearchLowerbound(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] >= target) {
                right = mid - 1;
                result = right;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            }
        }
        return result;
    }

    public static int binarySearchLowerbound2(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] >= target) {
                result = mid;
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            }
        }
        return result;
    }
}


