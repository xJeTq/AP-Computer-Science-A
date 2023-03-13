import java.util.Scanner;

public class TrianglesLab {
	
	public static String nestedFun (String a, String b, int x) {
		
		String output = "";
		
		for (int r = 0; r < x; r ++) {
			
			output += a;
			
			for (int c = 0; c < x - 1; c ++) {
				
				output += b;
								
			}
			
			output += a + "\n";
			
		}
		
		return output;
		
	}

	public static String triangleLettersOne (int x, String y) {
		
		String output = "";
		
		for (int r = 0; r < x; r ++) {
			
			output += y;
			
			for (int c = 0; c < r; c ++) {
				
				output += y;
				
			}
			
			output += "\n";
			
		}
		
		return output;
		
	}
	
	public static String triangleLettersTwo (int x, String y) {
		
		String output = "";
		
		for (int r = 0; r < x; r ++) {
			
			output += y; 
			
			for (int c = x - 1; c > r; c --) {
				
				output += y; 
				
			}
			
			output += "\n";
			
		}
		
		return output;
		
	}
	
	public static String triangleLettersThree (int x, String y) {
		
		String output = "";
		
		for (int r = 1; r <= x; r ++) {
			
			for (int c = x; c > r; c --) {
				
				output += " ";
				
			}
			
			for (int i = 0; i < r; i ++) {
			
				output += y;
				
			}
			
			output += "\n";
			
		}
		
		return output;
		
	}
	
	public static String triangleLettersFour (int x, String y) {
		
		String output = "";
		
		for (int r = x; r > 0; r --) {
			
			for (int c = x; c > r; c --) {
				
				output += " ";
				
			}
			
			for (int i = 0; i < r; i ++) {
			
				output += y;
				
			}
			
			output += "\n";
			
		}
		
		return output;
		
	}
	
	public static String triangleLettersFive (int x) {
		
		String output = "";
		
		for (int r = x; r >= 0; r --) {
			
			for (int i = 0; i <= r; i ++) {
				
				output += "#";
				
			}
			
			for (int c = x; c >= r; c --) {
				
				output += "%";
				
			}
			
			output += "\n";
			
		}
		
		return output;
		
	}
	
	public static String triangleLettersSix (int x) {
		
		String output = "";
		
		int counter = 1;
		
		for (int r = 0; r < x; r ++) {
			
			for (int c = x - 1; c >= r; c --) {
				
				output += "*"; 
				
			}
			
			output += counter;
			
			for (int i = 0; i < r; i ++) {
				
				output += "*";
				
			}
			
			output += "\n";
			
			counter ++;
			
		}
		
		return output;
		
	}
	
	public static String triangleLetterSeven (String y) {
		
		String output = "";
		
		int backwards = y.length() - 1;
		
		int wordBackwards = y.length();
		
		for (int r = 0; r <= y.length() - 1; r ++) {
			
			output += y.substring(r, r + 1);
			
		}
		
		output += "\n";
		
		for (int c = 1; c < y.length() - 1; c ++) {
			
			output += y.substring(c, c + 1);
			
			for (int x = 1; x < y.length() - 1; x ++) {
				
				output += " ";
				
			}
			
			output += y.substring(backwards - 1, backwards);
			
			output += "\n";
			
			backwards --;
			
		}
		
		for (int x = y.length() - 1; x < y.length() - 1; x ++) {
			
			output += " ";
			
		}
		
		for (int a = 0; a <= y.length() - 1; a ++) {
			
				output += y.substring(wordBackwards - 1, wordBackwards);
			
				wordBackwards --;
			
		}
		
		return output;
		
	}
	
		public static String triangleLetterEight (int x, String word) {
		
		String output = "";
		
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		int counterIndicator = alphabet.indexOf(word);
		
		int counter = 0;
		
		int y = x;
		
		int z = y;
				
		for (int r = 0; r < x; r ++) {
			
			for (int c = 0; c < z; c ++) {
				
				for (int a = 0; a < y; a ++) {
					
					counter = alphabet.indexOf(word);
					
					output += alphabet.substring(counter, counter + 1);
					
				}
				
				output += " ";
				
				counter ++;
				
				word = alphabet.substring(counter, counter + 1);
				
				y --;
				
			}
			
			y = x;
			
			z --;
			
			word = alphabet.substring(counterIndicator);
			
			output += "\n";
			
		}

				
		return output;
		
	} 
	
	public static void main(String[] args) {
		
//		System.out.println(nestedFun("$", "*", 5));

//		System.out.println(triangleLettersOne(5, "A"));
		
//		System.out.println(triangleLettersTwo(5, "A"));
		
//		System.out.println(triangleLettersThree(5, "A"));
		
//		System.out.println(triangleLettersFour(5, "A"));
		
//		System.out.println(triangleLettersFive(5));
		
//		System.out.println(triangleLettersSix(5));
		
//		System.out.println(triangleLetterSeven("CHUNGUS"));
		
		System.out.println(triangleLetterEight(3, "A"));
		
	}

}
