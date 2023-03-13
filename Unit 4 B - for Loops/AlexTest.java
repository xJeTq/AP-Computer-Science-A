
public class AlexTest {

	public static String penis(String s, int n) {
		
		String output = "";
			
		for (int r = 0; r < n; r ++) {
				
			output += s.substring(0, n);
				
		}
		
		return output;
		
	}
	
	public static void main(String[] args) {

		System.out.println(penis("Chocolate", 2));
		
	}

}
