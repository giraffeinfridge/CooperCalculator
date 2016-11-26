import java.util.Scanner;
public class returnvalues {

	public static void main(String[] args) {
		System.out.println(age());
	}
	
	public static int age(){
		Scanner abc = new Scanner (System.in);
		int age = abc.nextInt();
		return age;
	}

}
