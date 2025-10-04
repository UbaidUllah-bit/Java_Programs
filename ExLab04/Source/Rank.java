public enum Rank{
    
    Ace("Ace",1), Two("Two",2), Three("Three",3), Four("Four",4), Five("Five",5), Six("Six",6), Seven("Seven",7), Eight("Eight",8), Nine("Nine",9), Ten("Ten",10), Jack("Jack",11), Queen("Queen",12), King("King",13);

    
    private final String symbol;
    private final int value;


    Rank(String symbol, int value){

        this.symbol = symbol;
        this.value = value;

    }

    public String getSymbol(){

        return symbol;

    }

    public int getValue(){

        return value;

    }

     




}
