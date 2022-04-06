public class Truck extends Car {
    private boolean TruckBody;

    public Truck(int maxSpeed, boolean wheel, boolean engine, boolean truckBody) {
        super(maxSpeed, wheel, engine);
        TruckBody = truckBody;
    }

    public boolean isTruckBody() {
        return TruckBody;
    }

    public void setTruckBody(boolean truckBody) {
        TruckBody = truckBody;
    }
}
