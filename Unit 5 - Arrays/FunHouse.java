import java.util.Arrays;
import java.util.Scanner;

public class FunHouse {

	public static int sumItUp (int[] nums) {
		
		int sum = 0;
		
		for (int i = 0; i < nums.length; i ++) {
			
			sum += nums[i];
			
		}
		
		return sum;
		
	}
	
	public static int countVals (int nums, int numsArray[]) {
		
		int count = 0; 
		
		for (int i = 0; i < numsArray.length; i ++) {	
			
			if (numsArray[i] == nums) {
				
				count ++;
				
			}
			
		}
		
		return count;
		
	}
	
	public static int[] remove (int choice, int nums[]) {
		
		int count = 0;
		
		for (int i = 0; i < nums.length; i ++) {
			
			if (nums[i] == choice) {
				
				count ++;
				
			}
		}
			
		int spotAt = 0; 
			
		int[] newNums = new int [nums.length - count];
			
		for (int t = 0; t < nums.length; t ++) {
				
			if (nums[t] != choice) {
					
					newNums[spotAt] += nums[t];
					
					spotAt ++;
					
			}
				
		}
			
	
		return newNums;
		
	}
	
	public static int[] odds (int nums[]) {
		
		int count = 0; 
		
		for (int i = 0; i < nums.length; i ++) {
			
			if (nums[i] % 2 == 0) {
				
				count ++;
				
			}
			
		}
		
		int spot = 0; 
		
		int[] oddNums = new int [nums.length - count];
		
		for (int t = 0; t < nums.length; t ++) {
			
			if (nums[t] % 2 == 1) {
				
				oddNums[spot] += nums[t];
				
				spot ++;
				
			}
			
		}
		
		return oddNums;
		
	}
	
	public static int[] evens (int nums[]) {
		
		int count = 0; 
		
		for (int i = 0; i < nums.length; i ++) {
			
			if (nums[i] % 2 == 1) {
				
				count ++;
				
			}
			
		}
		
		int spot = 0; 
		
		int[] evenNums = new int [nums.length - count];
		
		for (int t = 0; t < nums.length; t ++) {
			
			if (nums[t] % 2 == 0) {
				
				evenNums[spot] += nums[t];
				
				spot ++;
				
			}
			
		}
		
		return evenNums;
		
	}
	
	public static int findBiggest (int[] nums) {
		
		int placeHolderOne = 0; 
		
		int placeHolderTwo = 0;
		
		int largestNumber = 0;
		
		for (int i = 0; i < nums.length - 1; i ++) {
			
			placeHolderOne = nums[i];
			
			placeHolderTwo = nums[i + 1];
			
			if (placeHolderOne > placeHolderTwo ) {
				
				largestNumber = placeHolderOne;
				
			}
			
			if (placeHolderTwo > placeHolderOne) {
				
				largestNumber = placeHolderTwo;
				
			}
			
		}
				
		return largestNumber;
		
	}
	
	public static int[] swap (int nums[], int x, int y) {
		
		int numberAtLocationOne = nums[x - 1];
		
		int numberAtLocationTwo = nums[y - 1];
		
		nums[y - 1] = numberAtLocationOne;
		
		nums[x - 1] = numberAtLocationTwo;
		
		return nums;
		
	}
	
	public static void main(String[] args) throws InterruptedException {

		Scanner in = new Scanner (System.in);
		
		System.out.println("How many entities do you want in this array? \n");
		
		Thread.sleep(1000);
		
		int response = in.nextInt();
				
		int[] numsTwo = new int[response];
		
		for (int i = 0; i < response; i ++) {
			
			System.out.println("Please enter a number. \n");
			
			int num = in.nextInt();
			
			numsTwo[i] = num;
			
		}
		
		System.out.println("The sum of your entries is " + sumItUp(numsTwo) + ". \n");
		
		Thread.sleep(1000);
		
		System.out.println("Please enter a number to find how many of that same number are in the array. \n");

		Thread.sleep(1000);
		
		int spotAt = in.nextInt();
		
		System.out.println("There is/are " + countVals(spotAt, numsTwo) + " in the array. \n");
		
		Thread.sleep(1000);
		
		System.out.println("Please choose a number to remove from the array. \n");
		
		Thread.sleep(1000);
		
		int removeNumber = in.nextInt();
		
		System.out.println(Arrays.toString(remove(removeNumber, numsTwo)));
		
		System.out.println("Reinserting the number. \n");
		
		Thread.sleep(1000);
		
		System.out.println("The odd numbers in the array are " + Arrays.toString(odds(numsTwo)) + ". \n");
		
		Thread.sleep(1000);

		
		System.out.println("The even numbers in the array are " + Arrays.toString(evens(numsTwo)) + ". \n");
		
		Thread.sleep(1000);
		
		System.out.println("The largest number in the array is " + findBiggest(numsTwo) + ". \n");
		
		Thread.sleep(1000);
		
		System.out.println("Please provide a location in which you want to swap numbers. \n");
		
		Thread.sleep(1000);
		
		int locationOne = in.nextInt();
		
		System.out.println("Please provide another location in which you want to swap numbers. \n");
		
		Thread.sleep(1000);
		
		int locationTwo = in.nextInt();
		
		System.out.println("The new array is" + Arrays.toString(swap(numsTwo, locationOne, locationTwo)) + ". \n");
		
	}

}
