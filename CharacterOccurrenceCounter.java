import java.util.Scanner;

public class CharacterOccurrenceCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();
        System.out.println("Enter the character to count:");
        char targetCharacter = scanner.next().charAt(0);


        int occurrenceCount = countOccurrences(inputString, targetCharacter);
        System.out.println("The character '" + targetCharacter + "' occurs " + occurrenceCount + " times in the given string.");
System.out.println("Find The Non Repeting Numner");
System.out.println("Hello You are checking The result");
        scanner.close();
        System.out.println("");
        System.out.println("You are now Checking the result as per as your consern");
    }

    private static int countOccurrences(String str, char targetChar) {
        int count = 0;

        for (char c : str.toCharArray()) {
            if (c == targetChar) {
                count++;
            }
        }

        return count;
    }
}
