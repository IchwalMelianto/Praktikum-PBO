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
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        int pilih;
        char ulang;
        
        Scanner scan=new Scanner(System.in);
        
        do{
            System.out.println("\n-------- Menu --------");
            System.out.println("1. Bangun Datar");
            System.out.println("2. Bangun Ruang");
            System.out.println("----------------------");
            System.out.print("Pilih : ");
            pilih = scan.nextInt();
            switch(pilih){
                case 1 -> {
                    BangunDatar batar = new BangunDatar();
                    System.out.println("\n------ Bangun Datar ------");
                    System.out.println("1. Persegi");
                    System.out.println("2. Lingkaran");
                    System.out.println("3. Segitiga");
                    System.out.println("--------------------------");
                    System.out.print("Pilih : ");
                    pilih = scan.nextInt();
                    switch(pilih){
                        case 1 -> {
                            Persegi segi4 = new Persegi();
                            System.out.println("\n---------- Persegi ----------");
                            System.out.print("Masukkan Panjang Sisi\t: "); segi4.sisi = scan.nextDouble();
                            batar.luas();segi4.luas();
                            batar.keliling();segi4.keliling();
                            System.out.println("-----------------------------");break;
                        }
                        case 2 -> {
                            Lingkaran ling = new Lingkaran();
                            System.out.println("\n--------- Lingkaran ---------");
                            System.out.print("Masukkan Jari-jari\t: "); ling.jari = scan.nextDouble();
                            System.out.println("Phi\t\t\t: 3.14");
                            batar.luas();ling.luas();
                            batar.keliling();ling.keliling();
                            System.out.println("-----------------------------");break;
                        }
                        case 3 -> {
                            Segitiga segi3 = new Segitiga();
                            System.out.println("\n--------- Segitiga ---------");
                            System.out.print("Masukkan Alas\t\t: "); segi3.alas = scan.nextDouble();
                            System.out.print("Masukkan Tinggi\t\t: "); segi3.tinggi = scan.nextDouble();
                            batar.luas();segi3.luas();
                            batar.keliling();segi3.keliling();
                            System.out.println("----------------------------");break;
                        }
                        default -> {
                            System.out.println("Salah Memasukkan Pilihan Menu");
                        }
                    }
                    break;
                }
                case 2 -> {
                    BangunRuang bawang = new BangunRuang();
                    System.out.println("\n------ Bangun Ruang ------");
                    System.out.println("1. Kubus");
                    System.out.println("2. Kerucut");
                    System.out.println("3. Tabung");
                    System.out.println("4. Bola");
                    System.out.println("5. Limas");
                    System.out.println("6. Prisma");
                    System.out.println("--------------------------");
                    System.out.print("Pilih : ");
                    pilih = scan.nextInt();
                    switch(pilih){
                        case 1 -> {
                            Kubus kubik = new Kubus();
                            System.out.println("\n----------- Kubus -----------");
                            System.out.print("Masukkan Panjang Sisi\t: "); kubik.setSisi(scan.nextDouble());
                            bawang.volume();System.out.println(kubik.getVolume());
                            bawang.permukaan();System.out.println(kubik.getLP());
                            System.out.println("-----------------------------");break;
                        }
                        case 2 -> {
                            Kerucut lancip = new Kerucut();
                            System.out.println("\n---------- Kerucut ----------");
                            System.out.print("Masukkan Jari-jari\t: "); lancip.setJari(scan.nextDouble());
                            System.out.print("Masukkan Tinggi Kerucut\t: "); lancip.setTinggiKerucut(scan.nextDouble());
                            System.out.print("Masukkan Panjang Selimut: "); lancip.setSelimut(scan.nextDouble());
                            System.out.println("Phi\t\t\t: 3.14");
                            bawang.volume();System.out.println(lancip.getVolume());
                            bawang.permukaan();System.out.println(lancip.getLP());
                            System.out.println("-----------------------------");break;
                        }
                        case 3 -> {
                            Tabung tong = new Tabung();
                            System.out.println("\n---------- Tabung ----------");
                            System.out.print("Masukkan Jari-jari\t: "); tong.setJari(scan.nextDouble());
                            System.out.print("Masukkan Tinggi Tabung\t: "); tong.setTinggiTabung(scan.nextDouble());
                            System.out.println("Phi\t\t\t: 3.14");
                            bawang.volume();System.out.println(tong.getVolume());
                            bawang.permukaan();System.out.println(tong.getLP());
                            System.out.println("----------------------------");break;
                        }
                        case 4 -> {
                            Bola bulat = new Bola();
                            System.out.println("\n----------- Bola -----------");
                            System.out.print("Masukkan Jari-jari\t: "); bulat.setJari(scan.nextDouble());
                            System.out.println("Phi\t\t\t: 3.14");
                            bawang.volume();System.out.println(bulat.getVolume());
                            bawang.permukaan();System.out.println(bulat.getLP());
                            System.out.println("----------------------------");break;
                        }
                        case 5 -> {
                            System.out.println("\n----------- Limas -----------");
                            System.out.println("1. Persegi");
                            System.out.println("2. Segitiga");
                            System.out.println("-----------------------------");
                            System.out.print("Pilih : ");
                            pilih = scan.nextInt();
                            switch(pilih){
                                case 1 -> {
                                    LimasPersegi limas4 = new LimasPersegi();
                                    System.out.println("\n-------- Limas Persegi --------");
                                    System.out.print("Masukkan Panjang Alas\t: "); limas4.setAlas(scan.nextDouble());
                                    System.out.print("Masukkan Tinggi Limas\t: "); limas4.setTinggiLimas(scan.nextDouble());
                                    System.out.print("Masukkan Tinggi Sisi\t: "); limas4.setTinggiSisi(scan.nextDouble());
                                    bawang.volume();System.out.println(limas4.getVolume());
                                    bawang.permukaan();System.out.println(limas4.getLP());
                                    System.out.println("------------------------------");break;
                                }
                                case 2 -> {
                                    LimasSegitiga limas3 = new LimasSegitiga();
                                    System.out.println("\n-------- Limas Segitiga --------");
                                    System.out.print("Masukkan Panjang Alas\t: "); limas3.setAlas(scan.nextDouble());
                                    System.out.print("Masukkan Tinggi Alas\t: "); limas3.setTinggi(scan.nextDouble());
                                    System.out.print("Masukkan Tinggi Limas\t: "); limas3.setTinggiLimas(scan.nextDouble());
                                    System.out.print("Masukkan Tinggi Sisi\t: "); limas3.setTinggiSisi(scan.nextDouble());
                                    bawang.volume();System.out.println(limas3.getVolume());
                                    bawang.permukaan();System.out.println(limas3.getLP());
                                    System.out.println("--------------------------------");break;
                                }
                                default -> {
                                    System.out.println("Salah Memasukkan Pilihan Menu");
                                }
                            }break;
                        }
                        case 6 -> {
                            System.out.println("\n----------- Prisma ----------");
                            System.out.println("1. Jajargenjang");
                            System.out.println("2. Segitiga");
                            System.out.println("-----------------------------");
                            System.out.print("Pilih : ");
                            pilih = scan.nextInt();
                            switch(pilih){
                                case 1 -> {
                                    PrismaJajargenjang prisma4 = new PrismaJajargenjang();
                                    System.out.println("\n------ Limas Jajargenjang ------");
                                    System.out.print("Masukkan Panjang Alas\t: "); prisma4.setAlas(scan.nextDouble());
                                    System.out.print("Masukkan Tinggi Alas\t: "); prisma4.setTinggi(scan.nextDouble());
                                    System.out.print("Masukkan Tinggi Prisma\t: "); prisma4.setTinggiPrisma(scan.nextDouble());
                                    System.out.print("Masukkan Sisi Miring\t: "); prisma4.setSisiMiring(scan.nextDouble());
                                    bawang.volume();System.out.println(prisma4.getVolume());
                                    bawang.permukaan();System.out.println(prisma4.getLP());
                                    System.out.println("--------------------------------");break;
                                }
                                case 2 -> {
                                    PrismaSegitiga prisma3 = new PrismaSegitiga();
                                    System.out.println("\n------- Prisma Segitiga --------");
                                    System.out.print("Masukkan Panjang Alas\t: "); prisma3.setAlas(scan.nextDouble());
                                    System.out.print("Masukkan Tinggi Alas\t: "); prisma3.setTinggi(scan.nextDouble());
                                    System.out.print("Masukkan Tinggi Prisma\t: "); prisma3.setTinggiPrisma(scan.nextDouble());
                                    bawang.volume();System.out.println(prisma3.getVolume());
                                    bawang.permukaan();System.out.println(prisma3.getLP());
                                    System.out.println("--------------------------------");break;
                                }
                                default -> {
                                    System.out.println("Salah Memasukkan Pilihan Menu");
                                }
                            }break;
                        }
                        default -> {
                            System.out.println("Salah Memasukkan Pilihan Menu");
                        }
                        
                    }
                    break;
                }
                default -> {
                    System.out.println("Salah Memasukkan Pilihan Menu");
                }
            }System.out.print("Ingin Kembali Ke Menu?(Y/N)  "); ulang = scan.next().charAt(0);
        }while(ulang=='Y'||ulang=='y');
    }
}
