package com.training.goborov.homework2.homework2_1;

import static java.lang.Math.PI;

public class Formula {
    private Formula() {
    }

    public static double calculation(int a, int p, double m1, double m2){
        double b1 = 4 * Math.pow(PI, 2);
        double a1 = Math.pow(a, 3);
        double p1 = Math.pow(p, 2) * (m1 + m2);

        double g = b1 * (a1 / p1);
        return g;
    }
}
