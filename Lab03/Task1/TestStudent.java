
public class TestStudent{

	public static void main(String[] args){

		Student S1 = new Student();
		Student S2 = new Student("Ali",'M',"4/9/08","House no 3 Street 2 Ahmad Colony, lahore");
		Student S3 = new Student("Laiba",'F',"4/7/08","House no 4 Street 5 Ahmad Colony, lahore");
		Student S4 = new Student(S2);
		Student S5 = new Student("Ali",'M',"4/9/08","House no 3 Street 2 Ahmad Colony, lahore");

		System.out.println(S1);
		System.out.println(S2);
		System.out.println(S4);

	System.out.println("Is Equal to: "+S2.equals(S5));



}



}