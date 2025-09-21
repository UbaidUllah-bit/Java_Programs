
public class Book{

	private String bookId;
	private String title;
	private Person author;
	private Date publicationDate;
	private String genre;
	static int counter = 101;
	
	Book(){
	
	this(null, new Person(null, Gender.Default, new Address(null, null, null)), new Date(00, 00, 0000), null);
	
		

}

	Book( String title, Person author, Date publicationDate, String genre){

		bookId = String.format("LB25-BK-%3d",counter ++);
		this.title = title;
		this.author = author;
		this.publicationDate = publicationDate;
		this.genre = genre;

}

	Book(Book b){

		bookId = String.format("LB25-BK-%3d",counter ++);
		this.title = b.getTitle();
		this.author = new Person(b.getAuthor());
		this.publicationDate = new Date(b.getPublicationDate());
		this.genre = b.getGenre();

}

	public void setTitle(String title){

		this.title = title;

}

	public void setAuthor(Person author){

		this.author = author;

}

	public void setPublicationDate(Date publicationDate){

		this.publicationDate = publicationDate;


}

	public void setGenre(String genre){

		this.genre = genre;

}

	public String getTitle(){

		return title;

}

	public Person getAuthor(){

		return author;

}

	public Date getPublicationDate(){

		return publicationDate;


}

	public String getGenre(){

		return genre;

}

	@Override
	public String toString(){

		return String.format("%n~~ Book Credentials ~~%n%nBook ID: %s%nTitle: %s%n%s%nPublish Date: %s%nGenre: %s%n", bookId, title, author, publicationDate, genre);


}

	@Override
	public boolean equals(Object o ){

	Book temp = (Book) o;
	return (this.title.equals(temp.getTitle()) && this.author.equals(temp.getAuthor()) && this.publicationDate.equals(temp.getPublicationDate()));

	

}





	
	





}