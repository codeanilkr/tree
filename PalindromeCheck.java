import java.util.*;
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Please Enter String:");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Is a palindrome.");
        } else {
            System.out.println(" is not a palindrome.");
        }
        sc.close();
    }

    private static boolean isPalindrome(String str) {
   
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();


        String reversedStr = new StringBuilder(cleanStr).reverse().toString();
        return cleanStr.equals(reversedStr);
    }
}
