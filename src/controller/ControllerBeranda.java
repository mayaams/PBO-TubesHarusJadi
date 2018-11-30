/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Buku;
import model.Petugas;
import view.ViewBeranda;
import view.ViewCari;
import view.ViewLogin;

/**
 *
 * @author Asus
 */
public class ControllerBeranda {
    ViewBeranda view;

    public ControllerBeranda(ViewBeranda view) {
        this.view = view;
        
        this.view.setBerandaEvent(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                toBeranda();
            }
        });
        this.view.setCariEvent(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toCari();
            }
        });
        this.view.setLoginEvent(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                toLogin();
            }
        });
        }
    
    public void toBeranda(){
        ControllerBeranda cb = new ControllerBeranda(new ViewBeranda());
        cb.showView();
        this.view.dispose();
    }
    public void toCari(){
        ControllerCari cc = new ControllerCari(new ViewCari());
        cc.showView();
        this.view.dispose();
        
    }
    public void toLogin(){
        ControllerLogin cl = new ControllerLogin(new ViewLogin());
        cl.ShowView();
        this.view.dispose();
    }
    
    public void showView(){
        this.view.setLocationRelativeTo(null);
        this.view.show();
    }
    
}
