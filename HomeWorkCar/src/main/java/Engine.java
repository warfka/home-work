public class Engine {
    private int engineSpeed;
    private int engineWeight;
    private String EngineForWhatCar;

    public Engine(int engineSpeed, int engineWeight) {
        this.engineSpeed = engineSpeed;
        setEngineWeight(engineWeight);
    }

    public String getEngineForWhatCar() {
        return EngineForWhatCar;
    }

    public int getEngineSpeed() {
        return engineSpeed;
    }

    public void setEngineSpeed(int engineSpeed) {
        this.engineSpeed = engineSpeed;
    }

    public int getEngineWeight() {
        return engineWeight;
    }

    public void setEngineWeight(int engineWeight) {
        this.engineWeight = engineWeight;
        if (engineWeight >= 90 && engineWeight <= 110)
            EngineForWhatCar = "SportCar";
        if (engineWeight >= 111 && engineWeight <= 300)
            EngineForWhatCar = "SimpleCar";
        if (engineWeight >= 301 && engineWeight <= 1000)
            EngineForWhatCar = "Truck";
    }
}
