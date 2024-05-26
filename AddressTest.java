package org.pearl;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AddressTest {

    @Test
    public void testIsPostalCodeValid() {
        assertTrue(Address.isPostalCodeValid("A1B2C3"));
        assertTrue(Address.isPostalCodeValid("A1B 2C3"));
        assertFalse(Address.isPostalCodeValid("123456"));
        assertFalse(Address.isPostalCodeValid("AB1C2D"));
    }

    @Test
    public void testConstructorWithValidPostalCode() {
        Address address = new Address(123, "Main St", "City", "Province", "A1B2C3", "Country");
        assertNotNull(address);
        assertEquals(123, address.getStreetNo());
        assertEquals("Main St", address.getStreet());
        assertEquals("City", address.getCity());
        assertEquals("Province", address.getProvince());
        assertEquals("A1B2C3", address.getPostalCode());
        assertEquals("Country", address.getCountry());
    }

    @Test
    public void testConstructorWithInvalidPostalCode() {
        Address address = new Address(123, "Main St", "City", "Province", "123456", "Country");
        assertNull(address.getStreet());
        assertNull(address.getCity());
        assertNull(address.getProvince());
        assertNull(address.getPostalCode());
        assertNull(address.getCountry());
    }
}

/