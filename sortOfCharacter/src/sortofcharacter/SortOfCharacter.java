package sortofcharacter;

import java.util.Scanner;

public class SortOfCharacter {

    public static void main(String[] args) {
        // if-statement, asks the user to type in an alphabetic character.
        // program determine what character was entered and display an appropriate message.

        Scanner scn = new Scanner(System.in);

        System.out.println("Please type in an alphabetical character (A – Z): ");
        char letter = scn.next().charAt(0);
        letter = Character.toUpperCase(letter);

//        if ('A' == letter || 'E' == letter || 'I' == letter || 'O' == letter || 'U' == letter) {
//            System.out.println("You entered a vowel.");
//        } else if ('A' > letter && 'Z' < letter && 'a' > letter && 'z' < letter && 'M' > letter) {
//            System.out.println("You entered a non-vowel up to 'M'.");
//        } else if('A' > letter && 'Z' < letter && 'a' > letter && 'z' < letter && 'M' < letter){
//            System.out.println("You entered a non-vowel after 'M'.");
//        } else{
//            System.out.println("You did not enter an alphabetical character.");
//        }
        if (!Character.isLetter(letter)) {
            System.out.println("You did not enter an alphabetical character.");
        } else {
            if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
                System.out.println("You entered a vowel.");
            } else if (letter <= 'M') {
                System.out.println("You entered a non-vowel up to 'M'.");
            } else {
                System.out.println("You entered a non-vowel after 'M'.");
            }
        }

    }

}
