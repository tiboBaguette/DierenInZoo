package be.vdab;

public class Tiger extends Animal {
    private String name;
    private double weight;
    private char gender;
    private int age;

    public Tiger(String name, double weight, char gender, int age) {
        super(name, weight, gender, age, "Tiger");
    }
}
