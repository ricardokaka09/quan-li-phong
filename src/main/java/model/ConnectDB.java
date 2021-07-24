/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author itsof
 */
public class ConnectDB {
    private static final String hostName= "localhost";
    private static final String userName="root";
    private static final String passWord = "";
    private static final String dbName="javaBasic";
    private static final String dbURL="jdbc:mysql://"+hostName+"/"+dbName;
    public static Connection getConnection () {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection conn = DriverManager.getConnection(dbURL, userName, passWord);
            System.out.println("Kết nối db thành công");
            
            return conn;
        } catch (Exception e) {
            System.out.println("Lỗi kết nối"+ e.getMessage());
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args){
        Connection conn = ConnectDB.getConnection();
        String sql = "select * from phong";
        
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            
            while (rs.next()) {   
                int id = rs.getInt("id");
                int maPhong = rs.getInt("so");
                String loai = rs.getString("loai");
                String moTa = rs.getString("description");
                
                System.out.println("Ma Phong:" + maPhong + "\n" + "loai: "+loai + "\t" + moTa);
                
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
        }
    
}
