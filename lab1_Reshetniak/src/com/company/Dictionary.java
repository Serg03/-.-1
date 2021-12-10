package com.company;

public class Dictionary {
    private static String[] processors = {
        "Intel Core i5-8300H",
        "Intel Core i7-9700H",
        "Intel Core i3-10100F",
        "AMD Ryzen 9 5900X",
        "AMD Ryzen 7 5800X "
    };

    public static String[] getProcessors() {
        return processors;
    }

    public static void setProcessors(String[] processors) {
        Dictionary.processors = processors;
    }

    private static String[] graphics = {
            "NVIDIA GeForce GTX 1050",
            "NVIDIA GT 630",
            "NVIDIA GeForce GTX 1660Ti",
            "ATI Mobility Radeon HD 5470",
            "AMD Radeon™ RX 6800 XT"
    };

    public static String[] getGraphics() {
        return graphics;
    }

    public static void setGraphics(String[] graphics) {
        Dictionary.graphics = graphics;
    }

    private static String[] marks = {
            "Toyota",
            "Honda",
            "Mazda",
            "BMW",
            "Mercedes"
    };

    public static String[] getMarks() {
        return marks;
    }

    public static void setMarks(String[] marks) {
        Dictionary.marks = marks;
    }

    private static String[] manufacturers = {
            "VAG",
            "Groupe PSA",
            "Suzuki",
            "Daimler",
            "General Motors"
    };

    public static String[] getManufacturers() {
        return manufacturers;
    }

    public static void setManufacturers(String[] manufacturers) {
        Dictionary.manufacturers = manufacturers;
    }

    private static String[] types = {
            "Универсал",
            "Минивен",
            "Кабриолет",
            "Пикап",
            "Седан"
    };

    public static String[] getTypes() {
        return types;
    }

    public static void setTypes(String[] types) {
        Dictionary.types = types;
    }
}
