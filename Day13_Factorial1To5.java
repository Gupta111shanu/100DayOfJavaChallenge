import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
	      int i,fact=1,number=5;
             Scanner sc=new Scanner(System.in);
             System.out.println("enter the factorial number");
             number=sc.nextInt();
             for(i=1;i<=5;i++)
              {
                 fact=fact*i;
                 System.out.println("factorial number "+i+" "+fact);
              }
        }
}


