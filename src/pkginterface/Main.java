/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

import datamodel.Kalkulator;
import static operasi.Operasi.op_dasar_konst;

/**
 *
 * @author SYARIF
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kons= op_dasar_konst;
        System.out.println(kons);
        Kalkulator calc=new Kalkulator(16.0, 3.0);
        
        System.out.println("Demo Kalkulator");
        System.out.println("Nilai x = " +calc.getX());
        System.out.println("Nilai Y = " +calc.getY());
        System.out.println("=========================");
        System.out.println("Operasi Dasar Aritmatika");
        System.out.println("x + y = " +calc.penjumlahan());
        System.out.println("x - y = " +calc.pengurangan());
        System.out.println("x * y = " +calc.perkalian());
        System.out.println("x / y = " +calc.pembagian());
        System.out.println("=========================");
        System.out.println("Operasi Scientific");
        System.out.println("akar x = " +calc.akar());
        System.out.println("x ^ y = " +calc.pangkat());
        System.out.println("x mod y = " +calc.modulus());
    }
    
}
