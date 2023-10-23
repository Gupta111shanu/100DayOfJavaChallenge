import java.util.Scanner;
class series
{
	public static void main(String args[])
    {
	int power=2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++)
            {
        	System.out.println(power+ " ");
                power=power*2;
             }
   }
}
	  
	  
	  
