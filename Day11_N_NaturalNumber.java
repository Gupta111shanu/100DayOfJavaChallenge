import java.util.Scanner;
class Natural
{
  public static void main(String args[])
	{
	  int number,i;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Please Enter Any Number ");
	 number=sc.nextInt();
	 for(i=1;i<=number;i++)
	    {
		 System.out.println(i+"\t");
	    }
	}
 }
