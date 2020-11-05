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
public class Lingkaran extends BangunDatar{
    double jari;
    
    @Override
    double luas(){
        double luas = (double) (Math.PI*jari*jari);
        System.out.println(luas);
        return luas;
    }
    
    @Override
    double keliling(){
        double keliling = (double) (Math.PI*jari*2);
        System.out.println(keliling);
        return keliling;
    }
}
