import java.util.Scanner;
class simple 
{
  public static void main(String args[])
   {
	 int i,n,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number :");
	 n=sc.nextInt();	
	 System.out.println("the odd number are :");
	 for(i=1;i<n;i++)
	   {
		 System.out.println(2*i-1);
		 sum+=2*i-1;
	   }
	    System.out.println("the sum of odd natural number upto "+n+"terms is " +sum);
	 
   }
}
	
	
