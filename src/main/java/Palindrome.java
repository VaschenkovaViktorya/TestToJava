import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input string: ");
        String text = in.nextLine();
        System.out.println("this String is palindrome: "+isPalindrome(text));

    }
    public static boolean isPalindrome(String text) {
        return text.equalsIgnoreCase(new StringBuilder(text)
                        .reverse().toString());
    }
}
