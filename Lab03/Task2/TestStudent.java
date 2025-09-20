
public class TestStudent{

	public static void main(String[] args){

		Student S1 = new Student();
		Student S2 = new Student("Abdullah",Gender.Male, new Date(1,12,2005), new Address("Ahmad colony", "Faisalabad", "Pakistan"));
		Student S3 = new Student("Laiba",Gender.Female, new Date(22,2,2005),new Address("Guluna colony", "Lahore", "Pakistan"));
		Student S4 = new Student(S2);	//Object copy
		Student S5 = new Student("Abdullah",Gender.Male, new Date(12,5,2006),new Address("Aslam colony", "Multan", "Pakistan"));

		System.out.println(S1);
		System.out.println(S2);
		S2.getDateOfBirth().setDate(10);
		System.out.println("\nStudent 2 updated date: \n");
		System.out.println(S2);
		System.out.println(S3);
		System.out.println(S4);
		System.out.println(S5);

	System.out.println("If student 2 name and Date of Birth is the same as student 4 : " + (S2.equals(S4) && S2.getDateOfBirth().equals(S4.getDateOfBirth())));
	System.out.println("If student 3 name  and Date of Birth is the same as student 4 : " + (S3.equals(S4) && S3.getDateOfBirth().equals(S4.getDateOfBirth())));



}



}