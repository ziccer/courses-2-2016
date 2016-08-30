package com.courses.spalah;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Ievgen Tararaka
 */
public class ConsecutiveNumbers {
    /**
     * Написать программу, которая отвечает на вопрос:
     * "Содержит ли введенная строка правильную последовательность цифр?"
     * <p>
     * Входные параметры программы:
     * 1. Строка с числами (только целые числа, которые не больше, чем int)
     * 2. Разделительный символ для этой строки. Разделительный символ в строке может быть любой, пустой в том числе.
     * <p>
     * Например:
     * Строка - 1*2*3*6*7
     * Символ - *
     * Ответ - false
     *
     * @param args - аргументы коммандной строки
     */
    public static void main(String[] args) {


        int x = 0;
        float argument1;
        float argument2;
        String sign = " ";
        String[] array = readFromConsole();
        argument1 = Float.parseFloat(array[2]);
        argument2 = Float.parseFloat(array[4]);
        sign = array[1];

        for (int i = 0; i < array.length; i++) {
            x = i + 1;
            if (x - i == 1) {
                System.out.println("Строка содержит правильную последовательность цифр");
                break;
            }
            if (x - i != 1) {
                System.out.println("Строка содержит неправильную последовательность цифр");
                break;
            }



        }
    }
    public static String[] readFromConsole () {
        try {
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            String input = bufferRead.readLine();
            return input.split("");
        } catch (IOException e) {
            return new String[0];
        }
    }
}