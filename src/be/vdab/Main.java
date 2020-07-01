package be.vdab;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Cow cow1 = new Cow("Bob", 20.2, 'F', 16);
        zoo.addAnimal(cow1);
        zoo.addAnimal(cow1);
        zoo.addAnimal(cow1);
        zoo.addAnimal(cow1);

        Monkey monkey1 = new Monkey("Frank", 34.8, 'M', 8);
        zoo.addAnimal(monkey1);
        zoo.addAnimal(monkey1);
        zoo.addAnimal(monkey1);
        zoo.addAnimal(monkey1);
        zoo.addAnimal(monkey1);
        zoo.addAnimal(monkey1);
        zoo.addAnimal(monkey1);
        zoo.addAnimal(monkey1);

        Sheep sheep1 = new Sheep("Sheep", 54.5, 'F', 6);
        zoo.addAnimal(sheep1);
        zoo.addAnimal(sheep1);
        zoo.addAnimal(sheep1);
        zoo.addAnimal(sheep1);

        Tiger tiger1 = new Tiger("Willy", 108.9, 'M', 17);
        zoo.addAnimal(tiger1);
        zoo.addAnimal(tiger1);

        Whale whale1 = new Whale("Greek", 9852.3, 'M', 87);
        zoo.addAnimal(whale1);

        zoo.printZooAnimals();
    }
}
