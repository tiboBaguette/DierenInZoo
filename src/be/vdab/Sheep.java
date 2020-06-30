package be.vdab;

public class Sheep {
    private String name;
    private double weight;
    private char gender;
    private int age;

    public Sheep(String name, double weight, char gender, int age) {
        this.name = name;
        this.weight = weight;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
