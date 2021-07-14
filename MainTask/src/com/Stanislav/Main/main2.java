package com.Stanislav.Main;

import java.util.Scanner;

public class main2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите что-нибудь: ");
        String str = in.nextLine();
        String reverse = new StringBuffer(str).reverse().toString();
        System.out.println("\nСтрока до реверса: " + str);
        System.out.println("Строка в обратном порядке: " + reverse);
    }
}
