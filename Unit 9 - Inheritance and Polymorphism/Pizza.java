import java.util.ArrayList;

public class Pizza {

	private String size;
	private ArrayList<String> toppings;
	private String name;
	
	public Pizza(String s) {
		
		this.size = s;
		
	}
	
	public Pizza(ArrayList<String> t) {
		
		this.toppings = t;
		
	}
	
	public Pizza(String n, String s, ArrayList<String> t) {
		
		this.name = n;
		
		this.size = s;
		
		this.toppings = t;
		
	}
	
	public String getSize() {
		
		return size;
		
	}
	
	public ArrayList<String> getToppings() {
		
		return toppings;
		
	}
	
	public void setSize(String s) {
		
		this.size = s;
		
	}
	
	public void setToppings(ArrayList<String> t) {
		
		this.toppings = t;
		
	}
		
	public String toString() {
		
		return "Name: " + name + ", Size: " + size + ", Toppings: " + toppings + ";\n";
		
	}
	
}
