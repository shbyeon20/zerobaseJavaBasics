package dataStructure.binarySearch;

public class CutLine {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[] {8593,9617,9313,4513,7505,5457,8257,4689,2657},0,2657,100));

    }

    public static int binarySearch(int[] nums, int lt, int rt, int target) {
        int res = -1;
        while (lt <= rt) {
            int val = 0;
            int val2 = 0;
            int mid = (lt + rt) / 2;
            for (int num : nums) {
                val += (num/mid);
                val2 += (num/(mid+1));
            }
            if (val == target && val2 == target-1){
                return mid;
            }else if (val >= target){
                res = mid;
                lt = mid + 1;
            }else if ( val<target){
                rt = mid - 1;
            }
        }
        return res;
    }
}
