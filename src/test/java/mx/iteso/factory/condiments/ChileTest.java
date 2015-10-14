package mx.iteso.factory.condiments;

import mx.iteso.factory.Pozole;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Created by Arreola on 10/14/2015.
 */
public class ChileTest {
    Pozole pozole;

    @Before
    public void setUp() {
        pozole = mock(Pozole.class);
    }

    @Test
    public void TestGetName() {
        Pozole chile = new Chile(pozole);
        when(pozole.getName()).thenReturn("El Pozole");
        String name = chile.getName();
        assertEquals("El Pozole con Chile", name);
    }

}
