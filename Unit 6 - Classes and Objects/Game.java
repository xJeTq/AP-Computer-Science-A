import java.util.Scanner;

public class Game {
	
	public static String randomVillain(String[] villains) {
		
		int random = (int) (Math.random() * villains.length);
		
		return villains[random];
		
	}
	
	public static int dice() {
		
		int dice = (int) (Math.random() * 20 + 1);
		
		return dice;
		
	}
	
	public static String randomWeapon(String[] weapons) {
		
		String output = weapons[(int)(Math.random() * weapons.length - 1)];
		
		return output;
		
	}

	public static void main(String[] args) throws InterruptedException {

		Player character = new Player(100);
		Enemy villain1 = new Enemy(10);
		Enemy villain2 = new Enemy(10);
		Enemy villain3 = new Enemy(10);
		Enemy villain4 = new Enemy(10);
		Enemy villain5 = new Enemy(10);

		String[] villains = {"Ork", "Werewolf", "Goblin", "Demon", "Ghost"};
		String[] basicWeapons = {"Fists", "Shovel", "Sword", "Musket", "Bazooka"};
		String[] magicWeapons = {"Fists", "Water Spell", "Ice Spell", "Fire Spell", "Strike Spell"};
		String[] ninjaWeapons = {"Fists", "Smoke Bombs", "Ninja Stars", "Nunchucks", "Katana"};
		
		Scanner in = new Scanner(System.in);
		
		String playAgain = "Yes";
		
		while (playAgain.equalsIgnoreCase("Yes")) {
			
			System.out.println("Welcome to Dungeons and Dragons! Please enter the name of your character.");
			
			String name = in.nextLine();
			
			System.out.println("Please select a class. Type \"Basic,\" \"Magic,\" or \"Ninja\"");
			
			String playerClass = in.nextLine();
			
			if (playerClass.equalsIgnoreCase("Basic")) {
				
				System.out.println("Perfect. Let's begin... ");
				Thread.sleep(1500);
				System.out.println("You are on a quest to rescue Princess Fiona from Castle Duloc. ");
				Thread.sleep(1850);
				System.out.println("Many have tried to rescue her, but none have returned. ");
				Thread.sleep(1850);
				System.out.println("There are evil villains along the way, trying their best to stop you from rescuing her. ");
				Thread.sleep(1850);
				System.out.println("You begin your journey, hoping to rescue Princess Fiona once and for all. ");
				Thread.sleep(1850);
							
				String randomVillain1 = randomVillain(villains);
				String randomVillain2 = randomVillain(villains);
				String randomVillain3 = randomVillain(villains);
				String randomVillain4 = randomVillain(villains);
				String randomVillain5 = randomVillain(villains);
				
				System.out.println("As you are walking through the Ardennes Forest, you come across your first villain: " + randomVillain1 + ". You draw your " + randomWeapon(basicWeapons) + ".");
				Thread.sleep(2250);
				System.out.println("Roll the 20-sided die to find out if you land your attack.");
				Thread.sleep(1500);
				System.out.println("If you roll higher than a 10, you automatically hit the target, but depending on the number will determine the damage you deal.");
				Thread.sleep(1850);
				System.out.println("The higher the number, the more damage you deal.");
				Thread.sleep(1500);
				
				while (villain1.getHealth() > 0) {
					
					if (character.getHealth() > 1 && villain1.getHealth() > 0) {
						
						System.out.println("Press \"R\" to roll the dice.");	
						
						Thread.sleep(1000);
						
					}
					
					String diceRoll1 = in.nextLine();
					
					if (diceRoll1.equalsIgnoreCase("R")) {
						
						int actualDiceRoll = dice();
						
						System.out.println("You rolled a(n) " + actualDiceRoll + ".");
						
						Thread.sleep(1000);
						
						if (actualDiceRoll >= 10 && character.getHealth() > 1) {
							
							System.out.println("You hit the " + randomVillain1 + ".");
							
							Thread.sleep(1000);
							
							if (actualDiceRoll <= 13) {
								
								if (villain1.getHealth() - 2 <= 0) {
									
									int h = villain1.getHealth();
									
									villain1.setHealth(0);
									
									System.out.println("Since you rolled a(n) " + actualDiceRoll + ", you did 2 Damage. The enemies' health will now be reduced from " + h + " to " + villain1.getHealth() + ". ");
									
									Thread.sleep(2250);
									
								} else {
								
								System.out.println("Since you rolled a(n) " + actualDiceRoll + ", you did 2 Damage. The enemies' health will now be reduced from " + villain1.getHealth() + " to " + (villain1.getHealth() - 2) + ". ");
								
								Thread.sleep(2250);
								
								villain1.setHealth(villain1.getHealth() - 2);
								
								}
								
							} else if (actualDiceRoll >= 13 || actualDiceRoll <= 17) {
								
								if (villain1.getHealth() - 4 <= 0) {
									
									int h = villain1.getHealth();
									
									villain1.setHealth(0);
									
									System.out.println("Since you rolled a(n) " + actualDiceRoll + ", you did 4 Damage. The enemies' health will now be reduced from " + h + " to " + villain1.getHealth() + ". ");
									
									Thread.sleep(2250);
									
								} else {
								
								System.out.println("Since you rolled a(n) " + actualDiceRoll + ", you did 4 Damage. The enemies' health will now be reduced from " + villain1.getHealth() + " to " + (villain1.getHealth() - 4) + ". ");
								
								Thread.sleep(2250);
								
								villain1.setHealth(villain1.getHealth() - 4);
								
								}
								
							} else if (actualDiceRoll >= 17) {
								
								if (villain1.getHealth() - 6 <= 0) {
									
									int h = villain1.getHealth();
									
									villain1.setHealth(0);
									
									System.out.println("Since you rolled a(n) " + actualDiceRoll + ", you did 6 Damage. The enemies' health will now be reduced from " + h + " to " + villain1.getHealth() + ". ");
									
									Thread.sleep(2250);
									
								} else {
								
								System.out.println("Since you rolled a(n) " + actualDiceRoll + ", you did 6 Damage. The enemies' health will now be reduced from " + villain1.getHealth() + " to " + (villain1.getHealth() - 6) + ". ");
								
								Thread.sleep(2250);
								
								villain1.setHealth(villain1.getHealth() - 6);
								
								}
								
							}
							
						} if (actualDiceRoll < 10 && character.getHealth() > 1) {
							
							System.out.println("You missed the " + randomVillain1 + ". Now they will roll the dice. ");
							
							Thread.sleep(1500);
							
						}
						
						if (villain1.getHealth() > 1) {
							
							System.out.println("It is now the " + randomVillain1 + "'s turn to roll the dice.");
							
							Thread.sleep(1500);	
							
						}
						
						int actualDiceRoll2 = dice();
						
						if (actualDiceRoll2 >= 10 && villain1.getHealth() > 1) {
							
							if (actualDiceRoll2 <= 13) {
								
								System.out.println("Since they rolled a(n) " + actualDiceRoll2 + ", they did 4 Damage. Your health will now be reduced from " + character.getHealth() + " to " + (character.getHealth() - 4) + ". ");
								
								Thread.sleep(2250);
								
								character.setHealth(character.getHealth() - 4);
								
							} else if (actualDiceRoll2 >= 13 || actualDiceRoll2 <= 17) {
								
								System.out.println("Since they rolled a(n) " + actualDiceRoll2 + ", they did 6 Damage. Your health will now be reduced from " + character.getHealth() + " to " + (character.getHealth() - 6) + ". ");
								
								Thread.sleep(2250);
								
								character.setHealth(character.getHealth() - 6);
								
							} else if (actualDiceRoll2 >= 17) {
								
								System.out.println("Since they rolled a(n) " + actualDiceRoll2 + ", they did 8 Damage. Your health will now be reduced from " + character.getHealth() + " to " + (character.getHealth() - 8) + ". ");
								
								Thread.sleep(2250);
								
								character.setHealth(character.getHealth() - 8);
								
							}
							
						} if (actualDiceRoll2 < 10 && villain1.getHealth() > 1) {
							
							System.out.println("They missed you. Now it's your turn to roll the dice. ");
							
							Thread.sleep(1500);
							
						}
							
					}
					
				}
				
				if (villain1.getHealth() < 1) {
					
					System.out.println("You killed the " + randomVillain1 + ". You now continue your journey through the forest to resue the princess and encounter a " + randomVillain2 + ". You draw your " + randomWeapon(basicWeapons) + ".");
					
					Thread.sleep(2250);
					
				} 
				
				if (character.getHealth() < 1) {
					
					System.out.println("You died. Game over.");
					
					System.exit(0);
					
				}
				
				while (villain2.getHealth() > 0) {
					
					if (character.getHealth() > 1 && villain2.getHealth() > 0) {
						
						System.out.println("Press \"R\" to roll the dice.");
						
						Thread.sleep(1000);
						
					}
					
					String diceRoll2 = in.nextLine();
					
					if (diceRoll2.equalsIgnoreCase("R")) {
						
						int actualDiceRoll3 = dice();
						
						System.out.println("You rolled a(n) " + actualDiceRoll3 + ".");
						
						Thread.sleep(1000);
						
						if (actualDiceRoll3 >= 10 && character.getHealth() > 1) {
							
							System.out.println("You hit the " + randomVillain2 + ".");
							
							Thread.sleep(1000);
							
							if (actualDiceRoll3 <= 13) {
														
								if (villain2.getHealth() - 2 <= 0) {
									
									int h = villain2.getHealth();
									
									villain2.setHealth(0);
									
									System.out.println("Since you rolled a(n) " + actualDiceRoll3 + ", you did 2 Damage. The enemies' health will now be reduced from " + h + " to " + villain2.getHealth() + ". ");
									
									Thread.sleep(2250);
									
								} else {
								
								System.out.println("Since you rolled a(n) " + actualDiceRoll3 + ", you did 2 Damage. The enemies' health will now be reduced from " + villain2.getHealth() + " to " + (villain2.getHealth() - 2) + ". ");
								
								Thread.sleep(2250);
								
								villain2.setHealth(villain2.getHealth() - 2);
								
								}
								
							} else if (actualDiceRoll3 >= 13 || actualDiceRoll3 <= 17) {
								
								if (villain2.getHealth() - 4 <= 0) {
									
									int h = villain2.getHealth();
									
									villain2.setHealth(0);
									
									System.out.println("Since you rolled a(n) " + actualDiceRoll3 + ", you did 4 Damage. The enemies' health will now be reduced from " + h + " to " + villain2.getHealth() + ". ");
									
									Thread.sleep(2250);
									
								} else {
								
								System.out.println("Since you rolled a(n) " + actualDiceRoll3 + ", you did 4 Damage. The enemies' health will now be reduced from " + villain2.getHealth() + " to " + (villain2.getHealth() - 4) + ". ");
								
								Thread.sleep(2250);
								
								villain2.setHealth(villain2.getHealth() - 4);
								
								}
								
							} else if (actualDiceRoll3 >= 17) {
								
								if (villain2.getHealth() - 6 <= 0) {
									
									int h = villain2.getHealth();
									
									villain2.setHealth(0);
									
									System.out.println("Since you rolled a(n) " + actualDiceRoll3 + ", you did 6 Damage. The enemies' health will now be reduced from " + h + " to " + villain2.getHealth() + ". ");
									
									Thread.sleep(2250);
									
								} else {
								
								System.out.println("Since you rolled a(n) " + actualDiceRoll3 + ", you did 6 Damage. The enemies' health will now be reduced from " + villain2.getHealth() + " to " + (villain2.getHealth() - 6) + ". ");
								
								Thread.sleep(2250);
								
								villain2.setHealth(villain2.getHealth() - 6);
								
								}
								
							}
							
						} if (actualDiceRoll3 < 10 && character.getHealth() > 1) {
							
							System.out.println("You missed the " + randomVillain2 + ". Now they will roll the dice. ");
							
							Thread.sleep(1500);
							
						}
						
						if (villain2.getHealth() > 1) {
							
							System.out.println("It is now the " + randomVillain2 + "'s turn to roll the dice.");
							
							Thread.sleep(1500);	
							
						}
						
						int actualDiceRoll4 = dice();
						
						if (actualDiceRoll4 >= 10 && villain2.getHealth() > 1) {
							
							if (actualDiceRoll4 <= 13) {
								
								System.out.println("Since they rolled a(n) " + actualDiceRoll4 + ", they did 4 Damage. Your health will now be reduced from " + character.getHealth() + " to " + (character.getHealth() - 4) + ". ");
								
								Thread.sleep(2250);
								
								character.setHealth(character.getHealth() - 4);
								
							} else if (actualDiceRoll4 >= 13 || actualDiceRoll4 <= 17) {
								
								System.out.println("Since they rolled a(n) " + actualDiceRoll4 + ", they did 6 Damage. Your health will now be reduced from " + character.getHealth() + " to " + (character.getHealth() - 6) + ". ");
								
								Thread.sleep(2250);
								
								character.setHealth(character.getHealth() - 6);
								
							} else if (actualDiceRoll4 >= 17) {
								
								System.out.println("Since they rolled a(n) " + actualDiceRoll4 + ", they did 8 Damage. Your health will now be reduced from " + character.getHealth() + " to " + (character.getHealth() - 8) + ". ");
								
								Thread.sleep(2250);
								
								character.setHealth(character.getHealth() - 8);
								
							}
							
						} if (actualDiceRoll4 < 10 && villain2.getHealth() > 1) {
							
							System.out.println("They missed you. Now it's your turn to roll the dice. ");
							
							Thread.sleep(1500);
							
						}
							
					}
					
				}
				
				if (villain2.getHealth() < 1) {
					
					System.out.println("You killed the " + randomVillain2 + ". You now continue your journey through the forest to resue the princess and encounter a " + randomVillain3  + ". You draw your " + randomWeapon(basicWeapons) + ".");
					
					Thread.sleep(2250);
					
				} 
				
				if (character.getHealth() < 1) {
					
					System.out.println("You died. Game over.");
					
					System.exit(0);
					
				}
				
				while (villain3.getHealth() > 0) {
					
					if (character.getHealth() > 1 && villain3.getHealth() > 0) {
						
						System.out.println("Press \"R\" to roll the dice.");
						
						Thread.sleep(1000);
						
					}
					
					String diceRoll3 = in.nextLine();
					
					if (diceRoll3.equalsIgnoreCase("R")) {
						
						int actualDiceRoll5 = dice();
						
						System.out.println("You rolled a(n) " + actualDiceRoll5 + ".");
						
						Thread.sleep(1000);
						
						if (actualDiceRoll5 >= 10 && character.getHealth() > 1) {
							
							System.out.println("You hit the " + randomVillain3 + ".");
							
							Thread.sleep(1000);
							
							if (actualDiceRoll5 <= 13) {
														
								if (villain3.getHealth() - 2 <= 0) {
									
									int h = villain3.getHealth();
									
									villain3.setHealth(0);
									
									System.out.println("Since you rolled a(n) " + actualDiceRoll5 + ", you did 2 Damage. The enemies' health will now be reduced from " + h + " to " + villain3.getHealth() + ". ");
									
									Thread.sleep(2250);
									
								} else {
								
								System.out.println("Since you rolled a(n) " + actualDiceRoll5 + ", you did 2 Damage. The enemies' health will now be reduced from " + villain3.getHealth() + " to " + (villain3.getHealth() - 2) + ". ");
								
								Thread.sleep(2250);
								
								villain3.setHealth(villain3.getHealth() - 2);
								
								}
								
							} else if (actualDiceRoll5 >= 13 || actualDiceRoll5 <= 17) {
								
								if (villain3.getHealth() - 4 <= 0) {
									
									int h = villain3.getHealth();
									
									villain3.setHealth(0);
									
									System.out.println("Since you rolled a(n) " + actualDiceRoll5 + ", you did 4 Damage. The enemies' health will now be reduced from " + h + " to " + villain3.getHealth() + ". ");
									
									Thread.sleep(2250);
									
								} else {
								
								System.out.println("Since you rolled a(n) " + actualDiceRoll5 + ", you did 4 Damage. The enemies' health will now be reduced from " + villain3.getHealth() + " to " + (villain3.getHealth() - 4) + ". ");
								
								Thread.sleep(2250);
								
								villain3.setHealth(villain3.getHealth() - 4);
								
								}
								
							} else if (actualDiceRoll5 >= 17) {
								
								if (villain3.getHealth() - 6 <= 0) {
									
									int h = villain3.getHealth();
									
									villain3.setHealth(0);
									
									System.out.println("Since you rolled a(n) " + actualDiceRoll5 + ", you did 6 Damage. The enemies' health will now be reduced from " + h + " to " + villain3.getHealth() + ". ");
									
									Thread.sleep(2250);
									
								} else {
								
								System.out.println("Since you rolled a(n) " + actualDiceRoll5 + ", you did 6 Damage. The enemies' health will now be reduced from " + villain3.getHealth() + " to " + (villain3.getHealth() - 6) + ". ");
								
								Thread.sleep(2250);
								
								villain3.setHealth(villain3.getHealth() - 6);
								
								}
								
							}
							
						} if (actualDiceRoll5 < 10 && character.getHealth() > 1) {
							
							System.out.println("You missed the " + randomVillain3 + ". Now they will roll the dice. ");
							
							Thread.sleep(1500);
							
						}
						
						if (villain3.getHealth() > 1) {
							
							System.out.println("It is now the " + randomVillain3 + "'s turn to roll the dice.");
							
							Thread.sleep(1500);
							
						}
						
						int actualDiceRoll6 = dice();
						
						if (actualDiceRoll6 >= 10 && villain3.getHealth() > 1) {
							
							if (actualDiceRoll6 <= 13) {
								
								System.out.println("Since they rolled a(n) " + actualDiceRoll6 + ", they did 4 Damage. Your health will now be reduced from " + character.getHealth() + " to " + (character.getHealth() - 4) + ". ");
								
								Thread.sleep(2250);
								
								character.setHealth(character.getHealth() - 4);
								
							} else if (actualDiceRoll6 >= 13 || actualDiceRoll6 <= 17) {
								
								System.out.println("Since they rolled a(n) " + actualDiceRoll6 + ", they did 6 Damage. Your health will now be reduced from " + character.getHealth() + " to " + (character.getHealth() - 6) + ". ");
								
								Thread.sleep(2250);
								
								character.setHealth(character.getHealth() - 6);
								
							} else if (actualDiceRoll6 >= 17) {
								
								System.out.println("Since they rolled a(n) " + actualDiceRoll6 + ", they did 8 Damage. Your health will now be reduced from " + character.getHealth() + " to " + (character.getHealth() - 8) + ". ");
								
								Thread.sleep(2250);
								
								character.setHealth(character.getHealth() - 8);
								
							}
							
						} if (actualDiceRoll6 < 10 && villain3.getHealth() > 1) {
							
							System.out.println("They missed you. Now it's your turn to roll the dice. ");
							
							Thread.sleep(1500);
							
						}
							
					}
					
				}
				
				if (villain3.getHealth() < 1) {
					
					System.out.println("You killed the " + randomVillain3 + ". You now continue your journey through the forest to resue the princess and encounter a " + randomVillain4  + ". You draw your " + randomWeapon(basicWeapons) + ".");
					
					Thread.sleep(2250);
					
				} 
				
				if (character.getHealth() < 1) {
					
					System.out.println("You died. Game over.");
					
					System.exit(0);
					
				}
				
				while (villain4.getHealth() > 0) {
					
					if (character.getHealth() > 1 && villain4.getHealth() > 0) {
						
						System.out.println("Press \"R\" to roll the dice.");	
						
						Thread.sleep(1000);
						
					}
					
					String diceRoll4 = in.nextLine();
					
					if (diceRoll4.equalsIgnoreCase("R")) {
						
						int actualDiceRoll7 = dice();
						
						System.out.println("You rolled a(n) " + actualDiceRoll7 + ".");
						
						Thread.sleep(1000);
						
						if (actualDiceRoll7 >= 10 && character.getHealth() > 1) {
							
							System.out.println("You hit the " + randomVillain4 + ".");
							
							Thread.sleep(1000);
							
							if (actualDiceRoll7 <= 13) {
														
								if (villain4.getHealth() - 2 <= 0) {
									
									int h = villain4.getHealth();
									
									villain4.setHealth(0);
									
									System.out.println("Since you rolled a(n) " + actualDiceRoll7 + ", you did 2 Damage. The enemies' health will now be reduced from " + h + " to " + villain4.getHealth() + ". ");
									
									Thread.sleep(2250);
									
								} else {
								
								System.out.println("Since you rolled a(n) " + actualDiceRoll7 + ", you did 2 Damage. The enemies' health will now be reduced from " + villain4.getHealth() + " to " + (villain4.getHealth() - 2) + ". ");
								
								Thread.sleep(2250);
								
								villain4.setHealth(villain4.getHealth() - 2);
								
								}
								
							} else if (actualDiceRoll7 >= 13 || actualDiceRoll7 <= 17) {
								
								if (villain4.getHealth() - 4 <= 0) {
									
									int h = villain4.getHealth();
									
									villain4.setHealth(0);
									
									System.out.println("Since you rolled a(n) " + actualDiceRoll7 + ", you did 4 Damage. The enemies' health will now be reduced from " + h + " to " + villain4.getHealth() + ". ");
									
									Thread.sleep(2250);
									
								} else {
								
								System.out.println("Since you rolled a(n) " + actualDiceRoll7 + ", you did 4 Damage. The enemies' health will now be reduced from " + villain4.getHealth() + " to " + (villain4.getHealth() - 4) + ". ");
								
								Thread.sleep(2250);
								
								villain4.setHealth(villain4.getHealth() - 4);
								
								}
								
							} else if (actualDiceRoll7 >= 17) {
								
								if (villain4.getHealth() - 6 <= 0) {
									
									int h = villain4.getHealth();
									
									villain4.setHealth(0);
									
									System.out.println("Since you rolled a(n) " + actualDiceRoll7 + ", you did 6 Damage. The enemies' health will now be reduced from " + h + " to " + villain4.getHealth() + ". ");
									
									Thread.sleep(2250);
									
								} else {
								
								System.out.println("Since you rolled a(n) " + actualDiceRoll7 + ", you did 6 Damage. The enemies' health will now be reduced from " + villain4.getHealth() + " to " + (villain4.getHealth() - 6) + ". ");
								
								Thread.sleep(2250);
								
								villain4.setHealth(villain4.getHealth() - 6);
								
								}
								
							}
							
						} if (actualDiceRoll7 < 10 && character.getHealth() > 1) {
							
							System.out.println("You missed the " + randomVillain4 + ". Now they will roll the dice. ");
							
							Thread.sleep(1500);
							
						}
						
						if (villain4.getHealth() > 1) {
							
							System.out.println("It is now the " + randomVillain4 + "'s turn to roll the dice.");
							
							Thread.sleep(1500);	
							
						}
						
						int actualDiceRoll8 = dice();
						
						if (actualDiceRoll8 >= 10 && villain4.getHealth() > 1) {
							
							if (actualDiceRoll8 <= 13) {
								
								System.out.println("Since they rolled a(n) " + actualDiceRoll8 + ", they did 4 Damage. Your health will now be reduced from " + character.getHealth() + " to " + (character.getHealth() - 4) + ". ");
								
								Thread.sleep(2250);
								
								character.setHealth(character.getHealth() - 4);
								
							} else if (actualDiceRoll8 >= 13 || actualDiceRoll8 <= 17) {
								
								System.out.println("Since they rolled a(n) " + actualDiceRoll8 + ", they did 6 Damage. Your health will now be reduced from " + character.getHealth() + " to " + (character.getHealth() - 6) + ". ");
								
								Thread.sleep(2250);
								
								character.setHealth(character.getHealth() - 6);
								
							} else if (actualDiceRoll8 >= 17) {
								
								System.out.println("Since they rolled a(n) " + actualDiceRoll8 + ", they did 8 Damage. Your health will now be reduced from " + character.getHealth() + " to " + (character.getHealth() - 8) + ". ");
								
								Thread.sleep(2250);
								
								character.setHealth(character.getHealth() - 8);
								
							}
							
						} if (actualDiceRoll8 < 10 && villain4.getHealth() > 1) {
							
							System.out.println("They missed you. Now it's your turn to roll the dice. ");
							
							Thread.sleep(1500);
							
						}
							
					}
					
				}
				
				if (villain4.getHealth() < 1) {
					
					System.out.println("You killed the " + randomVillain4 + ". You now continue your journey through the forest to resue the princess and encounter a " + randomVillain5  + ". You draw your " + randomWeapon(basicWeapons) + ".");
					
					Thread.sleep(2250);
					
				} 
				
				if (character.getHealth() < 1) {
					
					System.out.println("You died. Game over.");
					
					System.exit(0);
					
				}
				
				while (villain5.getHealth() > 0) {
					
					if (character.getHealth() > 1 && villain5.getHealth() > 0) {
						
						System.out.println("Press \"R\" to roll the dice.");
						
						Thread.sleep(1000);
						
					}
					
					String diceRoll5 = in.nextLine();
					
					if (diceRoll5.equalsIgnoreCase("R")) {
						
						int actualDiceRoll9 = dice();
						
						System.out.println("You rolled a(n) " + actualDiceRoll9 + ".");
						
						Thread.sleep(1000);
						
						if (actualDiceRoll9 >= 10 && character.getHealth() > 1) {
							
							System.out.println("You hit the " + randomVillain5 + ".");
							
							Thread.sleep(1000);
							
							if (actualDiceRoll9 <= 13) {
														
								if (villain5.getHealth() - 2 <= 0) {
									
									int h = villain5.getHealth();
									
									villain5.setHealth(0);
									
									System.out.println("Since you rolled a(n) " + actualDiceRoll9 + ", you did 2 Damage. The enemies' health will now be reduced from " + h + " to " + villain5.getHealth() + ". ");
									
									Thread.sleep(2250);
									
								} else {
								
								System.out.println("Since you rolled a(n) " + actualDiceRoll9 + ", you did 2 Damage. The enemies' health will now be reduced from " + villain5.getHealth() + " to " + (villain5.getHealth() - 2) + ". ");
								
								Thread.sleep(2250);
								
								villain5.setHealth(villain5.getHealth() - 2);
								
								}
								
							} else if (actualDiceRoll9 >= 13 || actualDiceRoll9 <= 17) {
								
								if (villain5.getHealth() - 4 <= 0) {
									
									int h = villain5.getHealth();
									
									villain5.setHealth(0);
									
									System.out.println("Since you rolled a(n) " + actualDiceRoll9 + ", you did 4 Damage. The enemies' health will now be reduced from " + h + " to " + villain5.getHealth() + ". ");
									
									Thread.sleep(2250);
									
								} else {
								
								System.out.println("Since you rolled a(n) " + actualDiceRoll9 + ", you did 4 Damage. The enemies' health will now be reduced from " + villain5.getHealth() + " to " + (villain5.getHealth() - 4) + ". ");
								
								Thread.sleep(2250);
								
								villain5.setHealth(villain5.getHealth() - 4);
								
								}
								
							} else if (actualDiceRoll9 >= 17) {
								
								if (villain5.getHealth() - 6 <= 0) {
									
									int h = villain5.getHealth();
									
									villain5.setHealth(0);
									
									System.out.println("Since you rolled a(n) " + actualDiceRoll9 + ", you did 6 Damage. The enemies' health will now be reduced from " + h + " to " + villain5.getHealth() + ". ");
									
									Thread.sleep(2250);
									
								} else {
								
								System.out.println("Since you rolled a(n) " + actualDiceRoll9 + ", you did 6 Damage. The enemies' health will now be reduced from " + villain5.getHealth() + " to " + (villain5.getHealth() - 6) + ". ");
								
								Thread.sleep(2250);
								
								villain5.setHealth(villain5.getHealth() - 6);
								
								}
								
							}
							
						} if (actualDiceRoll9 < 10 && character.getHealth() > 1) {
							
							System.out.println("You missed the " + randomVillain5 + ". Now they will roll the dice. ");
							
							Thread.sleep(1500);
							
						}
						
						if (villain5.getHealth() > 1) {
							
							System.out.println("It is now the " + randomVillain5 + "'s turn to roll the dice.");
							
							Thread.sleep(1500);
							
						}
						
						int actualDiceRoll10 = dice();
						
						if (actualDiceRoll10 >= 10 && villain5.getHealth() > 1) {
							
							if (actualDiceRoll10 <= 13) {
								
								System.out.println("Since they rolled a(n) " + actualDiceRoll10 + ", they did 4 Damage. Your health will now be reduced from " + character.getHealth() + " to " + (character.getHealth() - 4) + ". ");
								
								Thread.sleep(2250);
								
								character.setHealth(character.getHealth() - 4);
								
							} else if (actualDiceRoll10 >= 13 || actualDiceRoll10 <= 17) {
								
								System.out.println("Since they rolled a(n) " + actualDiceRoll10 + ", they did 6 Damage. Your health will now be reduced from " + character.getHealth() + " to " + (character.getHealth() - 6) + ". ");
								
								Thread.sleep(2250);
								
								character.setHealth(character.getHealth() - 6);
								
							} else if (actualDiceRoll10 >= 17) {
								
								System.out.println("Since they rolled a(n) " + actualDiceRoll10 + ", they did 8 Damage. Your health will now be reduced from " + character.getHealth() + " to " + (character.getHealth() - 8) + ". ");
								
								Thread.sleep(2250);
								
								character.setHealth(character.getHealth() - 8);
								
							}
							
						} if (actualDiceRoll10 < 10 && villain5.getHealth() > 1) {
							
							System.out.println("They missed you. Now it's your turn to roll the dice. ");
							
							Thread.sleep(1500);
							
						}
							
					}
					
				}
				
				if (villain5.getHealth() < 1) {
					
					System.out.println("Congratulations, " + name + "! You killed the " + randomVillain5 + ". You successfully saved Princess Fiona from Castle Duloc!");
					
					Thread.sleep(1500);
					
				}
				
				if (character.getHealth() < 1) {
					
					System.out.println("You died. Game over.");
					
					System.exit(0);
					
				}
				
				System.out.println("Do you want to play again? Type \"Yes\" or \"No.\"");
				
				playAgain = in.nextLine();
				
			}
			
			if (playerClass.equalsIgnoreCase("Magic")) {
				
				System.out.println("Perfect. Let's begin... ");
				Thread.sleep(1500);
				System.out.println("You are on a quest to rescue Princess Fiona from Castle Duloc. ");
				Thread.sleep(1850);
				System.out.println("Many have tried to rescue her, but none have returned. ");
				Thread.sleep(1850);
				System.out.println("There are evil villains along the way, trying their best to stop you from rescuing her. ");
				Thread.sleep(1850);
				System.out.println("You begin your journey, hoping to rescue Princess Fiona once and for all. ");
				Thread.sleep(1850);
							
				String randomVillain1 = randomVillain(villains);
				String randomVillain2 = randomVillain(villains);
				String randomVillain3 = randomVillain(villains);
				String randomVillain4 = randomVillain(villains);
				String randomVillain5 = randomVillain(villains);
				
				System.out.println("As you are walking through the Ardennes Forest, you come across your first villain: " + randomVillain1 + ". You draw your " + randomWeapon(magicWeapons) + ".");
				Thread.sleep(2250);
				System.out.println("Roll the 20-sided die to find out if you land your attack.");
				Thread.sleep(1500);
				System.out.println("If you roll higher than a 10, you automatically hit the target, but depending on the number will determine the damage you deal.");
				Thread.sleep(1850);
				System.out.println("The higher the number, the more damage you deal.");
				Thread.sleep(1500);
				
				while (villain1.getHealth() > 0) {
					
					if (character.getHealth() > 1 && villain1.getHealth() > 0) {
						
						System.out.println("Press \"R\" to roll the dice.");	
						
						Thread.sleep(1000);
						
					}
					
					String diceRoll1 = in.nextLine();
					
					if (diceRoll1.equalsIgnoreCase("R")) {
						
						int actualDiceRoll = dice();
						
						System.out.println("You rolled a(n) " + actualDiceRoll + ".");
						
						Thread.sleep(1000);
						
						if (actualDiceRoll >= 10 && character.getHealth() > 1) {
							
							System.out.println("You hit the " + randomVillain1 + ".");
							
							Thread.sleep(1000);
							
							if (actualDiceRoll <= 13) {
								
								if (villain1.getHealth() - 2 <= 0) {
									
									int h = villain1.getHealth();
									
									villain1.setHealth(0);
									
									System.out.println("Since you rolled a(n) " + actualDiceRoll + ", you did 2 Damage. The enemies' health will now be reduced from " + h + " to " + villain1.getHealth() + ". ");
									
									Thread.sleep(2250);
									
								} else {
								
								System.out.println("Since you rolled a(n) " + actualDiceRoll + ", you did 2 Damage. The enemies' health will now be reduced from " + villain1.getHealth() + " to " + (villain1.getHealth() - 2) + ". ");
								
								Thread.sleep(2250);
								
								villain1.setHealth(villain1.getHealth() - 2);
								
								}
								
							} else if (actualDiceRoll >= 13 || actualDiceRoll <= 17) {
								
								if (villain1.getHealth() - 4 <= 0) {
									
									int h = villain1.getHealth();
									
									villain1.setHealth(0);
									
									System.out.println("Since you rolled a(n) " + actualDiceRoll + ", you did 4 Damage. The enemies' health will now be reduced from " + h + " to " + villain1.getHealth() + ". ");
									
									Thread.sleep(2250);
									
								} else {
								
								System.out.println("Since you rolled a(n) " + actualDiceRoll + ", you did 4 Damage. The enemies' health will now be reduced from " + villain1.getHealth() + " to " + (villain1.getHealth() - 4) + ". ");
								
								Thread.sleep(2250);
								
								villain1.setHealth(villain1.getHealth() - 4);
								
								}
								
							} else if (actualDiceRoll >= 17) {
								
								if (villain1.getHealth() - 6 <= 0) {
									
									int h = villain1.getHealth();
									
									villain1.setHealth(0);
									
									System.out.println("Since you rolled a(n) " + actualDiceRoll + ", you did 6 Damage. The enemies' health will now be reduced from " + h + " to " + villain1.getHealth() + ". ");
									
									Thread.sleep(2250);
									
								} else {
								
								System.out.println("Since you rolled a(n) " + actualDiceRoll + ", you did 6 Damage. The enemies' health will now be reduced from " + villain1.getHealth() + " to " + (villain1.getHealth() - 6) + ". ");
								
								Thread.sleep(2250);
								
								villain1.setHealth(villain1.getHealth() - 6);
								
								}
								
							}
							
						} if (actualDiceRoll < 10 && character.getHealth() > 1) {
							
							System.out.println("You missed the " + randomVillain1 + ". Now they will roll the dice. ");
							
							Thread.sleep(1500);
							
						}
						
						if (villain1.getHealth() > 1) {
							
							System.out.println("It is now the " + randomVillain1 + "'s turn to roll the dice.");
							
							Thread.sleep(1500);	
							
						}
						
						int actualDiceRoll2 = dice();
						
						if (actualDiceRoll2 >= 10 && villain1.getHealth() > 1) {
							
							if (actualDiceRoll2 <= 13) {
								
								System.out.println("Since they rolled a(n) " + actualDiceRoll2 + ", they did 4 Damage. Your health will now be reduced from " + character.getHealth() + " to " + (character.getHealth() - 4) + ". ");
								
								Thread.sleep(2250);
								
								character.setHealth(character.getHealth() - 4);
								
							} else if (actualDiceRoll2 >= 13 || actualDiceRoll2 <= 17) {
								
								System.out.println("Since they rolled a(n) " + actualDiceRoll2 + ", they did 6 Damage. Your health will now be reduced from " + character.getHealth() + " to " + (character.getHealth() - 6) + ". ");
								
								Thread.sleep(2250);
								
								character.setHealth(character.getHealth() - 6);
								
							} else if (actualDiceRoll2 >= 17) {
								
								System.out.println("Since they rolled a(n) " + actualDiceRoll2 + ", they did 8 Damage. Your health will now be reduced from " + character.getHealth() + " to " + (character.getHealth() - 8) + ". ");
								
								Thread.sleep(2250);
								
								character.setHealth(character.getHealth() - 8);
								
							}
							
						} if (actualDiceRoll2 < 10 && villain1.getHealth() > 1) {
							
							System.out.println("They missed you. Now it's your turn to roll the dice. ");
							
							Thread.sleep(1500);
							
						}
							
					}
					
				}
				
				if (villain1.getHealth() < 1) {
					
					System.out.println("You killed the " + randomVillain1 + ". You now continue your journey through the forest to resue the princess and encounter a " + randomVillain2 + ". You draw your " + randomWeapon(magicWeapons) + ".");
					
					Thread.sleep(2250);
					
				} 
				
				if (character.getHealth() < 1) {
					
					System.out.println("You died. Game over.");
					
					System.exit(0);
					
				}
				
				while (villain2.getHealth() > 0) {
					
					if (character.getHealth() > 1 && villain2.getHealth() > 0) {
						
						System.out.println("Press \"R\" to roll the dice.");
						
						Thread.sleep(1000);
						
					}
					
					String diceRoll2 = in.nextLine();
					
					if (diceRoll2.equalsIgnoreCase("R")) {
						
						int actualDiceRoll3 = dice();
						
						System.out.println("You rolled a(n) " + actualDiceRoll3 + ".");
						
						Thread.sleep(1000);
						
						if (actualDiceRoll3 >= 10 && character.getHealth() > 1) {
							
							System.out.println("You hit the " + randomVillain2 + ".");
							
							Thread.sleep(1000);
							
							if (actualDiceRoll3 <= 13) {
														
								if (villain2.getHealth() - 2 <= 0) {
									
									int h = villain2.getHealth();
									
									villain2.setHealth(0);
									
									System.out.println("Since you rolled a(n) " + actualDiceRoll3 + ", you did 2 Damage. The enemies' health will now be reduced from " + h + " to " + villain2.getHealth() + ". ");
									
									Thread.sleep(2250);
									
								} else {
								
								System.out.println("Since you rolled a(n) " + actualDiceRoll3 + ", you did 2 Damage. The enemies' health will now be reduced from " + villain2.getHealth() + " to " + (villain2.getHealth() - 2) + ". ");
								
								Thread.sleep(2250);
								
								villain2.setHealth(villain2.getHealth() - 2);
								
								}
								
							} else if (actualDiceRoll3 >= 13 || actualDiceRoll3 <= 17) {
								
								if (villain2.getHealth() - 4 <= 0) {
									
									int h = villain2.getHealth();
									
									villain2.setHealth(0);
									
									System.out.println("Since you rolled a(n) " + actualDiceRoll3 + ", you did 4 Damage. The enemies' health will now be reduced from " + h + " to " + villain2.getHealth() + ". ");
									
									Thread.sleep(2250);
									
								} else {
								
								System.out.println("Since you rolled a(n) " + actualDiceRoll3 + ", you did 4 Damage. The enemies' health will now be reduced from " + villain2.getHealth() + " to " + (villain2.getHealth() - 4) + ". ");
								
								Thread.sleep(2250);
								
								villain2.setHealth(villain2.getHealth() - 4);
								
								}
								
							} else if (actualDiceRoll3 >= 17) {
								
								if (villain2.getHealth() - 6 <= 0) {
									
									int h = villain2.getHealth();
									
									villain2.setHealth(0);
									
									System.out.println("Since you rolled a(n) " + actualDiceRoll3 + ", you did 6 Damage. The enemies' health will now be reduced from " + h + " to " + villain2.getHealth() + ". ");
									
									Thread.sleep(2250);
									
								} else {
								
								System.out.println("Since you rolled a(n) " + actualDiceRoll3 + ", you did 6 Damage. The enemies' health will now be reduced from " + villain2.getHealth() + " to " + (villain2.getHealth() - 6) + ". ");
								
								Thread.sleep(2250);
								
								villain2.setHealth(villain2.getHealth() - 6);
								
								}
								
							}
							
						} if (actualDiceRoll3 < 10 && character.getHealth() > 1) {
							
							System.out.println("You missed the " + randomVillain2 + ". Now they will roll the dice. ");
							
							Thread.sleep(1500);
							
						}
						
						if (villain2.getHealth() > 1) {
							
							System.out.println("It is now the " + randomVillain2 + "'s turn to roll the dice.");
							
							Thread.sleep(1500);	
							
						}
						
						int actualDiceRoll4 = dice();
						
						if (actualDiceRoll4 >= 10 && villain2.getHealth() > 1) {
							
							if (actualDiceRoll4 <= 13) {
								
								System.out.println("Since they rolled a(n) " + actualDiceRoll4 + ", they did 4 Damage. Your health will now be reduced from " + character.getHealth() + " to " + (character.getHealth() - 4) + ". ");
								
								Thread.sleep(2250);
								
								character.setHealth(character.getHealth() - 4);
								
							} else if (actualDiceRoll4 >= 13 || actualDiceRoll4 <= 17) {
								
								System.out.println("Since they rolled a(n) " + actualDiceRoll4 + ", they did 6 Damage. Your health will now be reduced from " + character.getHealth() + " to " + (character.getHealth() - 6) + ". ");
								
								Thread.sleep(2250);
								
								character.setHealth(character.getHealth() - 6);
								
							} else if (actualDiceRoll4 >= 17) {
								
								System.out.println("Since they rolled a(n) " + actualDiceRoll4 + ", they did 8 Damage. Your health will now be reduced from " + character.getHealth() + " to " + (character.getHealth() - 8) + ". ");
								
								Thread.sleep(2250);
								
								character.setHealth(character.getHealth() - 8);
								
							}
							
						} if (actualDiceRoll4 < 10 && villain2.getHealth() > 1) {
							
							System.out.println("They missed you. Now it's your turn to roll the dice. ");
							
							Thread.sleep(1500);
							
						}
							
					}
					
				}
				
				if (villain2.getHealth() < 1) {
					
					System.out.println("You killed the " + randomVillain2 + ". You now continue your journey through the forest to resue the princess and encounter a " + randomVillain3  + ". You draw your " + randomWeapon(magicWeapons) + ".");
					
					Thread.sleep(2250);
					
				} 
				
				if (character.getHealth() < 1) {
					
					System.out.println("You died. Game over.");
					
					System.exit(0);
					
				}
				
				while (villain3.getHealth() > 0) {
					
					if (character.getHealth() > 1 && villain3.getHealth() > 0) {
						
						System.out.println("Press \"R\" to roll the dice.");
						
						Thread.sleep(1000);
						
					}
					
					String diceRoll3 = in.nextLine();
					
					if (diceRoll3.equalsIgnoreCase("R")) {
						
						int actualDiceRoll5 = dice();
						
						System.out.println("You rolled a(n) " + actualDiceRoll5 + ".");
						
						Thread.sleep(1000);
						
						if (actualDiceRoll5 >= 10 && character.getHealth() > 1) {
							
							System.out.println("You hit the " + randomVillain3 + ".");
							
							Thread.sleep(1000);
							
							if (actualDiceRoll5 <= 13) {
														
								if (villain3.getHealth() - 2 <= 0) {
									
									int h = villain3.getHealth();
									
									villain3.setHealth(0);
									
									System.out.println("Since you rolled a(n) " + actualDiceRoll5 + ", you did 2 Damage. The enemies' health will now be reduced from " + h + " to " + villain3.getHealth() + ". ");
									
									Thread.sleep(2250);
									
								} else {
								
								System.out.println("Since you rolled a(n) " + actualDiceRoll5 + ", you did 2 Damage. The enemies' health will now be reduced from " + villain3.getHealth() + " to " + (villain3.getHealth() - 2) + ". ");
								
								Thread.sleep(2250);
								
								villain3.setHealth(villain3.getHealth() - 2);
								
								}
								
							} else if (actualDiceRoll5 >= 13 || actualDiceRoll5 <= 17) {
								
								if (villain3.getHealth() - 4 <= 0) {
									
									int h = villain3.getHealth();
									
									villain3.setHealth(0);
									
									System.out.println("Since you rolled a(n) " + actualDiceRoll5 + ", you did 4 Damage. The enemies' health will now be reduced from " + h + " to " + villain3.getHealth() + ". ");
									
									Thread.sleep(2250);
									
								} else {
								
								System.out.println("Since you rolled a(n) " + actualDiceRoll5 + ", you did 4 Damage. The enemies' health will now be reduced from " + villain3.getHealth() + " to " + (villain3.getHealth() - 4) + ". ");
								
								Thread.sleep(2250);
								
								villain3.setHealth(villain3.getHealth() - 4);
								
								}
								
							} else if (actualDiceRoll5 >= 17) {
								
								if (villain3.getHealth() - 6 <= 0) {
									
									int h = villain3.getHealth();
									
									villain3.setHealth(0);
									
									System.out.println("Since you rolled a(n) " + actualDiceRoll5 + ", you did 6 Damage. The enemies' health will now be reduced from " + h + " to " + villain3.getHealth() + ". ");
									
									Thread.sleep(2250);
									
								} else {
								
								System.out.println("Since you rolled a(n) " + actualDiceRoll5 + ", you did 6 Damage. The enemies' health will now be reduced from " + villain3.getHealth() + " to " + (villain3.getHealth() - 6) + ". ");
								
								Thread.sleep(2250);
								
								villain3.setHealth(villain3.getHealth() - 6);
								
								}
								
							}
							
						} if (actualDiceRoll5 < 10 && character.getHealth() > 1) {
							
							System.out.println("You missed the " + randomVillain3 + ". Now they will roll the dice. ");
							
							Thread.sleep(1500);
							
						}
						
						if (villain3.getHealth() > 1) {
							
							System.out.println("It is now the " + randomVillain3 + "'s turn to roll the dice.");
							
							Thread.sleep(1500);
							
						}
						
						int actualDiceRoll6 = dice();
						
						if (actualDiceRoll6 >= 10 && villain3.getHealth() > 1) {
							
							if (actualDiceRoll6 <= 13) {
								
								System.out.println("Since they rolled a(n) " + actualDiceRoll6 + ", they did 4 Damage. Your health will now be reduced from " + character.getHealth() + " to " + (character.getHealth() - 4) + ". ");
								
								Thread.sleep(2250);
								
								character.setHealth(character.getHealth() - 4);
								
							} else if (actualDiceRoll6 >= 13 || actualDiceRoll6 <= 17) {
								
								System.out.println("Since they rolled a(n) " + actualDiceRoll6 + ", they did 6 Damage. Your health will now be reduced from " + character.getHealth() + " to " + (character.getHealth() - 6) + ". ");
								
								Thread.sleep(2250);
								
								character.setHealth(character.getHealth() - 6);
								
							} else if (actualDiceRoll6 >= 17) {
								
								System.out.println("Since they rolled a(n) " + actualDiceRoll6 + ", they did 8 Damage. Your health will now be reduced from " + character.getHealth() + " to " + (character.getHealth() - 8) + ". ");
								
								Thread.sleep(2250);
								
								character.setHealth(character.getHealth() - 8);
								
							}
							
						} if (actualDiceRoll6 < 10 && villain3.getHealth() > 1) {
							
							System.out.println("They missed you. Now it's your turn to roll the dice. ");
							
							Thread.sleep(1500);
							
						}
							
					}
					
				}
				
				if (villain3.getHealth() < 1) {
					
					System.out.println("You killed the " + randomVillain3 + ". You now continue your journey through the forest to resue the princess and encounter a " + randomVillain4  + ". You draw your " + randomWeapon(magicWeapons) + ".");
					
					Thread.sleep(2250);
					
				} 
				
				if (character.getHealth() < 1) {
					
					System.out.println("You died. Game over.");
					
					System.exit(0);
					
				}
				
				while (villain4.getHealth() > 0) {
					
					if (character.getHealth() > 1 && villain4.getHealth() > 0) {
						
						System.out.println("Press \"R\" to roll the dice.");	
						
						Thread.sleep(1000);
						
					}
					
					String diceRoll4 = in.nextLine();
					
					if (diceRoll4.equalsIgnoreCase("R")) {
						
						int actualDiceRoll7 = dice();
						
						System.out.println("You rolled a(n) " + actualDiceRoll7 + ".");
						
						Thread.sleep(1000);
						
						if (actualDiceRoll7 >= 10 && character.getHealth() > 1) {
							
							System.out.println("You hit the " + randomVillain4 + ".");
							
							Thread.sleep(1000);
							
							if (actualDiceRoll7 <= 13) {
														
								if (villain4.getHealth() - 2 <= 0) {
									
									int h = villain4.getHealth();
									
									villain4.setHealth(0);
									
									System.out.println("Since you rolled a(n) " + actualDiceRoll7 + ", you did 2 Damage. The enemies' health will now be reduced from " + h + " to " + villain4.getHealth() + ". ");
									
									Thread.sleep(2250);
									
								} else {
								
								System.out.println("Since you rolled a(n) " + actualDiceRoll7 + ", you did 2 Damage. The enemies' health will now be reduced from " + villain4.getHealth() + " to " + (villain4.getHealth() - 2) + ". ");
								
								Thread.sleep(2250);
								
								villain4.setHealth(villain4.getHealth() - 2);
								
								}
								
							} else if (actualDiceRoll7 >= 13 || actualDiceRoll7 <= 17) {
								
								if (villain4.getHealth() - 4 <= 0) {
									
									int h = villain4.getHealth();
									
									villain4.setHealth(0);
									
									System.out.println("Since you rolled a(n) " + actualDiceRoll7 + ", you did 4 Damage. The enemies' health will now be reduced from " + h + " to " + villain4.getHealth() + ". ");
									
									Thread.sleep(2250);
									
								} else {
								
								System.out.println("Since you rolled a(n) " + actualDiceRoll7 + ", you did 4 Damage. The enemies' health will now be reduced from " + villain4.getHealth() + " to " + (villain4.getHealth() - 4) + ". ");
								
								Thread.sleep(2250);
								
								villain4.setHealth(villain4.getHealth() - 4);
								
								}
								
							} else if (actualDiceRoll7 >= 17) {
								
								if (villain4.getHealth() - 6 <= 0) {
									
									int h = villain4.getHealth();
									
									villain4.setHealth(0);
									
									System.out.println("Since you rolled a(n) " + actualDiceRoll7 + ", you did 6 Damage. The enemies' health will now be reduced from " + h + " to " + villain4.getHealth() + ". ");
									
									Thread.sleep(2250);
									
								} else {
								
								System.out.println("Since you rolled a(n) " + actualDiceRoll7 + ", you did 6 Damage. The enemies' health will now be reduced from " + villain4.getHealth() + " to " + (villain4.getHealth() - 6) + ". ");
								
								Thread.sleep(2250);
								
								villain4.setHealth(villain4.getHealth() - 6);
								
								}
								
							}
							
						} if (actualDiceRoll7 < 10 && character.getHealth() > 1) {
							
							System.out.println("You missed the " + randomVillain4 + ". Now they will roll the dice. ");
							
							Thread.sleep(1500);
							
						}
						
						if (villain4.getHealth() > 1) {
							
							System.out.println("It is now the " + randomVillain4 + "'s turn to roll the dice.");
							
							Thread.sleep(1500);	
							
						}
						
						int actualDiceRoll8 = dice();
						
						if (actualDiceRoll8 >= 10 && villain4.getHealth() > 1) {
							
							if (actualDiceRoll8 <= 13) {
								
								System.out.println("Since they rolled a(n) " + actualDiceRoll8 + ", they did 4 Damage. Your health will now be reduced from " + character.getHealth() + " to " + (character.getHealth() - 4) + ". ");
								
								Thread.sleep(2250);
								
								character.setHealth(character.getHealth() - 4);
								
							} else if (actualDiceRoll8 >= 13 || actualDiceRoll8 <= 17) {
								
								System.out.println("Since they rolled a(n) " + actualDiceRoll8 + ", they did 6 Damage. Your health will now be reduced from " + character.getHealth() + " to " + (character.getHealth() - 6) + ". ");
								
								Thread.sleep(2250);
								
								character.setHealth(character.getHealth() - 6);
								
							} else if (actualDiceRoll8 >= 17) {
								
								System.out.println("Since they rolled a(n) " + actualDiceRoll8 + ", they did 8 Damage. Your health will now be reduced from " + character.getHealth() + " to " + (character.getHealth() - 8) + ". ");
								
								Thread.sleep(2250);
								
								character.setHealth(character.getHealth() - 8);
								
							}
							
						} if (actualDiceRoll8 < 10 && villain4.getHealth() > 1) {
							
							System.out.println("They missed you. Now it's your turn to roll the dice. ");
							
							Thread.sleep(1500);
							
						}
							
					}
					
				}
				
				if (villain4.getHealth() < 1) {
					
					System.out.println("You killed the " + randomVillain4 + ". You now continue your journey through the forest to resue the princess and encounter a " + randomVillain5  + ". You draw your " + randomWeapon(magicWeapons) + ".");
					
					Thread.sleep(2250);
					
				} 
				
				if (character.getHealth() < 1) {
					
					System.out.println("You died. Game over.");
					
					System.exit(0);
					
				}
				
				while (villain5.getHealth() > 0) {
					
					if (character.getHealth() > 1 && villain5.getHealth() > 0) {
						
						System.out.println("Press \"R\" to roll the dice.");
						
						Thread.sleep(1000);
						
					}
					
					String diceRoll5 = in.nextLine();
					
					if (diceRoll5.equalsIgnoreCase("R")) {
						
						int actualDiceRoll9 = dice();
						
						System.out.println("You rolled a(n) " + actualDiceRoll9 + ".");
						
						Thread.sleep(1000);
						
						if (actualDiceRoll9 >= 10 && character.getHealth() > 1) {
							
							System.out.println("You hit the " + randomVillain5 + ".");
							
							Thread.sleep(1000);
							
							if (actualDiceRoll9 <= 13) {
														
								if (villain5.getHealth() - 2 <= 0) {
									
									int h = villain5.getHealth();
									
									villain5.setHealth(0);
									
									System.out.println("Since you rolled a(n) " + actualDiceRoll9 + ", you did 2 Damage. The enemies' health will now be reduced from " + h + " to " + villain5.getHealth() + ". ");
									
									Thread.sleep(2250);
									
								} else {
								
								System.out.println("Since you rolled a(n) " + actualDiceRoll9 + ", you did 2 Damage. The enemies' health will now be reduced from " + villain5.getHealth() + " to " + (villain5.getHealth() - 2) + ". ");
								
								Thread.sleep(2250);
								
								villain5.setHealth(villain5.getHealth() - 2);
								
								}
								
							} else if (actualDiceRoll9 >= 13 || actualDiceRoll9 <= 17) {
								
								if (villain5.getHealth() - 4 <= 0) {
									
									int h = villain5.getHealth();
									
									villain5.setHealth(0);
									
									System.out.println("Since you rolled a(n) " + actualDiceRoll9 + ", you did 4 Damage. The enemies' health will now be reduced from " + h + " to " + villain5.getHealth() + ". ");
									
									Thread.sleep(2250);
									
								} else {
								
								System.out.println("Since you rolled a(n) " + actualDiceRoll9 + ", you did 4 Damage. The enemies' health will now be reduced from " + villain5.getHealth() + " to " + (villain5.getHealth() - 4) + ". ");
								
								Thread.sleep(2250);
								
								villain5.setHealth(villain5.getHealth() - 4);
								
								}
								
							} else if (actualDiceRoll9 >= 17) {
								
								if (villain5.getHealth() - 6 <= 0) {
									
									int h = villain5.getHealth();
									
									villain5.setHealth(0);
									
									System.out.println("Since you rolled a(n) " + actualDiceRoll9 + ", you did 6 Damage. The enemies' health will now be reduced from " + h + " to " + villain5.getHealth() + ". ");
									
									Thread.sleep(2250);
									
								} else {
								
								System.out.println("Since you rolled a(n) " + actualDiceRoll9 + ", you did 6 Damage. The enemies' health will now be reduced from " + villain5.getHealth() + " to " + (villain5.getHealth() - 6) + ". ");
								
								Thread.sleep(2250);
								
								villain5.setHealth(villain5.getHealth() - 6);
								
								}
								
							}
							
						} if (actualDiceRoll9 < 10 && character.getHealth() > 1) {
							
							System.out.println("You missed the " + randomVillain5 + ". Now they will roll the dice. ");
							
							Thread.sleep(1500);
							
						}
						
						if (villain5.getHealth() > 1) {
							
							System.out.println("It is now the " + randomVillain5 + "'s turn to roll the dice.");
							
							Thread.sleep(1500);
							
						}
						
						int actualDiceRoll10 = dice();
						
						if (actualDiceRoll10 >= 10 && villain5.getHealth() > 1) {
							
							if (actualDiceRoll10 <= 13) {
								
								System.out.println("Since they rolled a(n) " + actualDiceRoll10 + ", they did 4 Damage. Your health will now be reduced from " + character.getHealth() + " to " + (character.getHealth() - 4) + ". ");
								
								Thread.sleep(2250);
								
								character.setHealth(character.getHealth() - 4);
								
							} else if (actualDiceRoll10 >= 13 || actualDiceRoll10 <= 17) {
								
								System.out.println("Since they rolled a(n) " + actualDiceRoll10 + ", they did 6 Damage. Your health will now be reduced from " + character.getHealth() + " to " + (character.getHealth() - 6) + ". ");
								
								Thread.sleep(2250);
								
								character.setHealth(character.getHealth() - 6);
								
							} else if (actualDiceRoll10 >= 17) {
								
								System.out.println("Since they rolled a(n) " + actualDiceRoll10 + ", they did 8 Damage. Your health will now be reduced from " + character.getHealth() + " to " + (character.getHealth() - 8) + ". ");
								
								Thread.sleep(2250);
								
								character.setHealth(character.getHealth() - 8);
								
							}
							
						} if (actualDiceRoll10 < 10 && villain5.getHealth() > 1) {
							
							System.out.println("They missed you. Now it's your turn to roll the dice. ");
							
							Thread.sleep(1500);
							
						}
							
					}
					
				}
				
				if (villain5.getHealth() < 1) {
					
					System.out.println("Congratulations, " + name + "! You killed the " + randomVillain5 + ". You successfully saved Princess Fiona from Castle Duloc!");
					
					Thread.sleep(1500);
					
				}
				
				if (character.getHealth() < 1) {
					
					System.out.println("You died. Game over.");
					
					System.exit(0);
					
				}
				
				System.out.println("Do you want to play again? Type \"Yes\" or \"No.\"");
				
				playAgain = in.nextLine();
				
			}
			
			if (playerClass.equalsIgnoreCase("Ninja")) {
				
				System.out.println("Perfect. Let's begin... ");
				Thread.sleep(1500);
				System.out.println("You are on a quest to rescue Princess Fiona from Castle Duloc. ");
				Thread.sleep(1850);
				System.out.println("Many have tried to rescue her, but none have returned. ");
				Thread.sleep(1850);
				System.out.println("There are evil villains along the way, trying their best to stop you from rescuing her. ");
				Thread.sleep(1850);
				System.out.println("You begin your journey, hoping to rescue Princess Fiona once and for all. ");
				Thread.sleep(1850);
							
				String randomVillain1 = randomVillain(villains);
				String randomVillain2 = randomVillain(villains);
				String randomVillain3 = randomVillain(villains);
				String randomVillain4 = randomVillain(villains);
				String randomVillain5 = randomVillain(villains);
				
				System.out.println("As you are walking through the Ardennes Forest, you come across your first villain: " + randomVillain1 + ". You draw your " + randomWeapon(ninjaWeapons) + ".");
				Thread.sleep(2250);
				System.out.println("Roll the 20-sided die to find out if you land your attack.");
				Thread.sleep(1500);
				System.out.println("If you roll higher than a 10, you automatically hit the target, but depending on the number will determine the damage you deal.");
				Thread.sleep(1850);
				System.out.println("The higher the number, the more damage you deal.");
				Thread.sleep(1500);
				
				while (villain1.getHealth() > 0) {
					
					if (character.getHealth() > 1 && villain1.getHealth() > 0) {
						
						System.out.println("Press \"R\" to roll the dice.");	
						
						Thread.sleep(1000);
						
					}
					
					String diceRoll1 = in.nextLine();
					
					if (diceRoll1.equalsIgnoreCase("R")) {
						
						int actualDiceRoll = dice();
						
						System.out.println("You rolled a(n) " + actualDiceRoll + ".");
						
						Thread.sleep(1000);
						
						if (actualDiceRoll >= 10 && character.getHealth() > 1) {
							
							System.out.println("You hit the " + randomVillain1 + ".");
							
							Thread.sleep(1000);
							
							if (actualDiceRoll <= 13) {
								
								if (villain1.getHealth() - 2 <= 0) {
									
									int h = villain1.getHealth();
									
									villain1.setHealth(0);
									
									System.out.println("Since you rolled a(n) " + actualDiceRoll + ", you did 2 Damage. The enemies' health will now be reduced from " + h + " to " + villain1.getHealth() + ". ");
									
									Thread.sleep(2250);
									
								} else {
								
								System.out.println("Since you rolled a(n) " + actualDiceRoll + ", you did 2 Damage. The enemies' health will now be reduced from " + villain1.getHealth() + " to " + (villain1.getHealth() - 2) + ". ");
								
								Thread.sleep(2250);
								
								villain1.setHealth(villain1.getHealth() - 2);
								
								}
								
							} else if (actualDiceRoll >= 13 || actualDiceRoll <= 17) {
								
								if (villain1.getHealth() - 4 <= 0) {
									
									int h = villain1.getHealth();
									
									villain1.setHealth(0);
									
									System.out.println("Since you rolled a(n) " + actualDiceRoll + ", you did 4 Damage. The enemies' health will now be reduced from " + h + " to " + villain1.getHealth() + ". ");
									
									Thread.sleep(2250);
									
								} else {
								
								System.out.println("Since you rolled a(n) " + actualDiceRoll + ", you did 4 Damage. The enemies' health will now be reduced from " + villain1.getHealth() + " to " + (villain1.getHealth() - 4) + ". ");
								
								Thread.sleep(2250);
								
								villain1.setHealth(villain1.getHealth() - 4);
								
								}
								
							} else if (actualDiceRoll >= 17) {
								
								if (villain1.getHealth() - 6 <= 0) {
									
									int h = villain1.getHealth();
									
									villain1.setHealth(0);
									
									System.out.println("Since you rolled a(n) " + actualDiceRoll + ", you did 6 Damage. The enemies' health will now be reduced from " + h + " to " + villain1.getHealth() + ". ");
									
									Thread.sleep(2250);
									
								} else {
								
								System.out.println("Since you rolled a(n) " + actualDiceRoll + ", you did 6 Damage. The enemies' health will now be reduced from " + villain1.getHealth() + " to " + (villain1.getHealth() - 6) + ". ");
								
								Thread.sleep(2250);
								
								villain1.setHealth(villain1.getHealth() - 6);
								
								}
								
							}
							
						} if (actualDiceRoll < 10 && character.getHealth() > 1) {
							
							System.out.println("You missed the " + randomVillain1 + ". Now they will roll the dice. ");
							
							Thread.sleep(1500);
							
						}
						
						if (villain1.getHealth() > 1) {
							
							System.out.println("It is now the " + randomVillain1 + "'s turn to roll the dice.");
							
							Thread.sleep(1500);	
							
						}
						
						int actualDiceRoll2 = dice();
						
						if (actualDiceRoll2 >= 10 && villain1.getHealth() > 1) {
							
							if (actualDiceRoll2 <= 13) {
								
								System.out.println("Since they rolled a(n) " + actualDiceRoll2 + ", they did 4 Damage. Your health will now be reduced from " + character.getHealth() + " to " + (character.getHealth() - 4) + ". ");
								
								Thread.sleep(2250);
								
								character.setHealth(character.getHealth() - 4);
								
							} else if (actualDiceRoll2 >= 13 || actualDiceRoll2 <= 17) {
								
								System.out.println("Since they rolled a(n) " + actualDiceRoll2 + ", they did 6 Damage. Your health will now be reduced from " + character.getHealth() + " to " + (character.getHealth() - 6) + ". ");
								
								Thread.sleep(2250);
								
								character.setHealth(character.getHealth() - 6);
								
							} else if (actualDiceRoll2 >= 17) {
								
								System.out.println("Since they rolled a(n) " + actualDiceRoll2 + ", they did 8 Damage. Your health will now be reduced from " + character.getHealth() + " to " + (character.getHealth() - 8) + ". ");
								
								Thread.sleep(2250);
								
								character.setHealth(character.getHealth() - 8);
								
							}
							
						} if (actualDiceRoll2 < 10 && villain1.getHealth() > 1) {
							
							System.out.println("They missed you. Now it's your turn to roll the dice. ");
							
							Thread.sleep(1500);
							
						}
							
					}
					
				}
				
				if (villain1.getHealth() < 1) {
					
					System.out.println("You killed the " + randomVillain1 + ". You now continue your journey through the forest to resue the princess and encounter a " + randomVillain2 + ". You draw your " + randomWeapon(ninjaWeapons) + ".");
					
					Thread.sleep(2250);
					
				} 
				
				if (character.getHealth() < 1) {
					
					System.out.println("You died. Game over.");
					
					System.exit(0);
					
				}
				
				while (villain2.getHealth() > 0) {
					
					if (character.getHealth() > 1 && villain2.getHealth() > 0) {
						
						System.out.println("Press \"R\" to roll the dice.");
						
						Thread.sleep(1000);
						
					}
					
					String diceRoll2 = in.nextLine();
					
					if (diceRoll2.equalsIgnoreCase("R")) {
						
						int actualDiceRoll3 = dice();
						
						System.out.println("You rolled a(n) " + actualDiceRoll3 + ".");
						
						Thread.sleep(1000);
						
						if (actualDiceRoll3 >= 10 && character.getHealth() > 1) {
							
							System.out.println("You hit the " + randomVillain2 + ".");
							
							Thread.sleep(1000);
							
							if (actualDiceRoll3 <= 13) {
														
								if (villain2.getHealth() - 2 <= 0) {
									
									int h = villain2.getHealth();
									
									villain2.setHealth(0);
									
									System.out.println("Since you rolled a(n) " + actualDiceRoll3 + ", you did 2 Damage. The enemies' health will now be reduced from " + h + " to " + villain2.getHealth() + ". ");
									
									Thread.sleep(2250);
									
								} else {
								
								System.out.println("Since you rolled a(n) " + actualDiceRoll3 + ", you did 2 Damage. The enemies' health will now be reduced from " + villain2.getHealth() + " to " + (villain2.getHealth() - 2) + ". ");
								
								Thread.sleep(2250);
								
								villain2.setHealth(villain2.getHealth() - 2);
								
								}
								
							} else if (actualDiceRoll3 >= 13 || actualDiceRoll3 <= 17) {
								
								if (villain2.getHealth() - 4 <= 0) {
									
									int h = villain2.getHealth();
									
									villain2.setHealth(0);
									
									System.out.println("Since you rolled a(n) " + actualDiceRoll3 + ", you did 4 Damage. The enemies' health will now be reduced from " + h + " to " + villain2.getHealth() + ". ");
									
									Thread.sleep(2250);
									
								} else {
								
								System.out.println("Since you rolled a(n) " + actualDiceRoll3 + ", you did 4 Damage. The enemies' health will now be reduced from " + villain2.getHealth() + " to " + (villain2.getHealth() - 4) + ". ");
								
								Thread.sleep(2250);
								
								villain2.setHealth(villain2.getHealth() - 4);
								
								}
								
							} else if (actualDiceRoll3 >= 17) {
								
								if (villain2.getHealth() - 6 <= 0) {
									
									int h = villain2.getHealth();
									
									villain2.setHealth(0);
									
									System.out.println("Since you rolled a(n) " + actualDiceRoll3 + ", you did 6 Damage. The enemies' health will now be reduced from " + h + " to " + villain2.getHealth() + ". ");
									
									Thread.sleep(2250);
									
								} else {
								
								System.out.println("Since you rolled a(n) " + actualDiceRoll3 + ", you did 6 Damage. The enemies' health will now be reduced from " + villain2.getHealth() + " to " + (villain2.getHealth() - 6) + ". ");
								
								Thread.sleep(2250);
								
								villain2.setHealth(villain2.getHealth() - 6);
								
								}
								
							}
							
						} if (actualDiceRoll3 < 10 && character.getHealth() > 1) {
							
							System.out.println("You missed the " + randomVillain2 + ". Now they will roll the dice. ");
							
							Thread.sleep(1500);
							
						}
						
						if (villain2.getHealth() > 1) {
							
							System.out.println("It is now the " + randomVillain2 + "'s turn to roll the dice.");
							
							Thread.sleep(1500);	
							
						}
						
						int actualDiceRoll4 = dice();
						
						if (actualDiceRoll4 >= 10 && villain2.getHealth() > 1) {
							
							if (actualDiceRoll4 <= 13) {
								
								System.out.println("Since they rolled a(n) " + actualDiceRoll4 + ", they did 4 Damage. Your health will now be reduced from " + character.getHealth() + " to " + (character.getHealth() - 4) + ". ");
								
								Thread.sleep(2250);
								
								character.setHealth(character.getHealth() - 4);
								
							} else if (actualDiceRoll4 >= 13 || actualDiceRoll4 <= 17) {
								
								System.out.println("Since they rolled a(n) " + actualDiceRoll4 + ", they did 6 Damage. Your health will now be reduced from " + character.getHealth() + " to " + (character.getHealth() - 6) + ". ");
								
								Thread.sleep(2250);
								
								character.setHealth(character.getHealth() - 6);
								
							} else if (actualDiceRoll4 >= 17) {
								
								System.out.println("Since they rolled a(n) " + actualDiceRoll4 + ", they did 8 Damage. Your health will now be reduced from " + character.getHealth() + " to " + (character.getHealth() - 8) + ". ");
								
								Thread.sleep(2250);
								
								character.setHealth(character.getHealth() - 8);
								
							}
							
						} if (actualDiceRoll4 < 10 && villain2.getHealth() > 1) {
							
							System.out.println("They missed you. Now it's your turn to roll the dice. ");
							
							Thread.sleep(1500);
							
						}
							
					}
					
				}
				
				if (villain2.getHealth() < 1) {
					
					System.out.println("You killed the " + randomVillain2 + ". You now continue your journey through the forest to resue the princess and encounter a " + randomVillain3  + ". You draw your " + randomWeapon(ninjaWeapons) + ".");
					
					Thread.sleep(2250);
					
				} 
				
				if (character.getHealth() < 1) {
					
					System.out.println("You died. Game over.");
					
					System.exit(0);
					
				}
				
				while (villain3.getHealth() > 0) {
					
					if (character.getHealth() > 1 && villain3.getHealth() > 0) {
						
						System.out.println("Press \"R\" to roll the dice.");
						
						Thread.sleep(1000);
						
					}
					
					String diceRoll3 = in.nextLine();
					
					if (diceRoll3.equalsIgnoreCase("R")) {
						
						int actualDiceRoll5 = dice();
						
						System.out.println("You rolled a(n) " + actualDiceRoll5 + ".");
						
						Thread.sleep(1000);
						
						if (actualDiceRoll5 >= 10 && character.getHealth() > 1) {
							
							System.out.println("You hit the " + randomVillain3 + ".");
							
							Thread.sleep(1000);
							
							if (actualDiceRoll5 <= 13) {
														
								if (villain3.getHealth() - 2 <= 0) {
									
									int h = villain3.getHealth();
									
									villain3.setHealth(0);
									
									System.out.println("Since you rolled a(n) " + actualDiceRoll5 + ", you did 2 Damage. The enemies' health will now be reduced from " + h + " to " + villain3.getHealth() + ". ");
									
									Thread.sleep(2250);
									
								} else {
								
								System.out.println("Since you rolled a(n) " + actualDiceRoll5 + ", you did 2 Damage. The enemies' health will now be reduced from " + villain3.getHealth() + " to " + (villain3.getHealth() - 2) + ". ");
								
								Thread.sleep(2250);
								
								villain3.setHealth(villain3.getHealth() - 2);
								
								}
								
							} else if (actualDiceRoll5 >= 13 || actualDiceRoll5 <= 17) {
								
								if (villain3.getHealth() - 4 <= 0) {
									
									int h = villain3.getHealth();
									
									villain3.setHealth(0);
									
									System.out.println("Since you rolled a(n) " + actualDiceRoll5 + ", you did 4 Damage. The enemies' health will now be reduced from " + h + " to " + villain3.getHealth() + ". ");
									
									Thread.sleep(2250);
									
								} else {
								
								System.out.println("Since you rolled a(n) " + actualDiceRoll5 + ", you did 4 Damage. The enemies' health will now be reduced from " + villain3.getHealth() + " to " + (villain3.getHealth() - 4) + ". ");
								
								Thread.sleep(2250);
								
								villain3.setHealth(villain3.getHealth() - 4);
								
								}
								
							} else if (actualDiceRoll5 >= 17) {
								
								if (villain3.getHealth() - 6 <= 0) {
									
									int h = villain3.getHealth();
									
									villain3.setHealth(0);
									
									System.out.println("Since you rolled a(n) " + actualDiceRoll5 + ", you did 6 Damage. The enemies' health will now be reduced from " + h + " to " + villain3.getHealth() + ". ");
									
									Thread.sleep(2250);
									
								} else {
								
								System.out.println("Since you rolled a(n) " + actualDiceRoll5 + ", you did 6 Damage. The enemies' health will now be reduced from " + villain3.getHealth() + " to " + (villain3.getHealth() - 6) + ". ");
								
								Thread.sleep(2250);
								
								villain3.setHealth(villain3.getHealth() - 6);
								
								}
								
							}
							
						} if (actualDiceRoll5 < 10 && character.getHealth() > 1) {
							
							System.out.println("You missed the " + randomVillain3 + ". Now they will roll the dice. ");
							
							Thread.sleep(1500);
							
						}
						
						if (villain3.getHealth() > 1) {
							
							System.out.println("It is now the " + randomVillain3 + "'s turn to roll the dice.");
							
							Thread.sleep(1500);
							
						}
						
						int actualDiceRoll6 = dice();
						
						if (actualDiceRoll6 >= 10 && villain3.getHealth() > 1) {
							
							if (actualDiceRoll6 <= 13) {
								
								System.out.println("Since they rolled a(n) " + actualDiceRoll6 + ", they did 4 Damage. Your health will now be reduced from " + character.getHealth() + " to " + (character.getHealth() - 4) + ". ");
								
								Thread.sleep(2250);
								
								character.setHealth(character.getHealth() - 4);
								
							} else if (actualDiceRoll6 >= 13 || actualDiceRoll6 <= 17) {
								
								System.out.println("Since they rolled a(n) " + actualDiceRoll6 + ", they did 6 Damage. Your health will now be reduced from " + character.getHealth() + " to " + (character.getHealth() - 6) + ". ");
								
								Thread.sleep(2250);
								
								character.setHealth(character.getHealth() - 6);
								
							} else if (actualDiceRoll6 >= 17) {
								
								System.out.println("Since they rolled a(n) " + actualDiceRoll6 + ", they did 8 Damage. Your health will now be reduced from " + character.getHealth() + " to " + (character.getHealth() - 8) + ". ");
								
								Thread.sleep(2250);
								
								character.setHealth(character.getHealth() - 8);
								
							}
							
						} if (actualDiceRoll6 < 10 && villain3.getHealth() > 1) {
							
							System.out.println("They missed you. Now it's your turn to roll the dice. ");
							
							Thread.sleep(1500);
							
						}
							
					}
					
				}
				
				if (villain3.getHealth() < 1) {
					
					System.out.println("You killed the " + randomVillain3 + ". You now continue your journey through the forest to resue the princess and encounter a " + randomVillain4  + ". You draw your " + randomWeapon(ninjaWeapons) + ".");
					
					Thread.sleep(2250);
					
				} 
				
				if (character.getHealth() < 1) {
					
					System.out.println("You died. Game over.");
					
					System.exit(0);
					
				}
				
				while (villain4.getHealth() > 0) {
					
					if (character.getHealth() > 1 && villain4.getHealth() > 0) {
						
						System.out.println("Press \"R\" to roll the dice.");	
						
						Thread.sleep(1000);
						
					}
					
					String diceRoll4 = in.nextLine();
					
					if (diceRoll4.equalsIgnoreCase("R")) {
						
						int actualDiceRoll7 = dice();
						
						System.out.println("You rolled a(n) " + actualDiceRoll7 + ".");
						
						Thread.sleep(1000);
						
						if (actualDiceRoll7 >= 10 && character.getHealth() > 1) {
							
							System.out.println("You hit the " + randomVillain4 + ".");
							
							Thread.sleep(1000);
							
							if (actualDiceRoll7 <= 13) {
														
								if (villain4.getHealth() - 2 <= 0) {
									
									int h = villain4.getHealth();
									
									villain4.setHealth(0);
									
									System.out.println("Since you rolled a(n) " + actualDiceRoll7 + ", you did 2 Damage. The enemies' health will now be reduced from " + h + " to " + villain4.getHealth() + ". ");
									
									Thread.sleep(2250);
									
								} else {
								
								System.out.println("Since you rolled a(n) " + actualDiceRoll7 + ", you did 2 Damage. The enemies' health will now be reduced from " + villain4.getHealth() + " to " + (villain4.getHealth() - 2) + ". ");
								
								Thread.sleep(2250);
								
								villain4.setHealth(villain4.getHealth() - 2);
								
								}
								
							} else if (actualDiceRoll7 >= 13 || actualDiceRoll7 <= 17) {
								
								if (villain4.getHealth() - 4 <= 0) {
									
									int h = villain4.getHealth();
									
									villain4.setHealth(0);
									
									System.out.println("Since you rolled a(n) " + actualDiceRoll7 + ", you did 4 Damage. The enemies' health will now be reduced from " + h + " to " + villain4.getHealth() + ". ");
									
									Thread.sleep(2250);
									
								} else {
								
								System.out.println("Since you rolled a(n) " + actualDiceRoll7 + ", you did 4 Damage. The enemies' health will now be reduced from " + villain4.getHealth() + " to " + (villain4.getHealth() - 4) + ". ");
								
								Thread.sleep(2250);
								
								villain4.setHealth(villain4.getHealth() - 4);
								
								}
								
							} else if (actualDiceRoll7 >= 17) {
								
								if (villain4.getHealth() - 6 <= 0) {
									
									int h = villain4.getHealth();
									
									villain4.setHealth(0);
									
									System.out.println("Since you rolled a(n) " + actualDiceRoll7 + ", you did 6 Damage. The enemies' health will now be reduced from " + h + " to " + villain4.getHealth() + ". ");
									
									Thread.sleep(2250);
									
								} else {
								
								System.out.println("Since you rolled a(n) " + actualDiceRoll7 + ", you did 6 Damage. The enemies' health will now be reduced from " + villain4.getHealth() + " to " + (villain4.getHealth() - 6) + ". ");
								
								Thread.sleep(2250);
								
								villain4.setHealth(villain4.getHealth() - 6);
								
								}
								
							}
							
						} if (actualDiceRoll7 < 10 && character.getHealth() > 1) {
							
							System.out.println("You missed the " + randomVillain4 + ". Now they will roll the dice. ");
							
							Thread.sleep(1500);
							
						}
						
						if (villain4.getHealth() > 1) {
							
							System.out.println("It is now the " + randomVillain4 + "'s turn to roll the dice.");
							
							Thread.sleep(1500);	
							
						}
						
						int actualDiceRoll8 = dice();
						
						if (actualDiceRoll8 >= 10 && villain4.getHealth() > 1) {
							
							if (actualDiceRoll8 <= 13) {
								
								System.out.println("Since they rolled a(n) " + actualDiceRoll8 + ", they did 4 Damage. Your health will now be reduced from " + character.getHealth() + " to " + (character.getHealth() - 4) + ". ");
								
								Thread.sleep(2250);
								
								character.setHealth(character.getHealth() - 4);
								
							} else if (actualDiceRoll8 >= 13 || actualDiceRoll8 <= 17) {
								
								System.out.println("Since they rolled a(n) " + actualDiceRoll8 + ", they did 6 Damage. Your health will now be reduced from " + character.getHealth() + " to " + (character.getHealth() - 6) + ". ");
								
								Thread.sleep(2250);
								
								character.setHealth(character.getHealth() - 6);
								
							} else if (actualDiceRoll8 >= 17) {
								
								System.out.println("Since they rolled a(n) " + actualDiceRoll8 + ", they did 8 Damage. Your health will now be reduced from " + character.getHealth() + " to " + (character.getHealth() - 8) + ". ");
								
								Thread.sleep(2250);
								
								character.setHealth(character.getHealth() - 8);
								
							}
							
						} if (actualDiceRoll8 < 10 && villain4.getHealth() > 1) {
							
							System.out.println("They missed you. Now it's your turn to roll the dice. ");
							
							Thread.sleep(1500);
							
						}
							
					}
					
				}
				
				if (villain4.getHealth() < 1) {
					
					System.out.println("You killed the " + randomVillain4 + ". You now continue your journey through the forest to resue the princess and encounter a " + randomVillain5  + ". You draw your " + randomWeapon(ninjaWeapons) + ".");
					
					Thread.sleep(2250);
					
				} 
				
				if (character.getHealth() < 1) {
					
					System.out.println("You died. Game over.");
					
					System.exit(0);
					
				}
				
				while (villain5.getHealth() > 0) {
					
					if (character.getHealth() > 1 && villain5.getHealth() > 0) {
						
						System.out.println("Press \"R\" to roll the dice.");
						
						Thread.sleep(1000);
						
					}
					
					String diceRoll5 = in.nextLine();
					
					if (diceRoll5.equalsIgnoreCase("R")) {
						
						int actualDiceRoll9 = dice();
						
						System.out.println("You rolled a(n) " + actualDiceRoll9 + ".");
						
						Thread.sleep(1000);
						
						if (actualDiceRoll9 >= 10 && character.getHealth() > 1) {
							
							System.out.println("You hit the " + randomVillain5 + ".");
							
							Thread.sleep(1000);
							
							if (actualDiceRoll9 <= 13) {
														
								if (villain5.getHealth() - 2 <= 0) {
									
									int h = villain5.getHealth();
									
									villain5.setHealth(0);
									
									System.out.println("Since you rolled a(n) " + actualDiceRoll9 + ", you did 2 Damage. The enemies' health will now be reduced from " + h + " to " + villain5.getHealth() + ". ");
									
									Thread.sleep(2250);
									
								} else {
								
								System.out.println("Since you rolled a(n) " + actualDiceRoll9 + ", you did 2 Damage. The enemies' health will now be reduced from " + villain5.getHealth() + " to " + (villain5.getHealth() - 2) + ". ");
								
								Thread.sleep(2250);
								
								villain5.setHealth(villain5.getHealth() - 2);
								
								}
								
							} else if (actualDiceRoll9 >= 13 || actualDiceRoll9 <= 17) {
								
								if (villain5.getHealth() - 4 <= 0) {
									
									int h = villain5.getHealth();
									
									villain5.setHealth(0);
									
									System.out.println("Since you rolled a(n) " + actualDiceRoll9 + ", you did 4 Damage. The enemies' health will now be reduced from " + h + " to " + villain5.getHealth() + ". ");
									
									Thread.sleep(2250);
									
								} else {
								
								System.out.println("Since you rolled a(n) " + actualDiceRoll9 + ", you did 4 Damage. The enemies' health will now be reduced from " + villain5.getHealth() + " to " + (villain5.getHealth() - 4) + ". ");
								
								Thread.sleep(2250);
								
								villain5.setHealth(villain5.getHealth() - 4);
								
								}
								
							} else if (actualDiceRoll9 >= 17) {
								
								if (villain5.getHealth() - 6 <= 0) {
									
									int h = villain5.getHealth();
									
									villain5.setHealth(0);
									
									System.out.println("Since you rolled a(n) " + actualDiceRoll9 + ", you did 6 Damage. The enemies' health will now be reduced from " + h + " to " + villain5.getHealth() + ". ");
									
									Thread.sleep(2250);
									
								} else {
								
								System.out.println("Since you rolled a(n) " + actualDiceRoll9 + ", you did 6 Damage. The enemies' health will now be reduced from " + villain5.getHealth() + " to " + (villain5.getHealth() - 6) + ". ");
								
								Thread.sleep(2250);
								
								villain5.setHealth(villain5.getHealth() - 6);
								
								}
								
							}
							
						} if (actualDiceRoll9 < 10 && character.getHealth() > 1) {
							
							System.out.println("You missed the " + randomVillain5 + ". Now they will roll the dice. ");
							
							Thread.sleep(1500);
							
						}
						
						if (villain5.getHealth() > 1) {
							
							System.out.println("It is now the " + randomVillain5 + "'s turn to roll the dice.");
							
							Thread.sleep(1500);
							
						}
						
						int actualDiceRoll10 = dice();
						
						if (actualDiceRoll10 >= 10 && villain5.getHealth() > 1) {
							
							if (actualDiceRoll10 <= 13) {
								
								System.out.println("Since they rolled a(n) " + actualDiceRoll10 + ", they did 4 Damage. Your health will now be reduced from " + character.getHealth() + " to " + (character.getHealth() - 4) + ". ");
								
								Thread.sleep(2250);
								
								character.setHealth(character.getHealth() - 4);
								
							} else if (actualDiceRoll10 >= 13 || actualDiceRoll10 <= 17) {
								
								System.out.println("Since they rolled a(n) " + actualDiceRoll10 + ", they did 6 Damage. Your health will now be reduced from " + character.getHealth() + " to " + (character.getHealth() - 6) + ". ");
								
								Thread.sleep(2250);
								
								character.setHealth(character.getHealth() - 6);
								
							} else if (actualDiceRoll10 >= 17) {
								
								System.out.println("Since they rolled a(n) " + actualDiceRoll10 + ", they did 8 Damage. Your health will now be reduced from " + character.getHealth() + " to " + (character.getHealth() - 8) + ". ");
								
								Thread.sleep(2250);
								
								character.setHealth(character.getHealth() - 8);
								
							}
							
						} if (actualDiceRoll10 < 10 && villain5.getHealth() > 1) {
							
							System.out.println("They missed you. Now it's your turn to roll the dice. ");
							
							Thread.sleep(1500);
							
						}
							
					}
					
				}
				
				if (villain5.getHealth() < 1) {
					
					System.out.println("Congratulations, " + name + "! You killed the " + randomVillain5 + ". You successfully saved Princess Fiona from Castle Duloc!");
					
					Thread.sleep(1500);
					
				}
				
				if (character.getHealth() < 1) {
					
					System.out.println("You died. Game over.");
					
					System.exit(0);
					
				}
				
				System.out.println("Do you want to play again? Type \"Yes\" or \"No.\"");
				
				playAgain = in.nextLine();
				
			}
			
		}
		
	}

}

