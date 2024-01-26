package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Aman Aman
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        Random random = new Random();

        for (int i = 0; i < hand.length; i++) {
            int value = random.nextInt(13) + 1; // Card values from 1 to 13
            String suit = Card.SUITS[random.nextInt(Card.SUITS.length)]; // Select a suit
            hand[i] = new Card(value, suit); // Assume Card class has a constructor that sets value and suit
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a card value (1-13, where 11 is Jack, 12 is Queen, 13 is King): ");
        int userValue = scanner.nextInt();
        System.out.println("Pick a suit (1 for Hearts, 2 for Diamonds, 3 for Clubs, 4 for Spades): ");
        int userSuitIndex = scanner.nextInt() - 1;
        String userSuit = Card.SUITS[userSuitIndex];

        boolean matchFound = false;
        for (Card card : hand) {
            if (card.getValue() == userValue && card.getSuit().equals(userSuit)) {
                matchFound = true;
                break;
            }
        }

        if (matchFound) {
            printInfo();
        } else {
            System.out.println("Sorry, no match found.");
        }
        
        scanner.close();
    }

    private static void printInfo() {
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Paul, but you can call me prof, Paul or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
        System.out.println();    

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
    }
}

// Remember to define your Card class as well.
