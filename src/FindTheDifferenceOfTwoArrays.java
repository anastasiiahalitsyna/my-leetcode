import java.util.ArrayList;
import java.util.List;

public class FindTheDifferenceOfTwoArrays {
    public static void main(String[] args) {
        FindTheDifferenceOfTwoArrays task = new FindTheDifferenceOfTwoArrays();
        int[] nums1 = {1, 3, 3};
        int[] nums2 = {2, 4, 6};
        List<List<Integer>> result = task.findDifference(nums1, nums2);
        System.out.println(result);

    }

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> nums1List = new ArrayList();
        List<Integer> nums2List = new ArrayList();
        int l1 = nums1.length;
        int l2 = nums2.length;

        for (int i = 0; i < l1; i++) {
            boolean find = false;
            for (int j = 0; j < l2; j++) {
                if (nums1[i] == nums2[j]) {
                    find = true;
                }
            }
            if (!find) {
                if (!nums1List.contains(nums1[i])) {
                    nums1List.add(nums1[i]);
                }
            }
        }

        for (int i = 0; i < l2; i++) {
            boolean find = false;
            for (int j = 0; j < l1; j++) {
                if (nums2[i] == nums1[j]) {
                    find = true;
                }
            }
            if (!find) {
                if (!nums2List.contains(nums2[i])) {
                    nums2List.add(nums2[i]);
                }
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(nums1List);
        result.add(nums2List);
        return result;
    }
}
