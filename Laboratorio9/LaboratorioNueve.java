//Main
package com.mycompany.laboratorionueve;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

/**
 *
 * @author wmoncada
 */
public class LaboratorioNueve {

    public static void main(String[] args) {        
      
        /*
        String texto1 = "BIENVENIDOS ALUMNOS";
        String texto2 = "ESTE EL CURSO DE POO";
        
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\ReportesJava\\reporte.txt"))){
            
            //logica de escritura porque estoy llamando a BWRITER
            bw.write(texto1);
            bw.newLine();
            bw.write(texto2);
            
        }catch(IOException e){
            System.out.println("Error");
        }
        */
        
        /*
        String varlineatexto;
        
        try(BufferedReader br = new BufferedReader(new FileReader("D:\\\\ReportesJava\\\\reporte.txt"))){
            
            while((varlineatexto = br.readLine()) != null){
                
                System.out.println(varlineatexto);
            }
     
        }catch(IOException e){
            System.out.println("Error");
        }*/
        
        //determinar FORMATO PARA DECIMALES
        DecimalFormat f = new DecimalFormat("####.##");
        
        Circulo _circulo = new Circulo(30,"Circulo1");
        System.out.println("El área del "+_circulo.getNombre()+" es: "+f.format(_circulo.calcularArea()));
        System.out.println("El perímetro del "+_circulo.getNombre()+" es: "+f.format(_circulo.calcularPerimetro()));
        
        //Variables para el BufferedWriter
        //String area = String.valueOf(_circulo.calcularArea());
        //String perimetro = String.valueOf(_circulo.calcularPerimetro());
        
        String area = f.format(_circulo.calcularArea());
        String perimetro = f.format(_circulo.calcularPerimetro());
    
        
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\ReportesJava\\reporte.txt"))){
            
            bw.write("CÍRCULO\n");
            bw.write("------------\n");
            bw.write("Con su radio ==>>> "+_circulo.getRadio()+"\n");
            bw.write("Da como resultado un área de: "+area+"\n");
            bw.write("Da como resultado un perímetro de: "+perimetro+"\n");
            
            
        }catch(IOException e){
            System.out.println("Error");
        }
        
    }
}
