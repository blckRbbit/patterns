package fabric.fabric.handler;

import fabric.fabric.model.Coffee;
import fabric.fabric.model.support.CoffeeType;

public interface CoffeeMaker {
    Coffee make(CoffeeType type);
}
