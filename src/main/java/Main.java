import java.util.*;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);

        boolean done = false;
        while (!done) {
            System.out.println("Enter input: ");
            String input[] = scanner.nextLine().toString().split(" ");
            try {
                switch (input[0]) {
                    case "add":
                        System.out.println(calc.add(parseInt(input[1]), parseInt(input[2])));
                        break;
                    case "subtract":
                        System.out.println(calc.subtract(parseInt(input[1]), parseInt(input[2])));
                        break;
                    case "multiply":
                        System.out.println(calc.multiply(parseInt(input[1]), parseInt(input[2])));
                        break;
                    case "divide":
                        System.out.println(calc.divide(parseInt(input[1]), parseInt(input[2])));
                        break;
                    case "fibonacci":
                        System.out.println(calc.fibonacciNumberFinder(parseInt(input[1])));
                        break;
                    case "binary":
                        System.out.println(calc.intToBinaryNumber(parseInt(input[1])));
                        break;
                    case "quit":
                        done = true;
                        break;
                    default:
                        System.out.println("Invalid input");
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        scanner.close();
    }
}
