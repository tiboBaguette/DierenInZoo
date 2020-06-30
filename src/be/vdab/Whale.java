package be.vdab;

public class Whale {
    private String name;
    private double weight;
    private char gender;
    private int age;

    public Whale(String name, double weight, char gender, int age) {
        this.name = name;
        this.weight = weight;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Whale{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
