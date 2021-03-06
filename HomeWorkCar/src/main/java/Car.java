public class Car implements Driveable {

    private static final int MAXSPEED = 999;
    private static final int MINSPEED = 0;

    private int maxSpeed;
    private Wheel wheel;
    private int carWeight;
    private Engine engine;

    public Car(Wheel wheel, Engine engine) {
        this.wheel = wheel;
        this.engine = engine;
        if (engine.getEngineForWhatCar() == "SportCar")
            this.maxSpeed = 400;
        if (engine.getEngineForWhatCar() == "SimpleCar")
            this.maxSpeed = 200;
        if (engine.getEngineForWhatCar() == "Truck")
            this.maxSpeed = 100;
    }

    public void setMaxSpeed(int maxSpeed) {

        if (maxSpeed > MAXSPEED || maxSpeed < MINSPEED) { this.maxSpeed = MAXSPEED;}
        else this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getWheel() {//test
        return wheel.getRotationSpeed();
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public int isEngine() {
        return engine.getEngineSpeed();
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getCarWeight() {
        return carWeight;
    }

    public void setCarWeight(int carWeight) {
        this.carWeight = carWeight;
    }

    public void Drive(Engine engine, Wheel wheel){//test
        setEngine(this.engine);
        wheel.setRotationSpeed(10);
        setWheel(wheel);
        if (engine.getEngineSpeed() == 0) {wheel.setRotationSpeed(0);}
        else wheel.setRotationSpeed(0);
    }

    public String Info(){
    String getInfo;
    getInfo = engine.getEngineForWhatCar() + "\n" + "Max speed: " + Integer.toString(getMaxSpeed()) +
            "\nEngine speed: " + isEngine() +
            "\nWheel speed: " + getWheel();
    return getInfo;
    }
}
