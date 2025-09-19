
public class Book{

	private String id;
	private String title;
	private float price;
	static int counter;
		
		public Book(){

			this( null, 0.0f );
			

}
		public Book( String title, float price ){

			this.id = "" + ++counter;
			this.title = (title != null && title.length() >= 3) ? title : " Untitled";
			this.price = (price > 0) ? price : 0.0f;
			//setPrice(price);
}
		public String getTitle(){

			return title;


}

		public float getPrice(){

			return price;


}

		/*public void setPrice( float price ){

			if( price > 0 )this.price = price;
			
}*/
		@Override
		public String toString(){

			return String.format("%nId: %s%nTitle: %s%nPrice: $%,.2f%n", id, title, price );

}
		
	

}