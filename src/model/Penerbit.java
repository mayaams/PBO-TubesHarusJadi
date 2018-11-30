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
public class Penerbit {
    private String idPenerbit;
    private String namaPenerbit;
    private String noHp;
    private String alamat;
    

    public Penerbit(String idPenerbit, String namaPenerbit, String alamat,String noHp) {
        this.idPenerbit = idPenerbit;
        this.namaPenerbit = namaPenerbit;
        this.noHp = noHp;
        this.alamat = alamat;
    }

    public String getIdPenerbit() {
        return idPenerbit;
    }

    public void setIdPenerbit(String idPenerbit) {
        this.idPenerbit = idPenerbit;
    }

    public String getNamaPenerbit() {
        return namaPenerbit;
    }

    public void setNamaPenerbit(String namaPenerbit) {
        this.namaPenerbit = namaPenerbit;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    
}
