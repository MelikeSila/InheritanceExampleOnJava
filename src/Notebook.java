//child class
public class Notebook extends Stationery {
	private int sheetsNumber;
	public Notebook(){
		super(); // initialized each value in super class for child.  inherited values in from parent
		sheetsNumber=0; // initialized the value that don't exist in super class
	}
	
	public Notebook(String name, int price, int sheetsNumber){
		this.setName(name);
		this.setPrice(price);
		this.setSheetsNumber(sheetsNumber);
	}
	
	//the following method don't exist in super class
	public void setSheetsNumber(int sheetsNumber){
		this.sheetsNumber = sheetsNumber;
	}
	
	public int getSheetsName(){
		return sheetsNumber;
	}
	
	//we override the writing method in super class
	@Override
	public String writeProduct(){
		//we use get methods in parent to take name and price
		return "Name: " + this.getName() + " \tPrice: " + this.getName() + "\tSheets Number: " + sheetsNumber;
	}
}