import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        int[] myArray = {0, 2, 1, 5, 3, 4};
       int [] finalArray=  buildArray(myArray);
        System.out.println(Arrays.toString(finalArray));
    }

    static int[] buildArray(int[] nums) {
        int n= nums.length;
        int [] ans = new int [n];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
