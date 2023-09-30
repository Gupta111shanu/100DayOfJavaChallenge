import java.util.Scanner;
class Triangle
{
  public static void main(String args[])
	{
           Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the 1st Angles of Traingle");
	  int a=sc.nextInt();
	  System.out.println("Enter the 2nd Angles of Traingle");
          int b=sc.nextInt();
	  System.out.println("Enter the 3rd Angles of Traingle");
	  int c=sc.nextInt();
	    if((a+b+c)==180)
	      {
		  System.out.println("Triangle is valid");
              }
	    else
	      {
		  System.out.println("Triangle is not valid");
	      }
	}
}

