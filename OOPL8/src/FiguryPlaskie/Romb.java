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

public class Romb extends FiguraPlaska{
    
    private double x;
    private double h;

    public Romb(double x, double h) {
        this.x = x;
        this.h = h;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        if (x < 0) System.out.println("Podaj liczbe dodatnia");
         else  this.x = x;
        
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
        return 4*x;
    }

    @Override
    public double ObliczPole() {
        return x*h;
    }
    
    @Override
    public String toString() {
        return super.toString() + " Pole Romb: " + ObliczPole() + " Obw Romb: " + ObliczObwod();
    }
    
}
