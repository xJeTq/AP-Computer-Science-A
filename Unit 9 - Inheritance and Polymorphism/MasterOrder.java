import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MasterOrder {
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		ArrayList<String> hawaiian = new ArrayList<String>();
		hawaiian.add("Ham");
		hawaiian.add("Pineapple");
		
		ArrayList<String> veggie = new ArrayList<String>();
		veggie.add("Peppers");
		veggie.add("Mushrooms");
		veggie.add("Onions");
		veggie.add("Olives");

		ArrayList<String> white = new ArrayList<String>();
		white.add("Mozzarella");
		white.add("Ricotta");
		
		ArrayList<String> meatLovers = new ArrayList<String>();
		meatLovers.add("Sausage");
		meatLovers.add("Pepperoni");
		meatLovers.add("Ham");
		
		ArrayList<String> toppings = new ArrayList<String>();
				
		ArrayList<Pizza> order = new ArrayList<Pizza>();
				
		System.out.println("Would you like to order a pizza? Type \"Yes\" or \"No.\"");
		
		String input1 = in.nextLine();
		
		if (input1.equalsIgnoreCase("Yes")) {
			
			while (input1.equalsIgnoreCase("Yes")) {
				
				if (input1.equalsIgnoreCase("Yes")) {
					
					System.out.println("What Size? Type \"Small,\" \"Medium\" or \"Large.\"");
					
					String input2 = in.nextLine();
					
					System.out.println("Would you like to order a regular or specialty pizza? Type \"Regular\" or \"Hawaiian,\" \"Veggie,\" \"White\" or \"Meat-Lovers.\"");
					
					String input3 = in.nextLine();
					
					if (input3.equalsIgnoreCase("Regular")) {
						
						System.out.println("How many toppings would you like? ");
						
						int input4 = in.nextInt();
						
						System.out.println("Input your toppings here.");
																					
						for (int i = 0; i <= input4; i ++) {
																																
							String input5 = in.nextLine();
																			
							toppings.add(0, input5);
																									
						}
						
						toppings.remove(input4);
											
						Pizza order5 = new Pizza("Regular", input2, toppings);
						
						order.add(order5);
											
					}
					
					if (input3.equalsIgnoreCase("Hawaiian")) {
													
						SpecialtyPizza order1 = new SpecialtyPizza(input2, hawaiian, input3);
											
						order.add(order1);
										
					}
					
					if (input3.equalsIgnoreCase("Veggie")) {
											
						SpecialtyPizza order2 = new SpecialtyPizza(input2, veggie, input3);
						
						order.add(order2);
					
					}
					
					if (input3.equalsIgnoreCase("White")) {
						
						SpecialtyPizza order3 = new SpecialtyPizza(input2, white, input3);
					
						order.add(order3);
						
					}
					
					if (input3.equalsIgnoreCase("Meat-Lovers")) {
						
						SpecialtyPizza order4 = new SpecialtyPizza(input2, meatLovers, input3);
					
						order.add(order4);
						
					}
					
					System.out.println("Would you like to order another pizza? Type \"Yes\" or \"No.\"");
					
					input1 = in.nextLine();
					
				}		
				
			}
			
			System.out.println("Here is your order. \n");			
			
			for (int i = 0; i < order.size(); i ++) {
								
				System.out.println("Pizza #" + (i + 1) + " - " + order.get(i));
				
			}
			
		}
				
		if (!input1.equalsIgnoreCase("Yes")) {
			
			System.out.println("Please return when you would like to order a pizza. ");

			
		}
		
	}

}
