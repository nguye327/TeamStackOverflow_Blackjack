/**
 *
 * @author Minh Nguyen
 */
package BasicPlayingCards;

public class CardEnum {

    public enum Suit {HEARTS, CLUBS,SPADES,DIAMONDS};
    public enum Value{ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING};
    private final Suit suit;
    private final Value value;
        
    
    public CardEnum(Suit s, Value gVal){
           suit =s;
           value= gVal;
    }


    public Value getValue() {
    return this.value;
    }

    public Suit getSuit() {
    return this.suit;
    }
}

       
