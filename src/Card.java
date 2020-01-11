/**
 * An object of type Card represents a playing card from a
 * standard Poker deck, including Jokers.  The card has a suit, which
 * can be spades, hearts, diamonds, clubs, or joker.  A spade, heart,
 * diamond, or club has one of the 13 values: ace, 2, 3, 4, 5, 6, 7,
 * 8, 9, 10, jack, queen, or king.  Note that "ace" is considered to be
 * the smallest value.  A joker can also have an associated value;
 * this value can be anything and can be used to keep track of several
 * different jokers.
 */

public class Card {

    public final static int TREASURE = 0;   // Codes for the 4 suits, plus Joker.
    public final static int VICTORY = 1;
    public final static int ACTION = 2;

    /** This card's type: Treasure, Victory, Action **/
    private final int type;
    /** The card's value.
     * Treasure cards, assume value is 1
     * Victory cards, assume value is 1
     * Action cards...have an action instead of value
     */
    private final int value;

    /** cost - how much does it cost to buy the card, assume 1 for now **/
    private final int cost;
    /**
     * Creates a Joker, with 1 as the associated value.  (Note that
     * "new Card()" is equivalent to "new Card(1,Card.JOKER)".)
     */
    public Card() {
        type = TREASURE;
        value = 1;
        cost = 1;
    }

    /**
     * Creates a card with a specified suit and value.
     * @param theValue the value of the new card.  For a regular card (non-joker),
     * the value must be in the range 1 through 13, with 1 representing an Ace.
     * You can use the constants Card.ACE, Card.JACK, Card.QUEEN, and Card.KING.
     * For a Joker, the value can be anything.
     * @param theType the siiuit of the new card.  This must be one of the values
     * Card.SPADES, Card.HEARTS, Card.DIAMONDS, Card.CLUBS, or Card.JOKER.
     * @throws IllegalArgumentException if the parameter values are not in the
     * permissible ranges
     */
    public Card(int theValue, int theType) {
        value = theValue;
        type = theType;
        cost = 1;
    }

    public int getType() {
        return type;
    }

    public int getValue() {
        return value;
    }

    /**
     * Returns a String representation of the card's suit.
     * @return one of the strings "Spades", "Hearts", "Diamonds", "Clubs"
     * or "Joker".
     */
    public String getTypeAsString() {
        switch ( type ) {
            case TREASURE:   return "Treasure";
            case VICTORY:   return "Victory";
            case ACTION: return "Action";
            default:       return "Error";
        }
    }

    /**
     * Returns a String representation of the card's value.
     * @return for a regular card, one of the strings "Ace", "2",
     * "3", ..., "10", "Jack", "Queen", or "King".  For a Joker, the
     * string is always numerical.
     */
    public String getValueAsString() {
        switch ( value ) {
            case 1:   return "1";
            case 2:   return "2";
            case 3:   return "3";
            case 4:   return "4";
            case 5:   return "5";
            case 6:   return "6";
            default:  return "Error";
        }
    }

    /**
     * Returns a string representation of this card, including both
     * its suit and its value (except that for a Joker with value 1,
     * the return value is just "Joker").  Sample return values
     * are: "Queen of Hearts", "10 of Diamonds", "Ace of Spades",
     * "Joker", "Joker #2"
     */
    public String toString() {
        return getValueAsString() + " of " + getTypeAsString();
    }
} // end class Card