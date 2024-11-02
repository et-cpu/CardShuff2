import java.util.Random;

//define ranks and suits classes
public class Deck {
    private Card[] cards; // Array to hold the cards in the deck
    private static final String[] RANKS = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};

    //creates deck
    public Deck() {
        cards = new Card[52];
    }

    //fills the deck
    public void fill() {
        int index = 0;
        for (String suit : SUITS) {
            for (String rank : RANKS) {
                cards[index++] = new Card(rank, suit);
            }
        }
    }

    //shuffles deck
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

    //returns deck
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