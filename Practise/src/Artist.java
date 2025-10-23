public class Artist{

    private String name;
    private String genre;
    private String country;

    Artist(){

        this(null, null, null);  


    }

    Artist(String name, String genre, String country){

        this.name = name;
        this.genre = genre;
        this.country = country;

    }

    public void setName(String name){

        this.name = name;

    }

    public void setGenre(String genre){

        this.genre = genre;

    }

    public void setCountry(String country){

        this.country = country;

    }

    public String getName(){

        return name;

    }

    public String getGenre(){

        return genre;

    }

    public String getCountry(){

        return country;

    }

    @Override
    public String toString(){
   
        return String.format("Name: %s%%nGenre: %s%nCountry: %s%n", name, genre, country);
    
    }

}
