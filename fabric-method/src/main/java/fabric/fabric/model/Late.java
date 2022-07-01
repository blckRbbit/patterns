package fabric.fabric.model;

import fabric.fabric.model.support.CoffeeType;

public class Late extends Coffee {
    private final String name;
    private final CoffeeType type;

    public Late(CoffeeType type) {
        this.name = "лате";
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
