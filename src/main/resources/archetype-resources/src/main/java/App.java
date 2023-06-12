package $package;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public String fizzbuzz(Integer i) {

        log.info("Running Fizzbuzz with {}" i);

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
