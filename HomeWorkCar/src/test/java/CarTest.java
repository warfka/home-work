import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Engine testEngine = new Engine(0, 120);
    Wheel testWheel = new Wheel(0.5, "SimpleCar", 0);
    Car TestCar = new Car(120,testWheel, testEngine);

    @org.junit.jupiter.api.Test
    void drive() {
        TestCar.Drive(testEngine, testWheel);
        assertEquals(0, TestCar.getMaxSpeed());

    }

}