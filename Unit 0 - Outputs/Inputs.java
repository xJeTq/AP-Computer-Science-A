import java.util.Scanner;

public class Inputs {

	public static void main(String[] args) 
{	
		
	Scanner in = new Scanner(System.in);
		
	System.out.println("Hello, Welcome to QuizMath.com! What is your name?\n");
		
	String name = in.nextLine();
		
	System.out.println("Hello " + name + ", are you ready to take the math quiz? Type '1' for yes and '0' for no.\n");
		
		//Not sure how to have the user input strings in if statements. 
	
	int response1 = in.nextInt();
		
		if (response1 == 1) 
		{
			System.out.println("Perfect! Let's get started...\n");
		}
		else
		{
			System.out.println("Okay. Have a nice day!\n");
			return;
		}
		
	System.out.println("1.) 3 + (2 - 5) - 7 = x. What does x equal?\n");
		
	int actualAnswer1 = (int) 3 + (2 - 5) - 7;
	int userAnswer1 = in.nextInt();
		
		if (userAnswer1 == actualAnswer1)
		{
			System.out.println("Great job! Let's move on to question 2.\n");
		}
		else 
		{
			System.out.println("That's incorrect. The correct answer is " + actualAnswer1 + ".\n");
		}
		
	System.out.println("2.) 4 x 5 - 6 + 7 = x. What does x equal?\n");
		
	int actualAnswer2 = (int) 4 * 5 - 6 + 7;
	int userAnswer2 = in.nextInt();
		
		if (userAnswer2 == actualAnswer2)
		{
			System.out.println("Great job! Let's move on to question 3.\n");
		}
		else
		{
			System.out.println("That's incorrect. The correct answer is " + actualAnswer2 + ".\n");
		}
		
	System.out.println("3.) 5 + 3 - 7(3  /  1) = x. What does x equal?\n");
		
	int actualAnswer3 = (int)  5 + 3 - 7 * (3  /  1); 
	int userAnswer3 = in.nextInt();
		
		if (userAnswer3 == actualAnswer3)
		{
			System.out.println("Great job! Let's move on to question 4.\n");
		}
		else
		{
			System.out.println("That's incorrect. The correct answer is " + actualAnswer3 + ".\n");
		}
		
	System.out.println("4.) 6 - 3 + 5 + (9 / 3) = x. What does x equal?\n");
		
	int actualAnswer4 =  6 - 3 + 5 + (9 / 3); 
	int userAnswer4 = in.nextInt();
		
		if (userAnswer4 == actualAnswer4)
		{
			System.out.println("Great job! Let's move on to question 5.\n");
		}
		else
		{
			System.out.println("That's incorrect. The correct answer is " + actualAnswer4 + ".\n");
		}

	System.out.println("5.) 7(5 + 3) - 3 = x. What does x equal?\n");
		
	int actualAnswer5 = 7 * (5 + 3) - 3;
	int userAnswer5 = in.nextInt();
		
		if (userAnswer5 == actualAnswer5)
		{
			System.out.println("Great job! You've completed the quiz!\n");
		}
		else
		{
			System.out.println("That's incorrect. The correct answer is " + actualAnswer5 + ".\n");	
		}
		
	System.out.println("That concludes the quiz. I hope you learned something new!");
		
}
}


