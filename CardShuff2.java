import java.util.Scanner;

//The main class to get the deck and cards.

public class CardShuff2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();

        // fill and display the deck
        deck.fill();
        System.out.println("Original Deck:");
        System.out.println(deck);

        // then shuffle the deck
        deck.shuffle();
        System.out.println("\nShuffled Deck:");
        System.out.println(deck);

        // User input
        System.out.println("\nShuffle again? (Y/N)");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("Y")) {
            deck.shuffle();
            System.out.println("\nRe-shuffling:");
            System.out.println(deck);
        }

        scanner.close();
    }
}
