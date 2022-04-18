import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Engine testEngine = new Engine(0, 120);
    Wheel testWheel = new Wheel(0.5, "SimpleCar", 0);
    Car TestCar = new Car(testWheel, testEngine);

    Engine testEngine2 = new Engine(0, 600);
    Wheel testWheel2 = new Wheel(0.9, "Truck", 0);
    Car TestCar2 = new Car(testWheel2, testEngine2);

    Engine testEngine3 = new Engine(0, 105);
    Wheel testWheel3 = new Wheel(0.7, "SportCar", 0);
    Car TestCar3 = new Car(testWheel3, testEngine3);

    @org.junit.jupiter.api.Test
    void drive1() {
        TestCar.Drive(testEngine, testWheel);
        assertEquals(200, TestCar.getMaxSpeed());

    }

    @org.junit.jupiter.api.Test
    void drive2() {
        TestCar2.Drive(testEngine2, testWheel2);
        assertEquals(100, TestCar2.getMaxSpeed());

    }

    @org.junit.jupiter.api.Test
    void drive3() {
        TestCar3.Drive(testEngine3, testWheel3);
        assertEquals(400, TestCar3.getMaxSpeed());

    }
}