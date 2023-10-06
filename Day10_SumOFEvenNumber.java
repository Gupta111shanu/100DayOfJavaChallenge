import java.util.Scanner;
class SumEvenNumber
{
  public static void main(String args[])
   {  
          int i,sum=0;
	  System.out.println("enter any number");
          Scanner sc=new Scanner(System.in);
         int number=sc.nextInt();
    
        for(i=1;i<=number;i++)
    	if(i%2==0)
         {
    	   sum=sum+i;
         }
          System.out.println("the sum of 5  natural number to ="  +sum);
    }
}
