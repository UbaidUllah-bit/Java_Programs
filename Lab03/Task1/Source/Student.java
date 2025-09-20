
public class Student{

	private String studentId;
	private String name;
	private char gender = 'N';
	private String dateOfBirth;
	private String address;
	static int counter = 0;

	Student(){
	this.studentId = String.format("SP25-BCS-%03d", ++counter);
	



}

	Student( String name, char gender, String dateOfBirth, String address){

	this.studentId = String.format("SP25-BCS-%03d", ++counter);
	this.name = name;
	this.gender = gender;
	this.dateOfBirth = dateOfBirth;
	this.address = address;


}


	Student( Student s){

	this.studentId = s.getStudentId();
	this.name = s.getName();
	this.gender = s.getGender();
	this.dateOfBirth = s.getDateOfBirth();
	this.address = s.getAddress();

}

	public void setName( String name){

	this.name = name;
	

}


	public void setGender( char gender){

	this.gender = gender;
	

}

	public void setDateOfBirth( String dateOfBirth){

	this.dateOfBirth = dateOfBirth;
	

}

	public void setAddress( String address){

	this.address = address;
	

}

	public String getStudentId(){

	return studentId;


}

	public String getName(){

	return name;


}

	public char getGender(){

	return gender;


}

	public String getDateOfBirth(){

	return dateOfBirth;


}

	public String getAddress(){

	return address;


}

	@Override
	public boolean equals(Object o){

		Student temp = (Student) o;
		return this.name.equals(temp.name);

}
	@Override
	public String toString(){

		return String.format(" [ Student Id: %s Name: %s Gender: %c DOB: %s Address: %s ]",studentId, name, gender, dateOfBirth, address );
}


	




	
	

	
		



}