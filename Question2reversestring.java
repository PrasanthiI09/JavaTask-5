/* Reverse String */
 
 
  package javatask5;
 
import java.util.Scanner;

public class Question2reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String rev="";
		String word = sc.next();
		for(int i=word.length()-1;i>=0;i--) {
			
			rev=rev+word.charAt(i);
		}
		System.out.println("Reverse of the word "+word+" is -- "+rev);
	}

}
