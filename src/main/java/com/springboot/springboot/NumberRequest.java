package com.springboot.springboot;

public class NumberRequest {
    private int number1;
    private int number2;

    public NumberRequest(){

    }
    public NumberRequest(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    // Add getters and setters for the properties
    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

}
