package Formas;

public class circulo extends figura {
    private double radio;
    private double pi=3.1416;

    public circulo(Double radio,Double pi){
        this.radio=radio;
        this.pi=pi;
    }
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double getPi() {
        return pi;
    }

    public void setPi(Double pi) {
        this.pi = pi;
    }

    public void calcularArea() {
      Double area=0.0;
      radio=radio*radio;
      area=radio*pi;
      System.out.println("el radio del circulo es: "+radio+" Su area es: "+area);
        
    }
}