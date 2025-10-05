
public class Screen{

    private String screenName;

    Seat seats[][] = new Seat[8][];

    Screen(String screenName){

        this();
        this.screenName = screenName;

    }

    Screen(){


        //initializing columns
        for(int i = 0; i < seats.length; i++){

            seats[i] = new Seat[10 + i];

        }   

        //initializing objects
        for(int i = 0; i < seats.length; i++){

            for(int j = 0; j < seats[i].length; j++){

                //conditions for distinction in seats                
                if(i < 2){
                    
                    seats[i][j] = new Seat(i, j, Type.Regular);
                }

                else if(i >= 2 && i <= 3){

                    seats[i][j] = new Seat(i, j, Type.Premium);

                }
                
                else if(i >= 4 && i <= 5){
                
                    seats[i][j] = new Seat(i, j, Type.Vip);

                }
                
                else{
        
                    seats[i][j] = new Seat(i, j, Type.Recliner);    

                }
                    

            }

        }


    }

    public int getTotalRegularSeats(){

        int total = 0;

        for(int i = 0; i < 2; i++){
    
            for(Seat row: seats[i]){

                total++;

            }

        }

    return total;


    }

    public int getTotalPremiumSeats(){

        int total = 0;

        for(int i = 2; i < 4; i++){
    
            for(Seat row: seats[i]){

                total++;

            }

        }

    return total;


    }

    public int getTotalVipSeats(){

        int total = 0;

        for(int i = 4; i < 6; i++){
    
            for(Seat row: seats[i]){

                total++;

            }

        }

    return total;


    }

    public int getTotalReclinerSeats(){

        int total = 0;

        for(int i = 6; i < 8; i++){
    
            for(Seat row: seats[i]){

                total++;

            }

        }

    return total;


    }

     public int getTotalSeats(){

        int total = 0;
        
        for(Seat[] row: seats){

            total += row.length;

        }
        
        return total;        

    }


    @Override
    public String toString(){

        StringBuilder str = new StringBuilder();
        
        str.append("\t\t==================================\n\t\t\t");

        str.append(screenName);
        
        str.append("\n\t\t==================================\n");


            for(Seat[] s: seats){
        
                str.append("\n");
                
                for(Seat a: s){
    
                    str.append("\n\t\t");
                    str.append(a);

                }
            }

        return str.toString();


    }

}
