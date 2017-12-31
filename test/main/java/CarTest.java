package main.java;

import static org.junit.Assert.*;
import org.junit.Test;


public class CarTest {
    @Test
    public void 코리아타이어_브랜드() {
        Tire tire = new KoreaTire();
        Car car = new Car(tire);

        assertEquals("장착된 타이어 = 코리아 타이어", car.getTireBrand());
    }

    @Test
    public void 미국타이어_브랜드() {
        Tire tire = new AmericaTire();
        Car car = new Car(tire);

        assertEquals("장착된 타이어 = 미국 타이어", car.getTireBrand());
    }
}
