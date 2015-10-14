package mx.iteso.factory.condiments;

import mx.iteso.factory.Pozole;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Created by Arreola on 10/14/2015.
 */
public class LechugaTest {
    Pozole pozole;

    @Before
    public void setUp() {
        pozole = mock(Pozole.class);
    }

    @Test
    public void TestGetName() {
        Pozole lechuga = new Lechuga(pozole);
        when(pozole.getName()).thenReturn("El Pozole");
        String name = lechuga.getName();
        assertEquals("El Pozole con Lechuga", name);
    }
}
