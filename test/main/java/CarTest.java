package main.java;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/contextTest.xml")
public class CarTest {

    @Autowired
    Car carKorea;

    @Autowired
    Car carAmerica;

    @Test
    public void 코리아타이어_브랜드() {
        assertEquals("장착된 타이어 = 코리아 타이어", carKorea.getTireBrand());
    }

    @Test
    public void 미국타이어_브랜드() {
        assertEquals("장착된 타이어 = 미국 타이어", carAmerica.getTireBrand());
    }
}
