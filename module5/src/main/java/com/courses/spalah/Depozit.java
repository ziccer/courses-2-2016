package com.courses.spalah;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Um on 19.07.2016.
 */
public class Depozit {
    float summa;
    float procent;
    String name;

    int year;
    float argument1;
    String[] array = readFromConsole();


    float dohod() {
        argument1 = Float.parseFloat(array[0]);

        float x = summa * (procent/100) * argument1;
        return x;
    }


    public static void main(String[] args) {

        System.out.println("Введите количество лет депозита: ");

        Depozit one = new Depozit();
        one.summa = (float) 100.00;
        one.procent = (float)10.00;
        one.name = "Олег Барбарисович";


        one.dohod();

        System.out.println("Сумма депозита: " + one.summa + " гривен.");
        System.out.println("Процент депозита: " + one.procent);
        //System.out.println("Срок депозита: " + year + " года/лет.");
        System.out.println();
        System.out.println("Уважаемый " + one.name + " ваша чистая прибыль составила: " + one.dohod() + " гривен.");


    }

    public static String[] readFromConsole() {
        try {
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            String input = bufferRead.readLine();
            return input.split("\\s");
        } catch (IOException e) {
            return new String[]{""};
        }
    }
}