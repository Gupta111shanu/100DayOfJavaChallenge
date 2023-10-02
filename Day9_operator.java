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
	  System.out.println( "Choose and Enter the type of operation you want to  perform\n 1.Addition (+)\n 2.Substraction(-)\n 3.Multiply (*)\n 4.Devide ( /)");
	  char opt=sc.next().charAt(0);
	     if(opt=='+')
	  	  {
	  		System.out.println("sum is=" +(a+b));
	  	   }
	    else if(opt=='-')
	  	   {
	  		System.out.println("sub is=" +(a-b));
	  	   }
	   else if(opt=='*')
	  	  {
	  		System.out.println("mult is=" +(a*b));
	       	   }
	  else if(opt=='/')
	  	  {
	  		System.out.println("mod is="+(a/b));
	  	  }
	}
}
