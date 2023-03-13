import java.util.Arrays;
import java.util.Scanner;

public class WordScrambleWithAttemptedGUI {

/* 
  
 	I ATTEMPTED TO USE MATH.RANDOM, BUT WASN'T SURE HOW TO STOP THE LETTERS FROM REPEATING WHEN SCRAMBLING THE WORD. 
	
	public static String wordScramble (String word) { 
		
		String output = "";
		
		for (int r = 0; r < 1; r ++) {
			
			for (int c = 0; c < word.length(); c ++) {
			
				int k = (int)(Math.random() * word.length());
				
				output += word.substring(k, k + 1);
				
			}
			
		}
		
		return output;
					
	} 
	
*/ 
	
	public static String randomWord (String[] words) {
		
		String originalWord = words[(int) (Math.random() * 10)];
		
		return originalWord;
		
	}
	
	public static String wordScramble (String randomWord(words)) {
		
		String originalWord = word;
				
		String newOutput = "";
		
		int length = word.length();
		
		newOutput += word.substring(2 * word.length() / 4, 3 * word.length() / 4);
		
		newOutput += word.substring(word.length() / 4, 2 * word.length() / 4);
		
		newOutput += word.substring(0, word.length() / 4);
		
		newOutput += word.substring(3 * word.length() / 4);
		
		return newOutput;
		
	} 
	
