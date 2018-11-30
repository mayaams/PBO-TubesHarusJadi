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

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import view.ViewCari;
import view.ViewCariAlatTulis1;
import view.ViewCariBuku1;
import controller.ControllerBeranda;
//import view.login;
import view.ViewBeranda;

public class ControllerCariBuku1 {
    ViewCariBuku1 view;
    
    ControllerBeranda cb = new ControllerBeranda(new ViewBeranda());
    ControllerCari cc = new ControllerCari(new ViewCari());
    
    public ControllerCariBuku1(ViewCariBuku1 view) {
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
        
        this.view.setALatTulisEvent(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                cc.toCariAlatTulis1();
            }
        });
        
        this.view.setCariDataEvent(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                cc.toCariBuku2();
            }       
        });
    }
    
    public void showView(){
        this.view.setLocationRelativeTo(null);
        this.view.show();
    }
}
