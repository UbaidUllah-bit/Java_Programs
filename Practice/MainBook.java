
public class MainBook{

		public static void main( String[] args ){

			Book book1 = new Book();
			Book book2 = new Book("The Chronicles of Narnia", 2500f);
			Book book3 = new Book("Art of war", -50f);
			
			System.out.println(book1);
			System.out.printf("%nBook: %n%s%n%n",book2);
			System.out.println(book3);
			System.out.print(Book.class);
			System.out.println("\nTotal count:" + Book.counter);
}

}