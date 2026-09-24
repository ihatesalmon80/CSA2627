// LemonadeStand.java

// this program runs the coolmathgames Lemonade Stand
 
import java.util.Scanner;

public class LemonadeStand {
        
        int daysToSell = 7;

        double cashOnHand = 20.0;
        double costofLemon = 1.50; // 1 lemon
        double costofSugar = 2.00; // 1 cup
        double costofIce = 0.75; // 1 cup
        double costofCups = 0.50; // 1 cup

        int qtyLemons = 0;
        int qtySugars = 0;
        int qtyIce = 0;
        int qtyCups = 0;
        
        int lemonsPerPitcher; // initialize now, ask for user input later
        int sugarsPerPitcher;
        int icePerPitcher;
        int cupsPerPitcher = 10;
        
        boolean moreCupsInPitcher = true;
        int totalCustomers = 0;
        int cupsRemaining;

        double temperature; // randomized; could be on a scale from 1-10 where 1 is lowest temp $
                                                                 
        public boolean setup() {
		
			Scanner scan = new Scanner(System.in);
			
			System.out.println("....................");
			System.out.println("1 lemon: $" + costofLemon);
			System.out.println("1 cup of sugar: $" + costofSugar);
			System.out.println("1 cup of ice: $" + costofIce);
			System.out.println("1 cup: $" + costofCups);
			System.out.println("....................");
			System.out.println("\n");
			
			System.out.println("You have $" + cashOnHand + ". How many lemons would you like to purchase?");
			qtyLemons = scan.nextInt(); // still need to clear buffer
			//String temp = scan.nextLine(); // this line doesn't allow for user input bc enter is hanging -> handling storage issue as a buffer
			cashOnHand = cashOnHand - (qtyLemons * costofLemon);
			
			System.out.println("You have $" + cashOnHand + ". How many cups of sugar would you like to purchase?");
			qtySugars = scan.nextInt();
			cashOnHand = cashOnHand - (qtySugars * costofSugar);
			
			System.out.println("You have $" + cashOnHand + ". How many cups of ice would you like to purchase?");
			qtyIce = scan.nextInt();
			cashOnHand = cashOnHand - (qtyIce * costofIce);
			
			System.out.println("You have $" + cashOnHand + ". How many cups would you like to purchase?");
			qtyCups = scan.nextInt();
			cashOnHand = cashOnHand - (qtyCups * costofCups);
			//String temp = scan.nextLine();

			
			if (cashOnHand < 0) {
				System.out.println("You have no more cash :(");
				System.out.println("Thanks for playing!");
				boolean output = false
			}
			
			else {
				System.out.println("Your inventory: " + qtyLemons + " lemons, " + qtySugars + " cups of sugar, " + qtyIce + " cups of ice, and " + qtyCups + " cups");
				System.out.println("You have $" + cashOnHand +  " left.");
				boolean output = true
			}
			
			return output
		}                          
		

}        
	
		
