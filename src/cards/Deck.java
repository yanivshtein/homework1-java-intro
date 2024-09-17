package cards;


public class Deck {
    // The array to store Card objects
    private Card[] cards;
    // The number of cards currently in the deck
    private int num;

    // Constructor to create a deck with a specified number of card ranks
    // Each rank will have 4 suits
    public Deck(int num) {
        int cardNum = 0;
        // Initialize the cards array with size 4 times the number of ranks
        this.cards = new Card[num * 4];
        this.num = num * 4;
        // Populate the deck with cards
        for (int i = 0; i < num; i++) {
            // For each rank, create 4 cards (one for each suit)
            for (int j = 0; j < 4; j++) {
                Card card = new Card(i, j);
                cards[cardNum] = card;
                cardNum++;
            }
        }
    }

    // Constructor to create a deck by taking a specified number of cards from another deck
    public Deck(Deck from, int num) {
        int i = 0;
        this.cards = new Card[num];
        this.num = num;
        // Transfer cards from the given deck until the required number is reached
        while ((from.cards[i] != null) && ((num - i) > 0)) {
            this.cards[i] = from.takeOne();
            i++;
        }
    }

    // Constructor to create a new deck by combining two decks
    public Deck(Deck d1, Deck d2) {
        int i = 0;
        int len1 = d1.getNumCards();
        int len2 = d2.getNumCards();
        // Initialize the cards array with the combined length of the two decks
        this.cards = new Card[len1 + len2];
        this.num = len1 + len2;
        // Alternately take cards from both decks until one is empty
        while ((d1.getNumCards() != 0) && (d2.getNumCards() != 0)) {
            if (i % 2 == 0) {
                this.cards[i] = d1.takeOne();
                i++;
            } else {
                this.cards[i] = d2.takeOne();
                i++;
            }
        }
        // Take remaining cards from d1 if any are left
        while (d1.getNumCards() != 0) {
            this.cards[i] = d1.takeOne();
            i++;
        }
        // Take remaining cards from d2 if any are left
        while (d2.getNumCards() != 0) {
            this.cards[i] = d2.takeOne();
            i++;
        }
    }

    // Get the number of cards currently in the deck
    public int getNumCards() {
        return this.num;
    }

    // Take one card from the top of the deck
    public Card takeOne() {
        Card card = this.cards[this.getNumCards() - 1];
        this.cards[this.getNumCards() - 1] = null;
        this.num = this.num - 1;
        return card;
    }

    // Return a string representation of the deck
    public String toString() {
    	String str = "[";
    	for(int i = 0; i < getNumCards(); i++) {
    		str += cards[i].toString();
    		if(i != (getNumCards() -1) )
    			str += ", ";
    	}
    	str += "]";
        return str;//Arrays.toString(this.cards);
    }

    // Sort the cards in the deck
    public void sort() {
        int length = cards.length;
        // Bubble sort algorithm to sort the cards
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - 1; j++) {
                if (cards[j].compareTo(cards[j + 1]) == 1) {
                    Card temp = cards[j];
                    cards[j] = cards[j + 1];
                    cards[j + 1] = temp;
                }
            }
        }
    }
}
