package be.vdab;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Cow cow1 = new Cow("Bob", 20.2, 'F', 16);
        zoo.insertAnimalIntoArray(cow1);
        zoo.insertAnimalIntoArray(cow1);
        zoo.insertAnimalIntoArray(cow1);
        zoo.insertAnimalIntoArray(cow1);

        Monkey monkey1 = new Monkey("Frank", 34.8, 'M', 8);
        zoo.insertAnimalIntoArray(monkey1);
        zoo.insertAnimalIntoArray(monkey1);
        zoo.insertAnimalIntoArray(monkey1);
        zoo.insertAnimalIntoArray(monkey1);
        zoo.insertAnimalIntoArray(monkey1);
        zoo.insertAnimalIntoArray(monkey1);
        zoo.insertAnimalIntoArray(monkey1);
        zoo.insertAnimalIntoArray(monkey1);

        Sheep sheep1 = new Sheep("Sheep", 54.5, 'F', 6);
        zoo.insertAnimalIntoArray(sheep1);
        zoo.insertAnimalIntoArray(sheep1);
        zoo.insertAnimalIntoArray(sheep1);
        zoo.insertAnimalIntoArray(sheep1);

        Tiger tiger1 = new Tiger("Willy", 108.9, 'M', 17);
        zoo.insertAnimalIntoArray(tiger1);
        zoo.insertAnimalIntoArray(tiger1);

        Whale whale1 = new Whale("Greek", 9852.3, 'M', 87);
        zoo.insertAnimalIntoArray(whale1);

        zoo.printZooAnimals();
    }
}
