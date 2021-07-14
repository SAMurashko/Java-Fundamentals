package com.Stanislav.Main;

import java.util.Scanner;

public class Opt {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String longWord = "", shortWord = line;
        for (String s : line.split(" ")) {
            if (s.length() > longWord.length()) longWord = s;
            if (s.length() < shortWord.length()) shortWord = s;
        }
        System.out.println("Наибольшее число: '" + longWord + "'");
        System.out.println("Длина: " + longWord.length());
        System.out.println("Наименьшее число: '" + shortWord + "'");
        System.out.println("Длина: " + shortWord.length());
    }
}
