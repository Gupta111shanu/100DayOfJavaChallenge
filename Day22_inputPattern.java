import java.util.Scanner;
class star
{
	public static void main(String args[])
    {		
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the value of N: ");
	        int N = sc.nextInt();
	        for (int i = 1; i <= N; i++) 
	        {
	            for (int j = 1; j <= i; j++) 
	            {
	                System.out.print((i + j) % 2 == 0 ? "1" : "0");
	            }
	            System.out.println();
	        }
	    }
	}
		
		
		
