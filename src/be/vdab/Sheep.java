package be.vdab;

public class Sheep extends Animal {
    private String name;
    private double weight;
    private char gender;
    private int age;

    public Sheep(String name, double weight, char gender, int age) {
        super(name, weight, gender, age, "Sheep");
    }
}
