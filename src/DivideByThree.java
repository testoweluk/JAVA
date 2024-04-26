import java.util.Arrays;

public class DivideByThree {

    public static void main(String[] args) {

       /* for (int i = 0; i <= 100; i++) {

            if ( i%3 == 0) {
                System.out.println(i);
            }
        }*/

        int[] numbers = new int [] {10,20,30,40,50,60,70};

        for (int i = 0; i < numbers.length/2 ; i++) { // length=3
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length-1-i];
            numbers[numbers.length-1-i] = temp;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
