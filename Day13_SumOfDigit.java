import java.util.Scanner;
public class simple 
{
  public static void main(String args[])
  {
	  int m,n,sum=0;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the number");
	 m=sc.nextInt();
	 while(m>0)
	 {
		 n=m%10;
		 sum=sum+n;
		 m=m/10;
	 }
	 System.out.println("sum of digit" +sum);
  }
}
	

	  
