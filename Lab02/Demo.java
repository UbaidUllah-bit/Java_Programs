
// Ubaid Ullah 
// SP25-BCS-134

public class Demo{

	public static void main(String[] args){

		Student student1 = new Student(" Ubaid Ullah", "abc@gmail.com", 3.4f );
		student1.display();

		Student student2 = new Student(" Matti UR Rehman ", "xyz@gmail.com", 3.9f );
		student2.display();
		
		Student student3 = new Student(" Aftab ", "678@gmail.com", 3.7f );
		student3.display();
		
		student1.setName("Batman");
		student1.display();


}



}