package be.vdab;

public class Whale extends Animal {
    private String name;
    private double weight;
    private char gender;
    private int age;

    public Whale(String name, double weight, char gender, int age) {
        super(name, weight, gender, age, "Whale");
    }
}
