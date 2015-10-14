package mx.iteso.factory.condiments;

import mx.iteso.factory.Pozole;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Arreola on 10/14/2015.
 */
public class RabanosTest {
    private Pozole pozole;

    @Before
    public void setUp() {
        pozole = mock(Pozole.class);
    }

    @Test
    public void TestGetName() {
        Pozole rabanos = new Rabanos(pozole);
        when(pozole.getName()).thenReturn("El Pozole");
        String name = rabanos.getName();
        assertEquals("El Pozole con Rabanos", name);
    }
}
