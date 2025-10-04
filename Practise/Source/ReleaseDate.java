public class ReleaseDate{

    private int day;
    private Month month;
    private int year;

    ReleaseDate(){

        this(1, Month.Default,2000);



    }

    ReleaseDate(int day, Month month, int year){

        this.day = day;
        this.month = month;
        this.year = year;


    }

    public void setDay(int day){

        this.day = day;

    }

    public void setMonth(Month month){

        this.month = month;

    }

    public void setYear(int year){

        this.year = year;

    }

    public int getDay(){

        return day;

    }

    public Month getMonth(){

        return month;

    }

    public int getYear(){

        return year;

    }

    @Override
    
    public String toString(){

        return String.format("%2d-%s-%4d", day, month, year);

    }

    @Override

    public boolean equals(Object o){

        ReleaseDate temp = (ReleaseDate) o;

        return (this.getDay() == temp.getDay() && this.getMonth() == temp.getMonth() && this.getYear() == temp.getYear());


    }
    
    public boolean isBefore(Object o){

        ReleaseDate temp = (ReleaseDate) o;

        if(this.year < temp.getYear()){
            
            return true;
        
        }
        
        else if(this.year >= temp.getYear()){
        
        }
            
        if(this.month.getNumber() < temp.getMonth().getNumber()){

            return true;
        
        }
            
        else if(this.month.getNumber() >= temp.getMonth().getNumber()){

        }

        if(this.day < temp.getDay()){

            return true;    

                }

        return false;

           
    
    }

}
