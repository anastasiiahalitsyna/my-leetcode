public class RomanToInteger {
    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        String s = "XXIV";
        int myResult = romanToInteger.romanToInt(s);
        System.out.println(myResult);

    }

    public int romanToInt(String s) {
        // I can be placed before V (5) and X (10) to make 4 and 9.
        //X can be placed before L (50) and C (100) to make 40 and 90.
        //C can be placed before D (500) and M (1000) to make 400 and 900.

        char[] romans = s.toCharArray();
        int result = 0;
        for (int i = 0; i < romans.length - 1; i++) {
            final char nextRoman = romans[i + 1];
            final char currentRoman = romans[i];

            if (currentRoman == 'I') {
                if (nextRoman == 'V' || nextRoman == 'X') {
                    result -= 1;
                } else {
                    result += 1;
                }
            } else if (currentRoman == 'X') {
                if (nextRoman == 'L' || nextRoman == 'C') {
                    result -= 10;
                } else {
                    result += 10;
                }
            } else if (currentRoman == 'C') {
                if (nextRoman == 'D' || nextRoman == 'M') {
                    result -= 100;
                } else {
                    result += 100;
                }
            } else {
                result += convertRomanSymbol(currentRoman);
            }
        }

        return result + convertRomanSymbol(romans[romans.length - 1]);
    }

    private int convertRomanSymbol(char roman) {
        switch (roman) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;

            default:
                return 0;

        }
    }
}
