//main class
public class MainClass {
	public static void main(String [] args){
		Stationery stationery = new Stationery("x Notebook", 20);
		Notebook notebook = new Notebook("Y Notebook", 18, 150);
		Pen pen = new Pen("Z Red Pen", 15);
		
		System.out.println("Stationery:\t" + stationery.writeProduct()); //This line wrote by parent class:
		System.out.println("Notebook:\t" + notebook.writeProduct()); //This line wrote by child. override
		System.out.println("Pen:\t\t" + pen.writePen()); //This line wrote thanks of composition
	}
}
