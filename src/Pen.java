//Composition without parent child relation. without extends
public class Pen {
	private Stationery stationery = new Stationery();
	
	public Pen(String name, int price) {
		stationery.setName(name);
		stationery.setPrice(price);	
	}

	
	public String writePen(){
		return stationery.writeProduct();
		//System.out.println("Product writed!");
	}
}
