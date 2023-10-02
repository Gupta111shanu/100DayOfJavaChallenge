	     
import java.util.Scanner;
public class simple 
{
  public static void main(String args[])
	{
           Scanner sc = new Scanner(System.in);
 	   System.out.print("Enter the first number: ");
           int a = sc.nextInt();
	   System.out.print("Enter the second number: ");
	   int b = sc.nextInt();
	   System.out.print("Enter the third number: ");
	   int c = sc.nextInt();
	   System.out.print("Enter the fourth number: ");
	   int d = sc.nextInt();

	  if(a>b && a>c &&  a>d)
	  	System.out.println("The largest number is:"+a);

	  else if(b>a && b>c &&  c>d)
	  	System.out.println("The largest number is:"+b);

	  else if(c>a && c>b &&  c>d)
	  	System.out.println("The largest number is:"+c);

	  else
	  	System.out.println("The largest number is:"+d);

	    }
	  }
