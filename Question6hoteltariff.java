/* Hotel Tariff */
package javatask5;
import java.util.Scanner;


public class Question6hoteltariff {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of Days of the Stay");
	int noofdays = sc.nextInt();
	System.out.println("Enter Number of the Month");
	int noofmonth = sc.nextInt();
	System.out.println("Enter the rent of the Hotel per day");
	float roomrent = sc.nextFloat();
	
	switch (noofmonth)
	{
	case 1,2,3,7,8,9,10:
		roomrent = roomrent*noofdays;
		System.out.println("Room Rent for the month of "+ noofmonth +"th month is ");
		System.out.printf("%.2f",roomrent);
		System.out.println(" for "+ noofdays + " days");
		
		break;
	case 4,5,6,11,12:
			
		roomrent = (float) (((0.2*roomrent)+ roomrent)*noofdays);
	System.out.println("Room Rent for "+ noofmonth +" month is ");
	System.out.printf("%.2f",roomrent);
	System.out.println(" for "+ noofdays + " days");
	break;
	}

		
		
		
		
	} 
}
