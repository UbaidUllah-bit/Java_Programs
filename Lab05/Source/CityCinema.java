public class CityCinema{

    Cinema cinemas[] = new Cinema[2];
    private String cityName;

    CityCinema(String cityName){

        for(int i = 0; i < cinemas.length; i++){

            cinemas[i] = new Cinema(String.format("--------Cinema %d---------", (i+1)), 2);

        }
        
        this.cityName = cityName;

    }

    @Override
    public String toString(){

        StringBuilder str = new StringBuilder();
        
        str.append("\t\t\t" + cityName);

        for(Cinema cinema : cinemas){

            str.append("\n" + cinema);

        }

        return str.toString();



    }


}
