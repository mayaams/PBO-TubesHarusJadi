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
public class Rak {
    private String idRak;
    private String namaRak;
    private String kategori;
    private String tingkatRak;

    public Rak(String idRak, String namaRak, String kategori, String tingkatRak) {
        this.idRak = idRak;
        this.namaRak = namaRak;
        this.kategori = kategori;
        this.tingkatRak = tingkatRak;
    }

    public String getIdRak() {
        return idRak;
    }

    public void setIdRak(String idRak) {
        this.idRak = idRak;
    }

    public String getNamaRak() {
        return namaRak;
    }

    public void setNamaRak(String namaRak) {
        this.namaRak = namaRak;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getTingkatRak() {
        return tingkatRak;
    }

    public void setTingkatRak(String tingkatRak) {
        this.tingkatRak = tingkatRak;
    }
    
    
    
}
