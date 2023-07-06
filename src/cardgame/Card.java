
package cardgame;

/**
 * Code in progress for teaching purposes, finish by connecting the generator
 * to the CardGame class when teaching
 * @author dancye, 2023
 */
public class Card 
{
   

   public enum Suit
   {
       HEARTS, CLUBS,SPADES, DIAMONDS
   }
   
   public enum Value
   {
       ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING,
		JACL
   }
    private Value value;
    private Suit suit;
    
    public Card(Value v, Suit s)
    {
        value = v;
        suit = s;
    }
    /**
     * @return the value
     */
    public Value getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(Value value) {
        this.value = value;
    }

    /**
     * @return the suit
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(Suit suit) {
        this.suit = suit;
    }
    
}
