
/* Question - 1 Write a programme to check string is Palindrome or not */

package javatask5;
import java.util.Scanner;


public class Question1palindromstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String rev = "";
		String word = sc.next();
		for(int i = word.length()-1;i>=0;i--)
		{
			rev=rev+word.charAt(i);
			
		}
		if(word.equals(rev)) 
		//if(word==rev)
			{
			
			System.out.println("The word "+word+" is a Palindrom String");
		}
	
		else {
			System.out.println("The word "+word+" is a not Palindrom String");
		}
	}

}
