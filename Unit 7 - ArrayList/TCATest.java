import java.util.Arrays;

public class TCATest {

	private int[] a;
	private int[] b;
	
	public TCATest() {
		
		this.a = a;
		this.b = b;
		
	}
	
	public int[] getA() {
		
		return a;
		
	}
	
	public int[] getB() {
		
		return b;
		
	}
	
	public void setA(int[] a) {
		
		this.a = a;
		
	}
	
	public void setB(int[] b) {
		
		this.b = b;
		
	}
	
	public static String biggerTwo(int[] a, int[] b) {
		
		int sumA = a[0] + a[1];
		
		int sumB = b[0] + b[1];
		
		if (sumA >= sumB) {
			
			return Arrays.toString(a);
			
		} else {
			
			return Arrays.toString(b);
			
		}
		
	}
	
	public static String nTwice(String str, int n) {
		
		String firstHalf = str.substring(0, n);
		
		String secondHalf = str.substring(str.length() - n);
		
		return firstHalf + secondHalf;
		
	}
	
	public static boolean specialEleven(int a) {
		
		boolean x;
		
		if (a % 11 == 0) {
			
			x = true;
			
		} else if ((a - 1) % 11 == 0) {
			
			x = true;
			
		} else {
			
			x = false;
			
		}
		
		return x;
		
	}
	
	public static void main(String[] args) {

		int[] a = {1, 2};
		int[] b = {3, 4};
		
		System.out.println(biggerTwo(a, b));
		
		System.out.println(nTwice("Hello", 2));
		
		System.out.println(specialEleven(24));
		
	}

}
