/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Asus
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Buku;
import model.Petugas;
import view.ViewBeranda;
import view.ViewCari;
import view.ViewCariBuku2;
//import view.login;

public class ControllerCariBuku2 {    
    
   ViewCariBuku2 view;
    
    ControllerBeranda cb = new ControllerBeranda(new ViewBeranda());
    ControllerCari cc = new ControllerCari(new ViewCari());
    
    public ControllerCariBuku2(ViewCariBuku2 view) {
        this.view = view;
                
        this.view.setBerandaEvent(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                cb.toBeranda();
            }
            
        });
        
        this.view.setCariEvent(new ActionListener(){
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
        this.view.setBukuEvent(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cc.toCariBuku1();
            }
        });
        
        this.view.setAlatTulisEvent(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                cc.toCariAlatTulis1();
            }
        });
        
        this.view.setCariDataEvent(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                cc.toCariBuku3();
            }
            
        });
    }
    
    public void showView(){
        this.view.setLocationRelativeTo(null);
        this.view.show();
    }
}
