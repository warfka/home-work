public class Truck extends Car {
    private boolean truckBody;
    private int bodyCapacity;

    public Truck(Wheel wheel, Engine engine, boolean truckBody) {
        super(wheel, engine);
        this.truckBody = truckBody;
        setBodyCapacityDependingOnTheEngine(engine);
    }

    public boolean isTruckBody() {
        return truckBody;
    }

    public void setTruckBody(boolean truckBody) {
        this.truckBody = truckBody;
    }

    public int getBodyCapacity() {
        return bodyCapacity;
    }

    public void setBodyCapacityDependingOnTheEngine(Engine engine)
    {
        if (engine.getEngineWeight() <= 600)
            bodyCapacity = 7000;
        if (engine.getEngineWeight() > 600)
            bodyCapacity = 20000;
    }

    public void setBodyCapacity(int bodyCapacity) {
        this.bodyCapacity = bodyCapacity;
    }
}
