import java.util.Scanner;
class SumOfFact 
{
  public static void main(String args[])
  {
        int p,sum=0,fact=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("input number");
	p=sc.nextInt();

	while(p!=0)
	{
		p=p%10;
		for(int i=2;i<=p;i++)
		{
		  fact=fact*i;
		  System.out.println("factorial number: "+i+" " +fact);
		  sum=sum+fact;
		}
		 System.out.println("sum of factorial: " +sum);
		 p=p/10;
	}
  }
}
	
	  
	  
	  
