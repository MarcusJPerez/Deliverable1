import java.util.Scanner; 
public class NumberInput {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		int userInt1 = 0;
		int userInt2 = 0;
		int	num1Spot1 = 0;
		int num1Spot2 = 0;
		int num1Spot3 = 0;
		int num2Spot1 = 0;
		int num2Spot2 = 0;
		int num2Spot3 = 0;
		
		
		System.out.println("Enter a three digit number: ");
		userInt1 = userInput.nextInt();
		
		System.out.println("Enter another three digit number: ");
		userInt2 = userInput.nextInt();
		
		num1Spot1 = userInt1 / 100;
		num1Spot2 = (userInt1 - (num1Spot1 * 100)) / 10;
		num1Spot3 = (userInt1  - (num1Spot1 * 100) - (num1Spot2 * 10));
		
		num2Spot1 = userInt2 /100;
		num2Spot2 = (userInt2 - (num2Spot1 * 100)) / 10;
		num2Spot3 = (userInt2  - (num2Spot1 * 100) - (num2Spot2 * 10));
		
		if ( (num1Spot1 + num2Spot1) == (num1Spot2 + num2Spot2) && (num1Spot2 + num2Spot2) == (num1Spot3 + num2Spot3)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		
		
		String temp = "";
		System.out.println(temp);
	}

}
