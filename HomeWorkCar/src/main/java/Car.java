public class Car implements Driveable {

    private static final int MAXSPEED = 999;
    private static final int MINSPEED = 0;

    private int MaxSpeed;
    private Wheel wheel;
    private int Weight;
    private boolean Engine;

    public Car(int maxSpeed, Wheel wheel, boolean engine) {
        this.MaxSpeed = maxSpeed;
        this.wheel = wheel;
        this.Engine = engine;

    }

    public void setMaxSpeed(int maxSpeed) {

        if (maxSpeed > MAXSPEED || maxSpeed < MINSPEED) { MaxSpeed = MAXSPEED;}
        else MaxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return MaxSpeed;
    }

    public int getWheel() {//test
        return wheel.getRotationSpeed();
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public boolean isEngine() {
        return Engine;
    }

    public void setEngine(boolean engine) {
        Engine = engine;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    public void Drive(boolean in, Wheel wheel){//test
        setEngine(in);
        setWheel(wheel);
        if (in = false) {setMaxSpeed(0);}
        else setMaxSpeed(100); //как вернуть в начальное состояние?
    }

    public String Info(){
    String getInfo;
    getInfo = "Max speed: " + Integer.toString(getMaxSpeed()) +
            "\nEngine: " + isEngine() +
            "\nWheel: " + getWheel();
    return getInfo;
    }
}
