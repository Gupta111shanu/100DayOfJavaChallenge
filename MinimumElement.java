import java.util.Scanner;
class simple
{
	public static void main(String args[])
    {		
		 Scanner scanner = new Scanner(System.in);

	        int n = scanner.nextInt();
	        int[] arr = new int[n];

	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        int low = 0, high = n - 1;

	        while (low < high) {
	            int mid = (low + high) / 2;

	            if (arr[mid] > arr[high]) {
	                low = mid + 1;
	            } else {
	                high = mid;
	            }
	        }

	        System.out.println(arr[low]);
	    }
	}	
       		
	
		
		
