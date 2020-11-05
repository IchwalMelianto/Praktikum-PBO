/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author Ichwal Melianto
 */
public class Bola {
    double Jari=0;
    
    private double hitungVolume(double r) {
        return (4*3.14*r*r*r)/3;
    }
    private double hitungLP(double r) {
        return 4*3.14*r*r;
    }
    public void setJari(double Jari) {
        this.Jari = Jari;
    }
    public double getVolume() {
        return hitungVolume(Jari);
    }
    public double getLP() {
        return hitungLP(Jari);
    }
}
