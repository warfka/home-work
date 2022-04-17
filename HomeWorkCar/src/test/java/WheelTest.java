import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WheelTest {

    Wheel wheel = new Wheel(0.5, "SimpleCar", 0);

    @Test
    void setRotationSpeed() {
        assertEquals(0, wheel.getRotationSpeed());
    }

    @Test
    void setForWhatCar() {
        assertEquals("SimpleCar", wheel.getWheelForWhatCar());
    }


}