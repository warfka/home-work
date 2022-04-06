public class Main {
    public static void main (String[] args){
    Car SportCar = new Car(300,false, false);
    Car SimpleCar = new Car(120,false, false);
    SimpleCar.setMaxSpeed(150);
    SportCar.Drive(true);
    SportCar.setEngine(false);
    SportCar.setMaxSpeed(350);
    }
}
