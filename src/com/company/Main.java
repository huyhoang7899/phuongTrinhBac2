package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuadraticEquation ptb2 = new QuadraticEquation();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a : ");
        double a = sc.nextDouble();
        System.out.println("Nhập b : ");
        double b = sc.nextDouble();
        System.out.println("Nhập c : ");
        double c = sc.nextDouble();
        ptb2.setA(a);
        ptb2.setB(b);
        ptb2.setC(c);
        double x1 = ptb2.getRoot1();
        double x2 = ptb2.getRoot2();
        if (ptb2.getDiscriminant() < 0) {
            System.out.println("Phương trình vô nghiệm !");
        } else if (ptb2.getDiscriminant() == 0) {
            System.out.println("Phương trình có 2 nghiệm  kép x = " + x1);
        } else {
            System.out.println("Phương trình có 2 nghiệm phân biệt là x1 = " + x1 + " và x2 = " + x2);
        }
    }
}