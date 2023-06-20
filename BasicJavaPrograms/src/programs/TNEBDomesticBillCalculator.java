package programs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TNEBDomesticBillCalculator {

	public static void main(String[] args) {

		int units;
		double billToPay=0;

		Scanner userInput= new Scanner(System.in);
		System.out.println("Please enter the reading units value:");
		try {
			units = userInput.nextInt();
			if(units<=500) {
				if (units<=100) {
					System.out.println("Amount to be paid:0 INR");
				}
				if(units>=101 && units<=200) {
					billToPay = (units-100)*2.25;
				}
				if(units>=201 && units<=400) {
					int actualUnits = units-100;
					billToPay = 100*2.25 + (actualUnits-100)*4.5;
				}
				if (units>=401 && units<=500) {
					int actualUnits = units-100;
					billToPay = 100*2.25 + 200*4.5 + (actualUnits-300)*6;
				}
			}
			else {
				if (units>=501 && units<=600) {
					int actualUnits = units-100;
					billToPay = 300*4.5 + 100*6 + (actualUnits-400)*8;
				}
				if(units>=601 && units<=800) {
					int actualUnits = units-100;
					billToPay = 300*4.5 + 100*6 + 100*8 + (actualUnits-500)*9;
				}
				if(units>=801 && units<=1000) {
					int actualUnits = units-100;
					billToPay = 300*4.5 + 100*6 + 100*8 + 200*9 + (actualUnits-700)*10;
				}
				if (units>=1001) {
					int actualUnits = units-100;
					billToPay = 300*4.5 + 100*6 + 100*8 + 200*9 + 200*10 + (actualUnits-900)*11;
				}

			}
			System.out.println("Amount to be paid:"+billToPay+" INR");
		}
		catch(InputMismatchException exception){
			System.out.println("Please enter the reading units value as an integer.");
		}		
		userInput.close();
	}


}


