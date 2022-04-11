public class Car implements Driveable {

    private static final int Maxspeed = 999;
    private static final int Minspeed = 0;

    private int MaxSpeed;
    private boolean Wheel;
    private int Weight;
    private boolean Engine;

    public Car(int maxSpeed, boolean wheel, boolean engine) {
        this.MaxSpeed = maxSpeed;
        this.Wheel = wheel;
        this.Engine = engine;

    }

    public void setMaxSpeed(int maxSpeed) {

        if (maxSpeed > Maxspeed || maxSpeed < Minspeed) { MaxSpeed = Maxspeed;}
        else MaxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return MaxSpeed;
    }

    public boolean isWheel() {
        return Wheel;
    }

    public void setWheel(boolean wheel) {
        Wheel = wheel;
    }

    public boolean isEngine() {
        return Engine;
    }

    public void setEngine(boolean engine) {
        Engine = engine;
    }

    public void Drive(boolean in){
        setEngine(in);
        setWheel(in);
        if (in = false) {setMaxSpeed(0);}
        else setMaxSpeed(100); //как вернуть в начальное состояние?
    }

    public String Info(){
    String getInfo;
    getInfo = "Max speed: " + Integer.toString(getMaxSpeed()) + "\nEngine: " + isEngine() + "\nWheel: " + isWheel();
    return getInfo;
    }
}
