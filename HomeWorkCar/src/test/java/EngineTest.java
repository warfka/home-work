import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EngineTest {
    Engine engine1 = new Engine(0, 120);
    Engine engine2 = new Engine(0, 98);
    Engine engine3 = new Engine(0, 500);

    @Test
    void setEngineWeight1() {
        assertEquals("SimpleCar", engine1.getEngineForWhatCar());
    }

    @Test
    void setEngineWeight2() {
        assertEquals("SportCar", engine2.getEngineForWhatCar());
    }

    @Test
    void setEngineWeight3() {
        assertEquals("Truck", engine3.getEngineForWhatCar());
    }
}