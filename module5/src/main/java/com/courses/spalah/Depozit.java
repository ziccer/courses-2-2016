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

public Depozit (float summa, float procent, String name){
    this.summa = summa;
    this.procent = procent;
    this.name = name;
}

//    private int year;
//    float argument1;
  //  String[] array = readFromConsole();


    float dohod(float n) {
        //argument1 = Float.parseFloat(array[0]);
        float x = summa * (procent/100) * n;

        return x;

    }

    public static void main(String[] args) {



        Depozit one = new Depozit(100.00f, 10.00f, "Олег Барбарисыч");
        System.out.println("Уважаемый " + one.name + " ваша чистая прибыль составила: " + one.dohod(5) + " гривен.");
        //System.out.println(one.dohod(5));
       // one.summa = (float)100.00f;
      //  one.procent = (float)10.00;
      //  one.name = "Олег Барбарисович";


        ;
//        if (one.dohod()>0) {
//            System.out.println("Сумма депозита: " + one.summa + " гривен.");
//            System.out.println("Процент депозита: " + one.procent);
//            System.out.println();
//            System.out.println("Уважаемый " + one.name + " ваша чистая прибыль составила: " + one.dohod() + " гривен.");
//        } else {
//            System.out.println("Введите корректное значение!!!");
//        }


    }

//    public static String[] readFromConsole() {
//        try {
//            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
//            String input = bufferRead.readLine();
//            return input.split("\\s");
//        } catch (IOException e) {
//            return new String[]{""};
//        }
//    }


}