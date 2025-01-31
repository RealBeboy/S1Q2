package Semister2;
import java.util.Scanner;
public class Salvador_Acitivity7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int attempt = 0;
		int computer = 5;

		do {
			attempt = attempt + 1;
			
			System.out.println("Enter a number:");
			int player = scanner.nextInt();
			
			if (player < computer) {
				System.out.println("You are LESS THAN the Number");
				continue;
			}
			else if (player > computer) {
				System.out.println("You are are MORE THAN the number");
				continue;
				
			}
			else if (player == computer) {
				
				break;
			}
			
			
			
			
		}while(true);
		
		System.out.println();
		System.out.println("You win");
		System.out.println("With the attempts of " + attempt);
	}

}
