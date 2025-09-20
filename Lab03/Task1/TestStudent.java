
public class TestStudent{

	public static void main(String[] args){

		Student S1 = new Student();
		Student S2 = new Student("Ali",'M',"5/9/7","House no 3 Street 2 Ahmad Colony, lahore");
		Student S3 = new Student("Laiba",'F',"4/12/08","House no 4 Street 5 Super town, lahore");
		Student S4 = new Student(S2);	//Object copy
		Student S5 = new Student("Ali",'M',"8/11/08","House no 3 Street 2 Aslam Colony, lahore");

		System.out.println(S1);
		System.out.println(S2);
		System.out.println(S3);
		System.out.println(S4);
		System.out.println(S5);

	System.out.println("\nIf student 2 name is the same as student 5 : "+ S2.equals(S5));
	System.out.println("If student 3 name is the same as student 4 : "+ S3.equals(S4));



}



}