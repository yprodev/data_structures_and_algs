package com.traincode;

public class Main {
    public static void main(String[] args) {
        System.out.println(factorialLinear(4));
        System.out.println(factorialRecursive(4));
    }

    public static int factorialLinear(int n) {
        int factorial = 1;

        for (int i = n; i > 1; i--) {
             factorial *= i;
        }

        return factorial;
    }

    public static int factorialRecursive(int n) {
        // Base condition - termination of the recursion
        if (n == 0)
            return 1;

        return n * factorialRecursive(n - 1);
    }
}
