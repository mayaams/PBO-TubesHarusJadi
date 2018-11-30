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
public class Petugas {
    private String idPetugas;
    private String namaPetugas;
    private String username;
    private String password;
    private String alamat;
    private String noHp;
    private String idGudang;
    

    public Petugas(String idPetugas, String namaPetugas, String username, String password, String alamat, String noHp, String idGudang) {
        this.idPetugas = idPetugas;
        this.namaPetugas = namaPetugas;
        this.username = username;
        this.password = password;
        this.noHp = noHp;
        this.alamat = alamat;
        this.idGudang = idGudang;
    }

    public String getIdPetugas() {
        return idPetugas;
    }

    public void setIdPetugas(String idPetugas) {
        this.idPetugas = idPetugas;
    }

    public String getNamaPetugas() {
        return namaPetugas;
    }

    public void setNamaPetugas(String namaPetugas) {
        this.namaPetugas = namaPetugas;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getIdGudang() {
        return idGudang;
    }

    public void setIdGudang(String idGudang) {
        this.idGudang = idGudang;
    }
    
    
    
}
