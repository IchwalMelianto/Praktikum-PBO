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
public class Segitiga extends BangunDatar{
    double alas, tinggi;
    
    @Override
    double luas(){
        double luas =  alas*tinggi/2;
        System.out.println(luas);
        return luas;
    }
    
    @Override
    double keliling(){
        double keliling = alas*3;
        System.out.println(keliling);
        return keliling;
    }
}
