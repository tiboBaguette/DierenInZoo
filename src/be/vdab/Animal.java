package be.vdab;

public class Animal {
    private String name;
    private double weight;
    private char gender;
    private int age;
    private String animalType;

    Animal(String name, double weight, char gender, int age, String animalType) {
        this.name = name;
        this.weight = weight;
        this.gender = gender;
        this.age = age;
        this.animalType = animalType;
    }

    public String getAnimalType() {
        return animalType;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", gender=" + gender +
                ", age=" + age +
                ", animalType='" + animalType + '\'' +
                '}';
    }
}
