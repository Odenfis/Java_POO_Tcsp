package com.mycompany.laboratorionueve;

public class Cuadrado extends Figura {
    
    //Atributos propio de Circulo
    private double lado;
    
    //Constructor
    public Cuadrado(double lado, String nombre){
        super(nombre);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    
    //Métodos Heredados (Area y Perimetro)
    @Override
    public double calcularArea(){
        //CALCULAMOS EL AREA DEL CUADRADO con su respectiva ecuacion
        super.dimension1 = Math.pow(lado,2);
        return dimension1;
    }
    
    @Override
    public double calcularPerimetro(){
        //CALCULAMOS EL PERIMETRO DEL CUADRADO con su respectiva ecuacion
        super.dimension2 = lado * 4;
        return dimension2;
    }
    
    
}
