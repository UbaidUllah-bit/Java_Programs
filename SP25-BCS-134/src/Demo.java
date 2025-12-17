public class Demo{

	public static void main(String[] args){


	Part p1 = new Part(2025, 111, PartType.Regular, PartStatus.In_Service);

	
	System.out.println("Product: " + p1);

	CriticalPart cp1 = new CriticalPart(2024, 222, PartType.Critical, PartStatus.In_Service, 3);
	
	System.out.println(cp1);
	
	Bin bin = new Bin(3, 2, p1);
	System.out.println(bin);

	bin.remove(p1);
	System.out.println(bin.getPart());
	
	Shelf s1 = new Shelf(1,new int[] {3,4,3});
	System.out.println(s1);

	
	





	}




}