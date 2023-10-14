import java.util.Scanner;
class prime 
{
  public static void main(String args[])
  {
	 int i,num=0,flag=0;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the number");
	 num=sc.nextInt();
	 for(i=2;i<num;i++)

	   if(num%i==0)
	     {
	        flag=0;
	        break;
	     }
	     else  
	     {
		flag=1;
	     }

	   if(flag==1)
	     {
		 System.out.println("prime number");
	      }
	   else
	      {
		 System.out.println("not prime number");
	       }
	}
}
	
