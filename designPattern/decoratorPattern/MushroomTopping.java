
public class MushroomTopping extends ToppingsPizza {
    
    BasePizza pizza;

   public  MushroomTopping(BasePizza pizza){
    this.pizza = pizza;
   }

   @Override
   public int cost(){
    // getCost method name will be better
    return this.pizza.cost() + 20;
   }
}
