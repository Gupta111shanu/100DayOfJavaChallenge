import java.util.Scanner;
public class simple 
{
  public static void main(String args[])
     {
       	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter first number");
	  int m1=sc.nextInt();
	  System.out.println("Enter the second number");
	  int m2=sc.nextInt();
	  System.out.println("Enter the third number");
	  int m3=sc.nextInt();

	  if(m1==m2 && m2==m3)
	   {
		  System.out.println("equal");
       	  }
 	  else
	  {
		  System.out.println("not equal");
	  }
	}
}
	  

