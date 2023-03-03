import java.sql.Array;
import java.util.*;

class Calculator {
    breaking code
    Calculator(){

    }

    int add(int a , int b){
        return a + b;
    }

    int subtract(int a , int b){
        return a - b;
    }

    int multiply(int a , int b){
        return a * b;
    }

    int divide(int a , int b){
        return a / b;
    }


    /*
    Returns the n'th number in the fibonacci sequence
    https://en.wikipedia.org/wiki/Fibonacci_number
    Example below
    n = x
    0 = 0
    1 = 1
    2 = 1
    3 = 2
    4 = 3
    5 = 5
    .
    .
    .
    etc
     */
    int fibonacciNumberFinder(int n){
        int num = 0;
        int y = 0;
        int temp = 0;
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                num = 0;
            }
            else if (i == 1) {
                num = 1;
            }
            else {
                temp = y;
                y = num;
                num = num + temp;
            }
        }
        return num;
    }


    /*
    Returns binary value of the given int number
    The binary number will be stored as a string
    if int a = 0 then this method returns: 0
    if int a = 10 then this method returns: 1010
    if int a = 16 then this method returns: 10000
     */
    String intToBinaryNumber(int n){
        StringBuilder sb = new StringBuilder("");
        if (n == 0) {
            return "0";
        }
        while (n > 0) {
            sb.append(String.valueOf(n % 2));
            n = n / 2;
        }
        sb.reverse();
        return sb.toString();
    }

    /*
    Create a completely unique String identifier for a given string
    Each createdID must contain the string n in its unaltered Form
    if String n = "Jason"
    then the created ID could be = Jasonklfgn3jknnvksdfm - Because it contains the unaltered String n and is unique

    if you run this function twice with the same String input, it must return 2 unique String IDs
     */
    String createUniqueID(String n){
        String id = UUID.randomUUID().toString();
        id += n;
        return id;
    }


}
