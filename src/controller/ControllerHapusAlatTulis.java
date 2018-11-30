/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.ControllerHapusBuku;
import controller.ControllerLihatAlatTulis;
import controller.ControllerLihatBuku;
import controller.ControllerTambahAlatTulis;
import controller.ControllerTambahBuku;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class ControllerHapusAlatTulis {
    private ViewHapusAlatTulis view;
    private Alat_tulis model;

    ControllerBeranda cb = new ControllerBeranda(new ViewBeranda());
    public ControllerHapusAlatTulis(ViewHapusAlatTulis view) {
        this.view = view;
        
        this.view.setAddBukuEvent(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                toAddBuku();
            }
        });
        
        this.view.setAddATEvent(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               toAddAT();
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
        this.view.setCariMEvent(new ActionListener() {
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
    
    public void toAddAT(){
        ControllerTambahAlatTulis tat = new ControllerTambahAlatTulis(new ViewTambahAlatTulis());
        tat.ShowView();
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
}
