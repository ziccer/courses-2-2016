package com.courses.spalah;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("Калькулятор.");
        System.out.println("Введите выражение через пробел:");
        System.out.println("Выход из программы - exit");

        float argument1 = 0.0f;
        float argument2 = 0.0f;
        float result = 0.0f;
        String operator = "";
        float previous = 0.0f;

        while (true) {
            String[] array = readFromConsole();
            if (array.length == 3) {
                argument1 = Float.parseFloat(array[0]);
                argument2 = Float.parseFloat(array[2]);
                operator = array[1];
            }
            if (array.length == 2) {
                argument1 = result;
                argument2 = Float.parseFloat(array[1]);
                operator = array[0];
            }
            if ("exit".equals(array[0])) {
                break;
            }
            result = culc(argument1, argument2, operator);
            previous = result;
            System.out.println(result);
        }
    }
    public static float culc(float a, float b, String operator) {
        float result = 0;
        switch (operator.charAt(0)) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
        }
        return result;
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