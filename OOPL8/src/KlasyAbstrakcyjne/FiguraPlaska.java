package KlasyAbstrakcyjne;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author XYZ
 */


public abstract class FiguraPlaska extends FiguraGeometryczna{
    
    public abstract double ObliczObwod();
    
    @Override
    public String toString(){
        return super.toString()+" płaskiej: ";
    }
    
}
