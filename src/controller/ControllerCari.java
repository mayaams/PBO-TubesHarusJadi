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
//import view.login;
import view.ViewBeranda;
import view.ViewCariAlatTulis1;
import view.ViewCariAlatTulis2;
import view.ViewCariAlatTulis3;
import view.ViewCariBuku1;
import view.ViewCariBuku2;
import view.ViewCariBuku3;

public class ControllerCari {
    ViewCari view;
    ControllerBeranda cb = new ControllerBeranda(new ViewBeranda());
    
    public ControllerCari(ViewCari view) {
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
                toCariBuku1();
            }
        });
        
        this.view.setAlatTulisEvent(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                toCariAlatTulis1();
            }
        });
        
    }
    

    public void toCariBuku1(){
        ControllerCariBuku1 cb1 = new ControllerCariBuku1(new ViewCariBuku1());
        cb1.showView();
    }
    
    public void toCariBuku2(){
        ControllerCariBuku2 cb2 = new ControllerCariBuku2(new ViewCariBuku2());
        cb2.showView();
    }
    
    public void toCariBuku3(){
       ControllerCariBuku3 cb3 = new ControllerCariBuku3(new ViewCariBuku3());
       cb3.showView();    
    }
    
    public void toCariAlatTulis1(){
       ControllerCariAlatTulis1 ca1 = new ControllerCariAlatTulis1(new ViewCariAlatTulis1());
       ca1.showView();        
    }
    
    public void toCariAlatTulis2(){
       ControllerCariAlatTulis2 ca2 = new ControllerCariAlatTulis2(new ViewCariAlatTulis2());
       ca2.showView();
    }
    
    public void toCariAlatTulis3(){
       ControllerCariAlatTulis3 ca3 = new ControllerCariAlatTulis3(new ViewCariAlatTulis3());
       ca3.showView();
    }
    
    public void showView(){
        this.view.setLocationRelativeTo(null);
        this.view.show();
    }
}
