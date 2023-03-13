import java.util.Scanner;

public class DissectingNumbers {

	public static int digitCounter(int digit) {
		
		int counter = 0; 
		
		while (counter <= digit) { 
			
			counter ++;
			
			digit %= 10;
			
		}
		
		return counter;
		
	}
	
	public static int digitAdder(int digit) {
		
		int sum = 0; 
		
		while (sum <= digit) {
			
			digit %= 10;
			
			sum += digit;
			
		}
		
		return sum;
		
	}
	
	public static double digitAverage(int digit) {
		
			
		
	}
	
	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		
		System.out.println("Enter a number. \n");
		
		int userResponseOne = in.nextInt(); 
	
		System.out.println(digitCounter(userResponseOne));
		
		System.out.println("Enter another number. \n");
		
		int userResponseTwo = in.nextInt(); 
		
		System.out.println(digitAdder(userResponseTwo));
		
	}

}
