import java.util.Arrays;
public class Reversearray{
    public static void main (String[] args){
        int [] a = {10,20,30,40};
        int l = a.length;//l=4
        int [] b = new int[l];
        int j = l;//j=4 j is now l so l is 4    and j is use for rverse 

        System.out.println("before"+Arrays.toString(a));//array.to string is the system langugeb

        for (int i = 0;i<a.length;i++)
        {
            b[j-1]=a[i];
            j--;
        }
        System.out.println("after"+Arrays.toString(b));

    }
}