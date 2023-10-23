import java.util.Scanner;
class AnalysisSeries
{
	public static void main(String args[])
   {
        int power=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++)
            {
        	power+=i;
        	System.out.println(power+ " ");
        
            }
   }
}
	  
	  
