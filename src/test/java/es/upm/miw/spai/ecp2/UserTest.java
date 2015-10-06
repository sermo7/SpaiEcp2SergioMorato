package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class UserTest {

    
    private User user;
    
    @Before
    public void Before() {
        user = new User(7, "Sergio", "Morato");
    }
    
    @Test
    public void getNumberTest() {
        assertEquals(7, user.getNumber());
        assertNotEquals(8, user.getNumber());
    }

    @Test
    public void getNameTest() {
        assertEquals("Sergio", user.getName());
        assertNotEquals("David", user.getName());
    }
    
    @Test
    public void getFamilyNameTest() {
        assertEquals("Morato", user.getFamilyName());
        assertNotEquals("García", user.getFamilyName());
    }
    
    @Test
    public void fullNameTest() {
        assertEquals("Sergio Morato", user.fullName());
        assertNotEquals("Aguirre", user.fullName());
    }

    @Test
    public void initialsTest() {
        assertEquals("S.", user.initials());
        assertNotEquals("M.", user.initials());
    }
    
    @Test
    public void upperNameTest(){
    	assertEquals("SERGIO", user.upperName());
    }
    
}
