/* Largest number of three */
package javatask5;
import java.util.Scanner;

public class Question7largestnumberofthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any three numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		if(num1>num2)
		{ if (num1>num3)
		{
			 System.out.println(num1 + " is largest of " + num2 + " and " + num3);
		}
		}
		if(num2>num1)
		{ if(num2>num3)
		{
			 System.out.println(num2 + " is largest of " + num1 + " and " + num3);
		}
		}
		if(num3>num1)
		{ if(num3>num2)
		{
			 System.out.println(num3 + " is largest of " + num1 + " and " + num2);
		}
		}

		
	}

}
