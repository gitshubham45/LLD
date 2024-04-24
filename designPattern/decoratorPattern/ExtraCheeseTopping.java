
public class ExtraCheeseTopping extends ToppingsPizza {

    BasePizza pizza;

    public ExtraCheeseTopping(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        // getCost method name will be better
        return this.pizza.cost() + 10;
    }
}
