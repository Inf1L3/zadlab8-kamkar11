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

public class Kula extends FiguraPrzestrzenna{
    
    private final double pi = 3.14;
    private double R;

    public Kula(double R) {
        this.R = R;
    }

    public double getR() {
        return R;
    }

    public void setR(double R) {
        if (R < 0) System.out.println("Podaj liczbe dodatnia");
         else  this.R = R; 
        
    }
    
    @Override
    public double ObliczObjetosc() {
        return (4/3)*pi*R*R*R;
    }

    @Override
    public double ObliczPole() {
        return 4*pi*R*R;
    }
    
    @Override
    public String toString() {
        return super.toString() + " Pole Kula: " + ObliczPole() + " Obj Kula: " + ObliczObjetosc();
    }
    
    
    
}
