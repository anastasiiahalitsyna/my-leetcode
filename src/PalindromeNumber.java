public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 121;
        boolean palindromes = isPalindrome(x);
        System.out.println(palindromes);
    }

    static boolean isPalindrome(int x) {
        int r;
        int temp;
        int sum = 0;
        temp = x;
        while (x > 0) {
            r = x % 10;
            sum = (sum * 10) + r;
            x = x / 10;
        }
        return temp == sum;


    }
}
