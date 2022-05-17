import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Intersection {
    public static void main(String[] args) {
        Intersection intersection = new Intersection();

        int[][] num = new int[3][];
        num[0] = new int[]{1, 2, 4, 3};
        num[1] = new int[]{1, 2, 3, 4, 9, 0, 8};
        num[2] = new int[]{1};

        List<Integer> finalList = intersection.intersection(num);

        System.out.println(finalList);
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + "\t");
            }
            System.out.println();
        }


    }


    public List<Integer> intersection(int[][] nums) {

        List<Integer> myList = new ArrayList<>();
        if (nums.length == 1) {
            return Arrays.stream(nums[0])
                    .boxed()
                    .sorted()
                    .collect(Collectors.toList());
        }

        for (int i = 0; i < nums[0].length; i++) {
            int count = 0;
            for (int j = 1; j < nums.length; j++) {
                int[] targetArray = nums[j];
                boolean found = foundInArray(targetArray, nums[0][i]);
                if (found) {
                    count++;
                }
                if (count == nums.length - 1) {
                    myList.add(nums[0][i]);
                    break;
                }
            }
        }

        Collections.sort(myList);
        return myList;
    }

    private boolean foundInArray(int[] targetArray, int element) {
        Arrays.sort(targetArray);
        int result = Arrays.binarySearch(targetArray, element);
        return result >= 0;
    }


//
//    public List<Integer> intersection(int[][] nums) {
//        //[
//        // [3,1,9,2,4,5], 0th element
//        // [1,9,2,88,4], 1st element
//        // [3,4,5,6]  2nd element
//        //]
//        List<Integer> myList = new ArrayList<>();
//        if (nums.length == 1) {
//            return Arrays.stream(nums[0])
//                    .boxed()
//                    .sorted()
//                    .collect(Collectors.toList());
//        }
//        // for length > 1, {2, 3,...N}
//        for (int k = 0; k < nums[0].length; k++) {
//            int count = 0;
//
//            for (int i = 1; i < nums.length; i++) {
//                for (int j = 0; j < nums[i].length; j++) {
//                    if (nums[0][k] == nums[i][j]) {
//                        count++;
//                    }
//                    if (count == nums.length - 1) {
//                        count = 0;
//                        myList.add(nums[i][j]);
//                        break;
//                    }
//                }
//            }
//
//        }
//
//        Collections.sort(myList);
//        return myList;
//    }
}

