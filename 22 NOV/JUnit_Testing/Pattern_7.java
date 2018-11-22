package Assignment1;

import java.util.Scanner;

public class Pattern_7 {

	public static void main(String[] args) {
		int rows;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows: ");
	    rows=sc.nextInt();
	    int x=fnPattern(rows);
	   

	}
	public static int fnPattern(int rows)
	{
		int i,j=1;
		 for(i=rows; i>=1; --i)
		    {
		        for(j=1; j<=i; ++j)
		        {
		        	System.out.print("* ");
		        }
		        System.out.println();
		    }
		 
		return j;
	}
}
