
public class Screen{

    private String screenName;

    Seat seats[][] = new Seat[8][];

    Screen(String screenName){

        this.screenName = screenName;
        this();

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
                    
                    seats[i][j] = new Seats(i, j, Type.Regular);
                }

                else if(i >= 2 && i <= 3){

                    seats[i][j] = new Seats(i, j, Type.Premium);

                }
                
                else if(i >= 4 && i <= 5){
                
                    seats[i][j] = new Seats(i, j, Type.Vip);

                }
                
                else{
        
                    seats[i][j] = new Seats(i, j, Type.Recliner);    

                }
                    

            }

        }


    }

    






}
