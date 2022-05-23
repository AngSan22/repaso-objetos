package uaslp.objetos.figuras;

import uaslp.objetos.figuras.Exception.DatoFaltanteException;

abstract class Figura implements DrawableItem{

    private final String name;

    public Figura(String name){
        this.name = name;
    }
    public abstract double getArea();
    public String getName() throws DatoFaltanteException {
        return name;
    }
}
