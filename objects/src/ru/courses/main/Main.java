package ru.courses.main;

import ru.courses.enums.Sauce;
import ru.courses.enums.Spiciness;

public class Main {
    public static void main(String[] args) {
        Sauce s1 = new Sauce("Ширачи", Spiciness.VERY_HOT);
        Sauce s2 = new Sauce("Табаско", Spiciness.HOT);
        Sauce s3 = new Sauce("Соевый", Spiciness.MILD);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
