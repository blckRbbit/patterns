package fabric.fabric.model;

import fabric.fabric.model.support.CoffeeType;

public class Americano extends Coffee {
    private final String name;
    private final CoffeeType type;

    public Americano(CoffeeType type) {
        this.name = "американо";
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public CoffeeType getType() {
        return type;
    }
}
