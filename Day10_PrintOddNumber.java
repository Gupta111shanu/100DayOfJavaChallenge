import java.util.Scanner;
class PrintOddNumber 
{
  public static void main(String args[])
	{	  
	
	   System.out.println("the first 10 even number");
          Scanner sc=new Scanner(System.in);
          int  number=sc.nextInt();
    
          for( int i=1;i<=10; i++)
          System.out.println(2*i-1);
	}
}
