import java.util.Scanner;
public class Oddoreven{
    public static void main(String []args){

        Scanner scan=new Scanner(System.in);
        int number;
        System.out.println("enter  the nuumber to check;");
        number=scan.nextInt();

        if (number %2==0)
        {
            System.out.println("the number is even");

        }
    
       else {
        System.out.println("the  number is odd ");
       }
    } 
}

