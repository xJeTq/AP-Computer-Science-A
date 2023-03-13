
public class HomeworkExercises {

	public static void trace1 () {
		
		for (int x = 1; x < 3; x ++) {
			
			for (int y = 1; y < 10; y += 3) {
				
				System.out.println(x + " " + y);
				
			}
			
		}
		
	}
	
	public static void trace2 () {
		
		for (int i = 1; i <= 3; i ++) {
			
			for (int j = 2; j < 5; j ++) {
				
				System.out.print(i * j + " ");
				
			System.out.println();
			
			}
			
		}
		
	}
	
	public static void trace3 () {
		
		int t = 0;
		
		for (int p = 0; p <= 9; p ++) {
			
			for (int q = 0; q < 9; q ++) {
				
				t ++;
				
			System.out.println("t = " + t);
				
			}
			
		}
		
	}
	
	public static void trace4 () {
		
		int t = 0; 
		
		for (int m = 0; m < 5; m ++) {
			
			for (int k = m; k < 5; k ++) {
				
				t ++; 
				
			System.out.println("t = " + t);
				
			}
			
		}
		
	}
	
	public static void trace5 () {
		
		for (int x = 1; x <= 5; x ++) {
			
			for (int y = 5; y >= x; y --) {
				
				System.out.print(x + y + " ");
				
			System.out.println();
				
			}
			
		}
		
	}
	
	public static void trace6 () {
		
		int a = 0; 
		
		int b = 2; 
		
		for (int k = 0; k < 3; k ++) {
			
			a = k;
			
			b += k; 
			
			while (a < b) {
				
				System.out.println(a + " " + b);
				
				a += b; 
				
				b ++;
				
			}
			
			
		}
		
	}
	
	public static void trace7 () {
		
		int x = 5; int y = 0; int k = 1; 
		
		while (x < 15) {
			
			y ++;
			
			if (y % 2 == 0) {
				
				k = x + y;
				
			}
			
			x += y;
			
		}
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("k = " + k);
		
	}
	
	public static void trace8 () {
		
		int x = 10; 
		
		while (x > 0) {
			
			for (int i = x; i > 0; i -= 2) {
				
				System.out.print(x / i + " ");
				
			x -= 3;
			
			System.out.println();
				
			}
			
		}
		
	}
	
	public static void main(String[] args) {

		trace8();
		
	}

}
