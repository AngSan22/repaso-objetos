package uaslp.objetos.figuras;

public class PoligonoRegular extends Figura{
    private int numeroDeLados;
    private double lado;

    public PoligonoRegular(int numeroDeLados){
        super("Poligono Regular");
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
