package loopexample;

import java.util.Scanner;

public class DoWhileInput {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int input;
		int sum = 0;
		
		do {
			input = scanner.nextInt();
			sum+= input;
		} while(input != 0);
		System.out.println(sum);
	}

}
