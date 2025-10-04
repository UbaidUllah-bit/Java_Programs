public class Player{

   private String name;
   private Card[] hand;
   private int initialCapacity;

   Player(String name, int numberOfCards){

        this.name = name;
        this.hand = new Card[numberOfCards];
        this.initialCapacity = 0;
        

    }

    public void addCard(Card c){

        if(initialCapacity < hand.length){
            
            hand[initialCapacity] = c;
            initialCapacity ++;

        }

        else{

            System.out.println("Hand is already full for " + name);

        }

    }

    public Card playCard(){

        if (initialCapacity == 0){

            return null;

        }

        Card cardToPlay = hand[0];

        for(int i = 1; i < initialCapacity; i++){

            hand[i-1] = hand[i];

        }

        hand[initialCapacity - 1] = null;
        initialCapacity--;

        return cardToPlay;

    }

    public String showHand(){

        StringBuilder str = new StringBuilder(name + "'s hand: ");

        for(int i = 0; i < initialCapacity; i++){

            str.append(hand[i]);

            if(i < initialCapacity - 1){

                str.append(", ");

            }
            
            

        }
        
        return str.toString();
        
    }

    public int handSize(){

        return initialCapacity;

    }

    public boolean isOut(){

        return initialCapacity == 0;

    }

    public int calculateScore(){

        int score = 0;

        for(int i = 0; i < initialCapacity; i++){
        
            score += hand[i].getRank().getValue();

        }

        return score;

    }

    public void setName(String name){

        this.name = name;

    }

    public String getName(){

        return name;

    }

    @Override
    
    public String toString(){

        return String.format("Player: %s has %d cards", name, initialCapacity );

    }


    




}
