/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agungbmi;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class CalculateBMI {
    public static void main(String[] args) {
        
        AgungBMI hitungBMI = new AgungBMI();
        Scanner userInput = new Scanner(System.in);
        System.out.println("MASA INDEKS TUBUH");
        System.out.println("");
        System.out.println("Input Nama : ");
        hitungBMI.Nama = userInput.nextLine();     
        System.out.println("Input Berat dalam Kilogram : ");
        hitungBMI.berat = userInput.nextDouble();
        System.out.println("Input Tinggi dalam Meter : ");
        hitungBMI.tinggi = userInput.nextDouble();
        hitungBMI.calculateBMI();
        System.out.println("TERIMA KASIH!");
    } 
}
