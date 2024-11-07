package javatask5;

public class Question4starpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row,col,i;
		i=5;
		int j=i;
		for(row=1;row<=i;row++)
		{
			for(col=i;col>=1;col--)
			{
				if(col==row||col==j)
				{System.out.print("*");}
				else
				{System.out.print(" ");}
				
			}
			j=j-1;
			System.out.println();
		}
		
		
	}

}
