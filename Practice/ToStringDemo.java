
public class ToStringDemo{

	public static void main(String args[]){

		Product p1 = new Product("Laptop", 12_000.5f);
		ProductAttributesUsingToString p2 = new ProductAttributesUsingToString("Phone", 5_000.9f);

//What is happening here?

/*public String toString() {
    return getClass().getName() + "@" + Integer.toHexString(hashCode());
}*/


		System.out.println("\nWithout toString() override: ");
		System.out.println(p1);
		System.out.println(p1.toString());
 

		System.out.println("\nWith toString() override: ");
		System.out.println(p2);	
		System.out.println(p2.toString());

		
}


}