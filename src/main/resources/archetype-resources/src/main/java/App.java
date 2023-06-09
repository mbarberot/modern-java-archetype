package $package;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public String fizzbuzz(Integer i) {
        if (i % 15 == 0) {
            return "FizzBuzz";
        }

        if (i % 5 == 0) {
            return "Buzz";
        }

        if (i % 3 == 0) {
            return "Fizz";
        }

        return String.valueOf(i);
    }
}
