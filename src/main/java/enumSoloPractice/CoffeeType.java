package enumSoloPractice;

public enum CoffeeType {
    AMERICANO(4000), LATTE(4500), ESPRESSO(3000);

    private int coffeePrice;

    CoffeeType(int coffeePrice) {
        this.coffeePrice = coffeePrice;
    }

    public int getCoffeePrice() {
        return coffeePrice;
    }
}
