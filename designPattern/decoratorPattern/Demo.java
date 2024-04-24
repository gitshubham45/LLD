public class Demo {
    public static void main(String[] args){
        FarmHouse farmHouse = new FarmHouse();
        Marghrita marghrita = new Marghrita();
        VegDelight vegDelight = new VegDelight();

        ExtraCheeseTopping extraCheeseTopping = new ExtraCheeseTopping(farmHouse);

        MushroomTopping mushroomTopping = new MushroomTopping(vegDelight);

        ExtraCheeseTopping doublExtraCheeseTopping = new ExtraCheeseTopping(extraCheeseTopping);
        ExtraCheeseTopping trippleExtraCheeseTopping = new ExtraCheeseTopping(doublExtraCheeseTopping);

        System.out.println(farmHouse.cost());
        System.out.println(marghrita.cost());
        System.out.println(vegDelight.cost());
        System.out.println(extraCheeseTopping.cost());
        System.out.println(mushroomTopping.cost());
        System.out.println(doublExtraCheeseTopping.cost());
        System.out.println(trippleExtraCheeseTopping.cost());
    }
}
