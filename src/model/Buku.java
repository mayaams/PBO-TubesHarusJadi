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
public class Buku extends Barang{
    private String kategori;
    private int jumHalaman;
    private Penerbit penerbit;
    private Pengarang pengarang;
    private String ukuran;
    private String idRak;
    private String idPenerbit;

    public Buku(String id, String nama, int stok, int harga, String idGudang, String kategori, String ukuran, int jumHalaman, String idRak, String idPenerbit) {
        super(id, nama, stok, harga, idGudang);
        this.kategori = kategori;
        this.jumHalaman = jumHalaman;
        this.ukuran = ukuran;
        this.idRak = idRak;
        this.idPenerbit = idPenerbit;
    }

    //(id,nama,stok,harga,idGudang,kategori,ukuran,jumHalaman, idRak,idPenerbit)

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public int getJumHalaman() {
        return jumHalaman;
    }

    public void setJumHalaman(int jumHalaman) {
        this.jumHalaman = jumHalaman;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public String getIdRak() {
        return idRak;
    }

    public void setIdRak(String idRak) {
        this.idRak = idRak;
    }

    public String getIdPenerbit() {
        return idPenerbit;
    }

    public void setIdPenerbit(String idPenerbit) {
        this.idPenerbit = idPenerbit;
    }
    
    
}
