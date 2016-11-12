import java.util.Scanner;

public class BasicCalculator {

	public static int operation; // 1 = add, 2 = subtract,
									// 3 = multiply, 4 = divide


	public static void main(String[] args) {
		Scanner bc = new Scanner(System.in);
		String input;

		input = bc.nextLine();

		char[] inputChars = input.toCharArray();
		for (char c : inputChars) {
			if (isnum(c)) {
				System.out.println("Number");
			} else if (isop(c)) {
				System.out.println("Operation");
			} else {
				System.out.println("[-] Error: " + c + "is not a number or an operation");
			}
		}
	}

	public static boolean isnum(char c) {
		if (c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8'
				|| c == '9') {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isop(char c) {
		if (c == '+' || c == '-' || c == '*' || c == '/') {
			return true;
		} else {
			return false;
		}

	}
	public static int getop(char c){
		switch(c){
		case '+':
			return 1;
		case '-':
			return 2;
		case '*':
			return 3;
		case '/':
			return 4;
			default:
				return 0;
		}
	}
}
