public class TEST {
    public static void main(String[] args) {
        TEST hillsAndValleys = new TEST();
        int[] nums1 = {2, 4, 1, 1, 6, 5};
        int[] nums2 = {6, 6, 5, 5, 4, 1};
        int[] nums3 = {5, 7, 7, 1, 7};
        int[] num4 = {21, 21, 21, 2, 2, 2, 2, 21, 21, 45};
       int[] num5 = {22, 22, 22, 22, 22, 22, 11, 11, 11, 11, 11, 11, 100, 100, 3};



        int val = hillsAndValleys.countHillValley(nums1);
        int cal = hillsAndValleys.countHillValley(nums2);
        int mal = hillsAndValleys.countHillValley(nums3);
        int ral = hillsAndValleys.countHillValley(num4);
        int lal = hillsAndValleys.countHillValley(num5);

        System.out.println(val + " must be 3");
        System.out.println(cal + " must be 0");
        System.out.println(mal + " must be 2");
        System.out.println(ral + " must be 2");



    }

    public int countHillValley(int[] nums) {

        int sum = 0;

        //  {21, 21, 21,i= 2, 2, 2, 2, 21, 21, 45};
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1] && nums[i + 1] != nums[i + 2]) {
                if ((nums[i] < nums[i + 2]) && (nums[i] < nums[i - 1])) {
                    sum += 1;
                } else if ((nums[i] > nums[i - 1]) && (nums[i] > nums[i + 2])) {
                    sum += 1;
                }

            } else if (nums[i] == nums[i + 1] && nums[i + 1] == nums[i + 2] && nums[i+2]!=nums[i+3]) {
                if (nums[i] < nums[i - 1] && nums[i] < nums[i + 3]) {
                    sum += 1;
                } else if ((nums[i] > nums[i + 3]) && (nums[i] > nums[i -1])) {
                    sum += 1;
                }
            }
            else if (nums[i] == nums[i + 1] && nums[i + 1] == nums[i + 2]
                    && nums[i+2]==nums[i+3] && nums[i+3]!=nums[i+4] ) {
                if (nums[i] < nums[i - 1] && nums[i] < nums[i + 4]) {
                    sum += 1;
                } else if ((nums[i] > nums[i + 4]) && (nums[i] > nums[i -1])) {
                    sum += 1;
                }
            }
        }


        for (int i = 1; i < nums.length - 1; i++) {

            if ((nums[i] > nums[i - 1]) && (nums[i] > nums[i + 1])) {
                sum += 1;

            } else if ((nums[i] < nums[i - 1]) && (nums[i] < nums[i + 1])) {
                sum += 1;

            }

        }


        return sum;


    }
}
