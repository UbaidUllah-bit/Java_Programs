public class LibraryTest{

	public static void main(String[] args){

	Book b1 = new Book();
	Book b2 = new Book("Weaveworld", new Person("Clive Barker", Gender.Male, new Address("P.O. Box 691821", "West Hollywood", "USA")), new Date(1, 10, 1987), "Fantasy");
	Book b3 = new Book("The Kite Runner", new Person("Khaled Hosseini", Gender.Male, new Address("5655 Silver Creek Valley Rd", "San Jose", "USA")), new Date(29, 5, 2003), "Historical Fantasy");
	Book b4 = new Book(b3); 
		
	System.out.println(b1);
	System.out.println(b2);
	System.out.println(b3);
	System.out.println(b4);

	System.out.println("If Book 103 is the same as Book 104: " + b3.equals(b4));
	System.out.println("If Book 102 is the same as Book 104: " + b2.equals(b4));

	System.out.println("If Book 103 was published before or on the same day as Book 104: " + (b3.getPublicationDate().isBefore(b4.getPublicationDate()) || b3.getPublicationDate().equals(b4.getPublicationDate())));
	System.out.println("If Book 104 was published before or on the same day as Book 102: " + (b4.getPublicationDate().isBefore(b2.getPublicationDate()) || b4.getPublicationDate().equals(b2.getPublicationDate())));

	
}



}