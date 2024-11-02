/**
 * Represents a playing card with a rank and a suit.
 */
public class Card {
    private final String rank; // The rank of the card
    private final String suit; // The suit of the card

    /**
     * Default constructor that initializes an empty Card.
     */
    public Card() {
        this.rank = "";
        this.suit = "";
    }

    /**
     * Parameterized constructor that initializes the card with the given rank and suit.
     *
     * @param rank The rank of the card (e.g., "Ace", "2", "3", ..., "King").
     * @param suit The suit of the card (e.g., "Hearts", "Diamonds", "Clubs", "Spades").
     */
    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    /**
     * Gets the rank of the card.
     *
     * @return The rank of the card.
     */
    public String getRank() {
        return rank;
    }

    /**
     * Gets the suit of the card.
     *
     * @return The suit of the card.
     */
    public String getSuit() {
        return suit;
    }

    /**
     * Returns a string representation of the card in the format "RankSuit".
     *
     * @return A string representing the card.
     */
    @Override
    public String toString() {
        return rank + suit;
    }
}