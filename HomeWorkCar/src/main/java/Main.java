public class Main {
    public static void main (String[] args){
        Wheel sportWheel = new Wheel(0.7, "SportCar", 0);
        Wheel simpleWheel = new Wheel(0.5, "SimpleCar", 0);
        Wheel truckWheel = new Wheel(0.9, "Truck", 0);
        Engine engine1 = new Engine(0, 120);
        Engine engine2 = new Engine(0, 98);
        Engine engine3 = new Engine(0, 500);
    Car SportCar = new Car(300, sportWheel, engine2);
    Car SimpleCar = new Car(120,simpleWheel, engine1);
    SimpleCar.setMaxSpeed(150);
    SportCar.Drive(engine2, sportWheel); //test
    SportCar.setEngine(engine1);
    SportCar.setMaxSpeed(350);
    Truck Kamaz = new Truck(90, truckWheel, engine3, false);
    //Kamaz.Info();
    System.out.println(Kamaz.Info());
    Kamaz.Drive(engine3, truckWheel);
    Kamaz.Drive(engine3, truckWheel);
    Kamaz.setTruckBody(true);
    Kamaz.setTruckBody(false);
    }
}
