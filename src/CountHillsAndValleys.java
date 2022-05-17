public class CountHillsAndValleys {
    public static void main(String[] args) {
        CountHillsAndValleys hillsAndValleys = new CountHillsAndValleys();
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

    public int countHillValley(int[] num) {
        int sum = 0;
        int[] cleanedNums = new int[101];
        int index = 0;
        for (int i = 0; i < num.length; i++) {
            if (index > 0 && cleanedNums[index - 1] == num[i]) {
                continue;
            }
            cleanedNums[index++] = num[i];
        }

        for (int i = 1; i < index - 1; i++) {
            if (cleanedNums[i] > cleanedNums[i - 1] && cleanedNums[i] > cleanedNums[i + 1]) {
                sum++;
            }
            if (cleanedNums[i] < cleanedNums[i - 1] && cleanedNums[i] < cleanedNums[i + 1]){
                sum++;
            }
        }
        return sum;
    }
}
