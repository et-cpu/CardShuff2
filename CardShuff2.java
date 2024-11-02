import java.util.Scanner;

/**
 * The main driver class to test the Deck and Card classes.
 */
public class CardShuff2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();

        // Fill and display the deck
        deck.fill();
        System.out.println("Original Deck:");
        System.out.println(deck.toString());

        // Shuffle the deck
        deck.shuffle();
        System.out.println("\nShuffled Deck:");
        System.out.println(deck.toString());

        // Example of user input (not specified in original requirements)
        System.out.println("\nWould you like to shuffle the deck again? (yes/no)");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("yes")) {
            deck.shuffle();
            System.out.println("\nDeck after re-shuffling:");
            System.out.println(deck.toString());
        }

        scanner.close();
    }
}
