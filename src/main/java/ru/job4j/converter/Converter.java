package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(600);
        float in2 = 120;
        float expected2 = 2;
        float out2 = Converter.rubleToDollar(in2);
        float input = 140;
        float expected = 2;
        float out1 = Converter.rubleToEuro(input);
        boolean passed1 = expected == out1;
        boolean passed2 = expected2 == out2;
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("600 rubles are " + dollar + " dollar.");
        System.out.println("140 rubles are 2. Test result : " + passed1);
        System.out.println("120 rubles are 2. Test result : " + passed2);
    }
}
