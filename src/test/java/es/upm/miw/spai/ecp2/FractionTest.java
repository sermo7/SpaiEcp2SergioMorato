package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class FractionTest {

    private Fraction fractionTest1;
    private Fraction fractionTest2;
    
    @Before
    public void Before() {
        fractionTest1 = new Fraction(); //(1,1)
        fractionTest2 = new Fraction(4,2);
    }
    
    @Test
    public void getNumeratorTest() {
        assertEquals(1, fractionTest1.getNumerator());
        assertEquals(4, fractionTest2.getNumerator());
    }

    @Test
    public void getDenominatorTest() {
        assertEquals(1, fractionTest1.getDenominator());
        assertEquals(2, fractionTest2.getDenominator());
    }

    @Test
    public void decimalTest() {
        assertEquals(1.0, fractionTest1.getDenominator(), 0.001);
        assertEquals(2.0, fractionTest2.getDenominator(), 0.001);
    }


}
