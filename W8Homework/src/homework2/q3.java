package homework2;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Alphabet: ");
        String alphabet = sc.nextLine();

        if (alphabet.length() != 1 || !Character.isLetter(alphabet.charAt(0))) {
            System.out.println("Error: Input should be a single letter.");
        } else {
            char ch = Character.toLowerCase(alphabet.charAt(0));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Character is Vowel");
            } else {
                System.out.println("Input letter is Consonante");
            }
        }
    }
}