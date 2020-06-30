package be.vdab;

public class Cow extends Animal {
    private String name;
    private double weight;
    private char gender;
    private int age;

    public Cow(String name, double weight, char gender, int age) {
        super(name, weight, gender, age, "Cow");
    }
}
