package assignment_4;

import java.util.Scanner;
/*An application that allows the user to enter a Fahrenheit temperature and displays the Celsius equivalent or enter a Celsius temperature and displays the Fahrenheit equivalent*/
public class TempConversion {

	public static void main(String[] args) {
		
		boolean flag= true;
		Scanner s = new Scanner(System.in);
		
		// Continuous loop for Menu driven program
		while (flag){
				
		System.out.print("\n1.Fahrenheit to Celsius\n2.Celsius to Fahrenheit\n3.Exit\nChoice:");
		
		int choice = s.nextInt();
		
		switch(choice)
		{
			case 1: System.out.print("Enter temperture: ");
		            Celsius(s.nextInt());
		            break;
		    case 2: System.out.print("Enter temperature: ");
					int Fartemp = s.nextInt();
		            Fahrenheit(Fartemp);
		            break;
		    case 3: System.out.print("Program Terminated");
		    		flag = false;
		    		
		    		break;
		            
		    default: System.out.print("Please enter right choice\n");
		             break;
		}// end of switch
		
		}// end of while
		s.close();
	}
	
	// Method to convert Fahrenheit temperature to Celsius
	static void Celsius(int temp){
		int celsius = (int)(5.0/9.0 * (temp - 32));
		System.out.println(temp+" Fahrenheit is "+celsius+" Celsius" );
	}
	
	// Method to convert Celsius temperature to Fahrenheit
	static void Fahrenheit(int temp){
		 double fahrenheit = 9.0/5.0 * temp + 32;
		 int Fahrenheit = (int)fahrenheit;
		System.out.println(temp+" celsius is "+Fahrenheit+" Fahrenheit" );
	}

}