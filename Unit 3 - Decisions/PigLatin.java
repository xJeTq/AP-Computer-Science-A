import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		
		System.out.println("Hello! Welcome to PigLatin.com. Please enter a word that you would like to be translated to Pig Latin! \n");
		
		String word = in.nextLine(); System.out.println("\n");
		
		System.out.println("You would like the word \"" + word + "\" to be translated to Pig Latin. Please confirm this by typing 'Yes' or 'No' in the space provided. \n");
		
		String confirmation = in.nextLine(); System.out.println("\n"); 
		
		if (confirmation.equalsIgnoreCase("Yes")) {
			
			System.out.println("Perfect! Here we go... \n");
			
		} else {
			
			System.out.println("Okay. Returning to homescreen. \n");
			
			return;
			
		}
						
		if (word.substring(0, 1).equalsIgnoreCase("B") || word.substring(0, 1).equalsIgnoreCase("C") || word.substring(0, 1).equalsIgnoreCase("D") || word.substring(0, 1).equalsIgnoreCase("E") || word.substring(0, 1).equalsIgnoreCase("F") || word.substring(0, 1).equalsIgnoreCase("G") || word.substring(0, 1).equalsIgnoreCase("H") || word.substring(0, 1).equalsIgnoreCase("J") || word.substring(0, 1).equalsIgnoreCase("K") || word.substring(0, 1).equalsIgnoreCase("L") || word.substring(0, 1).equalsIgnoreCase("M") || word.substring(0, 1).equalsIgnoreCase("N") || word.substring(0, 1).equalsIgnoreCase("P") || word.substring(0, 1).equalsIgnoreCase("Q") || word.substring(0, 1).equalsIgnoreCase("R") || word.substring(0, 1).equalsIgnoreCase("S") || word.substring(0, 1).equalsIgnoreCase("T") || word.substring(0, 1).equalsIgnoreCase("V") || word.substring(0, 1).equalsIgnoreCase("W") || word.substring(0, 1).equalsIgnoreCase("X") || word.substring(0, 1).equalsIgnoreCase("Y") || word.substring(0, 1).equalsIgnoreCase("Z")) {
			
			String firstLetter = word.substring(0, 1);
			
			String shortWord = word.substring(1);
			
			System.out.println("Okay. Here is your word: " + shortWord + firstLetter + "ay. \n");
			
		} else {
			
			System.out.println("Okay. Here is your word: " + word + "way. \n");

		}
	
		System.out.println("Would you like to play again? Type \"Yes\" or \"No.\"");
		
		String wantToPlayAgain = in.nextLine(); System.out.println("\n"); 
		
		while (wantToPlayAgain.equalsIgnoreCase("Yes")) {
			
			System.out.println("Please enter a word that you would like to be translated to Pig Latin! \n");
			
			String wordOne = in.nextLine(); System.out.println("\n"); 
			
			System.out.println("You would like the word \"" + wordOne + "\" to be translated to Pig Latin. Please confirm this by typing 'Yes' or 'No' in the space provided. \n");
			
			String confirmationAgain = in.nextLine(); System.out.println("\n"); 
			
			if (confirmationAgain.equalsIgnoreCase("Yes")) {
				
				System.out.println("Perfect! Here we go... \n");
				
			} else {
				
				System.out.println("Okay. Returning to homescreen. \n");
				
				return;
				
			}
							
			if (wordOne.substring(0, 1).equalsIgnoreCase("B") || wordOne.substring(0, 1).equalsIgnoreCase("C") || wordOne.substring(0, 1).equalsIgnoreCase("D") || wordOne.substring(0, 1).equalsIgnoreCase("E") || wordOne.substring(0, 1).equalsIgnoreCase("F") || wordOne.substring(0, 1).equalsIgnoreCase("G") || wordOne.substring(0, 1).equalsIgnoreCase("H") || wordOne.substring(0, 1).equalsIgnoreCase("J") || wordOne.substring(0, 1).equalsIgnoreCase("K") || wordOne.substring(0, 1).equalsIgnoreCase("L") || wordOne.substring(0, 1).equalsIgnoreCase("M") || wordOne.substring(0, 1).equalsIgnoreCase("N") || wordOne.substring(0, 1).equalsIgnoreCase("P") || wordOne.substring(0, 1).equalsIgnoreCase("Q") || wordOne.substring(0, 1).equalsIgnoreCase("R") || wordOne.substring(0, 1).equalsIgnoreCase("S") || wordOne.substring(0, 1).equalsIgnoreCase("T") || wordOne.substring(0, 1).equalsIgnoreCase("V") || wordOne.substring(0, 1).equalsIgnoreCase("W") || wordOne.substring(0, 1).equalsIgnoreCase("X") || wordOne.substring(0, 1).equalsIgnoreCase("Y") || wordOne.substring(0, 1).equalsIgnoreCase("Z")) {
				
				String firstLetterOne = wordOne.substring(0, 1);
				
				String shortWordOne = wordOne.substring(1);
				
				System.out.println("Okay. Here is your word: " + shortWordOne + firstLetterOne + "ay. \n");
				
			} else {
				
				System.out.println("Okay. Here is your word: " + wordOne + "way. \n");

			}
		
			System.out.println("Would you like to play again? Type \"Yes\" or \"No.\"");
			
			wantToPlayAgain = in.nextLine(); System.out.println("\n"); 
			
			}
			
		
		if (wantToPlayAgain.equalsIgnoreCase("No")) {
			
			System.out.println("No problem. Have a great day!");
			
		}
		
	}

}
