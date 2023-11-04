import java.util.Scanner;
class simple
{
	public static void main(String args[])
     {
	Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int count = 0;
        int temp = num;
        while (temp != 0) {
            temp /= 10;
            count++;
     }
        temp = num;
        while (temp != 0) 
          {
            int digit = temp % 10;
            int result = 1;
            for (int i = 0; i < count; i++) {
                result *= digit;
          }
            System.out.print(result + " ");
            temp /= 10;
        }
    }
}
  
	
	
