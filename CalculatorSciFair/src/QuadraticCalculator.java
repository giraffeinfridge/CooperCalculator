import java.util.Scanner;
public class QuadraticCalculator {

	public static void init() {
		Scanner quad = new Scanner (System.in);
		
		float one;
		
		double fourfour;
		
		float two;
		
		double three;
		
		double four;
		
		double five;
		
		double fin;
		
		double finfin;
		
		System.out.println("ax^2 + bx + c");
		
		System.out.println();
		
		try {
			Thread.sleep(500);
		}	catch(InterruptedException balls) {
			Thread.currentThread().interrupt();
		}
		
		System.out.println("Enter 'a' value: ");
		
		float a = quad.nextFloat();
		
		System.out.println("Enter 'b' value: ");
		
		float b = quad.nextFloat();
				
		System.out.println("Enter 'c' value: ");
		
		float c = quad.nextFloat();
		
		one = -1 * b;
		
		two = (b * b) - (4 * a * c);
		
		three = Math.sqrt(two);
		
		fourfour = one - three;
		
		four = one + three;
		
		five = 2 * a;
		
		fin = four/five;
		
		finfin = fourfour/five;
		
		System.out.println();
		
		System.out.println("x(1) = " + fin);
		
		System.out.println();
		
		System.out.println("x(2) = " + finfin);
		
		try {
			Thread.sleep(1000);
		}	catch(InterruptedException balls) {
			Thread.currentThread().interrupt();
		}
		
		System.out.println();
		
		System.out.println("Enter '1' for help");
		
		int helper = quad.nextInt();
		
		System.out.println();
		
		if (helper == 1) {
			System.out.println("To find the zeros, you would plug the coefficients:");
			System.out.println("a, b, and c into this formula:");
			System.out.println();
			System.out.println("-b + (square root of (b^2 - 4 * a * c))/2 * a");
			System.out.println();
			
			try {
				Thread.sleep(3000);
			}	catch(InterruptedException balls) {
				Thread.currentThread().interrupt();
			}
			
			System.out.println("Once you solve for 'x' there, you get x(1).");
			
			try {
				Thread.sleep(1000);
			}	catch(InterruptedException balls) {
				Thread.currentThread().interrupt();
			}
						
			System.out.println();
			System.out.println("To get x(2) you need to do the same thing");
			System.out.println("except this time you do -b - (...) instead of -b + (...)");
			System.out.println();
			
			try {
				Thread.sleep(3000);
			}	catch(InterruptedException balls) {
				Thread.currentThread().interrupt();
			}
			
			System.out.println("So the overall formula for x(2) would be: ");
			System.out.println();
			System.out.println("-b - (square root of (b^2 - 4 * a * c))/2 * a");
			System.out.println();
			System.out.println();
			
			try {
				Thread.sleep(3000);
			}	catch(InterruptedException balls) {
				Thread.currentThread().interrupt();
			}
			
			System.out.println("So...");
			
			try {
				Thread.sleep(1000);
			}	catch(InterruptedException balls) {
				Thread.currentThread().interrupt();
			}
			
			System.out.println();
			System.out.println("-" + b + " (+,-)(square root of (" + b + " * " + b + "- 4" + " * " + a + " * " + c + "))/2 * " + a);
			
			try {
				Thread.sleep(3000);
			}	catch(InterruptedException balls) {
				Thread.currentThread().interrupt();
			}
			
			System.out.println();
			System.out.println("^ Gives you both zeros for the values that you inputted earlier");
			
			System.out.println();
			
			System.out.println();
			
			System.out.println();
			
			System.out.println("Enter 2 if the zeros are 'NaN'");
			
			int helpertwo = quad.nextInt();
			
			if (helpertwo == 2) {
				System.out.println();
				System.out.println("When you plug the values into the equation");
				System.out.println("it will try to divide by zero, or take the");
				System.out.println("square root of a negative number, which are");
				System.out.println("both undefined, resulting in 'NaN',");
				System.out.println("standing for 'Not a Number'");
				}
			
			
			
		
			
			
			
		
		
		
		
		
		
		
		
		
		}

	}

}