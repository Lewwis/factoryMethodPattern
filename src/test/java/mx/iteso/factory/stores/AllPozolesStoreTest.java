package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Arreola on 10/14/2015.
 */
public class AllPozolesStoreTest {
    AllPozolesStore pozoleStore;

    @Before
    public void setUp() {
        pozoleStore = new AllPozolesStore();
    }

    @Test
    public void TestMenudo() {
        Pozole menudo = pozoleStore.createPozole("menudo", "x");
        assertEquals("Menudo", menudo.name);
        assertEquals("Caldo Rojo", menudo.broth);
    }

    @Test
    public void TestPozoleBlanco() {
        Pozole pozoleBlancoCachete = pozoleStore.createPozole("blanco", "cachete");
        assertEquals("Pozole Blanco con Cachete", pozoleBlancoCachete.name);
        assertEquals("Caldo Blanco", pozoleBlancoCachete.broth);

        Pozole pozoleBlancoCamaron = pozoleStore.createPozole("blanco", "camaron");
        assertEquals("Pozole Blanco con Camaron", pozoleBlancoCamaron.name);

        Pozole pozoleBlancoOreja = pozoleStore.createPozole("blanco", "oreja");
        assertEquals("Pozole Blanco con Oreja", pozoleBlancoOreja.name);

        Pozole pozoleBlancoPierna = pozoleStore.createPozole("blanco", "pierna");
        assertEquals("Pozole Blanco con Pierna", pozoleBlancoPierna.name);

        Pozole pozoleBlancoPollo = pozoleStore.createPozole("blanco", "pollo");
        assertEquals("Pozole Blanco con Pollo", pozoleBlancoPollo.name);

        Pozole pozoleBlancoTrompa = pozoleStore.createPozole("blanco", "trompa");
        assertEquals("Pozole Blanco con Trompa", pozoleBlancoTrompa.name);
    }

    @Test
    public void TestPozoleRojo() {
        Pozole pozoleRojoCachete = pozoleStore.createPozole("rojo", "cachete");
        assertEquals("Pozole Rojo con Cachete", pozoleRojoCachete.name);
        assertEquals("Caldo Rojo", pozoleRojoCachete.broth);

        Pozole pozoleRojoRana = pozoleStore.createPozole("rojo", "rana");
        assertEquals("Pozole Rojo con Ancas de Rana", pozoleRojoRana.name);

        Pozole pozoleRojoOreja = pozoleStore.createPozole("rojo", "oreja");
        assertEquals("Pozole Rojo con Oreja", pozoleRojoOreja.name);

        Pozole pozoleRojoPierna = pozoleStore.createPozole("rojo", "pierna");
        assertEquals("Pozole Rojo con Pierna", pozoleRojoPierna.name);

        Pozole pozoleRojoPollo = pozoleStore.createPozole("rojo", "pollo");
        assertEquals("Pozole Rojo con Pollo", pozoleRojoPollo.name);

        Pozole pozoleRojoTrompa = pozoleStore.createPozole("rojo", "trompa");
        assertEquals("Pozole Rojo con Trompa", pozoleRojoTrompa.name);
    }

    @Test
    public void TestPozoleVerde() {
        Pozole pozoleVerdeCachete = pozoleStore.createPozole("verde", "cachete");
        assertEquals("Pozole Verde con Cachete", pozoleVerdeCachete.name);
        assertEquals("Caldo Verde", pozoleVerdeCachete.broth);

        Pozole pozoleVerdePescado = pozoleStore.createPozole("verde", "pescado");
        assertEquals("Pozole Verde con Pescado", pozoleVerdePescado.name);

        Pozole pozoleVerdeOreja = pozoleStore.createPozole("verde", "oreja");
        assertEquals("Pozole Verde con Oreja", pozoleVerdeOreja.name);

        Pozole pozoleVerdePierna = pozoleStore.createPozole("verde", "pierna");
        assertEquals("Pozole Verde con Pierna", pozoleVerdePierna.name);

        Pozole pozoleVerdePollo = pozoleStore.createPozole("verde", "pollo");
        assertEquals("Pozole Verde con Pollo", pozoleVerdePollo.name);

        Pozole pozoleVerdeTrompa = pozoleStore.createPozole("verde", "trompa");
        assertEquals("Pozole Verde con Trompa", pozoleVerdeTrompa.name);
    }

    @Test
    public void TestPozolillo() {
        Pozole pozolilloCachete = pozoleStore.createPozole("pozolillo", "cachete");
        assertEquals("Pozolillo con Cachete", pozolilloCachete.name);
        assertEquals("Caldo Blanco", pozolilloCachete.broth);

        Pozole pozolilloCanival = pozoleStore.createPozole("pozolillo", "humano");
        assertEquals("Pozolillo con Carne de nuestros enemigos", pozolilloCanival.name);

        Pozole pozolilloOreja = pozoleStore.createPozole("pozolillo", "oreja");
        assertEquals("Pozolillo con Oreja", pozolilloOreja.name);

        Pozole pozolilloPierna = pozoleStore.createPozole("pozolillo", "pierna");
        assertEquals("Pozolillo con Pierna", pozolilloPierna.name);

        Pozole pozolilloPollo = pozoleStore.createPozole("pozolillo", "pollo");
        assertEquals("Pozolillo con Pollo", pozolilloPollo.name);

        Pozole pozolilloTrompa = pozoleStore.createPozole("pozolillo", "trompa");
        assertEquals("Pozolillo con Trompa", pozolilloTrompa.name);
    }
}
