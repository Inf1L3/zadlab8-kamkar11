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

public class Stozek extends FiguraPrzestrzenna{
    
    private final double pi = 3.14;
    private double r;
    private double l;
    private double h;

    public Stozek(double r, double l, double h) {
        this.r = r;
        this.l = l;
        this.h = h;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
         if (r < 0) System.out.println("Podaj liczbe dodatnia");
         else  this.r = r;
        
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
         if (l < 0) System.out.println("Podaj liczbe dodatnia");
         else  this.l = l;
        
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
        return (1/3)*pi*r*r*h;
    }

    @Override
    public double ObliczPole() {
        return (pi*r*r)+(pi*r*l);
    }
    
    @Override
    public String toString() {
        return super.toString() + " Pole Stozek: " + ObliczPole() + " Obj Stozek: " + ObliczObjetosc();
    }
    
}
