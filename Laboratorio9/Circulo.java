package com.mycompany.laboratorionueve;

public class Circulo extends Figura{

    //Atributos propio de Circulo
    private double radio;
    
    //Constructor
    public Circulo(double radio, String nombre){
        super(nombre);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    //Métodos Heredados (Area y Perimetro)
    @Override
    public double calcularArea(){
        //CALCULAMOS EL AREA DEL CIRCULO con su respectiva ecuacion
        super.dimension1 = Math.PI * Math.pow(radio,2);
        return dimension1;
    }
    
    @Override
    public double calcularPerimetro(){
        //CALCULAMOS EL PERIMETRO DEL CIRCULO con su respectiva ecuacion
        super.dimension2 = 2 * radio * Math.PI;
        return dimension2;
    }
    
}
