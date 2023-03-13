public class NurseryRhymes
{ 
   public static void main(String[] args)
   {
//      farm("cow","moo");
//      farm("duck","quack");
//TODO: add another animal to the farm here
//		monkeys(10);
//      monkeys(9);
//TODO: remove a monkey from the bed here
//      hickory_dickory(1);
//      hickory_dickory(2);
//TODO: make the clock strike three here

//TODO: call your new methods here (you must write them first!)
   }
  
   public static void farm(String animal, String sound) throws InterruptedException
   {
      
      System.out.println("Old McDonald had a farm");
      Thread.sleep(500);
      System.out.println("e-i-e-i-o");
      Thread.sleep(500);
      System.out.println("And on that farm he had a cow");
      Thread.sleep(500);
      System.out.println("e-i-e-i-o");
      Thread.sleep(500);
      System.out.println("With a moo moo here");
      Thread.sleep(500);
      System.out.println("And a moo moo there");
      Thread.sleep(500);
      System.out.println("Here a moo, there a moo");
      Thread.sleep(500);
      System.out.println("Everywhere a moo moo");
      Thread.sleep(500);
      System.out.println("Old McDonald had a farm");
      Thread.sleep(500);
      System.out.println("e-i-e-i-o\n");
      Thread.sleep(1000);
      
      System.out.println("Old McDonald had a farm");
      Thread.sleep(500);
      System.out.println("e-i-e-i-o");
      Thread.sleep(500);
      System.out.println("And on that farm he had a duck");
      Thread.sleep(500);
      System.out.println("e-i-e-i-o");
      Thread.sleep(500);
      System.out.println("With a quack quack here");
      Thread.sleep(500);
      System.out.println("And a quack quack there");
      Thread.sleep(500);
      System.out.println("Here a quack, there a quack");
      Thread.sleep(500);
      System.out.println("Everywhere a quack quack");
      Thread.sleep(500);
      System.out.println("Old McDonald had a farm");
      Thread.sleep(500);
      System.out.println("e-i-e-i-o\n");
      Thread.sleep(1000);
      
      System.out.println("Old McDonald had a farm");
      Thread.sleep(500);
      System.out.println("e-i-e-i-o");
      Thread.sleep(500);
      System.out.println("And on that farm he had a " + animal);
      Thread.sleep(500);
      System.out.println("e-i-e-i-o");
      Thread.sleep(500);
      System.out.println("With a " + sound + " " + sound + " here");
      Thread.sleep(500);
      System.out.println("With a " + sound + " " + sound + " there");
      Thread.sleep(500);
      System.out.println("Here a " + sound + ", there a " + sound);
      Thread.sleep(500);
      System.out.println("Everywhere a " + sound + " " + sound);
      Thread.sleep(500);
      System.out.println("Old McDonald had a farm");
      Thread.sleep(500);
      System.out.println("e-i-e-i-o\n");
      Thread.sleep(1000);
   
   }
   
   public static void monkeys(int numberOfMonkeys) throws InterruptedException {
	   
	   System.out.println(numberOfMonkeys + " little monkeys jumping on the bed");
	   Thread.sleep(500);
	   System.out.println("One fell off and bumped his head");
	   Thread.sleep(500);
	   System.out.println("Mama called the doctor and the doctor said");
	   Thread.sleep(500);
	   System.out.println("No more monkeys jumping on the bed\n");
	   Thread.sleep(500);
	   System.out.println(numberOfMonkeys - 1 + " little monkeys jumping on the bed");
	   Thread.sleep(1000);
	   System.out.println("One fell off and bumped his head");
	   Thread.sleep(500);
	   System.out.println("Mama called the doctor and the doctor said");
	   Thread.sleep(500);
	   System.out.println("No more monkeys jumping on the bed\n");
	   Thread.sleep(1000);
	   
   	}
   
   public static void hickoryDickory(int timeOne, int timeTwo, int timeThree) throws InterruptedException {

	   System.out.println("Hickory dickory dock");
	   Thread.sleep(500);
	   System.out.println("The mouse ran up the clock");
	   Thread.sleep(500);
	   System.out.println("The clock struck " + timeOne);
	   Thread.sleep(500);
	   System.out.println("The mouse ran down");
	   Thread.sleep(500);
	   System.out.println("Hickory dickory dock");
	   Thread.sleep(1000);
	     
	   System.out.println("Hickory dickory dock");
	   Thread.sleep(500);
	   System.out.println("The mouse ran up the clock");
	   Thread.sleep(500);
	   System.out.println("The clock struck " + timeTwo);
	   Thread.sleep(500);
	   System.out.println("The mouse ran down");
	   Thread.sleep(500);
	   System.out.println("Hickory dickory dock");
	   Thread.sleep(1000);

	   System.out.println("Hickory dickory dock");
	   Thread.sleep(500);
	   System.out.println("The mouse ran up the clock");
	   Thread.sleep(500);
	   System.out.println("The clock struck " + timeThree);
	   Thread.sleep(500);
	   System.out.println("The mouse ran down");
	   Thread.sleep(500);
	   System.out.println("Hickory dickory dock");
	   Thread.sleep(1000);
	   
   }
    
   public static void milk(int bottleOne) throws InterruptedException {
	   
	   System.out.println(bottleOne + " bottles of milk on the wall");
	   Thread.sleep(500);
	   System.out.println(bottleOne + " bottles of milk");
	   Thread.sleep(500);
	   System.out.println("one down and pass it around");
	   Thread.sleep(500);
	   System.out.println(bottleOne - 1 + " bottles of milk on the wall\n");
	   Thread.sleep(1000);
	   
   }
   
   public static void hokeyPokey(String bodyPart) throws InterruptedException { 
	   
	   System.out.println("You put your " + bodyPart + " in");
	   Thread.sleep(500);
	   System.out.println("You put your " + bodyPart + " out");
	   Thread.sleep(500);
	   System.out.println("You put your " + bodyPart + " in");
	   Thread.sleep(500);
	   System.out.println("Then you shake it all about");
	   Thread.sleep(500);
	   System.out.println("You do the Hokey Pokey");
	   Thread.sleep(500);
	   System.out.println("Then you turn yourself around");
	   Thread.sleep(500);
	   System.out.println("That’s what it’s all about!\n");
	   Thread.sleep(1000);

   }
   
   public static void bingo(String bingoVar) throws InterruptedException {
	   
	   System.out.println("There was a farmer who had a dog");
	   Thread.sleep(500);
	   System.out.println("Bingo was his name-o");
	   Thread.sleep(500);
	   System.out.println(bingoVar);
	   Thread.sleep(500);
	   System.out.println(bingoVar);
	   Thread.sleep(500);
	   System.out.println(bingoVar);
	   Thread.sleep(500);
	   System.out.println("And Bingo was his name-o\n");
	   Thread.sleep(1000);
	   
   }
   
   public static void frogs(int numberOfFrogs) throws InterruptedException {
	   
       System.out.println(numberOfFrogs + " little speckled frogs");
       Thread.sleep(500);
       System.out.println("sitting on a speckled log");
       Thread.sleep(500);
       System.out.println("eating the most delicious bugs");
       Thread.sleep(500);
       System.out.println("yum, yum");
       Thread.sleep(500);
       System.out.println("one jumped into the pool");
       Thread.sleep(500);
       System.out.println("where it is nice and cool");
       Thread.sleep(500);
       System.out.println("now there are " + (numberOfFrogs - 1) + " little speckled frogs!");
       Thread.sleep(500);
       System.out.println("ribbit, ribbit");
       Thread.sleep(1000);

   }
   
   
}
