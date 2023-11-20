import java.util.Scanner;
class simple
{
	public static void main(String args[])
    {		
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the value of N: ");
	        int N = sc.nextInt();
	        for (int i = 1; i <= N; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j);
	            }

	            for (int k = 1; k <= 2 * (N - i); k++) {
	                System.out.print(" ");
	            }

	            for (int l = i; l >= 1; l--) {
	                System.out.print(l);
	            }

	            System.out.println();
	        }
	    }
	}
	
		
		
		
