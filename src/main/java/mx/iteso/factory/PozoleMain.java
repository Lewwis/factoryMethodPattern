package mx.iteso.factory;

import mx.iteso.factory.condiments.Cebolla;
import mx.iteso.factory.condiments.Chile;
import mx.iteso.factory.stores.AllPozolesStore;
import mx.iteso.factory.stores.MenudoStore;
import mx.iteso.factory.stores.PozoleRojoStore;
import mx.iteso.factory.stores.PozoleVerdeStore;
import org.apache.maven.shared.invoker.SystemOutHandler;

public class PozoleMain {
    public static void main (String[] args) {
//        PozoleStore verdeStore = new PozoleVerdeStore();
//        PozoleStore rojoStore = new PozoleRojoStore();
//        PozoleStore menuderia = new MenudoStore();
//
//        Pozole pozole = verdeStore.orderPozole("pollo");
//        System.out.println("First order is: "+ pozole.getName());
//        System.out.println();
//
//        pozole = rojoStore.orderPozole("pollo");
//        System.out.println("Second order is: "+ pozole.getName());
//        System.out.println();
//
//        pozole = menuderia.orderPozole("pollo");
//        System.out.println("Third order is: "+ pozole.getName());

        AllPozolesStore store = new AllPozolesStore();

        Pozole pozole = store.createPozole("verde","trompa");
        pozole = new Cebolla(pozole);
        pozole = new Chile(pozole);
        System.out.print(pozole.getName());
    }
}