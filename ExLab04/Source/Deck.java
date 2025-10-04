public class Deck{

    Card cards[];

    Deck(){    
        cards = new Card[52];
        Suit suits[] = Suit.values();
        Rank ranks[] = Rank.values();
        int k = 0;

        for(int i = 0; i < suits.length; i++){

            for(int j = 0; j < ranks.length; j++){

                cards[k++]= new Card(ranks[i], suits[j]);


}


}



}

    public void display(){

        for(int i = 0; i < 52; i++){

            System.out.println(cards[i]);

}



}


}
