package Assignment1;
import java.util.*;
public class Pattern_8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i, j;
	    char input, alphabet = 'A',ch=' ';

	    System.out.println("Enter the uppercase character you want to print in last row: ");
	    input=sc.next().charAt(0);
	    ch=fnPattern(input);
	}
	public static char fnPattern(char input)
	{
		int i, j;
	    char alphabet = 'A';
		for(i=1; i <= (input-'A'+1); ++i)
	    {
	        for(j=1;j<=i;++j)
	        {
	        	System.out.print(alphabet+" ");
	        }
	        ++alphabet;

	        System.out.println();
	    }
		//System.out.println(alphabet);
		return (alphabet);
	}
}
