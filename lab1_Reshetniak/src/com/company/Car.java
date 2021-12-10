package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Car {
    private String mark;
    private String manufacturer;
    private String type;
    private int year;
    private LocalDateTime date;

    public Car(String mark, String manufacturer, String type, int year, LocalDateTime date) {
        this.mark = mark;
        this.manufacturer = manufacturer;
        this.type = type;
        this.year = year;
        this.date = date;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public static Car generate(){
        Random r = new Random();
        return new Car(Dictionary.getMarks()[r.nextInt(Dictionary.getMarks().length)],
                Dictionary.getManufacturers()[r.nextInt(Dictionary.getManufacturers().length)],
                Dictionary.getTypes()[r.nextInt(Dictionary.getTypes().length)],
                r.nextInt(21)+2000,
                LocalDateTime.of(r.nextInt(3)+2019, r.nextInt(12)+1, r.nextInt(28)+1, 0, 0));
    }

    @Override
    public String toString() {
        return "\n\nАвтомобиль{\n" +
                "Марка: " + mark +
                "\nПроизводитель: " + manufacturer +
                "\nТип: " + type +
                "\nГод выпуска: " + year +
                "\nДата регистрации: " + date.format(DateTimeFormatter.ofPattern("d.M.y")) +
                "\n}";
    }
}
