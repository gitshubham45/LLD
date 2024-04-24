public class Bike implements Vehicle{
    @Override
    public int getSeatingCapacity(){
        return 2;
    }

    @Override
    public int getFuelTankCapacity(){
        return 10;
    }
}
