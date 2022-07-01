import fabric.fabric.handler.CoffeeHandler;
import fabric.fabric.model.support.CoffeeType;

public class Run {
    public static void main(String[] args) {
        CoffeeHandler handler = new CoffeeHandler();
        handler.make(CoffeeType.LATE);
    }
}
