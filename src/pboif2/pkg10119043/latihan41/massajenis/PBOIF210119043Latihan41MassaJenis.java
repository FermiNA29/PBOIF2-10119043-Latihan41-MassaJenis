/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan41.massajenis;
import java.util.Scanner;
/**
 *
 * @author FERMI
 * NAMA      : FERMI NAUFAL AKBAR
 * NIM       : 10119043
 * KELAS     : IF2
 * DESKRIPSI : Program menghitung massa jenis
 */
public class PBOIF210119043Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    private static int sisi;
    private static int massa;

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Kubus kubus = new Kubus();
        System.out.println("======Massa Jenis Kubus======");
        
        System.out.print("Sisi : ");
        sisi = scanner.nextInt();
        kubus.setSisi(sisi);

        System.out.print("Mass : ");
        massa = scanner.nextInt();
        kubus.setMassa(massa);
        
        System.out.println();
        System.out.println("======Hasil Perhitungan======");
        System.out.println("Volume " + kubus.hitungVolume(kubus.getSisi()));
        System.out.println("Massa Jenis "+kubus.hitungMassaJenis(kubus.getMassa(), kubus.hitungVolume(kubus.getSisi())));
    }
    
}
