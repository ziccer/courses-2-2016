package com.courses.spalah;

/**
 * Created by Um on 22.07.2016.
 */
public class Dep {
    float summa;
    float procent;
    String name;

    public Dep(float summa, float procent, String name) {
        this.summa = summa;
        this.procent = procent;
        this.name = name;
    }

    float dohod(int n) {
        float x = summa * (procent/100) * n;
        return x;
    }

    public static void main(String[] args) {
        Dep dep = new Dep(100, 10, "a");
        System.out.println(dep.dohod(6));
    }
}
