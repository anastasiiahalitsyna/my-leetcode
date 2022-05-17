import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Intersection2 {
    public static void main(String[] args) {
        Intersection2 intersection = new Intersection2();
        //int[][] num = {{3, 1, 2, 4, 5}, {1, 2, 3, 4}, {3, 4, 5, 6}};
        int[][] num = {{7, 34, 45, 10, 12, 27, 13}, {27, 21, 45, 10, 12, 13}};
//        int[][] num = new int[3][];
//        num[0] = new int[]{1, 2, 4, 3};
//        num[1] = new int[]{1, 2, 3, 4, 9, 0, 8};
//        num[2] = new int[]{1};

        List<Integer> finalList = intersection.intersection(num);

        System.out.println(finalList);

    }

    private List<Integer> intersection(int[][] num) {
        List<Integer> myList = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                myList.add(num[i][j]);
            }
        }
        // 111223334
        Collections.sort(myList);
        if (myList.size() == num.length) {
            return myList;
        }
        int count = 0;

        for (int i = 0; i < myList.size() - 1; i++) {
            boolean equals = myList.get(i).equals(myList.get(i + 1));
            if (equals) {
                count++;
            }
            if (count == num.length - 1) {
                result.add(myList.get(i));
                count = 0;
            }
            if (!equals) {
                count = 0;
            }
        }

        return result;
    }
}
