import java.util.Scanner;
class simple
{
	public static void main(String args[])
    {		
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        System.out.print("Enter element 1: ");
        int min = scanner.nextInt();

        for (int i = 2; i <= n; i++) {
            System.out.print("Enter element " + i + ": ");
            int num = scanner.nextInt();
            if (num < min) {
                min = num;
            }
        }

        System.out.println("Minimum element: " + min);
    }
}
		
