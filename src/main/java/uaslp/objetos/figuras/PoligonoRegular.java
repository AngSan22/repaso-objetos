package uaslp.objetos.figuras;

import uaslp.objetos.figuras.Exception.NumeroInvalidoDeLados;

public class PoligonoRegular extends Figura{
    private final int numeroDeLados;
    private double lado;

    public PoligonoRegular(int numeroDeLados) throws NumeroInvalidoDeLados {
        super("Poligono Regular");

        if (numeroDeLados < 5){
            throw new NumeroInvalidoDeLados();
        }
        this.numeroDeLados = numeroDeLados;
    }

    public PoligonoRegular(int numeroDeLados, double lado){
        super("Poligono Regular");
        this.numeroDeLados = numeroDeLados;
        this.lado = lado;
    }

    public void setLado(double lado){
        this.lado = lado;
    }

    public double getLado(){
        return lado;
    }

    public double getArea(){
        return numeroDeLados * lado * lado * Math.sqrt(3) / 4;
    }
}
