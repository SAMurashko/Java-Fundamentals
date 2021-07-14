package com.Stanislav.Main;

import java.util.Scanner;

public class main5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число:");
        int a = in.nextInt();
        if (a == 1) {
            System.out.print("Январь");
        } else if (a == 2) {
            System.out.print("Февраль");
        } else if (a == 3) {
            System.out.print("Март");
        } else if (a == 4) {
            System.out.print("Апрель");
        } else if (a == 5) {
            System.out.print("Май");
        } else if (a == 6) {
            System.out.print("Июнь");
        } else if (a == 7) {
            System.out.print("Июль");
        } else if (a == 8) {
            System.out.print("Август");
        } else if (a == 9) {
            System.out.print("Сентябрь");
        } else if (a == 10) {
            System.out.print("Октябрь");
        } else if (a == 11) {
            System.out.print("Ноябрь");
        } else if (a == 12) {
            System.out.print("Декабрь");
        } else {
            System.out.print("Неверное число");
        }
    }
}

