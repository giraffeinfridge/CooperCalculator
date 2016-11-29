import java.util.Scanner;

public class methods {

	public static void main(String[] args) {
		boolean on = true;
		while (on) {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter explanation number: ");
			int ex = in.nextInt();
			if (ex == -1) {
				on = false;
			}
			System.out.println(explanation(ex));
			thanks();
		}
	}

	public static String explanation(int ex) {
		switch (ex) {
		case 0:
			return "No Explanation";
		case 1:
			return "First explanation";
		case 2:
			return "second explanation";
		default:
			return "enter a number";
		}
	}

	public static void thanks() {
		System.out.println("thanks for using my calculator");
	}

}
