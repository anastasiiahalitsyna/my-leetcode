import java.util.Arrays;

public class AddMinimumNumberOfRungs {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        int target = 6;
        int[] finalArray = twoSum(nums, target);
        System.out.println(Arrays.toString(finalArray));

    }

    static int[] twoSum(int[] nums, int target) {

        int l = nums.length;
        int[] targetArray = new int[2];


        for (int i = 0; i < l - 1; i++) {
            for (int j = i + 1; j < l; j++) {
                if (nums[i] + nums[j] == target) {
                    targetArray[0] = i;
                    targetArray[1] = j;

                }
            }
        }
        return targetArray;
    }
}
