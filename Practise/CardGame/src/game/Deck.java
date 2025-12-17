package game;

import java.util.Random;

public class Deck {

    private Card[] cards;
    private int cardCount;

    public Deck(){

        int count = 0;
        cards = new Card[52];
        Suit[] suits = Suit.values();
        Rank[] ranks = Rank.values();

        for(int i = 0; i < suits.length; i++){
            for(int j = 0; j < ranks.length; j++){
                cards[count++] = new Card(suits[i], ranks[j]);
            }

        }

    }

    public void shuffle(){

        Random rand = new Random();
        for(int i = 0; i < cards.length; i++){
            int r = rand.nextInt(52);
            Card temp = cards[i];
            cards[i] = cards[r];
            cards[r] = temp;
        }

    }


    public Card draw(){

	if(cardCount < cards.length){

        Card temp = cards[cardCount];
        cards[cardCount] = null;
        cardCount++;

        return temp;
    }

    return null;

    }

    public Card[] deal(int numberOfCards) {

        if (cards != null) {

            Card[] dealCards = new Card[numberOfCards];

            for (int i = 0; i < numberOfCards; i++){

                dealCards[i] = cards[i];
                cards[i] = null;

            }
            return dealCards;

        }

        return null;

    }

    public int size(){

        return cards.length;

    }

    public boolean isEmpty(){

        return cardCount >= cards.length ? true:false;
    }

    @Override
    public String toString() {

        StringBuilder str = new StringBuilder();
        for(int i = 0; i < cards.length; i++){

            str.append(cards[i] + "\n");

        }
        return str.toString();
    }

}