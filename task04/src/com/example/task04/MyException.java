package com.example.task04;

public class MyException extends IllegalArgumentException {

    private final int monthNumber;
    public MyException(int monthNumber) {
        this.monthNumber = monthNumber;
    }
    @Override
    public String getMessage() {
        return "monthNumber " + monthNumber + " is invalid, month number should be between 1..12";
    }
}
