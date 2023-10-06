import java.util.Scanner;
 class NaturalNumberSum 
{
  public static void main(String args[])
	{
	   var number=5;
	   int i,sum=0;
	   System.out.println("enter the number");
          Scanner sc=new Scanner(System.in);
          number=sc.nextInt();
    
          for(i=1;i<=number;i++)
           {
    	     sum=sum+i;
           }
            System.out.println("the sum of 5  natural number to ="  +sum);
	}
}
