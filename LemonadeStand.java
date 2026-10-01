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
        int qtyCupsToSell;
        
        int lemonsPerPitcher; // initialize now, ask for user input later
        int sugarsPerPitcher;
        int icePerCup;
        int cupsPerPitcher = 10;
        
        int qtyPitchers;
        double pricePerCup;
        boolean moreCupsInPitcher = true;
        int totalCustomers = 0;
        int cupsSoldTotal = 0;
        int cupsRemaining;

        double temperature; // randomized; could be on a scale from 1-10 where 1 is lowest temp $

		Scanner scan = new Scanner(System.in);
		
        /* user decides length of game by inputting # of days 
         * user buys all materials for lemonade
         * method proceeds if after buying everything, use is not bankrupt
         */                
         
        public int setupDuration() {
		
		System.out.println("Welcome to Lemonade Stand! \n \n You can play for 7, 14, or 30 days. Which option would you like to choose?");
		daysToSell = scan.nextInt();
		return daysToSell;
		
	}	                                         
        public boolean setup() {
			
			System.out.println("....................");
			System.out.println("1 lemon: $" + costofLemon);
			System.out.println("1 cup of sugar: $" + costofSugar);
			System.out.println("1 bag of ice cubes (100 ice cubes): $" + costofIce);
			System.out.println("1 cup: $" + costofCups);
			System.out.println("....................");
			System.out.println("\n");
			
			System.out.println("You have $" + cashOnHand + " and " + qtyLemons + " lemons. How many lemons would you like to purchase?");

			int tempLemons = scan.nextInt();
			qtyLemons = qtyLemons + tempLemons;
			
			//String temp = scan.nextLine(); this line doesn't allow for user input bc enter is hanging -> handling storage issue as a buffer
			cashOnHand = cashOnHand - (tempLemons * costofLemon);
			
			System.out.println("You have $" + cashOnHand + " and " + qtySugars + " cups of sugar. How many cups of sugar would you like to purchase?");
			int tempSugars = scan.nextInt();
			qtySugars = qtySugars + tempSugars;
			cashOnHand = cashOnHand - (tempSugars * costofSugar);
			
			System.out.println("You have $" + cashOnHand + " and " + qtyIce + " ice cubes. How many bags of ice cubes would you like to purchase?");
			int tempIceDividedBy100 = scan.nextInt();
			qtyIce = qtyIce + tempIceDividedBy100 * 100;
			cashOnHand = cashOnHand - (tempIceDividedBy100 * costofIce);
			
			System.out.println("You have $" + cashOnHand + " and " + qtyCups + " cups. How many cups would you like to purchase?");
			int tempCups = scan.nextInt();
			qtyCups = qtyCups + tempCups;
			cashOnHand = cashOnHand - (tempCups * costofCups);
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
		                
		/* sets up recipe for each pitcher of lemonade
		 * sets up price for each cup of lemonade
		 * determines maximum pitchers/cups user can make
		 */
		 
		public void setupPitcher() {
			
			System.out.println("You now must make pitchers of lemonade. Each pitcher serves 10 cups of lemonade. \n Knowing your inventory, determine how many of each ingredient you want to put in each pitcher. \n Keep in mind that you should be balancing sourness and sweetness as well as the temperature of the lemonade for maximum customer approval. ONLY choose integers (i.e. 1, 3) for each ingredient");
			System.out.println("\n");
			System.out.println("Your inventory: " + qtyLemons + " lemons, " + qtySugars + " cups of sugar, " + qtyIce + " cups of ice, and " + qtyCups + " cups");
			System.out.println("\n");
	
			
			System.out.println("You have " + qtyLemons + " lemons. How many lemons would you like to add per pitcher?");
			lemonsPerPitcher = scan.nextInt();
			System.out.println("You have " + qtySugars + " cups of sugar. How many cups of sugar would you like to add per pitcher?");
			sugarsPerPitcher = scan.nextInt();
			System.out.println("You have " + qtyIce + " ice cubes. How many ice cubes would you like to add per cup?");
			icePerCup = scan.nextInt();
			System.out.println("What would you like to set the price per cup to be? (Suggested range: $0.10 to $1.00)\n Type number only, no dollar sign");
			pricePerCup = scan.nextDouble();
			
			System.out.println("\n");
			System.out.println("Your recipe: \n \n" + lemonsPerPitcher + " lemons/pitcher \n" + sugarsPerPitcher + " cups of sugar/pitcher \n" + icePerCup + " ice cubes/cup \n$" + pricePerCup + "/cup" );
			
			int temp1 = (int) (qtyLemons / lemonsPerPitcher);
			int temp2 = (int) (qtyIce / (icePerCup * 10));
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
				System.out.println("You can make and sell " + qtyPitchers*10 + " cups of lemonade");
				qtyCupsToSell = qtyPitchers*10;
			}
			else {
				System.out.println("You can make and sell " + qtyCups + " cups of lemonade");
				qtyCupsToSell = qtyCups;
			}
			
		}
			
			
		/* runs one day of selling lemonade, can be called x times where x is the number of days user wants to play
		 * if certain unfavorable conditions are met 
		 * (i.e. too many lemons, too little ice, too high of a price, etc) 
		 * then the rate at which lemonade is bought drops
		 * baically, user starts at a high probability of selling which decreases if favorability of recipe drops
		 * calculates total cups served, total money made
		 * subtracts pitchers made from toal ingredients
		 * keeps track of total money on hand
		 * returns progress at end of each day
		 * if user is making money then they will repeat a day using main method
		 */ 
		 public int gamePlay() {
			 
			 System.out.println();
			 System.out.println("Running stand... \n. \n. \n. \n.");
			 
			 int n = qtyCupsToSell;
			 int range = 10;
			 int cupsSoldDay = 0;
			 int shift = 0;
			 
			 if ( lemonsPerPitcher > sugarsPerPitcher + 2 ) {
				 range = range - 3;
			 }
			 
			 if ( icePerCup < 5 ) {
				 range = range - 2;
				 if (icePerCup<3) {
					 range = range -1;
				}
			 }
			 if ( pricePerCup >= 0.25 ) {
				 if (pricePerCup >= 0.50) {
					 range = range - 2;
				}
				 else {
					 range = range - 1;
				 }
			}
			if (pricePerCup >= 1) {
				shift -= 2;
			}
			if (icePerCup > 10) {
				shift -= 1;
			}
			if (lemonsPerPitcher <=2) {
				shift -=1;
			}
			if (sugarsPerPitcher >= 8) {
				shift -=1;
			}
			 
			 while (n > 0) {	
				double prob = Math.random() * range + shift;
				// test print statement : System.out.println(prob);
				if (prob >=1) {
					 cupsSoldDay += 1;
				}
				n -= 1;
				// test print statement to check errors System.out.println("cupssoldday: " + cupsSoldDay);
			 }

			 double percentageSold = 100 * ((double) cupsSoldDay/qtyCupsToSell);
			 double moneyMade = pricePerCup * cupsSoldDay;
			 cashOnHand = moneyMade + cashOnHand;
			 
			 int cupsSoldDayRoundedToNextHighest10 = ((cupsSoldDay+9) / 10)*10; // round to nearest 10 because the rest of lemonade in a half-full pitcher is disposed of
			 int pitchersMadeDay = cupsSoldDayRoundedToNextHighest10/10;
			 
			 qtyLemons = qtyLemons - pitchersMadeDay * lemonsPerPitcher;
			 qtyIce = qtyIce - pitchersMadeDay * (icePerCup*10);
			 qtySugars = qtySugars - pitchersMadeDay * (sugarsPerPitcher);
			 qtyCups = qtyCups - cupsSoldDay;
			 
			 System.out.println();
			 System.out.println("You sold " + cupsSoldDay + " cups of lemonade out of " + qtyCupsToSell + " possible cups!");
			 System.out.println("That's " + percentageSold + "% of all your cups!");
			 System.out.println();
			 System.out.println("You earned $" + moneyMade + " today. Your total balance is $" + cashOnHand + ".");
			 return cupsSoldDay;
			 
		}
		/* returns final cash on hand at end of seven days when called in main method
		 * only called once 
		 */
		public double cashReturn() {
		
			return cashOnHand;
	}

}
	

  
	
		
