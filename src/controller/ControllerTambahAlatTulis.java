/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.ControllerTambahBuku;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Alat_tulis;
import view.ViewBeranda;
import view.ViewEditAlatTulis;
import view.ViewEditBuku;
import view.ViewHapusAlatTulis;
import view.ViewHapusBuku;
import view.ViewLihatAlatTulis;
import view.ViewLihatBarang;
import view.ViewLihatBuku;
import view.ViewTambahAlatTulis;
import view.ViewTambahBuku;

/**
 *
 * @author Rendy
 */
public class ControllerTambahAlatTulis {
    private ViewTambahAlatTulis view;
    private Alat_tulis model;
    private Database db = new Database();
     
    ControllerBeranda cb = new ControllerBeranda(new ViewBeranda());
    
    public ControllerTambahAlatTulis(ViewTambahAlatTulis view) {
        this.view = view;
        
        this.view.setAddBukuEvent(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                toAddBuku();
            }
        });
               
        this.view.setEditBukuEvent(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                toEditBuku();
            }
        });
        
        this.view.setEditATEvent(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                toEditAT();
            }
        });
        
        this.view.setDeleteBukuEvent(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                toDeleteBuku();
            }
        });
        
        this.view.setDeleteATEvent(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                toDeleteAT();
            }
        });
        
         this.view.setShowBukuEvent(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                toShowBuku();
            }
        });
        
        this.view.setShowATEvent(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                toShowAT();
            }
        });
        
        this.view.setShowAllEvent(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                toShowAll();
            }
        });
        this.view.setBerandaEvent(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                cb.toBeranda();
            }
        });
        this.view.setCariEvent(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cb.toCari();
            }
        });
        this.view.setLoginEvent(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                cb.toLogin();
            }
        });
        
        this.view.setTambahEvent(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btnTambahActionPerformed();
                db.loadAlatTulis();
            }
        });
    }
    
    public void ShowView(){
        this.view.setLocationRelativeTo(null);
        this.view.show();
    }
    
    public void toAddBuku(){
        ControllerTambahBuku tb = new ControllerTambahBuku(new ViewTambahBuku());
        tb.ShowView();
        this.view.dispose();
    }
    
    
    public void toEditBuku(){
        ControllerEditBuku eb = new ControllerEditBuku(new ViewEditBuku());
        eb.ShowView();
        this.view.dispose();
    }
    
    public void toEditAT(){
        ControllerEditAlatTulis eat = new ControllerEditAlatTulis(new ViewEditAlatTulis());
        eat.ShowView();
        this.view.dispose();
    }
    
    public void toDeleteBuku(){
        ControllerHapusBuku hb = new ControllerHapusBuku(new ViewHapusBuku());
        hb.ShowView();
        this.view.dispose();
    }
    
    public void toDeleteAT(){
        ControllerHapusAlatTulis hat = new ControllerHapusAlatTulis(new ViewHapusAlatTulis());
        hat.ShowView();
        this.view.dispose();
    }
     public void toShowBuku(){
        ControllerLihatBuku lb = new ControllerLihatBuku(new ViewLihatBuku());
        lb.ShowView();
        this.view.dispose();
    }
    
    public void toShowAT(){
        ControllerLihatAlatTulis lat = new ControllerLihatAlatTulis(new ViewLihatAlatTulis());
        lat.ShowView();
        this.view.dispose();
    }
    
    public void toShowAll(){
        ControllerLihatBarang bar = new ControllerLihatBarang(new ViewLihatBarang());
        bar.ShowView();
        this.view.dispose();
    }
    
    public void btnTambahActionPerformed(){
        db = new Database();
        System.out.println("cekkk");
        String nama = view.getTfNamaBarang();
        String idBarang = view.getTfIdBarang();
        int harga = view.getTfHarga();
        int stok = view.getTfStok();
        String detail = view.getTfDetail();
        String idGudang = view.getTfIdGudang();
        String idRak = view.getTfIdRak();
        if (nama.isEmpty() || idBarang.isEmpty() || harga == 0 ||
        stok == 0 || detail.isEmpty() || idGudang.isEmpty() ||
        idRak.isEmpty()){
            view.showMessage("Tidak ada data", "Error", 0);
        }else{
            if (db.cekDuplikatIdBarang(idBarang)){
                view.showMessage("Barang sudah ada", "Error", 0);
           }else{
        System.out.println("cek2");
                db.addAlatTulis(new Alat_tulis(idBarang, nama, stok, harga, idGudang,idRak,detail));
                System.out.println("cek3");
                view.reset();
                view.showMessage("Data berhasil ditambahkan", "Success", 1);
           }        }
    }
}
