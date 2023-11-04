import java.util.Scanner;
class simple
{
	public static void main(String args[])
     {
	Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
         {
          int a=0,b=1;
          while(a<num)
           {
        	 int temp=a+b;
        	 a=b;
        	 b=temp;
        	 if(a==num) 
        	 {
                   System.out.println("Yes, the number is  fibonacci number:");
        	    return;
        	 }
         }
              System.out.println("No, the number is not a fibonacci number");
      }
   }  
}
        
	  
	  
