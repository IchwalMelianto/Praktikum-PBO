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
public class Kerucut {
    double Jari=0;
    double TinggiKerucut=0;
    double Selimut=0;
    
    private double hitungVolume(double r, double t) {
        return (3.14*r*r*t)/3;
    }
    private double hitungLP(double r, double s) {
        return 3.14*r*(r+s);
    }
    public void setJari(double Jari) {
        this.Jari = Jari;
    }
    public void setTinggiKerucut(double TinggiKerucut) {
        this.TinggiKerucut = TinggiKerucut;
    }
    public void setSelimut(double Selimut) {
        this.Selimut = Selimut;
    }
    public double getVolume() {
        return hitungVolume(Jari, TinggiKerucut);
    }
    public double getLP() {
        return hitungLP(Jari, Selimut);
    }
}
