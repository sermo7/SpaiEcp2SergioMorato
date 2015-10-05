package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DecimalCollectionTest {

    
    private DecimalCollection decimalCollection;
    
    @Before
    public void before() {
        decimalCollection = new DecimalCollection();
    }
       
    @Test
    public void addTest() {
        assertEquals(0,decimalCollection.size());
        decimalCollection.add(7.77);
        assertEquals(1,decimalCollection.size());
        decimalCollection.add(1.7987);
        assertEquals(2,decimalCollection.size());
    }
    
    @Test
    public void sizeTest() {
        assertEquals(0,decimalCollection.size());
        decimalCollection.add(1.77);
        assertEquals(1,decimalCollection.size());
        decimalCollection.add(1.6984);
        assertEquals(2,decimalCollection.size());
    }
    
    @Test
    public void sumTest() {
        assertEquals(0,decimalCollection.sum(),0.001);
        decimalCollection.add(1.7);
        assertEquals(1.7,decimalCollection.sum(),0.001);
        decimalCollection.add(2.5);
        assertEquals(4.2,decimalCollection.sum(),0.001);
    }

    @Test
    public void higherTest() {
        assertEquals(Double.NEGATIVE_INFINITY,decimalCollection.higher(),0.001);
        decimalCollection.add(1.29);
        assertEquals(1.29,decimalCollection.higher(),0.001);
        decimalCollection.add(2.27);
        assertEquals(2.27,decimalCollection.higher(),0.001);
        decimalCollection.add(2.26);
        assertEquals(2.27,decimalCollection.higher(),0.001);        
    }
    
    
    
    

}
