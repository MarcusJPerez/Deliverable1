
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberInput2 {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		int userInt1 = 0;
		int userInt2 = 0;
		boolean result = true;
		int length1 = 0;
		int length2 = 1;
		int count = 0;
		
		while (length1 != length2) {
			if (count > 0) {
				System.out.println("Please try again, numbers must be the same length.");
				
			}
			System.out.println("Enter a number: ");
			userInt1 = userInput.nextInt();

			length1 = String.valueOf(userInt1).length();

			System.out.println("Enter another " + length1 + " digit number: ");
			userInt2 = userInput.nextInt();
			length2 = String.valueOf(userInt2).length();
			count++;

		}

		List<Integer> input1 = new ArrayList<Integer>();
		List<Integer> input2 = new ArrayList<Integer>();

		while (userInt1 > 0) {
			input1.add(userInt1 % 10);
			userInt1 /= 10;
		}
		while (userInt2 > 0) {
			input2.add(userInt2 % 10);
			userInt2 /= 10;
		}
		for (int i = 0; (i < input1.size() - 1); i++) {
			if (input1.get(i) + input2.get(i) != input1.get(i + 1) + input2.get(i + 1)) {
				result = false;
				break;
			}

		}
		System.out.println(result);
		userInput.close();

	}
}
