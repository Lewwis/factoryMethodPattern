package mx.iteso.factory.condiments;

import mx.iteso.factory.CondimentsDecorator;
import mx.iteso.factory.Pozole;

/**
 * Created by Arreola on 10/8/2015.
 */
public class Rabanos extends CondimentsDecorator{
    Pozole pozole;

    public Rabanos(Pozole pozole) {
        this.pozole = pozole;
    }

    @Override
    public String getName() {
        return this.pozole.getName() + " con Rabanos";
    }
}
