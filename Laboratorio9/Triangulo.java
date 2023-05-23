package com.mycompany.laboratorionueve;

public class Triangulo extends Figura {
    
   private double lado;

    public Triangulo(double lado,String nombre) {
        super(nombre);       
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double calcularArea() {
        super.dimension1 =  (lado*((Math.sqrt(3) * lado)/2))/2;
        return dimension1;
    }

    @Override
    public double calcularPerimetro() {
        super.dimension2 = lado * 3;
        return dimension2;
    }
}
