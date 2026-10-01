public class Main {

	public static void main(String[] args) {
		int totalCupsSold = 0;
		LemonadeStand l1 = new LemonadeStand();
		int daysTotal = l1.setupDuration();
		boolean continue1 = l1.setup();
		if (continue1) {
			l1.setupPitcher();
			
			while (daysTotal > 0) { 
				int cupsSoldDay = l1.gamePlay(); 
				totalCupsSold += cupsSoldDay;
				boolean cont = l1.setup();
				if (cont) {
					l1.setupPitcher();
				} 
				else {
				//System.out.print("You have no more money. Thanks for playing!");	
				System.exit(0);}
				if (daysTotal == 1) {
					int cups = l1.gamePlay(); 
					totalCupsSold += cups;
					
					double totalCash = l1.cashReturn();
					System.out.println("............");
					System.out.println("Congratulations! You have completed Lemonade Stand!");
					System.out.println("You sold " + totalCupsSold + " cups of lemonade and your final balance is $" + totalCash + "!");
					System.out.println("............");
			}
				daysTotal -= 1;
			}
			
		}
		else {
			}

    }

}
