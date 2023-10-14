import java.util.Scanner;
class square
{
  public static void main(String args[])
  {
	 int n=5,i=1,sum=0;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the number");
	 n=sc.nextInt();
	 while(i<=n)
	     {
	   	System.out.println(i+ "*" +i+ "=" +i*i);
		 sum+=i*i;
		 i++;
              }
	        System.out.println("sum square number "+n+" " +sum);
     } 
}

