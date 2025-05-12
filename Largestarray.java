public class Largestarray {
    public static void main(String[] args) {
        int[] a = {19, 23, 52, 72, 90};

        int largest = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > largest) {
                largest = a[i];
            }
        }

        System.out.println("The largest number is " + largest); 
    }
}