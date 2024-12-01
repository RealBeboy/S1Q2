package semister2;
import java.util.Scanner;
public class Salvador_Activity4 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        
	        
	        System.out.println("What is your number?");
	        int number = scanner.nextInt();
	         
	         
	        int factorial = 1;
	      
	        int i = 1;
	        do {
	        	 factorial = factorial*i;
		            i++;
		            
	        }
	        while (i <= number );
	            
	          
	        
	        System.out.println("The factorial is: " + factorial);
	}

}
