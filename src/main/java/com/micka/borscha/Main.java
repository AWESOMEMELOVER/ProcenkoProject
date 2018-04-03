package com.micka.borscha;

import com.micka.borscha.DAO.DaoFactory;
import com.micka.borscha.DAO.GenericDao;
import com.micka.borscha.DAO.PersistException;
import com.micka.borscha.Entities.*;
import com.micka.borscha.Services.ProductService;
import com.micka.borscha.Services.VendorService;
import com.micka.borscha.UI.LoginUI;
import com.micka.borscha.UI.ProductTable;
import com.micka.borscha.UI.ProductToDelivery;
import com.micka.borscha.Utils.DbUtils;
import com.micka.borscha.mysql.MySqlDaoFactory;
import com.micka.borscha.mysql.MySqlVendorDao;

import javax.swing.*;
import java.sql.Connection;
import java.util.Date;
import java.util.List;


public class Main  {


  public   static Employee employee;

    public static void main(String[] args) {

       System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {




             try {
                    new LoginUI();

                }catch (Exception e){
                    e.printStackTrace();
                }


            }
        });


    }



}
