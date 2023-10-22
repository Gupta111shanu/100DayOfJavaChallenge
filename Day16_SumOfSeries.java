import java.util.Scanner;
class sumofseries 
{
	public static void main(String args[])

  {
    int totalSum = 0;
    int currentTerm =0;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the value");
   int n=sc.nextInt();
   for(int i=1;i<=n;i++)
   {
	   currentTerm=currentTerm*10+2;
	   System.out.print(currentTerm );
	   if(i<n) 
           {
	      System.out.print("+");
	   }
	     totalSum+=currentTerm;
   }
     System.out.println(" totalSum: " +totalSum);
  }
}
  

