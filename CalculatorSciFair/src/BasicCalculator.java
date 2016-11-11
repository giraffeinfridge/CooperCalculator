import java.util.Scanner;
public class BasicCalculator {
	
	public static int operation; //1 = add, 2 = subtract, 3 = multiply, 4 = divide
	public static int opindex;
	public static int firstnum;
	public static int secondnum;
	
	public static void main(String[] args) {
		Scanner bc = new Scanner (System.in);
		String input;
		
		input = bc.nextLine();
		
		char[] inputChars = input.toCharArray();
		
		for(int i = 0; i < inputChars.length; i++){
			//Check if each char is number or operation
			//Sample equation: number operator number 69-12
			if(inputChars[i] == '+'){
				operation = 1;
				opindex = i;
			}else if(inputChars[i] == '-'){
				operation = 2;
				opindex = i;
			}else if(inputChars[i] == '*'){
				operation = 3;
				opindex = i;
			}else if(inputChars[i] == '/'){
				operation = 4;
				opindex = i;
			}
			
			
		}

	}
	
	//TODO: assign all numbers before operation to firstnum, and all after secondnum
	
}