	public static String sendWord (String words) {
		
		String output = wordScramble(randomWord(words));
		
		return output;
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		Scanner in = new Scanner (System.in);
		
		int score = 0;
		
		int gameCounter = 0; 
		
		String[] words = {"java", "pig", "cow", "computer", "chungus", "seven", "chicken", "sandwich", "leather", "johnson"};
		
		System.out.println(sendWord(wordScramble(randomWord(words))));
		
		System.out.println(wordScramble(randomWord(words)));
				
/*
		
		String scrambledWordZero = wordScramble(words[0]);
		
		String scrambledWordOne = wordScramble(words[1]);
		
		String scrambledWordTwo = wordScramble(words[2]);
		
		String scrambledWordThree = wordScramble(words[3]);
		
		String scrambledWordFour = wordScramble(words[4]);
		
		String scrambledWordFive = wordScramble(words[5]);
		
		String scrambledWordSix = wordScramble(words[6]);
		
		String scrambledWordSeven = wordScramble(words[7]);
		
		String scrambledWordEight = wordScramble(words[8]);
		
		String scrambledWordNine = wordScramble(words[9]);
		
		System.out.println(scrambledWordZero);
		
*/
		
		System.out.println("Welcome to Word Scramble! \n");
		
		System.out.println("Guess the word: " + wordScramble(randomWord(words)) + "\n");
		
		String responseZero = in.nextLine();
						
		while (responseZero.equalsIgnoreCase(randomWord(words)) == false) {

			System.out.println("That's incorrect. \n");
			
			responseZero = in.nextLine();
			
			gameCounter ++;
		
		}
		
		if (responseZero.equalsIgnoreCase(randomWord(words))) {
			
			System.out.println("That's correct! \n");
			
			score ++;
			
			gameCounter ++;
			
		}
		
		System.out.println("Would you like to play again? Type \"Yes\" or \"No.\" \n");
	
		String playAgain = in.nextLine();
		
		while (playAgain.equalsIgnoreCase("Yes")) {
			
			System.out.println("Guess the word: " + wordScramble(randomWord(words)) + "\n");
			
			String responseOne = in.nextLine();
							
			while (responseOne.equalsIgnoreCase(randomWord(words)) == false) {

				System.out.println("That's incorrect. \n");
				
				responseOne = in.nextLine();
				
				gameCounter ++;
			
			}
			
			if (responseOne.equalsIgnoreCase(randomWord(words))) {
				
				System.out.println("That's correct! \n");
				
				score ++;
				
				gameCounter ++;
				
			}
			
			System.out.println("Would you like to play again? Type \"Yes\" or \"No.\" \n");
		
			String playAnother = in.nextLine();
			
		} if (playAgain.equalsIgnoreCase("No")) {
			
			System.out.println("Thank you for playing. \n");
			
		}
		
/*		
		
		System.out.println("Guess the word: " + wordScramble(words[1]) + "\n");
		
		String responseOne = in.nextLine();
				
		while (responseOne.equalsIgnoreCase("Pig") == false) {

			System.out.println("That's incorrect... Try again. \n");
			
			responseOne = in.nextLine();
			
			gameCounter ++;
		
		}
		
		if (responseOne.equalsIgnoreCase("Pig")) {
			
			System.out.println("That's correct! \n");
			
			score ++;
			
			gameCounter ++;
			
		}
		
		System.out.println("Guess the word: " + wordScramble(words[2]) + "\n");
		
		String responseTwo = in.nextLine();
				
		while (responseTwo.equalsIgnoreCase("Cow") == false) {

			System.out.println("That's incorrect... Try again. \n");
			
			responseTwo = in.nextLine();
			
			gameCounter ++;
		
		}
		
		if (responseTwo.equalsIgnoreCase("Cow")) {
			
			System.out.println("That's correct! \n");
			
			score ++;
			
			gameCounter ++;
			
		}
		
		System.out.println("Guess the word: " + wordScramble(words[3]) + "\n");
		
		String responseThree = in.nextLine();
				
		while (responseThree.equalsIgnoreCase("Computer") == false) {

			System.out.println("That's incorrect... Try again. \n");
			
			responseThree = in.nextLine();
			
			gameCounter ++;
		
		}
		
		if (responseThree.equalsIgnoreCase("Computer")) {
			
			System.out.println("That's correct! \n");
			
			score ++;
			
			gameCounter ++;
			
		}
		
		System.out.println("Guess the word: " + wordScramble(words[4]) + "\n");
		
		String responseFour = in.nextLine();
				
		while (responseFour.equalsIgnoreCase("Chungus") == false) {

			System.out.println("That's incorrect... Try again. \n");
			
			responseFour = in.nextLine();
			
			gameCounter ++;
		
		}
		
		if (responseFour.equalsIgnoreCase("Chungus")) {
			
			System.out.println("That's correct! \n");
			
			score ++;
			
			gameCounter ++;
			
		}
		
		System.out.println("Guess the word: " + wordScramble(words[5]) + "\n");
		
		String responseFive = in.nextLine();
				
		while (responseFive.equalsIgnoreCase("Seven") == false) {

			System.out.println("That's incorrect... Try again. \n");
			
			responseFive = in.nextLine();
			
			gameCounter ++;
		
		}
		
		if (responseFive.equalsIgnoreCase("Seven")) {
			
			System.out.println("That's correct! \n");
			
			score ++;
			
			gameCounter ++;
			
		}
		
		System.out.println("Guess the word: " + wordScramble(words[6]) + "\n");
		
		String responseSix = in.nextLine();
				
		while (responseSix.equalsIgnoreCase("Chicken") == false) {

			System.out.println("That's incorrect... Try again. \n");
			
			responseSix = in.nextLine();
			
			gameCounter ++;
		
		}
		
		if (responseSix.equalsIgnoreCase("Chicken")) {
			
			System.out.println("That's correct! \n");
			
			score ++;
			
			gameCounter ++;
			
		}
		
		System.out.println("Guess the word: " + wordScramble(words[7]) + "\n");
		
		String responseSeven = in.nextLine();
				
		while (responseSeven.equalsIgnoreCase("Sandwich") == false) {

			System.out.println("That's incorrect... Try again. \n");
			
			responseSeven = in.nextLine();
			
			gameCounter ++;
		
		}
		
		if (responseSeven.equalsIgnoreCase("Sandwich")) {
			
			System.out.println("That's correct! \n");
			
			score ++;
			
			gameCounter ++;
			
		}
		
		System.out.println("Guess the word: " + wordScramble(words[8]) + "\n");
		
		String responseEight = in.nextLine();
				
		while (responseEight.equalsIgnoreCase("Leather") == false) {

			System.out.println("That's incorrect... Try again. \n");
			
			responseEight = in.nextLine();
			
			gameCounter ++;
		
		}
		
		if (responseEight.equalsIgnoreCase("Leather")) {
			
			System.out.println("That's correct! \n");
			
			score ++;
			
			gameCounter ++;
			
		}
		
		System.out.println("Guess the word: " + wordScramble(words[9]) + "\n");
		
		String responseNine = in.nextLine();
				
		while (responseNine.equalsIgnoreCase("Johnson") == false) {

			System.out.println("That's incorrect... Try again. \n");
			
			responseNine = in.nextLine();
			
			gameCounter ++;
		
		}
		
		if (responseNine.equalsIgnoreCase("Johnson")) {
			
			System.out.println("That's correct! \n");
			
			score ++;
			
			gameCounter ++;
			
		} 
		
*/
		
		System.out.println("The game has ended. Here is your score: " + score + "/10. \n");
		
		Thread.sleep(500);
		
		System.out.println("Although you did guess them all correctly eventually, it took you " + gameCounter + " attempts to guess all ten correctly. \n");
		
/* 
  
 		THIS CODE COMPLETES THE ASSIGNMENT CORRECTLY. I WANTED TO TRY SOMETHING DIFFERENT, SO I'M USING THE CODE ABOVE. 
		
		if (responseZero.equalsIgnoreCase("Java")) {
			
			System.out.println("That's correct! \n");
			
			score ++;
			
		} else {
			
			System.out.println("That's incorrect. \n");
			
		}
		
		System.out.println("Guess the word: " + wordScramble(words[1]) + "\n");
		
		String responseOne = in.nextLine();
		
		if (responseOne.equalsIgnoreCase("Pig")) {
			
			System.out.println("That's correct! \n");
			
			score ++;
			
		} else {
			
			System.out.println("That's incorrect. \n");
			
		}
		
		System.out.println("Guess the word: " + wordScramble(words[2]) + "\n");
		
		String responseTwo = in.nextLine();
		
		if (responseTwo.equalsIgnoreCase("Cow")) {
			
			System.out.println("That's correct! \n");
			
			score ++;
			
		} else {
			
			System.out.println("That's incorrect. \n");
			
		}
		
		System.out.println("Guess the word: " + wordScramble(words[3]) + "\n");
		
		String responseThree = in.nextLine();
		
		if (responseThree.equalsIgnoreCase("Computer")) {
			
			System.out.println("That's correct! \n");
			
			score ++;
			
		} else {
			
			System.out.println("That's incorrect. \n");
			
		}
		
		System.out.println("Guess the word: " + wordScramble(words[4]) + "\n");
		
		String responseFour = in.nextLine();
		
		if (responseFour.equalsIgnoreCase("Chungus")) {
			
			System.out.println("That's correct! \n");
			
			score ++;
			
		} else {
			
			System.out.println("That's incorrect. \n");
			
		}
		
		System.out.println("Guess the word: " + wordScramble(words[5]) + "\n");
		
		String responseFive = in.nextLine();
		
		if (responseFive.equalsIgnoreCase("Seven")) {
			
			System.out.println("That's correct! \n");
			
			score ++;
			
		} else {
			
			System.out.println("That's incorrect. \n");
			
		}
		
		System.out.println("Guess the word: " + wordScramble(words[6]) + "\n");
		
		String responseSix = in.nextLine();
		
		if (responseSix.equalsIgnoreCase("Chicken")) {
			
			System.out.println("That's correct! \n");
			
			score ++;
			
		} else {
			
			System.out.println("That's incorrect. \n");
			
		}
		
		System.out.println("Guess the word: " + wordScramble(words[7]) + "\n");
		
		String responseSeven = in.nextLine();
		
		if (responseSeven.equalsIgnoreCase("Sandwich")) {
			
			System.out.println("That's correct! \n");
			
			score ++;
			
		} else {
			
			System.out.println("That's incorrect. \n");
			
		}
		
		System.out.println("Guess the word: " + wordScramble(words[8]) + "\n");
		
		String responseEight = in.nextLine();
		
		if (responseEight.equalsIgnoreCase("Leather")) {
			
			System.out.println("That's correct! \n");
			
			score ++;
			
		} else {
			
			System.out.println("That's incorrect. \n");
			
		}
		
		System.out.println("Guess the word: " + wordScramble(words[9]) + "\n");
		
		String responseNine = in.nextLine();
		
		if (responseNine.equalsIgnoreCase("Johnson")) {
			
			System.out.println("That's correct! \n");
			
			score ++;
			
		} else {
			
			System.out.println("That's incorrect. \n");
			
		}
		
		System.out.println("The game has ended. Here is your score: " + score + "/10. \n"); 
		
*/ 
		
	} 

}
