package fabric.fabric.model.support;

import lombok.Getter;

@Getter
public enum CoffeeType {
    AMERICANO("американо"), ESPRESSO("эспрессо"), CAPPUCCINO("капучино"), LATE("лате");

    private final String name;

    CoffeeType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
