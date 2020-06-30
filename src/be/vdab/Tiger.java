package be.vdab;

public class Tiger {
    private String name;
    private double weight;
    private char gender;
    private int age;

    public Tiger(String name, double weight, char gender, int age) {
        this.name = name;
        this.weight = weight;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
