package be.vdab;

public class Zoo {
    private Cow[] cows;
    private Monkey[] monkeys;
    private Sheep[] sheep;
    private Tiger[] tigers;
    private Whale[] whales;

    public Zoo() {
        this.cows = new Cow[0];
        this.monkeys = new Monkey[0];
        this.sheep = new Sheep[0];
        this.tigers = new Tiger[0];
        this.whales = new Whale[0];
    }

    public void insertCowIntoArray(Cow cow) {
        Cow[] placeHolderArray = new Cow[cows.length + 1];

        if (cows.length != 0) {
            for (int i = 0; i < cows.length; i++) {
                placeHolderArray[i] = cows[i];
            }
        }

        placeHolderArray[cows.length] = cow;
        cows = placeHolderArray;
    }

    public void insertMonkeyIntoArray(Monkey monkey) {
        Monkey[] placeHolderArray = new Monkey[monkeys.length + 1];

        if (monkeys.length != 0) {
            for (int i = 0; i < monkeys.length; i++) {
                placeHolderArray[i] = monkeys[i];
            }
        }

        placeHolderArray[monkeys.length] = monkey;
        monkeys = placeHolderArray;
    }

    public void insertSheepIntoArray(Sheep sheep) {
        Sheep[] placeHolderArray = new Sheep[this.sheep.length + 1];

        if (this.sheep.length != 0) {
            for (int i = 0; i < this.sheep.length; i++) {
                placeHolderArray[i] = this.sheep[i];
            }
        }

        placeHolderArray[this.sheep.length] = sheep;
        this.sheep = placeHolderArray;
    }

    public void insertTigerIntoArray(Tiger tiger) {
        Tiger[] placeHolderArray = new Tiger[tigers.length + 1];

        if (tigers.length != 0) {
            for (int i = 0; i < tigers.length; i++) {
                placeHolderArray[i] = tigers[i];
            }
        }

        placeHolderArray[tigers.length] = tiger;
        tigers = placeHolderArray;
    }

    public void insertWhaleIntoArray(Whale whale) {
        Whale[] placeHolderArray = new Whale[whales.length + 1];

        if (whales.length != 0) {
            for (int i = 0; i < whales.length; i++) {
                placeHolderArray[i] = whales[i];
            }
        }

        placeHolderArray[whales.length] = whale;
        whales = placeHolderArray;
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
