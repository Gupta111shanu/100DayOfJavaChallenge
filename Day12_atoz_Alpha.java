import java.util.Scanner;
class Alpha 
{
  public static void main(String args[])
    {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter Alphabet");
	  char ch=sc.next().charAt(0);
	  for(ch='a';ch<='z';ch++)
	    {
		 System.out.println(ch);
	    }
    }
}
