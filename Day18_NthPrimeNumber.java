import java.util.Scanner;
class NthPrime
{
	public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        System.out.println("The first " + n + " prime numbers are:");

        int count = 0;
        int num = 2;

        while(true)
           {	
              boolean isPrime=true;
              for (int i = 2; i <= num / 2; i++) 
                {
                   if (num % i == 0) {
                    isPrime = false;
                    break;
                 }
          }

            if (isPrime)
              {
                count++;
              }
            if(count==n)
            {
            	System.out.println("The" +n+ "th prime number i:" +num);
            	break;
            }
            num++;
            }

            num++;
        }
    
}
