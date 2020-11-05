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
public class Persegi extends BangunDatar{
    double sisi;
    
    @Override
    double luas(){
        double luas = sisi*sisi;
        System.out.println(luas);
        return luas;
    }
    
    @Override
    double keliling(){
        double keliling = 4*sisi;
        System.out.println(keliling);
        return keliling;
    }
}
