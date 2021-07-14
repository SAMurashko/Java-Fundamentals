package com.Stanislav.Main;

import java.util.Random;
import java.util.Scanner;

public class main3 {
    public static int getRandomDiceNumber()
    {
        return (int) (Math.random() * 100);
    }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
        {
            int x = getRandomDiceNumber();
            System.out.print(x + " ");

        }
    }
}