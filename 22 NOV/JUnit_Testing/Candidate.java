package Assignment1;
import java.util.*;
public class Candidate {
	
	
		public static void main (String[] args)
		{
			Scanner sc=new Scanner(System.in);
			String fn,ln,middle,dep,spanish,hire;
			int year;
			int current=2018;
			System.out.println("Enter your first name: ");
			fn=sc.nextLine();
			System.out.println("Enter your last name: ");
			ln=sc.nextLine();
			System.out.println("Enter your middle initials: ");
			middle=sc.nextLine();
			System.out.println("Enter your department: ");
			dep=sc.nextLine();
			System.out.println("Enter your Yes or No for Spanish: ");
			spanish=sc.nextLine();
			System.out.println("Enter your graduation degree: ");
			hire=sc.nextLine();
			System.out.println("Enter your year of hiring: ");
			year=sc.nextInt();
			int c=check(spanish, hire,current, year);
			if(c==1)
				System.out.println("Name= "+fn+" "+ln+"\nDept= "+dep+"\nMiddle Initials= "+middle+"\nYou are Qualified");
			else
				System.out.println("Not qualified");
		}
	public static int check(String spanish,String hire,int current,int year)
	{
		if((spanish.equals("Yes") && ((hire.compareTo("BA"))>0) && ((current-year)>=5)))
		{
			return 1;
		}
		return 0;
	}


}
