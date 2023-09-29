import java.util.Scanner;
class YearMonthNumber	       
{
   public static void main(String args[])
       { 
              Scanner sc=new Scanner(System.in);
	         System.out.println("enter the month number");
	         int mn=sc.nextInt();
	         if(mn==1)
	         {
	        	 System.out.println("January= 31 Days");
	         }
	         else if(mn==2)
	         {
	        	 System.out.println("Februry = 28/29 Days");
	         }
	         else if(mn==3) 
	         {
	        	 System.out.println("March = 31 Days");
	         }
	         else if(mn==4) 
	         {
                       System.out.println("April = 30 Days");
	          }
	         else if(mn==5) 
	         {
	        	 System.out.println("May  = 31 Days");
	         }
	         else if(mn==6) 
	         {
	        	 System.out.println("June = 30 Days");
	         }
	         else if(mn==7) 
	         {
                 System.out.println("July = 31 Days");
	           }
	         else if(mn==8) 
	         {
	        	 System.out.println("August = 31 Days");
	      	 }
	         else if(mn==9) 
                {
               System.out.println("September = 30 Days");
	         }
	         else if(mn==10)
	         {
                System.out.println("October = 30 Days");
	          }
	         else if(mn==11) 
	         {
               System.out.println("November = 30 Days");
	          }
	         else if(mn==12)
	         {
	        	 System.out.println("December = 31 Days");
	         }
	         else  
	         {
	        	 System.out.println("invalid month number");
	         }
}
}
	 
	        
	  