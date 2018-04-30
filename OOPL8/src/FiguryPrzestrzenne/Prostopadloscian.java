/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FiguryPrzestrzenne;

/**
 *
 * @author XYZ
 */
import KlasyAbstrakcyjne.FiguraPrzestrzenna;

public class Prostopadloscian extends FiguraPrzestrzenna{
    
    private double a;
    private double b;
    private double c;

    public Prostopadloscian(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
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
    
    

    @Override
    public double ObliczObjetosc() {
        return a*b*c;
    }

    @Override
    public double ObliczPole() {
        return (2*a*b)+(2*b*c)+(2*a*c);
    }
    
    @Override
    public String toString() {
        return super.toString() + " Pole Prostopadloscian: " + ObliczPole() + " Obj Prostopadloscian: " + ObliczObjetosc();
    }
    
}
