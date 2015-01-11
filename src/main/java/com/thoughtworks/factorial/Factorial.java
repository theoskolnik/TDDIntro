package com.thoughtworks.factorial;

public class Factorial {
    public Integer compute(int i) {
        if ((i == 1) || (i == 0)) {
            return 1;
        }

        if (i < 0) {
            throw new IllegalArgumentException();
        }

        int total = 1;
        for (int j = 2; j <= i; j++) {
            total *= j;
        }
        return total;
    }

    public static void main(String[] args) {
        Factorial f = new Factorial();
        f.compute(6);
    }
}
