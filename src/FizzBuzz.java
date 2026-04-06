import java.util.*;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzbuzz(16));
    }

    public static ArrayList<String> fizzbuzz(int n)
    {
        // Write your code here
        ArrayList<String> fizzbuzz = new ArrayList<String>();

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0 && i % 5 == 0){
                fizzbuzz.add("FizzBuzz");

            } else if (i % 3 == 0) {
                fizzbuzz.add("Fizz");

            } else if (i % 5 == 0) {
                fizzbuzz.add("Buzz");

            } else
                fizzbuzz.add(String.valueOf(i));


        }
        return fizzbuzz;
    }
}