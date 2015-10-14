package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;

/**
 * Created by Arreola on 10/8/2015.
 */
public class AllPozolesStore{

    PozoleStore verdeStore = new PozoleVerdeStore();
    PozoleStore rojoStore = new PozoleRojoStore();
    PozoleStore menuderia = new MenudoStore();
    PozoleStore blancoStore = new PozoleBlancoStore();
    PozoleStore pozolillo = new Pozolillo();

    public Pozole createPozole(String type, String meat) {
        if(type.equals("menudo"))
            return menuderia.orderPozole(meat);
        else if(type.equals("blanco"))
            return blancoStore.orderPozole(meat);
        else if(type.equals("rojo"))
            return rojoStore.orderPozole(meat);
        else if(type.equals("verde"))
            return verdeStore.orderPozole(meat);
        else if(type.equals("pozolillo"))
            return pozolillo.orderPozole(meat);

        return null;
    }

}
