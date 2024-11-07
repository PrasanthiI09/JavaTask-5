/* UNiversity Grading */
package javatask5;
import java.util.Scanner;


public class Question5universitygrading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the Student Marks");
		int marks = sc.nextInt();
		
		System.out.println("Studen got " + marks + " marks and Grade is -- ");
		
		if(marks==100 )
		{
			System.out.print("Grade S");
		}
		else if((marks>100)||(marks<0))
		{System.out.println("Invalid Input");}
		
		else if((marks<=99)&& (marks>=90))
	{
		System.out.println("Grade A");
	}
		else if((marks<=89)&& (marks>=80))
	{
	System.out.println("Grade B");
	}
		else if((marks<=79)&& (marks>=70))
	{
	System.out.println("Grade C");
	}
		else if((marks<=69)&& (marks>=60))
	{
	System.out.println("Grade D");
	}
		else if((marks<=59)&& (marks>=50))
	{
	System.out.println("Grade E");
	}
	else if((marks<=50)&& (marks>=0))
	{
	System.out.println("Fail");
	}

		
	}

}
