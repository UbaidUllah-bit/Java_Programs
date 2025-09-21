
public class Date{

	private int date;
	private int month;
	private int year;
		
	Date(int date, int month, int year){

		this.date = date;
		this.month = month;
		this.year = year;

			
}

	Date(Date d){

		this.date = d.getDate();
		this.month = d.getMonth();
		this.year = d.getYear();

			
}
	public void setDate(int date){

		this.date = date;
		
}

	public void setMonth(int month){

		this.month = month;
		
}

	public void setYear(int year){

		this.year = year;
		
}

	public int getDate(){

		return date;
}

	public int getMonth(){

		return month;
}

	public int getYear(){

		return year;
}

		@Override
		public boolean equals(Object o) {

		Date d = (Date) o;    
    		return (this.getDate() == d.getDate() && this.getMonth() == d.getMonth() && this.getYear() == d.getYear());          // comparing primitive values
}


	
		@Override
		public String toString(){

		return String.format("%2d-%2d-%04d ",date,month,year);
}

		public boolean isBefore(Object o){

		Date temp = (Date) o;

		if(this.year < temp.getYear()){

			return true;
		}
		
		else if(this.year == temp.getYear()){

			if(this.month < temp.getMonth()){

				return true;
			}	

		else if(this.month == temp.getMonth()){
		
			if(this.date < temp.getDate()){
			
				return true;
			}
		}
	}
		
		return false;
}

}


