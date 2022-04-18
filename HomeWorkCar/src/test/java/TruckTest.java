import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TruckTest {

    Engine bigEngine = new Engine(0, 500);
    Wheel truckWheel = new Wheel(0.9, "Truck", 0);
    Truck Kamaz = new Truck(truckWheel, bigEngine, false);

    Engine superBigEngine = new Engine(0, 900);
    Truck truck = new Truck(truckWheel, superBigEngine, false);
    @Test
    void setBodyCapacityDependingOnTheEngine1() {
        assertEquals(7000, Kamaz.getBodyCapacity());
    }

    @Test
    void setBodyCapacityDependingOnTheEngine2() {
        assertEquals(20000, truck.getBodyCapacity());
    }
}