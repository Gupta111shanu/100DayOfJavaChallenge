import java.util.Scanner;
class Power3
{
	public static void main(String args[])
    {
	int series=1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++)
            {
        	System.out.println(series+ " ");
        	 series=series*3;
            }
    }
}
	  
	  
