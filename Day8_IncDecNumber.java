import java.util.Scanner;
public class IncDecNumber
{
  public static void main(String args[])
   {
         Scanner sc=new Scanner(System.in);
	  System.out.println("input first number");
	  int s=sc.nextInt();
	  System.out.println("input second number");
	  int u=sc.nextInt();
	  System.out.println("input third number");
	  int g=sc.nextInt();
	    if(s<u && u<g)
	      {
		  System.out.println("Increasing order");
	       }
	    else if(s>u && u>g)
	       {
		  System.out.println("Decreasing order");
               }
	    else
	       {
		  System.out.println("not Increasing Decreasing order");
	       } 
	}
}
	 