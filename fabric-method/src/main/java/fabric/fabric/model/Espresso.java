package fabric.fabric.model;

import fabric.fabric.model.support.CoffeeType;

public class Espresso extends Coffee {
    private final String name;
    private final CoffeeType type;

    public Espresso(CoffeeType type) {
        this.name = "эспрессо";
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public CoffeeType getType() {
        return type;
    }
}
