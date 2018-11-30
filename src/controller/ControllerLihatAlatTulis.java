/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Alat_tulis;
import view.ViewBeranda;
import view.ViewHalamanPetugas;
import view.ViewLihatAlatTulis;

/**
 *
 * @author Rendy
 */
public class ControllerLihatAlatTulis {
    private ViewLihatAlatTulis view;
    private Alat_tulis model;

    ControllerBeranda cb = new ControllerBeranda(new ViewBeranda());
    
    public ControllerLihatAlatTulis(ViewLihatAlatTulis view) {
        this.view = view;
        
        this.view.setBackEvent(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                toHalamanPetugas();
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
    }
    
    public void ShowView(){
        this.view.setLocationRelativeTo(null);
        this.view.show();
    }
    
    public void toHalamanPetugas(){
        ControllerHalamanPetugas hp = new ControllerHalamanPetugas(new ViewHalamanPetugas());
        hp.ShowView();
        this.view.dispose();
    }
    
}
