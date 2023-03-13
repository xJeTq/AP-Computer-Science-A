import java.util.Scanner;

public class FRQTest {

	public static String stringBits (String str) {
		
		String output = "";
		
		for (int x = 0; x <= str.length() - 1; x += 2) {
			
			output += str.substring(x, x + 1);
			
		}
		
		return output;
		
	}
	
	public static String stringSplosion (String str) {
		
		String output = "";
		
		for (int x = 0; x <= str.length(); x ++) {
			
			output += str.substring(0, x);
			
		}
		
		return output;
		
	}
	
	public static boolean equalIsNot (String str) {
		
		int isCounter = 0;
		
		int notCounter = 0;
		
		for (int x = 0; x < str.length(); x ++) {
			
			if (str.substring(x, x + 1).equalsIgnoreCase("i")) {
				
				if (x < str.length() - 1) {
				
					if (str.substring(x + 1, x + 2).equalsIgnoreCase("s")) {
				
						isCounter ++;
				
					}
				
				} 
				
			}
			
			if (str.substring(x, x + 1).equalsIgnoreCase("n")) {
				
				if (x < str.length() - 1) {
				
					if (str.substring(x + 1, x + 2).equalsIgnoreCase("o")) {
					
						if (x < str.length() - 2) {
					
							if (str.substring(x + 2, x + 3).equalsIgnoreCase("t")) {
				
								notCounter ++;
				
							}
				
						}
				
					} 
				
				}
			}
			
		}
			
			if (isCounter == notCounter) {
				
				return true;
				
			} else {
				
				return false;
				
			}
		
	}
	
	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		
//		System.out.println("Input a word. \n");
		
//		String wordOne = in.nextLine();
		
//		System.out.println(stringBits(wordOne));
		
//		System.out.println("Input a word. \n");
		
//		String wordTwo = in.nextLine();
		
//		System.out.println(stringSplosion(wordTwo));
		
		System.out.println("Input a word. \n");
		
		String wordThree = in.nextLine();
		
		System.out.println(equalIsNot(wordThree));
		
	}

}
