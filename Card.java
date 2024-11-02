public class Card {
    private final String rank; // The rank of the card
    private final String suit; // The suit of the card

    //creates card
    public Card() {
        this.rank = "";
        this.suit = "";
    }

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    // gets rank
    public String getRank() {
        return rank;
    }

    // gets suit
    public String getSuit() {
        return suit;
    }

   //print
    public String toString() {
        return rank +" of "+ suit +",";
    }
}