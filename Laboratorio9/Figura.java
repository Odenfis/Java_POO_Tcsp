
package com.mycompany.laboratorionueve;

abstract class Figura {
    
    public String nombre;
    public double dimension1;
    public double dimension2;

    public Figura(String nombre) {
        this.nombre = nombre;
       
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDimension1() {
        return dimension1;
    }

    public void setDimension1(double dimension1) {
        this.dimension1 = dimension1;
    }

    public double getDimension2() {
        return dimension2;
    }

    public void setDimension2(double dimension2) {
        this.dimension2 = dimension2;
    }
    
    //CREO MÉTODOS QUE NO SE NECESITARÁN APLICAR DESDE LA CLASE ABSTRACTA
    //POR ENDE SON MÉTODOS ABSTRACTOS
    abstract public double calcularArea();
    abstract public double calcularPerimetro();    
    
}
