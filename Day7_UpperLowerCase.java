import java.util.Scanner;
public class simple 
{
  public static void main(String args[])
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the character");
	  char ch=sc.next().charAt(0);            	
	    if(ch>='A' && ch<='Z')
              {
		  System.out.println("this is a uppercase alphabet");
	       }
	   else
	       {
		  System.out.println("this is a lowercase alphabet");
	       }
		    	  
	}
}