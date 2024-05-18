public class WaterContainer {

    public static void main(String[] args) {
        int[] ex1 = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] ex2 = new int[]{5, 3, 9, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2};

        int maxheight = maxheight_check(ex1);
        System.out.println(maxwidth_check(ex1, maxheight));
        System.out.println(maxwidth_check2(ex1,maxheight));

    }

    private static int maxwidth_check(int[] array, int maxheight) {
        int i = 0;
        int length = array.length - 1;
        int j= i + (length);;
        int width;
        int maxwidth = 0;
        while (i < j) {
            while (j < array.length) {
                // loop until look for every possibility
                width = (length) * (array[j] >= array[i] ? array[i] : array[j]);
                if (width > maxwidth) {
                    maxwidth = width;
                }
                i++;
                j = i + (length);
            }
            i = 0;
            length--;
            j=i+length;
            if (maxwidth >= maxheight * length) {
                return maxwidth;
            }
        }return maxwidth;
    }

    private static int maxwidth_check2(int[] array, int maxheight) {
        int maxwidth = 0;
        for (int length = array.length - 1; length > 0; length--) {
            for (int i = 0; i + length < array.length; i++) {
                int j = i + length;
                int height = Math.min(array[i], array[j]);
                int width = length * height;
                maxwidth = Math.max(maxwidth, width);
                if (maxwidth >= maxheight * length) {
                    return maxwidth;
                }
            }
        }
        return maxwidth;
    }





    private static int maxheight_check(int[] arry) {
        int max = 0;
        int priormax = 0;
        for (int x : arry) {
            if (x >= max) {
                priormax = max;
                max = x;
            }
        }
        return priormax;
    }
}


