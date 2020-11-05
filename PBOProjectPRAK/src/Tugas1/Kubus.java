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
public class Kubus {
    double Sisi=0;
    
    private double hitungVolume(double s) {
        return s*s*s;
    }
    private double hitungLP(double s) {
        return s*s*6;
    }
    public void setSisi(double Sisi) {
        this.Sisi = Sisi;
    }
    public double getVolume() {
        return hitungVolume(Sisi);
    }
    public double getLP() {
        return hitungLP(Sisi);
    }
}
