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
public class Pengarang {
    private String idPengarang;
    private String namaPengarang;
    private String alamat;
    private String noHp;
    private String idPenerbit;

    public Pengarang(String idPengarang, String namaPengarang, String alamat,String noHp,String idPenerbit) {
        this.idPengarang = idPengarang;
        this.namaPengarang = namaPengarang;
        this.noHp = noHp;
        this.alamat = alamat;
    }

    public String getIdPengarang() {
        return idPengarang;
    }

    public void setIdPengarang(String idPengarang) {
        this.idPengarang = idPengarang;
    }

    public String getNamaPengarang() {
        return namaPengarang;
    }

    public void setNamaPengarang(String namaPengarang) {
        this.namaPengarang = namaPengarang;
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
