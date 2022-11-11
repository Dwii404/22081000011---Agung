/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agungbmi;

/**
 *
 * @author USER
 */
public class AgungBMI {

        double calculateBMI,berat,tinggi;
        String Nama ;
        void calculateBMI () {
            calculateBMI = Math.ceil(berat / (tinggi * tinggi) * 100000);
            System.out.println("Nama : " + Nama);
            System.out.println("Masa Indeks Tubuh anda adalah " + calculateBMI + "kg/m2");
    
    }
    
}
