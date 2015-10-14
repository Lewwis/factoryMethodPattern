package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.pozoles.*;

/**
 * Created by Arreola on 10/8/2015.
 */
public class Pozolillo extends PozoleStore {

    @Override
    protected Pozole createPozole(String meat) {
        if (meat.equals("pollo"))
            return new PozolilloPollo();
        else if (meat.equals("cachete") )
            return new PozolilloCachete();
        else if (meat.equals("oreja"))
            return new PozolillOreja();
        else if (meat.equals("pierna") )
            return new PozolilloPierna();
        else if (meat.equals("trompa"))
            return new PozolilloTrompa();
        else if (meat.equalsIgnoreCase("humano"))
            return new PozolilloCanival();
        else return null;
    }
}
