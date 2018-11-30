/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Asus
 */
public class Barang {
    String idBarang;
    String namaBarang;
    String idGudang;
    int stok;
    int harga;
    
    
    public Barang(String id, String nama, int stok, int harga, String idGudang){
        this.idBarang = id;
        this.namaBarang = nama;
        this.stok = stok;
        this.harga = harga;
    }
    
    
    public String getIdBarang() {
        return idBarang;
    }

    public String getIdGudang() {
        return idGudang;
    }

    public void setIdGudang(String idGudang) {
        this.idGudang = idGudang;
    }

    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }


    
}
