import java.util.Scanner;
class ReverseTable 
{
  public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the starting number ");
     int n=sc.nextInt();
     System.out.println("Enter the ending number");
     int s=sc.nextInt();
     System.out.println("Enter the tables number");
     int t=sc.nextInt();
      while(n>=s)	  
	  {
	     System.out.println(n+ "*" +t+ "=" +(n*t));
		  n--;
	  }
    } 
}
	   
	  
	  
	  
