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

public class Trojkat extends FiguraPlaska{
    
    private double a;
    private double h;

    public Trojkat(double a, double h) {
        this.a = a;
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if (a < 0) System.out.println("Podaj liczbe dodatnia");
         else  this.a = a;
        
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
        return 3*a;
    }

    @Override
    public double ObliczPole() {
        return (1/2) * a * h;
    }
    
    @Override
    public String toString() {
        return super.toString() + " Pole Trojkat: " + ObliczPole() + " Obw Trojkat: " + ObliczObwod();
    }
    
}
