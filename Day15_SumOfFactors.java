import java.util.Scanner;
class SumOfFactores
{
  public static void main(String args[])
  {
     int i sum=0;
     Scanner sc=new Scanner(System.in);
    System.out.println("Enter the  number");
    int n=sc.nextInt();
 
       for(i=1;i<n;i++)
           {
    	       if(n%i==0) 
    	         {
                    sum+=i;
                   System.out.println("factors "+n+" " +i);
    	      
    	        } 
           }
    	        System.out.println(" sum of factors " +sum);
   } 
}  

	  
	  
	  
