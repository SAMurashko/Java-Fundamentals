package com.Stanislav.Main;

import java.util.Scanner;

public class main4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число A:");
        int a = sc.nextInt();
        System.out.print("Введите число B:");
        int b = sc.nextInt();
        System.out.print("Введите число C:");
        int c = sc.nextInt();
        int sum = a + b + c;
        int prod = a * b * c;
        System.out.println("Сумма:" + sum);
        System.out.println("Произведение:" + prod);
    }
}
