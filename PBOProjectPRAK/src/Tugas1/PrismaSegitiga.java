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
public class PrismaSegitiga {
    double Alas = 0;
    double Tinggi = 0;
    double TinggiPrisma = 0;
    double SisiMiring = 0;
    
    private double hitungVolume(double a, double t, double TP){
        return (a*t)/2*TP;
    }
    private double hitungLP(double a, double t, double TP){
        return (2*(a*t)/2)+(3*(a*TP));
    }
    public void setAlas(double Alas){
        this.Alas = Alas;
    }
    public void setTinggi(double Tinggi){
        this.Tinggi = Tinggi;
    }
    public void setTinggiPrisma(double TinggiPrisma){
        this.TinggiPrisma = TinggiPrisma;
    }
    public double getVolume(){
        return hitungVolume(Alas, Tinggi, TinggiPrisma);
    }
    public double getLP(){
        return hitungLP(Alas, Tinggi, TinggiPrisma);
    }
}
