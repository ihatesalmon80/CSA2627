// LemonadeStand.java

// this program runs the coolmathgames Lemonade Stand
 
import java.util.Scanner;

public class LemonadeStand {
        

        double cashOnHand;

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

        int cupsPerPitcher;

        

        boolean moreCupsInPitcher = true;

        int totalCustomers = 0;

        int cupsRemaining;

        

        double temperature; // randomized; could be on a scale from 1-10 where 1 is lowest temp $

                                                                 
        public void setup() {
		
		Scanner scan = new Scanner(System.in);
		int lemons = scan.nextInt(); // still need to clear buffer
		String temp = scan.nextLine(); // this line doesn't allow for user input bc enter is hanging
	
	}                               

}        
	
		