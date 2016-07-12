package com.courses.spalah;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Calculator {
    BufferedReader in; // буферизованный читатель строки из некоего потока (необязательно System.in)

<<<<<<< HEAD
    public Calculator(InputStreamReader isr) {//конструктор
        in = new BufferedReader(isr); //создаем буфчитателя вокруг переданного потока-читателя
    }
    public void run() {// основной метод класса
        double valueOne = 0, valueTwo = 0; // значения в выражении
        char op = ' '; //знак операции. Присвоения сделаны чтобы компилятор не ругался
        int state = 0; // 0 - читаем первое число, 1 - знак операции, 2 - второе число
        String str; // строка из потока
=======
    public static float culc(float a, float b, String operator) {
        float result = 0;
        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
        }
        return result;
    }

    public static String[] readFromConsole() {
>>>>>>> 1d921b46a6617438944ecd22cd6eb70a8f71ae15
        try {
            // в цикле читаем строку, одновременно проверяем, что поток не кончился (!= null)
            // одновременно проверяем, что строка не пустая (условие выхода из цикла)
            while((str = in.readLine()) != null && !str.equals("")) {
                switch (state) { // в зависимости от состояния
                    case 0: // если состояние "читаем первое число"
                        valueOne = Double.parseDouble(str); // читаем
                        state = 1; // переключаем в состояние "читаем операцию"
                        break;
                    case 1: //состояние "читаем операцию"
                        op = str.charAt(0);
                        state = 2; // переключаем в состояние "читаем второе число"
                        break;
                    case 2:
                        valueTwo = Double.parseDouble(str); // разбор второго числа
                        // к этому моменту мы прочитали оба числа и его операцию
                        switch (op) { // выбираем нужное действие, выводим результат
                            case '+':
                                System.out.println(valueOne + valueTwo);
                                break;
                            case '-':
                                System.out.println(valueOne - valueTwo);
                                break;
                            case '*':
                                System.out.println(valueOne * valueTwo);
                                break;
                            case '/':
                                System.out.println(valueOne / valueTwo);
                                break;
                        }
                        state = 0; // после печати, снова переключаемся в режим "читаем первое число"
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) { // входная точка
        // создаем объект Calc, передаем ему читателя вокруг system.in
        // и тут же запускаем цикл чтения/печати
        System.out.println("Start calculator");
        new Calculator(new InputStreamReader(System.in)).run();
    }
}