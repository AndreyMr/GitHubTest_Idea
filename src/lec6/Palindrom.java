package lec6;

public class Palindrom {
    public static void main(String[] args) {
        for (int i = 0; i < 100_000; i++) {
            if (isPalendrom(i, 7) && isPalendrom(i, 17))
                System.out.println("(" + i + ")" + Long.toString(i, 7)+ " "+ Long.toString(i, 17));
            }
        }

    private static boolean isPalendrom(long m, int r) {
        String string;
        string = Long.toString(m, r);
        return isPalendrom(string);
    }

    private static boolean isPalendrom(String string) {
        boolean isPolendrom;
        for (int i = 0; i < string.length() / 2; i++) {
            if (string.charAt(i) != string.charAt(string.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPalendrom2(String string) {


        //int lenght = string.length() / 2;
        char[] charsArray = string.toCharArray();

        for (int i = 0; i < charsArray.length; i++) {
            if (charsArray[i] != charsArray[string.length() - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPalendrom3(String string) {
        return new StringBuilder().reverse().equals(string);


        //StringBuilder sb = new StringBuilder(string);
        //StringBuilder sb = new StringBuilder();
        //b.reverse().equals(string);

    }
}


