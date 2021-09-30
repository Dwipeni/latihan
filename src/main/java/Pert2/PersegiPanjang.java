/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pert2;

/**
 *
 * @author Lenovo
 */
public class PersegiPanjang {
    int panjang, lebar, luas, keliling;
    
    public void dataPersegiPanjang(int p, int l) {
        panjang = p;
        lebar = l;
    }
    
    public void luasPersegiPanjang() {
        luas = panjang * lebar;
    }
    
    public void kelilingPersegiPanjang() {
        keliling =  2 * (panjang + lebar);
    }
    
    public void tampilPersegiPanjang() {
        System.out.println("Panjang Persegi Panjang: " + panjang);
        System.out.println("Lebar Persegi Panjang: " + lebar);
        System.out.println("Luas Persegi Panjang: " + luas);
        System.out.println("Keliling Persegi Panjang: " + keliling);
        System.out.println();
    }
    
    public static void main(String[] args) {
        System.out.println("== PROGRAM OPERASI PADA PERSEGI PANJANG ==");
        System.out.println();
                
        PersegiPanjang pp = new PersegiPanjang();
        pp.dataPersegiPanjang(8, 12);
        pp.luasPersegiPanjang();
        pp.kelilingPersegiPanjang();
        pp.tampilPersegiPanjang();
        
        PersegiPanjang pp1 = new PersegiPanjang();
        pp1.dataPersegiPanjang(14, 18);
        pp1.luasPersegiPanjang();
        pp1.kelilingPersegiPanjang();
        pp1.tampilPersegiPanjang();
        
        PersegiPanjang pp2 = new PersegiPanjang();
        pp2.dataPersegiPanjang(20, 24);
        pp2.luasPersegiPanjang();
        pp2.kelilingPersegiPanjang();
        pp2.tampilPersegiPanjang();
    }
}
