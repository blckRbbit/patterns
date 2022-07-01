package fabric.fabric.model;

import fabric.fabric.model.support.CoffeeType;

public class Cappuccino extends Coffee {
    private final String name;
    private final CoffeeType type;

    public Cappuccino(CoffeeType type) {
        this.name = "капуччино";
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
