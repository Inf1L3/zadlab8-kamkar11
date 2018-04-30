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

public class Szescian extends FiguraPrzestrzenna{
    
    private double a;

    public Szescian(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if (a < 0) System.out.println("Podaj liczbe dodatnia");
         else  this.a = a;
        
    }
    
    @Override
    public double ObliczObjetosc() {
        return a*a*a;
    }

    @Override
    public double ObliczPole() {
        return 6*a*a;
    }
    
    @Override
    public String toString() {
        return super.toString() + " Pole Szescian: " + ObliczPole() + " Obj Szescian: " + ObliczObjetosc();
    }
    
}
