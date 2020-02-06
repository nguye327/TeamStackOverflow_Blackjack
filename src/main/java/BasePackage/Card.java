/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package BasePackage;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author Sivagama
 */
public abstract class Card 
{
    public enum Suit {HEARTS, CLUBS,SPADES,DIAMONDS};
    public enum Value{ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, JACK, QUEEN, KING};
    public int bjValue[] = {11,2,3,4,5,6,7,8,9,10,10,10};
    private final Suit suit;
    private final Value value;
        
    
    public Card(Suit s, Value gVal){
           suit =s;
           value= gVal;
    }


    public Value getValue() {
    return this.value;
    }

    public Suit getSuit() {
    return this.suit;
    }
    
    public int[] getbjValue() {
        return this.bjValue;
    }
    
    @Override
    public abstract String toString();
    
}
