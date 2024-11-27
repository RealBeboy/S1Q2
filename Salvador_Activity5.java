package fibbonacci;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter the number of terms: ");
    int number = scanner.nextInt();

    int first_num = 0;
    int second_num = 1;
    int sum;

    if (number >= 1) {
        System.out.println(first_num);
    }
    if (number >= 2) {
        System.out.println(second_num);
    }

    
    for (int i = 3; i <= number; i++) {
    	
        sum = first_num + second_num;
        System.out.println(sum);
        
        first_num = second_num;
        second_num = sum;
    }

	}

}
