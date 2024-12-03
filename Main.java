package gas_station;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        boolean continueTransaction = true;
	        double specialPrice = 55.00; 
	        double unleadedPrice = 60.00; 
	        double dieselPrice = 70.00; 
	        double kerosenePrice = 85.00;  

	        while (continueTransaction) {
	            double totalCost = 0.0;
	            StringBuilder receiptDetails = new StringBuilder("\n--- Receipt ---\n");

	            System.out.println("Welcome to the Gasoline Station!");

	            boolean addMoreFuel = true;
	            while (addMoreFuel) {
	               
	                int fuelType = 0;
	                boolean validFuelType = false;
	                while (!validFuelType) {
	                    System.out.println("\nSelect Fuel Type:");
	                    System.out.println("1. Special (Price per liter: ₱55.00)");
	                    System.out.println("2. Unleaded (Price per liter: ₱60.00)");
	                    System.out.println("3. Diesel (Price per liter: ₱70.00)");
	                    System.out.println("4. Kerosene (Price per liter: ₱85.00)");
	                    System.out.print("Enter your choice (1-4): ");
	                    
	                    try {
	                        fuelType = scanner.nextInt();
	                        if (fuelType >= 1 && fuelType <= 4) {
	                            validFuelType = true; 
	                        } else {
	                            System.out.println("Invalid choice. Please select a valid fuel type.");
	                        }
	                    } catch (Exception e) {
	                        System.out.println("Invalid input. Please enter a number between 1 and 4.");
	                        scanner.next(); 
	                    }
	                }

	                double pricePerLiter = 0.0;
	                String fuelName = "";

	               
	                switch (fuelType) {
	                    case 1:
	                        pricePerLiter = specialPrice;
	                        fuelName = "Special";
	                        break;
	                    case 2:
	                        pricePerLiter = unleadedPrice;
	                        fuelName = "Unleaded";
	                        break;
	                    case 3:
	                        pricePerLiter = dieselPrice;
	                        fuelName = "Diesel";
	                        break;
	                    case 4:
	                        pricePerLiter = kerosenePrice;
	                        fuelName = "Kerosene";
	                        break;
	                }

	           
	                double liters = 0.0;
	                boolean validAmount = false;
	                while (!validAmount) {
	                    System.out.print("Enter the amount of fuel in liters for " + fuelName + ": ");
	                    try {
	                        liters = scanner.nextDouble();
	                        if (liters > 0) {
	                            validAmount = true; 
	                        } else {
	                            System.out.println("Please enter a positive number for the amount of fuel.");
	                        }
	                    } catch (Exception e) {
	                        System.out.println("Invalid input. Please enter a valid number for liters.");
	                        scanner.next();
	                    }
	                }

	            
	                double cost = liters * pricePerLiter;
	                totalCost += cost;

	       
	                receiptDetails.append(fuelName)
	                        .append(" - ")
	                        .append(liters)
	                        .append(" liters @ ₱")
	                        .append(pricePerLiter)
	                        .append("/liter: ₱")
	                        .append(Math.round(cost * 100.0) / 100.0)
	                        .append("\n");

	         
	                System.out.print("Do you want to add another fuel type? (yes/no): ");
	                String response = scanner.next().toLowerCase();
	                if (!response.equals("yes")) {
	                    addMoreFuel = false;
	                }
	            }

	          
	            totalCost = Math.round(totalCost * 100.0) / 100.0;
	            receiptDetails.append("Total Cost: ₱").append(totalCost).append("\n");
	            receiptDetails.append("----------------\n");

	       
	            System.out.println(receiptDetails);

	            System.out.print("Do you want to make another transaction? (yes/no): ");
	            String response = scanner.next().toLowerCase();
	            if (!response.equals("yes")) {
	                continueTransaction = false;
	            }
	        }

	   
	        System.out.println("Thank you for visiting! Goodbye!");
	}

}
