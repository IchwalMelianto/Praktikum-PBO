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
public class LimasPersegi {
    double Alas = 0;
    double TinggiLimas = 0;
    double TinggiSisi = 0;
    
    private double hitungVolume(double a, double TL){
        return (a*a*TL)/3;
    }
    private double hitungLP(double a, double TS){
        return (a*a)+4*((a*TS)/2);
    }
    public void setAlas(double Alas){
        this.Alas = Alas;
    }
    public void setTinggiLimas(double TinggiLimas){
        this.TinggiLimas = TinggiLimas;
    }
    public void setTinggiSisi(double TinggiSisi){
        this.TinggiSisi = TinggiSisi;
    }
    public double getVolume(){
        return hitungVolume(Alas, TinggiLimas);
    }
    public double getLP(){
        return hitungLP(Alas, TinggiSisi);
    }
}
