package be.vdab;

public class Monkey extends Animal {
    private String name;
    private double weight;
    private char gender;
    private int age;

    public Monkey(String name, double weight, char gender, int age) {
        super(name, weight, gender, age, "Monkey");
    }
}
