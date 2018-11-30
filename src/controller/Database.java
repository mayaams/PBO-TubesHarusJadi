/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Alat_tulis;
import model.Barang;
import model.Buku;
import model.Gudang;
import model.Penerbit;
import model.Pengarang;
import model.Petugas;
import model.Rak;

/**
 *
 * @author Dell
 */
public class Database {
    private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    private ArrayList<Penerbit> penerbit = new ArrayList<>();
    private ArrayList<Alat_tulis> alat_tulis = new ArrayList<>();
    private ArrayList<Barang> barang = new ArrayList<>();
    private ArrayList<Buku> buku = new ArrayList<>();
    private ArrayList<Gudang> gudang = new ArrayList<>();
    private ArrayList<Pengarang> pengarang = new ArrayList<>();
    private ArrayList<Petugas> petugas = new ArrayList<>();
    private ArrayList<Rak> rak = new ArrayList<>();
    
    public Database() {
        
    }
    
    public void connect(){
        try {
            String url = "jdbc:mysql://localhost/db_toko_buku";
            String user = "root";
            String pass = "";
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void disconnect(){
        try {
            conn.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean manipulate(String query){
        boolean cek = false;
        try {
            int rows = stmt.executeUpdate(query);
            if (rows > 0) cek = true;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cek;
    }

    public ArrayList<Penerbit> getPenerbit() {
        return penerbit;
    }
    
    public void loadPenerbit() {
        connect();
        try {
            String query = "SELECT * FROM t_penerbit";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                penerbit.add(new Penerbit(rs.getString("id_penerbit"), rs.getString("nama_penerbit"), rs.getString("alamat"), rs.getString("no_hp")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }

    public ArrayList<Alat_tulis> getAlat_tulis() {
        return alat_tulis;
    }
    
    public void loadAlatTulis() {
        connect();
        try {
            String query = "SELECT * FROM t_alat_tulis NATURAL JOIN t_barang";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                alat_tulis.add(new Alat_tulis(rs.getString("id_barang"),rs.getString("nama_barang"),rs.getInt("stok"),rs.getInt("harga"),rs.getString("id_gudang"), rs.getString("detail")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }

    public ArrayList<Barang> getBarang() {
        return barang;
    }
    
     public void loadBarang() {
        connect();
        try {
            String query = "SELECT * FROM t_barang";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                barang.add(new Barang(rs.getString("id_barang"), rs.getString("nama_barang"),rs.getInt("stok"),rs.getInt("harga"),rs.getString("id_gudang")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }

    public ArrayList<Buku> getBuku() {
        return buku;
    }
    
    public void loadBuku() {
        connect();
        try {
            String query = "SELECT * FROM t_buku NATURAL JOIN t_barang";
            rs = stmt.executeQuery(query);
            while (rs.next()){
              buku.add(new Buku(rs.getString("id_barang"),rs.getString("nama_barang"),rs.getInt("stok"),rs.getInt("harga"),rs.getString("id_gudang"),rs.getString("kategori"),rs.getString("ukuran"),rs.getInt("jum_halaman"),rs.getString("id_rak"),rs.getString("id_penerbit")));
 //                 buku.add(new Buku(rs.getString("id_barang"),rs.getString(query)))
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }
    
    public void addBuku(Buku buku) {
        connect();
        String query = "INSERT INTO buku VALUES (";
        query += "'" + buku.getIdBarang() + "',";
        query += "'" + buku.getKategori() + "',";
        query += "'" + buku.getUkuran() + "',";
        query += "'" + buku.getJumHalaman()+ "'";
        query += "'" + buku.getIdRak()+ "'";
        query += "'" + buku.getIdPenerbit()+ "'";
        query += ")";
        if (manipulate(query)) this.buku.add(buku);
        disconnect();
    }
    
    
   
    

    public ArrayList<Gudang> getGudang() {
        return gudang;
    }
    
    
    public void loadGudang() {
        connect();
        try {
            String query = "SELECT * FROM t_gudang";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                gudang.add(new Gudang(rs.getString("id_gudang"), rs.getString("nama_gudang"),rs.getString("alamat"),rs.getFloat("luas")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }

    public ArrayList<Pengarang> getPengarang() {
        return pengarang;
    }
    
    public void loadPengarang() {
        connect();
        try {
            String query = "SELECT * FROM t_pengarang NATURAL JOIN t_penerbit";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                pengarang.add(new Pengarang(rs.getString("id_pengarang"), rs.getString("nama_pengarang"),rs.getString("alamat"),rs.getString("no_hp"),rs.getString("id_penerbit")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }

    public ArrayList<Petugas> getPetugas() {
        return petugas;
    }

    public void loadPetugas() {
        connect();
        try {
            String query = "SELECT * FROM t_petugas NATURAL JOIN t_gudang";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                petugas.add(new Petugas(rs.getString("id_petugas"), rs.getString("nama_petugas"),rs.getString("username"),rs.getString("password"),rs.getString("alamat"),rs.getString("no_hp"),rs.getString("id_gudang")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }
    
    public ArrayList<Rak> getRak() {
        return rak;
    }
    
    public void loadRak() {
        connect();
        try {
            String query = "SELECT * FROM t_rak";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                rak.add(new Rak(rs.getString("id_rak"), rs.getString("nama_rak"),rs.getString("kategori"),rs.getString("tingkat_rak")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }
    
    
    
    
    
}
