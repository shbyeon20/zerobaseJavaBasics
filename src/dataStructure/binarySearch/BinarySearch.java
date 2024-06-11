package dataStructure.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 10, 20, 30, 40, 50, 60};
        System.out.println(binarySearch(arr, 30));
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearch2(int[] arr, int target, int left, int right) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            }
            if (arr[mid] > target) {
                right = mid - 1;
            }

        }
        return -1;
    }





}




