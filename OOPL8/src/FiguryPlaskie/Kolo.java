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

public class Kolo extends FiguraPlaska{
    
    private final double pi = 3.14;
    private double r;

    public Kolo(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
         if (r < 0) System.out.println("Podaj liczbe dodatnia");
         else  this.r = r;
        
    }
    

    @Override
    public double ObliczObwod() {
        return 2*pi*r;
    }

    @Override
    public double ObliczPole() {
        return pi*r*r;
    }
    
    @Override
    public String toString() {
        return super.toString() + " Pole Kolo: " + ObliczPole() + " Obw Kolo: " + ObliczObwod();
    }
    
  
    
}
