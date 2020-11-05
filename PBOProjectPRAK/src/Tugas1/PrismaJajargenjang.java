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
public class PrismaJajargenjang {
    double Alas = 0;
    double Tinggi = 0;
    double TinggiPrisma = 0;
    double SisiMiring = 0;
    
    private double hitungVolume(double a, double t, double TP){
        return (a*t)*TP;
    }
    private double hitungLP(double a, double t, double TP, double SM){
        return 2*(a*t)+2*(a*TP)+2*(SM*TP);
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
    public void setSisiMiring(double SisiMiring){
        this.SisiMiring = SisiMiring;
    }
    public double getVolume(){
        return hitungVolume(Alas, Tinggi, TinggiPrisma);
    }
    public double getLP(){
        return hitungLP(Alas, Tinggi, TinggiPrisma, SisiMiring);
    }
}
