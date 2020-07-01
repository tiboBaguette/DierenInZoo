package be.vdab;

public class Zoo {
    private Animal[] cows;
    private Animal[] monkeys;
    private Animal[] sheep;
    private Animal[] tigers;
    private Animal[] whales;

    public Zoo() {
        this.cows = new Animal[0];
        this.monkeys = new Animal[0];
        this.sheep = new Animal[0];
        this.tigers = new Animal[0];
        this.whales = new Animal[0];
    }

    public void addAnimal(Animal animal) {
        Animal[] newAnimalArray;
        switch (animal.getAnimalType()) {
            case "Cow":
                cows = insertAnimalIntoArray(animal, cows);
                break;
            case "Monkey":
                monkeys = insertAnimalIntoArray(animal, monkeys);
                break;
            case "Sheep":
                sheep = insertAnimalIntoArray(animal, sheep);
                break;
            case "Tiger":
                tigers = insertAnimalIntoArray(animal, tigers);
                break;
            case "Whale":
                whales = insertAnimalIntoArray(animal, whales);
                break;
        }
    }

    private Animal[] insertAnimalIntoArray(Animal animal, Animal[] animals) {
        Animal[] newAnimalArray = new Animal[animals.length + 1];

        if (animals.length != 0) {
            for (int i = 0; i < animals.length; i++) {
                newAnimalArray[i] = animals[i];
            }
        }

        newAnimalArray[animals.length] = animal;
        return newAnimalArray;
    }

    public void printZooAnimals() {
        for (int i = 0; i < cows.length; i++) {
            System.out.println(cows[i]);
        }
        for (int i = 0; i < monkeys.length; i++) {
            System.out.println(monkeys[i]);
        }
        for (int i = 0; i < sheep.length; i++) {
            System.out.println(sheep[i]);
        }
        for (int i = 0; i < tigers.length; i++) {
            System.out.println(tigers[i]);
        }
        for (int i = 0; i < whales.length; i++) {
            System.out.println(whales[i]);
        }
    }
}
