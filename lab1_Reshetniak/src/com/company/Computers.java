package com.company;

import java.util.ArrayList;
import java.util.List;

public class Computers {
    private final List<Computer> computers;

    public Computers(){
        computers = new ArrayList<>();
    }

    public List<Computer> getComputers() {
        return computers;
    }

    public void add(Computer computer) {
        this.computers.add(computer);
    }

    public void remove(Computer computer) {
        this.computers.remove(computer);
    }

    public void fillRandom(int n){
        for (int i = 0; i < n; i++) {
            computers.add(Computer.generate());
        }
    }

    public void NumRAM_than12GB(){
        int num = 0;
        System.out.println("\n\nКомпьютеры с объемом оперативной памяти больше 12 Гбайт:\n");
        for (Computer computer : this.computers){
            if (computer.getRam() > 12){
                num++;
                System.out.println(computer);
            }
        }
        System.out.println("\nКоличество: " + num);
    }

    @Override
    public String toString() {
        return "\n\n\nКомпьютеры" + computers + "; ";
    }
}
