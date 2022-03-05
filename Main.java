package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        class Expression {
            float x;
            float y;
            Expression (float x, float y){
                this.x = x;
                this.y = y;
            }
            public void decision(){
                if (y == -1){
                    System.out.println("Знаменатель равен нулю, введите новое значение у");
                }
                float z = (x+y)/(y+1);
                System.out.println("Ответ: " + z);
            }
        }
        Scanner in = new Scanner(System.in);

        System.out.print("Введите значение x= ");
        float x = in.nextFloat();

        System.out.print("Введите значение y= ");
        float y = in.nextFloat();

        Expression answer =  new Expression(x, y);
        answer.decision();

}
}

