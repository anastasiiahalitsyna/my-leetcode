import com.sun.xml.internal.bind.v2.model.core.MaybeElement;

public class FindTheClosestNumberToZero {
    public static void main(String[] args) {
         FindTheClosestNumberToZero findTheClosestNumberToZero = new FindTheClosestNumberToZero();
        /// To receive a positive value from negative (modulus, a length) Math.abs()
        // int[] num = { -4,-2,1,4,8};
        // int[] num = {2, -1, -1};
        int[] num = {-100, -100};
        int result = findTheClosestNumberToZero.findClosestNumber(num);
        System.out.println(result);

    }

    public int findClosestNumber(int[] arr) {
        /*int[] copyOfOriginal = num;

        for (int i = 0; i < copyOfOriginal.length; i++) {
            copyOfOriginal[i] = Math.abs(copyOfOriginal[i]);

        }
        int min = 0;

        for (int i = 0; i < copyOfOriginal.length - 1; i++) {
            if (copyOfOriginal[i] <= copyOfOriginal[i + 1]) {
                min = copyOfOriginal[i];
            }
        }


        for (int i = 0; i < num.length; i++) {
            if (Math.abs(num[i]) == min) {

                min = num[i];
                return min;
            }
        }
        return min;*/

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i]) < Math.abs(min)) {
                min = arr[i];
            } else if(Math.abs(arr[i])==Math.abs(min)){
                min=Math.max(min,arr[i]);
            }
        }
        return min;
    }
}
