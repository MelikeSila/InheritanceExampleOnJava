//Parent class
public class Stationery {

	private String name;
	private int price;
	public Stationery(){
		name = "not defined yet!";
		price = 0;
	}
	
	public Stationery(String name, int price){
		setName(name);//this.name = name;
		setPrice(price);//this.price = price;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setPrice(int price){
		this.price = price;
	}
	
	public String writeProduct(){
		return "Name: " + name + " \tPrice: " + price;
	}
}
