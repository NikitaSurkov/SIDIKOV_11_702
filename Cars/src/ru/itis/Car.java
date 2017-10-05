package ru.itis;

public class Car {
    private String model;
    String number;
    int power;
    String color;
    int mileage = 6600;

    void go(int n) {
        mileage += n;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if (power >= 0) {
            this.power = power;
        } else {
            System.err.println("Дэбил шоле. Можьность с плюсеком нада");
            this.power = 0;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}
