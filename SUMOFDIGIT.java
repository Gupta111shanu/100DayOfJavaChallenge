import java.util.*;
class simple
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  int no=sc.nextInt();

int sum=0;
sum=sum+no%10;
no=no/10;


sum=sum+no%10;
no=no/10;


sum=sum+no%10;
no=no/10;


sum=sum+no%10;
no=no/10;

System.out.println(sum);
}
}