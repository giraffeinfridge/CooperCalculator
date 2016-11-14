import java.util.Scanner;

public class MainMenu {

	public static ImpulseCalculator ic = new ImpulseCalculator();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean on = true;
		while (on) {
			System.out.println("What would you like to calculate? ");
			System.out.println("\n[0]  Quit\nPhysics\n[1]  Impulse\nMath\n[2] Basic Expression ");
			int input = in.nextInt();
			switch (input) {
			case 0:
				on = false;
				return;
			case 1:
				ic.init();
				break;
			case 2:
				BasicCalculator.init();
				break;
			}
		}
	}
}