/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wiranto.latihanmvcjdbc.main;

import edu.wiranto.latihanmvcjdbc.database.BarbershopDatabase;
import edu.wiranto.latihanmvcjdbc.entity.Pelanggan;
import edu.wiranto.latihanmvcjdbc.error.PelangganException;
import edu.wiranto.latihanmvcjdbc.service.PelangganDao;
import edu.wiranto.latihanmvcjdbc.view.MainViewPelanggan;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *
 * @author ACER
 */
public class LatihanMVCJDBC {
    
    SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException ex) {
                } catch (PelangganException ex) {
                }

            }
        });


        /*
        //BarbershopDatabase.getConnection();
        Pelanggan pelanggan = new Pelanggan();
        pelanggan.setNama("Rosalina Dewi");
        pelanggan.setAlamat("Jalan Seketimbang");
        pelanggan.setTelepon("08288929397");
        pelanggan.setEmail("rossa@gmail.com");
        dao.insertPelanggan(pelanggan);
         */
 /*
         Pelanggan pelanggan = dao.getPelanggan(1);
         System.out.println("NAMA : "+pelanggan.getNama());
         */
 /*
        Pelanggan pelanggan = dao.getPelanggan("rizkiadam01@gmail.com");
        System.out.println("NAMA : " + pelanggan.getNama());
         */
 /*
        PelangganDao dao = BarbershopDatabase.getPelangganDao();
        dao.deletePelanggan(1);
         */
 /*Pelanggan pelanggan = dao.getPelanggan(1);
        pelanggan.setNama("Hulk");
        pelanggan.setAlamat("Jalan Industri");
        dao.updatePelanggan(pelanggan);
         */

 /*
         List<Pelanggan> list = dao.selectAllPelanggan();
         for (Pelanggan pelanggan : list) {
             System.out.println("NAMA : "+pelanggan.getNama());
             System.out.println("ALAMAT : "+pelanggan.getAlamat());
             System.out.println("TELEPON : "+pelanggan.getTelepon());
             System.out.println("EMAIL : "+pelanggan.getEmail());
            
        }*/
    }

}
