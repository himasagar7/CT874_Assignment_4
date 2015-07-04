package assignment_4;
/*
 * Program to display the charges for the current customer and should calculate and display the running total of yesterday’s receipts.
 */
import java.util.Scanner;

public class TollCalculator {

	public static void main(String[] args) {
		double charge =5, total_charge=0;
		int hours;
		Scanner s = new Scanner(System.in);
		while(true){
			System.out.print("Enter number of hours (-1 to quit):");
			 hours = s.nextInt();
				if(hours!= -1)
			{
				if(hours>16)
				{
					charge = 25;
				}
				else if(hours<3){
					//add nothing
					charge += 0;
				}
				else{
					charge += (hours-3)*1.5;
				}
				total_charge += charge;
				System.out.println("Current charge: € "+charge+", Total receipts: €"+total_charge);
			}
			else{
				
				break;
			}
			
		}
		s.close();

	}

}
