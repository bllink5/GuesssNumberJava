package com.company;

public class Point {
    public int closest(int number1, int number2) {
        int result;
        if (number1 < number2){
            result = number2 - number1;
        } else {
            result = number1 - number2;
        }
        return result;
    }

    public String winner(int closestPlayer, int closestCpu, String nama) {
        if (closestPlayer < closestCpu){
            return nama + " Score +1 ";
        }else if (closestCpu < closestPlayer){
            return "Cpu Score +1 ";
        }else {
            return "Draw ! ";
        }
    }
}
