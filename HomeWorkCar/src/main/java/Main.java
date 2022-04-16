public class Main {
    public static void main (String[] args){
        Wheel sportWheel = new Wheel(0.7, "SportCar", 0);
        Wheel simpleWheel = new Wheel(0.5, "SimpleCar", 0);
        Wheel truckWheel = new Wheel(0.9, "SimpleCar", 0);
    Car SportCar = new Car(300, sportWheel, false);
    Car SimpleCar = new Car(120,simpleWheel, false);
    SimpleCar.setMaxSpeed(150);
    SportCar.Drive(true, sportWheel); //test
    SportCar.setEngine(false);
    SportCar.setMaxSpeed(350);
    Truck Kamaz = new Truck(90, truckWheel, false, false);
    //Kamaz.Info();
    System.out.println(Kamaz.Info());
    Kamaz.Drive(true, truckWheel);//test
    Kamaz.Drive(false, truckWheel);//test
    Kamaz.setTruckBody(true);
    Kamaz.setTruckBody(false);
    }
}
