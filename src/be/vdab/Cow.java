package be.vdab;

public class Cow {
    private String name;
    private double weight;
    private char gender;
    private int age;

    public Cow(String name, double weight, char gender, int age) {
        this.name = name;
        this.weight = weight;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cow{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
