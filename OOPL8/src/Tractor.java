/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author XYZ
 */
public class Tractor extends Product {

    public Tractor(double price, String name, String describe) {
        super(price, name, describe);
    }

    public void buy() {
        System.out.println(
                "Kupilem traktor!");
    }

    public void showInfo() {
        System.out.println(
                "Cena:" + getPrice()
                + " nazwa:" + getName()
                + " opis:" + getDescribe()
        );
    }

}
