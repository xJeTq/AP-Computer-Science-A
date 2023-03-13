import java.util.Scanner;

public class NurseryRhymesRunner {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner in = new Scanner(System.in);

		System.out.println("Hello, welcome to NurseryRhymes.net! Please input your favorite animal...");
		String animal = in.nextLine();
		
		System.out.println("Now, input the sound it makes...");
		String sound = in.nextLine();
		
		System.out.println("Perfect... Here is your first nursery rhyme!");
		
		NurseryRhymes.farm(animal, sound);
		
		System.out.println("Great job! Now input a whole number...");
		int numberOfMonkeys = in.nextInt();
		
		NurseryRhymes.monkeys(numberOfMonkeys);
		
		System.out.println("Awesome! Here's another one...");
		
		NurseryRhymes.hickoryDickory(1, 2, 3);
		
		System.out.println("And one more... Please enter a number.");
		int bottleOne = in.nextInt();
		
		NurseryRhymes.milk(bottleOne);
		
		System.out.println("And one more...");
		String bodyPart = "Head";
		
		NurseryRhymes.hokeyPokey(bodyPart);
		
		System.out.println("And another...");
		String bingo = "B-I-N-G-O";
		
		NurseryRhymes.bingo(bingo);
		
		System.out.println("One last time!");
		
		NurseryRhymes.frogs(3);
		
		System.out.println("That's all we have for you today. Hope to see you again soon!\n");
		
	}

}
