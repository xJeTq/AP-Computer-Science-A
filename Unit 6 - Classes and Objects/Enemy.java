
public class Enemy {

	private int health; // From 0-100
	
	public Enemy() {
		
		this.health = health;
		
	}
	
	public Enemy(int h) {
		
		this.health = h;
		
	}
	
	public int getHealth() {
		
		return health;
		
	}
	
	public void setHealth(int h) {
		
		this.health = h;
		
	}
	
	public String randomVillain(String[] villains) {
	
		String output = villains[(int)(Math.random() * villains.length - 1)];
	
		return output;
	
	}
	
}
