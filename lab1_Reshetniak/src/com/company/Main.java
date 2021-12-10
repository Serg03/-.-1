package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Базовый уровень
        Random r = new Random();
        int n = r.nextInt(5)+1;
        Computers computers = new Computers();
        computers.fillRandom(n);
        System.out.println(computers);
        computers.NumRAM_than12GB();

        // Средний уровень
        n = r.nextInt(5)+1;
        Cars cars = new Cars();
        cars.fillRandom(n);
        System.out.println(cars);
        cars.RegisterThisYear();
    }
}
