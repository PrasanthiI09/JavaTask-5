/* Pattern */
package javatask5;
public class Question3pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Table Pattern");
		for (int row = 1; row<=4;row++) {
				for(int col = 1; col<=4;col++) {
					if(row==1&&col==1)
					{ System.out.println(1);}
					
								if(row==2&&col==2)
					{ System.out.println(2+" "+3);}
					if(row==3&&col==3)
					{ System.out.println(4+" "+5+" "+6);}
					if(row==4&&col==4)
					{ System.out.println(7+" "+8+" "+9+" "+10);}

				}
		}
	}
				

}
