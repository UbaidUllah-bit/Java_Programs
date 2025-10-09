public class Cinema{

    private String cinemaName;
    Screen screens[];
    
    Cinema(String cinemaName, int numberOfScreens){

        screens = new Screen[numberOfScreens];
        for(int i = 0; i < screens.length; i++){
    
            screens[i] = new Screen("Screen-"+ (i+1));


        }
        this.cinemaName = cinemaName;

    }

    public String getCinemaName(){

        return cinemaName;

    }

    public void display(){

     System.out.printf("\n--Total Screens in %s--", cinemaName);


        for(Screen s: screens){
    
            
        System.out.println("\n==========================="); 

            System.out.println("\t" + s.getScreenName());
            System.out.println("\n===========================");
            s.display();

        }           

    }

    @Override
    public String toString(){

        StringBuilder str = new StringBuilder();

        str.append(String.format("\n\t\t%s",cinemaName));

        for(Screen s: screens){

            str.append("\n" +s);
        
        } 

        return str.toString();

    }

}
