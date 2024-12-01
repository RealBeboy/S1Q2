package semister2;
import java.util.Scanner;
public class Salvador_Activity2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Five Sucbjects: ");
		
		System.out.println("Physics");
		int Physics = scanner.nextInt();
		System.out.println("Chemistry");
		int Chemistry = scanner.nextInt();
		System.out.println("Biology");
		int Biology = scanner.nextInt();
		System.out.println("Mathematics");
		int Mathematics = scanner.nextInt();
		System.out.println("Computer Science");
		int Computer_Science = scanner.nextInt();
		
		int TotalGrade = Physics+Chemistry+Biology+Mathematics+Computer_Science;
		
		System.out.println("Total Grade: "+TotalGrade);
		int Percentage = TotalGrade/5;
		
		System.out.println("Average/Percentage: "+ Percentage);
		
		
		
		
		
	}

}
