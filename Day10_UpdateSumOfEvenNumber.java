import java.util.Scanner;
class simple 
{
  public static void main(String args[])
  { 
	 int i,evensum=0;
	 System.out.println("enter any number");
        Scanner sc=new Scanner(System.in);
       int number=sc.nextInt();
    
       for(i=1;i<=number;i++)
     	if(i%2==0)
        {
    	  evensum=evensum+i;
        }
        System.out.println("the sum of 5  even number to ="  +evensum);
   }
}