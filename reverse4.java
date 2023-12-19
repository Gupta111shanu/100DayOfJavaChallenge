import java.util.*;
class simple
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
int no=sc.nextInt();

int rev=0;
rev=rev*10+no%10;
no=no/10;

rev=rev*10+no%10;
no=no/10;

rev=rev*10+no%10;
no=no/10;

rev=rev*10+no%10;
no=no/10;

System.out.println(rev);
}
}