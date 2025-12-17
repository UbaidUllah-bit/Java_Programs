package game;

public class Demo{

	public static void main(String[] args){

        //int count = 0;
        Card card = new Card(Suit.Spades, Rank.Ace);

        Deck deck = new Deck();

        deck.shuffle();

        System.out.println(deck);
        System.out.println(deck.size());
        System.out.println(deck.isEmpty());

        Card[] log = deck.deal(5);

        for(Card c : log){
            System.out.println(c);
        }
        System.out.println(deck);

        Player p1 = new Player("Zafar", 5);

        for(int i = 0; i < log.length; i++){

            p1.addCard(log[i]);

        }

        System.out.println(p1.showHand());
        System.out.println(p1.calculateScore());

        for(int i = 0; i < log.length; i++){

            System.out.println(p1.playCard());

        }


        System.out.println(p1.showHand());
        System.out.println("Player 1 is Out: "+ p1.isOut());
        System.out.println(deck.isEmpty());
        System.out.println(p1);




       /* for(int i = 0; i < 52; i++) {
            System.out.println(deck.draw());
            count++;
        }
        System.out.println(count);
        System.out.println(deck);*/









	}




}