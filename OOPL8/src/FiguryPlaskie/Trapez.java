package FiguryPlaskie;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author XYZ
 */
import KlasyAbstrakcyjne.FiguraPlaska;

public class Trapez extends FiguraPlaska{
    
    private double a;
    private double b;
    private double c;
    private double h;

    public Trapez(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if (a < 0) System.out.println("Podaj liczbe dodatnia");
         else  this.a = a;
        
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        if (b < 0) System.out.println("Podaj liczbe dodatnia");
         else  this.b = b;
        
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        if (c < 0) System.out.println("Podaj liczbe dodatnia");
         else  this.c = c;
        
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        if (h < 0) System.out.println("Podaj liczbe dodatnia");
         else  this.h = h; 
        
    }
    
    

    @Override
    public double ObliczObwod() {
        return a+b+(2*h);
    }

    @Override
    public double ObliczPole() {
        return (1/2)*(a+b)*h;
    }
    
    @Override
    public String toString() {
        return super.toString() + " Pole Trapez: " + ObliczPole() + " Obw Trapez: " + ObliczObwod();
    }
    
    
}
