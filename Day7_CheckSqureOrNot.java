import java.util.Scanner;
class CheckSquareOrNot
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length");
        float l=sc.nextFloat();
        System.out.println("Enter the breath");
        float b=sc.nextFloat();
        if(l==b)
        {
            System.out.println("square");
        }
        else
        {
            System.out.println("not square");
        }
    }
}