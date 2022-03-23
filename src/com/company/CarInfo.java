package com.company;

public class CarInfo {
    private String yearOfIssue;
    private String model;
    private int price;
    private String color;

    public CarInfo() {

    }
    public CarInfo(String yearOfIssue, String model, int price, String color) {
        this.yearOfIssue = yearOfIssue;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public String getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(String yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "year of issue = " + yearOfIssue +
                ", model = " + model +
                ", price = " + price +
                ", color = " + color;
    }
}
