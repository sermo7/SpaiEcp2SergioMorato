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
        assertEquals(1.0, fractionTest1.decimal(), 0.001);
        assertEquals(2.0, fractionTest2.decimal(), 0.001);
    }

    @Test
    public void multTest(){
    	fractionTest2.mult(new Fraction (10,5));
    	assertEquals(40, fractionTest2.getNumerator());
    	assertEquals(10, fractionTest2.getDenominator());
    }
    	
    @Test
    public void sumTest(){        
    		Fraction f = new Fraction (2,3);
        	assertEquals(16, fractionTest2.sum(f).getNumerator());
        	assertEquals(6, fractionTest2.sum(f).getDenominator());  	
    }
    
    @Test
    public void isPropiaTest(){
    	assertFalse(fractionTest2.isProper());
    }
    
}
