package com.training.goborov.homework2.homework2_1;

public class FormulaValue {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int p = Integer.parseInt(args[1]);
        double m1 = Double.parseDouble(args[2]);
        double m2 = Double.parseDouble(args[3]);

        System.out.println(Formula.calculation(a, p, m1, m2));
    }
}

