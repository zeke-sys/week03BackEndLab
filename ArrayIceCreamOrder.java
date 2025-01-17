package week03;

public class ArrayIceCreamOrder { //class used to instantiate an order, with fields, default constructor, additional constructors, and a describe method
	
	String user;
	String size;
	String cupOrCone;
	String[] flavors = new String[3];
	
	//default constructor
	public ArrayIceCreamOrder() {
		this.user = "";
		this.size = "";
		this.cupOrCone = "";
	}
	
	//additional constructors
	public ArrayIceCreamOrder(String user, String[] flavors) {
		this.user = user;
		this.flavors = flavors;
	}
	
	public ArrayIceCreamOrder(String user, String[] flavors, String size, String cupOrCone) {
		this.user = user;
		this.flavors = flavors;
		this.size = size;
		this.cupOrCone = cupOrCone;
	}
	
	//Getters & Setters
	public String getUser() {
		return this.user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String[] getFlavors() {
		return this.flavors;
	}
	public void setFlavors(String[] flavors) {
		this.flavors = flavors;
	}
	public String getSize() {
		return this.size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getCupOrCone() {
		return this.cupOrCone;
	}
	public void setCupOrCone(String cupOrCone) {
		this.cupOrCone = cupOrCone;
	}
	
	
	//Describe Method
	public void describe (int iceCreamCount) {
		int printFlavors = 0;
		int boxSize = 40;
		char star = '*';
		
		for (int i = 0; i < boxSize; i++) {
			System.out.print(star);
		}
		
		System.out.println("\nIce Cream Order:\n------------");
		System.out.println("Name:\n\t" + this.user + "\nOrder: \n\t");
		System.out.println(this.size + " " + this.cupOrCone);
		
		System.out.print("Flavors:\n\t");
		while (printFlavors < iceCreamCount) {
			System.out.print(this.flavors[printFlavors++]);
			if (printFlavors == iceCreamCount-1) {
				System.out.print(" & \n\t");
			} else if (printFlavors < iceCreamCount-1) {
				System.out.print(", \n\t");
			}
		}
		
		System.out.println();
		for (int i = 0; i < boxSize; i++) {
			System.out.print(star);
		}
	} //end of describe
		
} //end of ArrayIceCreamOrder
