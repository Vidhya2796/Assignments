package Assignment1;
import java.util.*;
public class Pattern_6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int i, j, rows;

	    System.out.println("Enter number of rows: ");
	    rows=sc.nextInt();
	    int x=fnPattern(rows);
	    

	}
	public static int fnPattern(int rows)
	{
		int i,j=1;
		for(i=1; i<=rows; ++i)
	    {
	        for(j=1; j<=i; ++j)
	        {
	        	System.out.print(j+" ");
	        }
	        System.out.println();
	    }
		return j-1;
	}
}
