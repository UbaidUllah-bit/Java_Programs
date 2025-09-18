
public class ProductAttributesUsingToString{

	private String name;
	private float price;

	public ProductAttributesUsingToString( String name, float price ){

		this.name = name;
		this.price = price;

}

@Override
public String toString(){

	return String.format(" Product[name = %s, price = %.2f]",name ,price );


}




}