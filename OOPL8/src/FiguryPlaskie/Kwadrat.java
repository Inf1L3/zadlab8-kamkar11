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

public class Kwadrat extends FiguraPlaska {

    private double x;

    public Kwadrat(int x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setX(int x) {
        if (x < 0) System.out.println("Podaj liczbe dodatnia");
         else  this.x = x;  
    }

    @Override
    public double ObliczObwod() {
        return 4 * x;
    }

    @Override
    public double ObliczPole() {
        return x * x;
    }

    @Override
    public String toString() {
        return super.toString() + " Pole kwadratu: " + ObliczPole() + " Obw kwadratu: " + ObliczObwod();
    }

}
