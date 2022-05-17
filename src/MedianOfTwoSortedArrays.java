import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
       double result=  findMedianSortedArrays(nums1,nums2);
        System.out.println(result);
    }

    public static int[] sortWithBubble(int[] array) {
        for (int a = 0; a < array.length; a++) {
            for (int b = 0; b < array.length - (a + 1); b++) {
                if (array[b] > array[b + 1]) {
                    int temp = array[b];
                    array[b] = array[b + 1];
                    array[b + 1] = temp;
                }
            }
        }
        return array;
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int[] sumOfNums = new int[l1 + l2];

        for (int i = 0; i < l1; i ++) {
            sumOfNums[i] = nums1[i];
        }

        for (int i = 0; i < l2; i ++) {
            sumOfNums[l1 + i] = nums2[i];
        }

        int[] finalSumOfNum = sortWithBubble(sumOfNums);
        int finalLength = finalSumOfNum.length;

        System.out.println(Arrays.toString(finalSumOfNum));

        if (finalLength % 2 == 0) {
            return finalSumOfNum[finalLength/2]+finalSumOfNum[finalLength/2 + 1];
        } else {
            return finalSumOfNum[(finalLength/2)];
        }
    }
}
