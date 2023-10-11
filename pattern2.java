import java.util.Scanner;
class pattern 
{
  public static void main(String args[])
  {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter row");
	int i=sc.nextInt();
	System.out.println("Enter column");
	int j=sc.nextInt();
	 for(i=1;i<=5;i++)
	{
	 for(j=1;j<=5;j++)
	{
	     System.out.print(j*j+" ");
	}
	     System.out.println();
	}
  }
}
	  
	  
	  
