
// Ubaid Ullah 
// SP25-BCS-134

public class Student{

	private String name;
	private String email;
	private float cgpa;

Student(){


	name = "null";
	email = "null";
	cgpa = 0.0f;



}

Student(String newName, String newMail, float newcgpa){


	name = newName;
	email = newMail;
	cgpa = newcgpa;


}

public void setName(String newName){

name = newName;

}

public void setMail(String newMail){

email = newMail;

}

public void setCgpa(float newcgpa){

cgpa = newcgpa;


}

public String getName(){

return name;

}

public String getMail(){

return email;


}

public float getCgpa(){

return cgpa;


}
public void display(){

	System.out.println(" Name: " + name );
	System.out.println("E-mail: " + email);
	System.out.println(" CGPA: " + cgpa);
	
}



}