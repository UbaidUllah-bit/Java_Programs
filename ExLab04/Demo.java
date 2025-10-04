public class Demo{

    public static void main(String args[]){


    //Deck D1 = new Deck();D1.display();
     
    Player player1 = new Player("Ali", 5);

    player1.addCard(new Card(Rank.Ace, Suit.Spades));
    player1.addCard(new Card(Rank.Two, Suit.Diamonds));
    player1.addCard(new Card(Rank.King, Suit.Hearts));
    player1.addCard(new Card(Rank.Queen, Suit.Clubs)); 
    player1.addCard(new Card(Rank.Three, Suit.Hearts));   

    System.out.println(player1);
    System.out.println(player1.showHand());
    System.out.println(player1.playCard());
    System.out.println(player1.playCard());
    System.out.println(player1.playCard());
    System.out.println(player1.playCard());
    System.out.println(player1.playCard());
   
    System.out.println(player1.calculateScore());




    }


}
