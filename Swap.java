public class Swap{
    public static void main (String []args){
        int a =4;
        int b =5;

        System.out.println("before a="+a+" b ="+b);

        a= a+b;
        b= a-b;
        a= a-b;
        System.out.println("after a ="+a+"b="+b);
    }
}

