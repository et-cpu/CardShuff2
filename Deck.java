import java.util.Random;

/**
 * Represents a deck of playing cards.
 */
public class Deck {
    private Card[] cards; // Array to hold the cards in the deck
    private static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};

    /**
     * Default constructor that initializes an empty Deck.
     */
    public Deck() {
        cards = new Card[52]; // Create a deck with 52 cards
    }

    /**
     * Fills the deck with a new set of Card objects.
     */
    public void fill() {
        int index = 0;
        for (String suit : SUITS) {
            for (String rank : RANKS) {
                cards[index++] = new Card(rank, suit);
            }
        }
    }

    /**
     * Shuffles the cards in the deck.
     */
    public void shuffle() {
        Random random = new Random();
        for (int i = 0; i < cards.length; i++) {
            int randomIndex = random.nextInt(cards.length);
            // Swap cards
            Card temp = cards[i];
            cards[i] = cards[randomIndex];
            cards[randomIndex] = temp;
        }
    }

    /**
     * Returns a string representation of the deck, showing all cards.
     *
     * @return A string representing the current order of cards in the deck.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Card card : cards) {
            if (card != null) {
                sb.append(card.toString()).append(" ");
            }
        }
        return sb.toString().trim();
    }
}