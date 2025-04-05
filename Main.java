import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double length = scanner.nextDouble();


        System.out.println("enter the width of the main: ");
        double width=scanner.nextDouble();

        double area = length *width;

        System.out.println("The area of the rectangle is:" +area);
        scanner.close();

    }

    
}