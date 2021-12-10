package com.company;

import java.util.Random;

public class Computer {
    private String processor;
    private int frequency;
    private int ram;
    private String graphic;
    private int price;

    public Computer(String processor, int frequency, int ram, String graphic, int price) {
        this.processor = processor;
        this.frequency = frequency;
        this.ram = ram;
        this.graphic = graphic;
        this.price = price;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getGraphic() {
        return graphic;
    }

    public void setGraphic(String graphic) {
        this.graphic = graphic;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static Computer generate(){
        Random r = new Random();
        return new Computer(Dictionary.getProcessors()[r.nextInt(Dictionary.getProcessors().length)], r.nextInt(4)+1,
                r.nextInt(16)+1, Dictionary.getGraphics()[r.nextInt(Dictionary.getGraphics().length)],
                r.nextInt(25000)+1);
    }

    @Override
    public String toString() {
        return "\n\nКомпьютер{\n" +
                "Процессор: " + processor +
                "\nЧастота: " + frequency + "GHz" +
                "\nОбъем оперативной памяти: " + ram + "GB" +
                "\nВидеокарта: " + graphic +
                "\nСтоимость: " + price +
                "\n}";
    }
}
