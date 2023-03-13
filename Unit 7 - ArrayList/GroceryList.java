import java.util.ArrayList;

public class GroceryList {

	private ArrayList<String> items;
	private ArrayList<Integer> quantity;
	
	public GroceryList() {
		
		items = new ArrayList<String>();
		quantity = new ArrayList<Integer>();
		
	}
	
	public ArrayList<String> getItems() {
		
		return items;
		
	}
	
	public ArrayList<Integer> getQuantity() {
		
		return quantity;
		
	}
	
	public String toString() {
		
		String output = "";
		
		for (int i = 0; i < items.size(); i ++) {
		
			output += items.get(i) + "(s) - " + quantity.get(i) + "\n";
				
		}
		
		return output;
		
	}
	
	public ArrayList<String> addItems(String s) {
		
		items.add(s);
		
		return items;
		
	}
	
	public ArrayList<Integer> addQuantity(int i) {
		
		quantity.add(i);
		
		return quantity;
		
	}
	
	public void addBoth(String s, int i) {
		
		addItems(s);
		
		addQuantity(i);
		
	}
	
	public ArrayList<String> removeItems(String s) {
		
		for (int i = items.size() - 1; i > 0; i --) {
			
			if (items.get(i).equalsIgnoreCase(s)) {
				
				items.remove(i);
				
			}
			
		}
		
		return items;
		
	}
	
	public int findQuantity(String s) {
		
		int spot = 0;
		
		for (int i = 0; i < items.size(); i ++) {
			
			if (items.get(i).equalsIgnoreCase(s)) {
				
				spot = i;
				
			}
			
		}
		
		return spot;
		
	}
	
	public ArrayList<Integer> removeQuantity(int r) {
		
		for (int i = quantity.size() - 1; i > 0; i --) {
			
			if (i == r) {
				
				quantity.remove(i);
				
			}
			
		}
		
		return quantity;
		
	}
	
	public void removeBoth(String s, int i) {
		
		removeItems(s);
		
		removeQuantity(i);
		
	}
	
	public ArrayList<String> setItems(String s, int l) {
		
		items.set(l, s);
		
		return items;
		
	}
	
	public ArrayList<Integer> setQuantities(int q, int s) {
		
		quantity.set(s, q);
		
		return quantity;
		
	}
	
	public void setBoth(String i, int q, int s) {

		setQuantities(q, s);
		
		setItems(i, s);
		
	}
	
	public int findLocation(String s) {
		
		int spot = 0;
		
		for (int i = 0; i < items.size(); i ++) {
			
			if (items.get(i).equalsIgnoreCase(s)) {
				
				spot = i;
				
			}
			
		}
		
		return spot;
		
	}
	
}
