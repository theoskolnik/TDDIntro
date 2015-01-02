package com.thoughtworks.factorial;

public class Factorial {
    public Integer compute(int i) {
        if ((i == 1) || (i == 0)) {
            return 1;
        }

        if (i < 0) {
            throw new IllegalArgumentException();
        }

        int total = i;

        for (int j = (i - 1); j > 0; j--) {
            total = total * (i - 1);
            i --;
        }

        if (total > 0){
            return total;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Factorial f = new Factorial();
        f.compute(3);
    }
}
