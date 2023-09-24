class LargestAndSmallest
{
public static void main(String args[])
{
	int x=70;
	int y=80;
	int z=10;

      if(x>y && x>z)
      {
	  System.out.println(x +" :is largest number");
      } 
       else if(y>x && y>z)
       {
	  System.out.println(y +" :is largest number");
        }
     else 
        {
	  System.out.println(z +" :is largest number");
         }

 if(z<y && x<z)
    {
	System.out.println(x +" :is Smallest number");
    }
else if(y<x && y<z)
    {
    	System.out.println(y +" :is smallest number");
    }
else 
   {
	System.out.println(z +" :is smallest number");
   } 

 }
}