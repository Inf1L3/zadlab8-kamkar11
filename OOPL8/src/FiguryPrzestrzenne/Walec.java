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

public class Walec extends FiguraPrzestrzenna{
    
    private final double pi = 3.14;
    private double r;
    private double h;

    public Walec(double r, double h) {
        this.r = r;
        this.h = h;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        if (r < 0) System.out.println("Podaj liczbe dodatnia");
         else  this.r = r; 
        
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        if (h < 0) System.out.println("Podaj liczbe dodatnia");
         else  this.h = h; 
        
    }
    
    @Override
    public double ObliczObjetosc() {
        return pi*r*r*h;
    }

    @Override
    public double ObliczPole() {
        return (2*pi*r*r)+(2*pi*r*h);
    }
    
    @Override
    public String toString() {
        return super.toString() + " Pole Walec: " + ObliczPole() + " Obj Walec: " + ObliczObjetosc();
    }
    
}
