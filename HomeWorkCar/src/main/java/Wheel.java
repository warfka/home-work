public class Wheel {
    private Double coefficientOfAdhesion; //коэффициент сцепления
    private String forWhatCar;
    private int rotationSpeed;

    public Wheel(Double coefficientOfAdhesion, String forWhatCar, int rotationSpeed) {
        this.coefficientOfAdhesion = coefficientOfAdhesion;
        this.forWhatCar = forWhatCar;
        this.rotationSpeed = rotationSpeed;
    }


    public Double getCoefficientOfAdhesion() {
        return coefficientOfAdhesion;
    }

    public void setCoefficientOfAdhesion(Double coefficientOfAdhesion) {
        this.coefficientOfAdhesion = coefficientOfAdhesion;
    }

    public String getForWhatCar() {
        return forWhatCar;
    }

    public void setForWhatCar(String forWhatCar) {
        this.forWhatCar = forWhatCar;
    }

    public int getRotationSpeed() {
        return rotationSpeed;
    }

    public void setRotationSpeed(int rotationSpeed) {
        this.rotationSpeed = rotationSpeed;
    }



}
