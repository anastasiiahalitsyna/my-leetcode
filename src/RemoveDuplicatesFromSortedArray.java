import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray duplicates = new RemoveDuplicatesFromSortedArray();
        int[] nums = {1, 1, 2, 2, 3, 4, 5, 8};
        int k = duplicates.removeDuplicates(nums);

        System.out.println(k);

        for (int elem : nums) {
            System.out.print(elem + "\t");
        }
    }

    // 1 1 1 2 2 3 - > 1 2 3 .....
    // 1 2 2 2 2 3
    // 1 2 3 3 3 3
    // k = 3
    public int removeDuplicates(int[] nums) {
        int l = nums.length;

        int m = 0;

        loop:
        for (int i = 0; i < l - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                m = m + 1;
                for (int j = i + 1; j < l; j++) {
                    if (nums[i] != nums[j]) {
                        nums[i] = nums[j];
                    }
                }

            } else {
                continue loop;
            }

        }

        Arrays.sort(nums);
        int val = l - m;
        return val;
    }


}




