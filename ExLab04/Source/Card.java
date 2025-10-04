public class Card{

    private final Suit suit;
    private final Rank rank;
    
    Card( Rank rank,Suit suit){

    this.suit = suit;
    this.rank = rank;


    }

    public Suit getSuit(){

    return suit;

    }

    public Rank getRank(){

    return rank;
    
    }

    @Override
    public String toString(){

    return String.format("%s of %s", rank, suit);

    }


}
