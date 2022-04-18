public class Truck extends Car {
    private boolean truckBody;
    private int bodyСapacity;

    public Truck(int maxSpeed, Wheel wheel, Engine engine, boolean truckBody) {
        super(wheel, engine);
        this.truckBody = truckBody;
        setBodyСapacityDependingOnTheEngine(engine);
    }

    public boolean isTruckBody() {
        return truckBody;
    }

    public void setTruckBody(boolean truckBody) {
        this.truckBody = truckBody;
    }

    public int getBodyСapacity() {
        return bodyСapacity;
    }

    public void setBodyСapacityDependingOnTheEngine(Engine engine)
    {
        if (engine.getEngineWeight() <= 600)
            bodyСapacity = 7000;
        if (engine.getEngineWeight() > 600)
            bodyСapacity = 20000;
    }

    public void setBodyСapacity(int bodyСapacity) {
        this.bodyСapacity = bodyСapacity;
    }
}
