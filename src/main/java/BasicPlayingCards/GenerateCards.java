package BasicPlayingCards;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Minh
 */
public class GenerateCards {
            
    private final int handSize = 52;
	public CardEnum[] cards = new CardEnum[handSize];

	
        /**
         * Add comments during class to explain what this method does.
         */
        public void generateHand()
        {
                int countCards = 0;
		for(CardEnum.Suit s: CardEnum.Suit.values())
                {
                    for(CardEnum.Value v: CardEnum.Value.values())
                    {
                        cards[countCards] = (new CardEnum(s,v));
                        countCards++;
                    }
                }//end outter for
        }//end method
}
