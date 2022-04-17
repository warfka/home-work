public class Wheel {
    private Double coefficientOfAdhesion; //коэффициент сцепления
    private String WheelForWhatCar;
    private int rotationSpeed;

    public Wheel(Double coefficientOfAdhesion, String WheelForWhatCar, int rotationSpeed) {
        this.coefficientOfAdhesion = coefficientOfAdhesion;
        this.WheelForWhatCar = WheelForWhatCar;
        this.rotationSpeed = rotationSpeed;
    }


    public Double getCoefficientOfAdhesion() {
        return coefficientOfAdhesion;
    }

    public void setCoefficientOfAdhesion(Double coefficientOfAdhesion) {
        this.coefficientOfAdhesion = coefficientOfAdhesion;
    }

    public String getWheelForWhatCar() {
        return WheelForWhatCar;
    }

    public void setWheelForWhatCar(String wheelForWhatCar) {
        this.WheelForWhatCar = wheelForWhatCar;
    }

    public int getRotationSpeed() {
        return rotationSpeed;
    }

    public void setRotationSpeed(int rotationSpeed) {
        this.rotationSpeed = rotationSpeed;
    }



}
