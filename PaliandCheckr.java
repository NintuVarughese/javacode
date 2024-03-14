import java.util.Scanner;

public class PaliandCheckr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name =scanner.nextLine();
		System.out.println("halo "+ name);
        System.out.println("Enter a String: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }
    }

    private static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s", "").toLowerCase();
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
