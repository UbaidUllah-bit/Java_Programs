package game;

public class Player{

    private String name;
    private Card[] hand;
    private int count;
    private int card;

    private int roundWins = 0;

    Player(String name, int initialCapacity){

        this.name=name;
        hand=new Card[initialCapacity];

    }

    public void addCard(Card card){

        if(count < hand.length){

            hand[count]=card;
            count++;

        }


    }

    public boolean isOut(){

        return card >= hand.length?true:false;

    }

    public int handSize(){

        return count;

    }

    public Card playCard(){

        if(card < hand.length && hand[card] != null) {

            Card temp = hand[card];
            hand[card]=null;
            card++;

            return temp;

        }

        return null;


    }

    public String showHand(){

        StringBuilder str =new StringBuilder();
        str.append("Player: "+name+"\n");

        for(int i=0;i < hand.length;i++){

            if(hand[i]!=null){

                str.append(hand[i] + "\n");

            }
            else {
                str.append("------------\n");
            }



        }

        return str.toString();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;

    }

    public int calculateScore(){

        int score=0;
        for(int i=0;i<hand.length;i++){

            if(hand[i]!=null){

                score += hand[i].getRank().getValue();

            }

        }

        return score;

    }

    public void incrementWins(){

        roundWins++;

    }

    public int getRoundWins() {
        return roundWins;
    }


    @Override
    public String toString() {

        return String.format("Player %s (%d cards)", name, handSize());

    }


}