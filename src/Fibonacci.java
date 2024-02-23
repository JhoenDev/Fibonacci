
// A program that takes an input (n > 2) as the nth element in the Fibonacci Series.
// Using both methods (Iterative and Recursive), returns the value in the nth place.
// Note: This program is a requirement for my DAA course (Design Analysis of Algorithm).

import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        while (n<=2) {
            System.out.print("Enter value of n(>2): ");
            n = scanner.nextInt();
        }
        System.out.printf("Iterative: %d\nRecurisve: %d",iterative(n),recursive(0,1,n));

        scanner.close();
    }

    //iterative method
    public static int iterative(int n) {
        int x=0,y=1,z=0;
        while (n!=2) {
            z = x+y;
            x = y;
            y = z;
            n--;
        }
        return z;
    }

    //recursive method
    public static int recursive(int x, int y, int n) {
        if (n==2) { //base
            return y;
        } else { //recursive
            return recursive(y, x+y, --n);
        }
    }
}

//Code by Jhoen