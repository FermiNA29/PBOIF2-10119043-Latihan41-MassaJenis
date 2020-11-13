/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan41.massajenis;

/**
 *
 * @author FERMI
 * NAMA      : FERMI NAUFAL AKBAR
 * NIM       : 10119043
 * KELAS     : IF2
 * DESKRIPSI : Program menghitung massa jenis
 */
public class Kubus {
    private int sisi;
    private int massa;
    
    public void setSisi(int sisi) {
        this.sisi = sisi;
    }
    
    public int getSisi() {
        return sisi;
    }
    
    public void setMassa(int massa) {
        this.massa = massa;
    }
    
    public int getMassa() {
        return massa;
    }
    
    public int hitungVolume(int parSisi) {
        return parSisi*parSisi*parSisi;
    }
    
    public int hitungMassaJenis(int parMassa, int volume) {
        return massa/volume;
    }
}
