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
public class Tabung {
    double Jari=0;
    double TinggiTabung=0;
    
    private double hitungVolume(double r, double t) {
        return 3.14*r*r*t;
    }
    private double hitungLP(double r, double t) {
        return 2*3.14*r*(r+t);
    }
    public void setJari(double Jari) {
        this.Jari = Jari;
    }
    public void setTinggiTabung(double TinggiTabung) {
        this.TinggiTabung = TinggiTabung;
    }
    public double getVolume() {
        return hitungVolume(Jari, TinggiTabung);
    }
    public double getLP() {
        return hitungLP(Jari, TinggiTabung);
    }
}
