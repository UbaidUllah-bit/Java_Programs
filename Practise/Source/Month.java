public enum Month{

     January(1,"January"),
     February(2,"Februrary"),
     March(3,"March"),
     April(4,"April"),
     May(5,"May"),
     June(6,"June"),
     July(7,"July"),
     August(8,"August"),
     September(9,"September"),
     October(10,"October"),
     November(11,"November"),
     December(12,"December");

    private final int number;
    private final String monthName;

    Month(int number, String monthName){

        this.number = number;
        this.monthName = monthName;
    
    }

    public int getNumber(){

        return number;

    }

    public String getMonthName(){

        return monthName;

    }


}
