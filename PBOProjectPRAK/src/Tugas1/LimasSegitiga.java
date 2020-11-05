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
public class LimasSegitiga {
    double Alas = 0;
    double Tinggi = 0;
    double TinggiLimas = 0;
    double TinggiSisi = 0;
    
    private double hitungVolume(double a, double t, double TL){
        return ((a*t)/2*TL)/3;
    }
    private double hitungLP(double a, double t, double TS){
        return ((a*t)/2)+3*((a*TS)/2);
    }
    public void setAlas(double Alas){
        this.Alas = Alas;
    }
    public void setTinggi(double Tinggi){
        this.Tinggi = Tinggi;
    }
    public void setTinggiLimas(double TinggiLimas){
        this.TinggiLimas = TinggiLimas;
    }
    public void setTinggiSisi(double TinggiSisi){
        this.TinggiSisi = TinggiSisi;
    }
    public double getVolume(){
        return hitungVolume(Alas, Tinggi, TinggiLimas);
    }
    public double getLP(){
        return hitungLP(Alas, Tinggi, TinggiSisi);
    }
}
