import java.util.Scanner;
class simple 
{
  public static void main(String args[])
      {
          int n,i;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number for cube:");
	  n=sc.nextInt();	
	  for(i=1;i<n;i++)
	    {
	       System.out.println("cube is "+i+" is:"+(i*i*i));
	    }
       }  
}
	
	
	
