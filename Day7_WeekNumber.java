import java.util.Scanner;
 class WeekNumber
{
  public static void main(String args[])
	{
	  System.out.println("Enter the week number(0 to 6");
	  Scanner sc=new Scanner(System.in);
	  int num=sc.nextInt();
	  if(num==0)
	  {
		  System.out.println(" this is a sunday");
	  }
	  else if(num==1)
	  {
		  System.out.println("this is a monday");
	  }
	  else if(num==2)
	  {
		  System.out.println("this is a tuesday");
	  }
	  else if(num==3)
	  {
		  System.out.println("this is a Wednesday");
	   }
	  else if(num==4)
	  {
		  System.out.println("this is a thursday");
	   }
	  else if(num==5)
	  {
		  System.out.println("this is a friday");
          }
	  else if(num==6)
	  {
		  System.out.println("this is a saturday");
          }
	  else
	  {
		  System.out.println("ENTER 0 TO 6");
	  }
	}
}