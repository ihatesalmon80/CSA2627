// LemonadeStand.java

// this program runs the coolmathgames Lemonade Stand
 
import java.util.Scanner;

public class LemonadeStand {
        
        int daysToSell;

        double cashOnHand = 20.0;
        double costofLemon = 0.10; // 1 lemon
        double costofSugar = 0.15; // 1 cup
        double costofIce = 0.50; // 100 cubes
        double costofCups = 0.01; // 1 cup

        int qtyLemons = 0;
        int qtySugars = 0;
        int qtyIce = 0;
        int qtyCups = 0;
        
        double lemonsPerPitcher; // initialize now, ask for user input later
        double sugarsPerPitcher;
        double icePerPitcher;
        double cupsPerPitcher = 10;
        
        int qtyPitchers;
        boolean moreCupsInPitcher = true;
        int totalCustomers = 0;
        int cupsRemaining;

        double temperature; // randomized; could be on a scale from 1-10 where 1 is lowest temp $

		Scanner scan = new Scanner(System.in);
                                                                 
        public boolean setup() {
			
			System.out.println("Welcome to Lemonade Stand! \n \n You can play for 7, 14, or 30 days. Which option would you like to choose?");
			daysToSell = scan.nextInt();
			
			System.out.println("....................");
			System.out.println("1 lemon: $" + costofLemon);
			System.out.println("1 cup of sugar: $" + costofSugar);
			System.out.println("100 ice cubes: $" + costofIce);
			System.out.println("1 cup: $" + costofCups);
			System.out.println("....................");
			System.out.println("\n");
			
			System.out.println("You have $" + cashOnHand + ". How many lemons would you like to purchase?");
			qtyLemons = scan.nextInt(); // still need to clear buffer
			//String temp = scan.nextLine(); this line doesn't allow for user input bc enter is hanging -> handling storage issue as a buffer
			cashOnHand = cashOnHand - (qtyLemons * costofLemon);
			
			System.out.println("You have $" + cashOnHand + ". How many cups of sugar would you like to purchase?");
			qtySugars = scan.nextInt();
			cashOnHand = cashOnHand - (qtySugars * costofSugar);
			
			System.out.println("You have $" + cashOnHand + ". How many ice cubes would you like to purchase?");
			int qtyIceDividedBy100 = scan.nextInt();
			qtyIce = qtyIceDividedBy100 * 100;
			cashOnHand = cashOnHand - (qtyIceDividedBy100 * costofIce);
			
			System.out.println("You have $" + cashOnHand + ". How many cups would you like to purchase?");
			qtyCups = scan.nextInt();
			cashOnHand = cashOnHand - (qtyCups * costofCups);
			//String temp = scan.nextLine();

			
			if (cashOnHand < 0) {
				System.out.println("You have no more cash :(");
				System.out.println("Thanks for playing!");
				boolean output = false;
				return output;
			}
			
			else {
				System.out.println("Your inventory: " + qtyLemons + " lemons, " + qtySugars + " cups of sugar, " + qtyIce + " ice cubes, and " + qtyCups + " cups");
				System.out.println("\n");
				System.out.println("You have $" + cashOnHand +  " left.");
				System.out.println("\n");
				boolean output = true;
				return output;
			}
			
		}                          
		
		public void setupPitcher() {
			
			System.out.println("You now must make pitchers of lemonade. Each pitcher serves 10 cups of lemonade. \n Knowing your inventory, determine how many of each ingredient you want to put in each pitcher. \n Keep in mind that you should be balancing sourness and sweetness as well as the temperature of the lemonade for maximum customer approval. \n You can choose integers (i.e. 1, 3) or decimals (0.25, 0.5) for each ingredient");
			System.out.println("\n");
			System.out.println("Your inventory: " + qtyLemons + " lemons, " + qtySugars + " cups of sugar, " + qtyIce + " cups of ice, and " + qtyCups + " cups");
			System.out.println("\n");
	
			
			System.out.println("You have " + qtyLemons + " lemons. How many lemons would you like to add per pitcher?");
			lemonsPerPitcher = scan.nextDouble();
			System.out.println("You have " + qtySugars + " cups of sugar. How many cups of sugar would you like to add per pitcher?");
			sugarsPerPitcher = scan.nextDouble();
			System.out.println("You have " + qtyIce + " cups of ice. How many cups of ice would you like to add per pitcher?");
			icePerPitcher = scan.nextDouble();
			
			System.out.println("\n");
			System.out.println("Your recipe: \n \n" + lemonsPerPitcher + " lemons \n" + sugarsPerPitcher + " cups of sugar \n" + icePerPitcher + " cups of ice");
			
			int temp1 = (int) (qtyLemons / lemonsPerPitcher);
			int temp2 = (int) (qtyIce / icePerPitcher);
			int temp3 = (int) (qtySugars / sugarsPerPitcher); 
			
			if (temp1 < temp2) {
				if (temp1 < temp3) {
					qtyPitchers = temp1;
				}
				else {
					qtyPitchers = temp3;
				}
			}
			else {
				if (temp2 < temp3) {
					qtyPitchers = temp2;
				}
				else {
					qtyPitchers = temp3;
				}
			}	
			System.out.println("\n");
			System.out.println("You have enough ingredients to make " + qtyPitchers + " pitchers of lemonade");
			//System.out.println("That's " + qtyPitchers*10 + " cups!");
			if (qtyCups > (qtyPitchers*10)) {
				System.out.println("You have " + qtyPitchers*10 + " cups in total");
			}
			else {
				System.out.println("You have " + qtyCups + " cups in total");
			}
			
			
		//public 
		
	}

}        
	
		
