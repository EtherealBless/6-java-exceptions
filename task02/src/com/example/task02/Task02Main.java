package com.example.task02;

public class Task02Main {

    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getSeason(-5));
         */
    }

    static String getSeason(int monthNumber)  throws IllegalArgumentException {
        return switch (monthNumber) {
            case 1, 2, 12 -> "зима";
            case 3, 4, 5 -> "весна";
            case 6, 7, 8 -> "лето";
            case 9, 10, 11 -> "осень";
            default ->
                    throw new IllegalArgumentException("monthNumber " + monthNumber + " is invalid, month number should be between 1..12");
        };

    }
}