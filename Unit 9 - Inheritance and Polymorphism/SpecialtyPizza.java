import java.util.ArrayList;

public class SpecialtyPizza extends Pizza {

	
	public SpecialtyPizza(String s, ArrayList<String> t, String n) {
		
		super(n, s, t);
				
	}
	
	public ArrayList<String> getToppings(ArrayList<String> t) {
		
		return t;
		
	}
	
}
