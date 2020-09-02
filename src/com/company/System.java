package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class System {
    //public Point point;

    public void sistem() throws IOException {
        Point point = new Point();
        java.lang.System.out.println("Enter Your Name : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(java.lang.System.in));
        String namaPLayer;
        namaPLayer = br.readLine();

        int [] number = {0,1,2,3,4,5,6,7,8,9};
        //List<Integer> listNumber = new ArrayList<Integer>();
        //listNumber.add(0,9);
        int round = 0;
        int scorePlayer = 0;
        int scoreCpu = 0;

        do {
            java.lang.System.out.println(namaPLayer);
            java.lang.System.out.println(" Please enter a number 0 - 9 ");
            String inputPlayer = br.readLine();
            int pilPlayer = Integer.parseInt(inputPlayer);

            //if (!listNumber.contains(inputPlayer)) {
                //do {
                    //java.lang.System.out.println("Wrong Input!");
                   // java.lang.System.out.println(namaPLayer);
                   // java.lang.System.out.println(" Please enter a number 0 - 9 ");
                   // inputPlayer = br.readLine();
               // } while (listNumber.contains(inputPlayer));
            //}

            java.lang.System.out.println(namaPLayer + "Guess " + pilPlayer);

            int cpu = new Random().nextInt(number.length);
            int pilCpu = number[cpu];
            java.lang.System.out.println("Cpu Guess : " + pilCpu);

            int numberRandom = new Random().nextInt(number.length);
            int numberGuess = number[numberRandom];
            java.lang.System.out.println("Number come out : " + numberGuess);

            int closestPlayer = point.closest(pilPlayer,numberGuess);
            int closestCpu = point.closest(pilCpu,numberGuess);
            String winner = point.winner(closestPlayer,closestCpu,namaPLayer);

            java.lang.System.out.println("Closest number for " + namaPLayer + " : " + closestPlayer);
            java.lang.System.out.println("Closest number for Cpu : " + closestCpu);
            java.lang.System.out.println("Result : " + winner);
            java.lang.System.out.println("======================================");

            if (winner.equals(namaPLayer + " Score +1 ")){
                scorePlayer++;
            } else if (winner.equals("Cpu Score +1 ")) {
                scoreCpu++;
            }
            round++;
        } while (round < 3);

        java.lang.System.out.println("Total score " + namaPLayer + " : " + scorePlayer);
        java.lang.System.out.println("Total score Cpu : " + scoreCpu);
        if (scorePlayer > scoreCpu){
            java.lang.System.out.println(namaPLayer + " Win ! ");
        } else if (scoreCpu > scorePlayer){
            java.lang.System.out.println(" Cpu Win ! ");
        } else
            java.lang.System.out.println(" Draw ! ");

        java.lang.System.out.println("\"GAME OVER\"");
    }
}
