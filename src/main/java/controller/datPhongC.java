/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.ConnectDB;
import model.datPhong;
import edu.hung.javabasic.ui;

/**
 *
 * @author itsof
 */
public class datPhongC {
    public static void Insert(datPhong dp){
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
           connection = ConnectDB.getConnection();
            
            //query
            String sql = "insert into datPhong(tenKH, sdtKH, tenPhong, date) values(?, ?, ?, ?)";
            statement = connection.prepareCall(sql);
            
            statement.setString(1, dp.getTenKH());
            statement.setString(2, dp.getSdtKH());
//            statement.setInt(3, ph.g());
            statement.setString(3, dp.getTenPhong());
            statement.setLong(4, dp.getTimestamp());
            
            statement.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(quanLi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
