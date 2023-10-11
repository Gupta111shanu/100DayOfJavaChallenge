import java.util.Scanner;
class simple 
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter row");
	  int n=sc.nextInt();
	  System.out.println("enter column ");
	  int m=sc.nextInt();
	  for(int i=1;i<=n;i++)
	  {
		  for(int j=1;j<=i;j++)
		  {
			  System.out.print(i);
		  }
		  System.out.println();
	  }
  }
}
