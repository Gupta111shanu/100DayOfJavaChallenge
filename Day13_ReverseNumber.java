import java.util.Scanner;
class ReverseNumber 
{
  public static void main(String args[])
  {
     int num=0;
     int revernum=0;
     System.out.println("Input your number");
     Scanner sc=new Scanner(System.in);
     num=sc.nextInt();
     while(num!=0)
	  {
	      revernum=revernum*10;
	      revernum=revernum+num%10;
	     num=num/10;
	  }
	  System.out.println("Reverse Input Number is:" +revernum);
  }
}

