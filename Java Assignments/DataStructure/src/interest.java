import java.sql.SQLOutput;
import java.util.Scanner;

public class interest
{
    public static void main(String[] args)
    {
        double si;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        int p= scan.nextInt();
        System.out.print("Enter the rate of interest: ");
        double r= scan.nextDouble();
        System.out.print("Enter the number of years: ");
        double t= scan.nextDouble();
        si=(p*r*t)/100;
        System.out.print("Simple Interest: "+si);



    }
}
