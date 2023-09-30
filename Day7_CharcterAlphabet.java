import java.util.Scanner;
class ChAlpha
{
  public static void main(String args[])
	{
           Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the value");
	  char ch=sc.next().charAt(0);
	   if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
	    {
		  System.out.println("This is Alphabet");
	     }
	   else if(ch>='0' && ch<='9')
	     {
		  System.out.println("This is Number");
             }
	    else
	     {
		  System.out.println("This is Special Character");
	     }
	}
}
