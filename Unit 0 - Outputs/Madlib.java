import java.util.Scanner;

public class Madlib 
{

	public static void main(String[] args) throws InterruptedException 
	{	

		Scanner in = new Scanner(System.in);
		
		System.out.println("*Please input name here...* \n");
		
		String name = in.nextLine();
		
		System.out.println("Hello " + name + ", Welcome to Madlib! Here, you will input a bunch of different words. Once we are done working our magic, we will input your responses into a song! Please type 'Yes' or 'No'. \n");
		
		String doYouWantToStart = in.nextLine();
		
		if(doYouWantToStart.equals("Yes"))
		{
			System.out.println("Perfect! Let's get started... \n");
		}
		else
		{
			System.out.println("No problem! Once you've come up with you words, start over again. \n");
				return;
		}
	
		System.out.println("Please input a noun... \n");
		String nounOne = in.nextLine(); 
		
		System.out.println("Please input an onamatopoeia... \n");
		String onamatopoeiaOne = in.nextLine(); 
		
		System.out.println("Please input a verb... \n");
		String verbOne = in.nextLine();
		
		System.out.println("Please input a body part... \n");
		String bodyPartOne = in.nextLine(); 
		
		System.out.println("Please input a proper noun... \n");
		String properNounOne = in.nextLine(); 
		
		System.out.println("Please input something you own... \n");
		String somethingYouOwnOne = in.nextLine(); 

		System.out.println("Please input a person's name... \n");
		String personNameOne = in.nextLine(); 
		
		System.out.println("Please input a two-syllable verb... \n");
		String twoSyllableVerbOne = in.nextLine(); 
		
		System.out.println("Please input something you can run out of... \n");
		String somethingYouCanRunOutOfOne = in.nextLine(); 
		
		System.out.println("Please input another two-syllable adjective... \n");
		String twoSyllableAdjectiveTwo = in.nextLine();
		
		System.out.println("Please input another body part (plural)... \n");
		String bodyPartTwo = in.nextLine();
		
		System.out.println("Please input a number... \n");
		String numberOne = in.nextLine();
		
		System.out.println("Great job " + name + ", You're done! Please wait one moment while we get your song ready... \n");
			Thread.sleep(2000);
			
		System.out.println("Choosing a song... \n");
			Thread.sleep(2000);
					
		System.out.println("Replacing lyrics... \n");
			Thread.sleep(2000);
						
		System.out.println("Creating greatness... \n");
			Thread.sleep(2000);
			
		System.out.println("The moment you've been waiting for, " + name + "... Here is your version of " + "Thriller " + "by Michael Jackson! \n");
		Thread.sleep(4000);
		
		
		
		System.out.println("You hear the " + nounOne + " " + onamatopoeiaOne + " and realize there's nowhere left to " + verbOne);
			Thread.sleep(4000);
		System.out.println("You feel the cold " + bodyPartOne + " and wonder if you'll ever see the " + properNounOne);
			Thread.sleep(4000);
		System.out.println("You close your eyes and hope it's just your " + somethingYouOwnOne + ", girl");
			Thread.sleep(4000);
		System.out.println("But all while you hear a(n) " + personNameOne + " " + twoSyllableVerbOne + " up behind");
			Thread.sleep(4000);
		System.out.println("You're outta " + somethingYouCanRunOutOfOne + "\n");
			Thread.sleep(1000);
		
		System.out.println("Cause this is " + twoSyllableAdjectiveTwo + ", " + twoSyllableAdjectiveTwo + " night");
			Thread.sleep(3000);
		System.out.println("There ain't no second chance against the thing with the " + numberOne + " " + bodyPartTwo + ", girl");
			Thread.sleep(4000);
		System.out.println(twoSyllableAdjectiveTwo + ", "+ twoSyllableAdjectiveTwo + " night");
			Thread.sleep(1000);
		System.out.println("You're fighting for your life inside a killer, " +  twoSyllableAdjectiveTwo + " tonight \n");
			Thread.sleep(4000);

		System.out.println("Great job, " + name + "... We hope you enjoyed playing!");	
			return;
		
	}
}
