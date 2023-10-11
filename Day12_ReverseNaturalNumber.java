import java.util.Scanner;
class simple 
{
  public static void main(String args[])
    {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the reverse starting natural number");
	  int s=sc.nextInt();
	  System.out.println("enter the reverse ending natural number");
	  int e=sc.nextInt();
	  while(s>=e)
	    {
		  System.out.println(s);
		  s--;
	    }
    }
}
	  
	  
