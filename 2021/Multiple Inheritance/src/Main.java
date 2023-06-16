interface Car{
    void speedCar();
}
interface Bike{
    void speedBike();
}
class Vehicle implements Car, Bike{
    @Override
    public void speedBike() {
        System.out.println("Bike is best for speeding");
    }

    @Override
    public void speedCar() {
        System.out.println("We shouldn't speed in car unless and until you have lamborgini");
    }
}
public class Main{
    public static void main(String[] args) {
        Vehicle veh = new Vehicle();
        veh.speedBike();
        veh.speedCar();
    }
}


