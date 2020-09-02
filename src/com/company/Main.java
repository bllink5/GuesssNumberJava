package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        System sistem = new System();

        BufferedReader br = new BufferedReader(new InputStreamReader(java.lang.System.in));
        String input;
        int masukan = 2;
        do {
            java.lang.System.out.println("======================================");
            java.lang.System.out.println("            GUESS THE NUMBER          ");
            java.lang.System.out.println("======================================");
            java.lang.System.out.println("                 1 PLAY               ");
            java.lang.System.out.println("                 2 EXIT               ");
            input = br.readLine();
            int input2 = Integer.parseInt(input);
            switch (input2) {
                case 1:
                    sistem.sistem();
                    break;
                case 2:
                    java.lang.System.out.println("GAME OVER");
                    break;
                default:
                    java.lang.System.out.println("GAME OVER");
            }
        } while (masukan != 2);

    }
}
