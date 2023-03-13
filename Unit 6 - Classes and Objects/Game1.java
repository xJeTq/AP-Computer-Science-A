import java.util.Scanner;

public class Game1 {

	public static int diceRoll() {
		
		int roll = (int) (Math.random() * 20 + 1);

		return roll;
		
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		Player1 player = new Player1(100, 7);
		Enemy1 pirate1 = new Enemy1(25, 5);
		Enemy1 pirate2 = new Enemy1(25, 5);
		Enemy1 pirate3 = new Enemy1(25, 5);
		
		String[] enemies = {"Small Pirate", "Medium Pirate", "Big Pirate"};
		
		String enemy1 = enemies[0];
		String enemy2 = enemies[1];
		String enemy3 = enemies[2];
		
		System.out.println("You are desserted on an island.");
		System.out.println("You encounter three pirates along the way.");
		
		while(pirate1.getHealth() > 0) {
			
			System.out.println("Press t to roll the dice to see how much damage you deal. If you roll above a 10, you do damage. If you don't, you miss. \n");
			
			String input1 = in.nextLine();
					
			if (input1.equals("t")) {
				
				int diceRoll = diceRoll();
				
				System.out.println("You rolled a " + diceRoll + ".");
				
				if (diceRoll >= 10) {
								
					pirate1.setHealth(pirate1.getHealth() - player.getDamage());
					
					System.out.println("You hit the " + enemy1 + ". You did " + player.getDamage() + " damage. The " + enemy1 + "'s health is now " + pirate1.getHealth() + ". \n");
					
				} else {
					
					System.out.println("You missed. \n");
					
				}
				
			}
			
			int diceRoll2 = diceRoll();
			
			if (diceRoll2 >= 10 && pirate1.getHealth() > 0) {
				
				System.out.println("It is now the enemies turn to roll the dice.");
									
				player.setHealth(player.getHealth() - pirate1.getDamage());
				
				System.out.println("They hit you. They did " + pirate1.getDamage() + " damage. Your health is now " + player.getHealth() + ". \n");
				
				System.out.println("It is now your turn to roll the dice.");
				
			} 
			
			if (diceRoll2 < 10 && pirate1.getHealth() > 0) {
				
				System.out.println("They missed you. \n");
				
			}
			
			if (player.getHealth() < 0) {
				
				System.out.println("You died. \n");
				
			}
			
		}
		
		System.out.println("The " + enemy1 + " is dead.");
		
		System.out.println("You now see the " + enemy2 + ". \n");
		
		while(pirate2.getHealth() > 0) {
			
			System.out.println("Press t to roll the dice to see how much damage you deal. If you roll above a 10, you do damage. If you don't, you miss. \n");
			
			String input1 = in.nextLine();
					
			if (input1.equals("t")) {
				
				int diceRoll = diceRoll();
				
				System.out.println("You rolled a " + diceRoll + ".");
				
				if (diceRoll >= 10) {
								
					pirate2.setHealth(pirate2.getHealth() - player.getDamage());
					
					System.out.println("You hit the " + enemy2 + ". You did " + player.getDamage() + " damage. The " + enemy2 + "'s health is now " + pirate2.getHealth() + ". \n");
					
				} else {
					
					System.out.println("You missed. \n");
					
				}
				
			}
			
			int diceRoll2 = diceRoll();
			
			if (diceRoll2 >= 10 && pirate2.getHealth() > 0) {
				
				System.out.println("It is now the enemies turn to roll the dice.");
									
				player.setHealth(player.getHealth() - pirate2.getDamage());
				
				System.out.println("They hit you. They did " + pirate2.getDamage() + " damage. Your health is now " + player.getHealth() + ". \n");
				
				System.out.println("It is now your turn to roll the dice.");
				
			} 
			
			if (diceRoll2 < 10 && pirate2.getHealth() > 0) {
				
				System.out.println("They missed you. \n");
				
			}
			
			if (player.getHealth() < 0) {
				
				System.out.println("You died. \n");
				
			}
			
		}
		
		System.out.println("The " + enemy2 + " is dead.");
		
		System.out.println("You now see the " + enemy3 + ". \n");
		
		while(pirate3.getHealth() > 0) {
			
			System.out.println("Press t to roll the dice to see how much damage you deal. If you roll above a 10, you do damage. If you don't, you miss. \n");
			
			String input1 = in.nextLine();
					
			if (input1.equals("t")) {
				
				int diceRoll = diceRoll();
				
				System.out.println("You rolled a " + diceRoll + ".");
				
				if (diceRoll >= 10) {
								
					pirate3.setHealth(pirate3.getHealth() - player.getDamage());
					
					System.out.println("You hit the " + enemy3 + ". You did " + player.getDamage() + " damage. The " + enemy3 + "'s health is now " + pirate3.getHealth() + ". \n");
					
				} else {
					
					System.out.println("You missed. \n");
					
				}
				
			}
			
			int diceRoll2 = diceRoll();
			
			if (diceRoll2 >= 10 && pirate3.getHealth() > 0) {
				
				System.out.println("It is now the enemies turn to roll the dice.");
									
				player.setHealth(player.getHealth() - pirate3.getDamage());
				
				System.out.println("They hit you. They did " + pirate3.getDamage() + " damage. Your health is now " + player.getHealth() + ". \n");
				
				System.out.println("It is now your turn to roll the dice.");
				
			} 
			
			if (diceRoll2 < 10 && pirate3.getHealth() > 0) {
				
				System.out.println("They missed you. \n");
				
			}
			
			if (player.getHealth() < 0) {
				
				System.out.println("You died. \n");
				
			}
			
		}
		
		System.out.println("The " + enemy3 + " is dead.");
		
		System.out.println("You defeated all three pirates and successfully escaped the island! \n");
		
		
		
	}

}
