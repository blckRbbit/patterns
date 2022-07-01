package fabric.fabric.handler;

import fabric.fabric.model.*;
import fabric.fabric.model.support.CoffeeType;

public class CoffeeHandler implements CoffeeMaker {
    @Override
    public Coffee make(CoffeeType type) {
        Coffee coffee;
        switch (type) {
            case LATE:
                coffee = new Late(CoffeeType.LATE);
                break;
            case ESPRESSO:
                coffee = new Espresso(CoffeeType.ESPRESSO);
                break;
            case AMERICANO:
                coffee = new Americano(CoffeeType.AMERICANO);
                break;
            case CAPPUCCINO:
                coffee = new Cappuccino(CoffeeType.CAPPUCCINO);
                break;
            default: throw new IllegalArgumentException("Вы не сказали, какой кофе хотите");
        }
        System.out.println(String.format("Ваш %s готов!", type.toString()));
        return coffee;
    }
}
