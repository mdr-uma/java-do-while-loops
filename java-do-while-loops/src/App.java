import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = 0;
		
		do {
			System.out.println("Enter a number; ");
			number = input.nextInt();
		}
		while(number != 10);
		System.out.println("You got 10!");
	}

}
