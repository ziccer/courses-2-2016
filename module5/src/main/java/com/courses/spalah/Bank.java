package com.courses.spalah;

/**
 * Created by Um on 26.07.2016.
 */
public class Bank {

    String name;
    private double dep1;
    private double dep2;
    private double dep3;
    private double proc = 10;

    public Bank(String name) {
        this.name = name;

        this.dep1 = 100;
        this.dep2 = 200;
        this.dep3 = 300;
    }

    private double sAfterNlet(int n) {
        double sDep1;
        double sDep2;
        double sDep3;
        sDep1 = dep1 * (proc / 100) * n;
        sDep2 = dep2 * (proc / 100) * n;
        sDep3 = dep3 * (proc / 100) * n;

        double x;
        x = sDep1 + sDep2 + sDep3;
        return x;
    }

    public static void main(String[] args) {


        Bank bank = new Bank("ПУМБ");

        System.out.println("Банк " + bank.name + " за 5 лет по трем депозитам 100, 200 и 300 грн. с 10% годовых, должен выплатить " + bank.sAfterNlet(5) + " гривен");

    }
}