
public class DogsAndCats {

	private String name;
	private double weight;
	private String sound;
	private int age;
	
	public DogsAndCats() {
		
		name = "Sparky";
		weight = 15.3;
		sound = "Bark";
		age = 5;
		
	}
	
	public DogsAndCats(String n, double w, String s, int a) {
		
		this.name = n;
		this.weight = w;
		this.sound = s;
		this.age = a;
		
	}
	
	public DogsAndCats(String n, double w) {
		
		this.name = n; 
		this.weight = w; 
		this.sound = "Bark";
		this.age = 5;
		
	}
	
	public void setName(String n) {
		
		this.name = n;
		
	}
	
	public void setWeight(double w) {
		
		this.weight = w;
		
	}
	
	public void setSound(String s) {
		
		this.sound = s;
		
	}
	
	public void setAge(int a) {
		
		this.age = a;
		
	}
	
	public String getName() {
		
		return name;
		
	}
	
	public double getWeight() {
		
		return weight;
		
	}
	
	public String getSound() {
		
		return sound;
		
	}
	
	public int getAge() {
		
		return age;
		
	}
	
	public String toString() {
		
		String output = "Name: " + name + ". \nWeight: " + weight + ". \nSound: " + sound + ". \nAge: " + age + ". \n";
		
		return output;
		
	}
	
	public String returnName() {
		
		String output = "My name is " + name + ". \n";
		
		return output;
		
	}
	
	public String returnWeight() {
		
		String output = "I weight " + weight + " pounds. \n";
		
		return output;
		
	}
	
	public static void main(String[] args) {

		DogsAndCats Jet = new DogsAndCats("Jet", 12.3, "Bark", 9);
		DogsAndCats basicDog = new DogsAndCats();
		
		System.out.println(Jet.returnName());
		
		System.out.println(Jet.returnWeight());
		
		System.out.println(basicDog.returnName());
		
		System.out.println(basicDog.returnWeight());
		
	}

}
