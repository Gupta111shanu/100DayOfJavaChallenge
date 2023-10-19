import java.util.Scanner;
class palindrome  
{
  public static void main(String args[])
  {
	  int num,rev=0,rem,d;
	Scanner sc=new Scanner(System.in);
	System.out.println("input number");
	num=sc.nextInt();
	rem=num;
	while(rem!=0)
	{
	       d=rem%10;
		rev=rev*10+d;
		rem=rem/10;
	}
	  if(rev==num)
	     {
		System.out.println("palindrome number");
	     }
	 else
	    {
		System.out.println("not palindrome number");
	    }
  }
}
  
