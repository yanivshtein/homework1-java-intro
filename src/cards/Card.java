package cards;

public class Card {
    // The card fields: number and suit
    private int num, suit;

    // Constructor to create a card with a specific number and suit
    public Card(int num, int suit) {
        this.num = num;
        this.suit = suit;
    }

    // Getter for the card number
    public int getNum() {
        return this.num;
    }

    // Getter for the card suit
    public int getSuit() {
        return this.suit;
    }

    // String representation of the card
    public String toString() {
        // Convert the suit to a character representation
        switch (this.suit) {
            case 0:
                return getNum() + "C"; // Clubs
            case 1:
                return getNum() + "D"; // Diamonds
            case 2:
                return getNum() + "H"; // Hearts
            case 3:
                return getNum() + "S"; // Spades
            default:
                return "error"; // Error case
        }
    }

    // Compare this card to another card
    public int compareTo(Card other) {
        // If the cards are equal
        if ((other.getNum() == this.getNum()) && (other.getSuit() == this.getSuit()))
            return 0;
        // If this card's number is greater than the other card's number
        if (this.getNum() > other.getNum())
            return 1;
        // If the cards have the same number but this card's suit is greater
        else if ((this.getSuit() > other.getSuit()) && (this.getNum() == other.getNum()))
            return 1;
        // If this card is less than the other card
        else
            return -1;
    }
}
