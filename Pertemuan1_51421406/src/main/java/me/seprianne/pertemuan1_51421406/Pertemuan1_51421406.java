/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package me.seprianne.pertemuan1_51421406;

import java.util.Scanner;


public class Pertemuan1_51421406 {
       public static void persegi() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi persegi: ");
        double sisi = input.nextDouble();
        
        double keliling = 4 * sisi;
        double luas = sisi * sisi;
        
        System.out.println("Keliling Persegi: " + keliling);
        System.out.println("Luas Persegi: " + luas);
    }

    // Method untuk menghitung keliling dan luas persegi panjang
    public static void persegiPanjang() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang: ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar: ");
        double lebar = input.nextDouble();
        
        double keliling = 2 * (panjang + lebar);
        double luas = panjang * lebar;
        
        System.out.println("Keliling Persegi Panjang: " + keliling);
        System.out.println("Luas Persegi Panjang: " + luas);
    }

    // Method untuk menghitung keliling dan luas lingkaran
    public static void lingkaran() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = input.nextDouble();
        
        double keliling = 2 * Math.PI * jariJari;
        double luas = Math.PI * jariJari * jariJari;
        
        System.out.println("Keliling Lingkaran: " + keliling);
        System.out.println("Luas Lingkaran: " + luas);
    }

    // Method untuk menghitung keliling dan luas segitiga
    public static void segitiga() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang alas segitiga: ");
        double alas = input.nextDouble();
        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = input.nextDouble();
        System.out.print("Masukkan panjang sisi miring segitiga: ");
        double sisiMiring = input.nextDouble();
        
        double keliling = alas + tinggi + sisiMiring;
        double luas = 0.5 * alas * tinggi;
        
        System.out.println("Keliling Segitiga: " + keliling);
        System.out.println("Luas Segitiga: " + luas);
    }

    // Method untuk menghitung keliling dan luas jajar genjang
    public static void jajarGenjang() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang alas jajar genjang: ");
        double alas = input.nextDouble();
        System.out.print("Masukkan tinggi jajar genjang: ");
        double tinggi = input.nextDouble();
        System.out.print("Masukkan panjang sisi miring jajar genjang: ");
        double sisiMiring = input.nextDouble();
        
        double keliling = 2 * (alas + sisiMiring);
        double luas = alas * tinggi;
        
        System.out.println("Keliling Jajar Genjang: " + keliling);
        System.out.println("Luas Jajar Genjang: " + luas);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nPilih bangun datar yang ingin dihitung:");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Lingkaran");
            System.out.println("4. Segitiga");
            System.out.println("5. Jajar Genjang");
            System.out.println("6. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = input.nextInt();
            
            switch (pilihan) {
                case 1:
                    persegi();
                    break;
                case 2:
                    persegiPanjang();
                    break;
                case 3:
                    lingkaran();
                    break;
                case 4:
                    segitiga();
                    break;
                case 5:
                    jajarGenjang();
                    break;
                case 6:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 6);
    }
}

