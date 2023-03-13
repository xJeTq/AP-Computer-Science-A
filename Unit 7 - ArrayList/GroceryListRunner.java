import java.util.ArrayList;
import java.util.Scanner;

public class GroceryListRunner {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		GroceryList myList = new GroceryList();
		
		System.out.println("Hello! Please add to your grocery list! Please input the amount of items that will be on your list (Please make sure to type all amounts/quantities out as numbers).");
		
		int amount = in.nextInt();
				
		for (int i = 0; i < amount; i ++) {
			
			System.out.println("Input your item.");
			
			in.nextLine();
			
			String item = in.nextLine();
									
			System.out.println("Input the amount of items you will be purchasing in this category.");

			int quantity = in.nextInt();
			
			myList.addBoth(item, quantity);
			
		}
		
		System.out.println("Great. Here is your list." + "\n");
		
		System.out.println(myList.toString());
		
		String progress = "Continue";
		
		in.nextLine();
		
		while(progress.equalsIgnoreCase("Continue")) {
		
			System.out.println("Would you like to add, remove, replace, or change the quantity of anything on your list? Type \"Add,\" \"Remove,\" \"Replace,\" or \"Change\" to continue.");
						
			String decision = in.nextLine();
									
			if (decision.equalsIgnoreCase("Add")) {
				
				System.out.println("Great. Please input the item.");
				
				String newItem = in.nextLine();
			
				System.out.println("Now enter the amount.");
			
				int newQuantity = in.nextInt();
			
				myList.addBoth(newItem, newQuantity);
			
				System.out.println("Great. Here is your new list." + "\n");
			
				System.out.println(myList.toString());
				
				System.out.println("Type \"Continue\" to perform another action, or \"No\" to end the list.");
				
				in.nextLine();
				
				progress = in.nextLine();
			
			} else if (decision.equalsIgnoreCase("Remove")) {
							
				System.out.println("Great. Please input the item you would like to remove.");
			
				String removeItem = in.nextLine();
				
				int location = myList.findQuantity(removeItem);
							
				myList.removeBoth(removeItem, location);
				
				System.out.println("Great. Here is your new list." + "\n");
			
				System.out.println(myList.toString());
				
				System.out.println("Type \"Continue\" to perform another action, or \"No\" to end the list.");
				
				progress = in.nextLine();
			
			} else if (decision.equalsIgnoreCase("Replace")) {
			
				System.out.println("What would you like to add?");
			
				String newestItem = in.nextLine();
			
				System.out.println("What is its quanity?");
			
				int newestQuantity = in.nextInt();
			
				in.nextLine();
			
				System.out.println("What would you like to replace?");
			
				String oldestItem = in.nextLine();
			
				myList.setBoth(newestItem, newestQuantity, myList.findLocation(oldestItem));
			
				System.out.println("Great. Here is your new list." + "\n");
			
				System.out.println(myList.toString());
				
				System.out.println("Type \"Continue\" to perform another action, or \"No\" to end the list.");
				
				progress = in.nextLine();
			
			} else {
			
				System.out.println("What item is having its quantity changed?");
			
				String item = in.nextLine();
			
				System.out.println("What is the new quantity?");
			
				int quantity = in.nextInt();
			
				myList.setQuantities(quantity, myList.findLocation(item));
			
				System.out.println("Great. Here is your new list." + "\n");
			
				System.out.println(myList.toString());
				
				System.out.println("Type \"Continue\" to perform another action, or \"No\" to end the list.");
				
				in.nextLine();
				
				progress = in.nextLine();
			
			}
						
		}
		
		System.out.println("Thank you. I hope you enjoy your shopping experience!");
		
	}

}
