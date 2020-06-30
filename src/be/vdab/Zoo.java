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

    public void insertAnimalIntoArray(Animal animal) {
        Animal[] newAnimalArray;
        switch (animal.getAnimalType()) {
            case "Cow":
                newAnimalArray = new Animal[cows.length + 1];

                if (cows.length != 0) {
                    for (int i = 0; i < cows.length; i++) {
                        newAnimalArray[i] = cows[i];
                    }
                }

                newAnimalArray[cows.length] = animal;
                cows = newAnimalArray;

                break;
            case "Monkey":
                newAnimalArray = new Animal[monkeys.length + 1];

                if (monkeys.length != 0) {
                    for (int i = 0; i < monkeys.length; i++) {
                        newAnimalArray[i] = monkeys[i];
                    }
                }

                newAnimalArray[monkeys.length] = animal;
                monkeys = newAnimalArray;

                break;
            case "Sheep":
                newAnimalArray = new Animal[sheep.length + 1];

                if (sheep.length != 0) {
                    for (int i = 0; i < sheep.length; i++) {
                        newAnimalArray[i] = sheep[i];
                    }
                }

                newAnimalArray[sheep.length] = animal;
                sheep = newAnimalArray;

                break;
            case "Tiger":
                newAnimalArray = new Animal[tigers.length + 1];

                if (tigers.length != 0) {
                    for (int i = 0; i < tigers.length; i++) {
                        newAnimalArray[i] = tigers[i];
                    }
                }

                newAnimalArray[tigers.length] = animal;
                tigers = newAnimalArray;

                break;
            case "Whale":
                newAnimalArray = new Animal[whales.length + 1];

                if (whales.length != 0) {
                    for (int i = 0; i < whales.length; i++) {
                        newAnimalArray[i] = whales[i];
                    }
                }

                newAnimalArray[whales.length] = animal;
                whales = newAnimalArray;

                break;
        }
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
