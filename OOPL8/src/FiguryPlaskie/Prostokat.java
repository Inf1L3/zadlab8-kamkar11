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

public class Prostokat extends FiguraPlaska {
    
    private double a;
    private double b;

    public Prostokat(double a, double b) {
        this.a = a;
        this.b = b;
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
    
    @Override
    public double ObliczObwod() {
        return (2*a)+(2*b);
    }

    @Override
    public double ObliczPole() {
        return a*b;
    }
    
    @Override
    public String toString() {
        return super.toString() + " Pole Prostokat: " + ObliczPole() + " Obw Prostokat: " + ObliczObwod();
    }
    
}
