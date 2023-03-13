
public class MonsterPractice {

	private int height; 
	private double weight;
	private int scareFactor; 
	private String color; 
	private String sound;
	
	public MonsterPractice() {
		
		height = 10;
		weight = 239.5;
		scareFactor = 2;
		color = "Green";
		sound = "Rawr";
		
	}
	
	public MonsterPractice(int h, double w, int sF, String c, String s) {
		
		this.height = h;
		this.weight = w;
		this.scareFactor = sF;
		this.color = c;
		this.sound = s;
		
	}
	
	public MonsterPractice(String c, String s) {
		
		this.height = (int) (Math.random() * 20 + 1);
		this.weight = (Math.random() * 300 + 1);
		this.scareFactor = (int) (Math.random() * 5 + 1);
		this.color = c;
		this.sound = s;
		
	}
	
	public MonsterPractice(int h, double w, int sF) {
		
		this.height = h;
		this.weight = w;
		this.scareFactor = sF;
		this.color = "Brown";
		this.sound = "Boo";
		
	}
	
	public int getHeight() {
		
		return height;
		
	}
	
	public double getWeight() {
		
		return weight;
		
	}
	
	public int getScareFactor() {
		
		return scareFactor;
		
	}
	
	public String getColor() {
		
		return color;
		
	}
	
	public String getSound() {
		
		return sound;
		
	}
	
	public void setHeight(int height) {
		
		this.height = height;
		
	}
	
	public void setWeight(double weight) {
		
		this.weight = weight;
		
	}
	
	public void setScareFactor(int scareFactor) {
		
		this.scareFactor = scareFactor;
		
	}
	
	public void setColor(String color) {
		
		this.color = color;
		
	}
	
	public void setSound(String sound) {
		
		this.sound = sound;
		
	}
	
	public String toString() {
		
		String output = "Height: " + height + ". \nWeight: " + weight + ". \nScare Factor: " + scareFactor + ". \nColor: " + color + ". \nSound: " + sound + ". \n";
				
		return output;
		
	}
	
	public String roar() {
		
		String output = "";
		
		if (getHeight() > 10 && getWeight() > 200 && getScareFactor() > 3) {
			
			output = getSound() + " " + getSound() + " " + getSound() + "\n";
			
			return output;
			
		} else {
			
			output = getSound() + "\n";
			
			return output;
			
		}
		
	}
	
	public String scareFactorCheck() {
		
		String output = "";
		
		if (getColor().equalsIgnoreCase("Blue") || getColor().equalsIgnoreCase("Orange")) {
			
			int num = getScareFactor() - 1;
			
			setScareFactor(num);
			
			output = "Monster's scare factor reduced: " + getScareFactor() + ". \n";
						
		} 
		
		if (getColor().equalsIgnoreCase("Red")) {
			
			int num = getScareFactor() + 1;
			
			setScareFactor(num);
			
			output = "Monster's scare factor increased: " + getScareFactor() + ". \n";
						
		}
		
		return output;
		
	}
	
	public static void main(String[] args) {

		MonsterPractice Monster1 = new MonsterPractice();
		MonsterPractice Monster2 = new MonsterPractice(13, 200.5, 4, "Purple", "Ooh");
		MonsterPractice Monster3 = new MonsterPractice("Orange", "Aah");
		MonsterPractice Monster4 = new MonsterPractice(4, 20.5, 1);
		
		System.out.println(Monster1.roar());
		System.out.println(Monster2.roar());
		System.out.println(Monster3.roar());
		System.out.println(Monster4.roar());
		System.out.println(Monster1.scareFactorCheck());
		System.out.println(Monster2.scareFactorCheck());
		System.out.println(Monster3.scareFactorCheck());
		System.out.println(Monster4.scareFactorCheck());
		
	}

}
