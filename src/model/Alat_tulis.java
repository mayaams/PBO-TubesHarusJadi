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
public class Alat_tulis extends Barang{
    private String detail;
    
    public Alat_tulis(String id, String nama, int stok, int harga,String idGudang, String detail) {
        super(id, nama, stok, harga,idGudang);
        this.detail = detail;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }


    
}
