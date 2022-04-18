import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TruckTest {

    Engine bigEngine = new Engine(0, 500);
    Wheel truckWheel = new Wheel(0.9, "Truck", 0);
    Truck Kamaz = new Truck(90, truckWheel, bigEngine, false);

    @Test
    void setBodyСapacityDependingOnTheEngine() {
        assertEquals(7000, Kamaz.getBodyСapacity());
    }
}