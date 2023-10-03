import java.util.Scanner;
public class OldestYoungest 
{
	public static void main(String[] args) 
            {
		Scanner sc = new Scanner(System.in);
		int age1 = sc.nextInt();
		int age2 = sc.nextInt();
		int age3 = sc.nextInt();

		if (age1 <= age2 && age1 <= age3) 
                  {
			System.out.println("Youngest is age1 : " + age1);
	          }
		if (age2 <= age1 && age2 <= age3) 
                  {
		 	System.out.println("Youngest is age2 : " + age2);
		  }
		if (age3 <= age1 && age3 <= age2) 
                  {
			System.out.println("Youngest is age3 : " + age3);
		  }
		
		
		
		if (age1 >= age2 && age1 >= age3) 
                  {
		 	System.out.println("Oldest is age1 : " + age1);
		  }
		if (age2 >= age1 && age2 >= age3) 
                  {
			System.out.println("Oldest is age2 : " + age2);
		  }
              if (age3 >= age1 && age3 >= age2) 
                  {
			System.out.println("Oldest is age3 : " + age3);
		  }
		
		
	}
}

