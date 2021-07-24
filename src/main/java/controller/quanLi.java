/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

//import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ConnectDB;
import model.Phong;

/**
 *
 * @author itsof
 */
public class quanLi {

  public static List<Phong> findAll() {
        List<Phong> phongList = new ArrayList<>();
        
        Connection connection = null;
        Statement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = ConnectDB.getConnection();
            
            //query
            String sql = "select * from phong";
            statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {                
                Phong ph = new Phong(resultSet.getInt("id"), 
                        resultSet.getString("ten"), resultSet.getString("loai"), 
                        resultSet.getString("gia"), resultSet.getString("trangThai"));
                phongList.add(ph);
            }
        } catch (SQLException ex) {
            Logger.getLogger(quanLi.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        //ket thuc.
        
        return phongList;
    }
    
   
    public static void insert(Phong ph) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
           connection = ConnectDB.getConnection();
            
            //query
            String sql = "insert into phong(fullname, gender, age, email, phone_number) values(?, ?, ?, ?, ?)";
            statement = connection.prepareCall(sql);
            
            statement.setString(1, ph.getTen());
            statement.setString(2, ph.getLoai());
//            statement.setInt(3, ph.g());
            statement.setString(3, ph.getTrangThai());
            statement.setString(4, ph.getGia());
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(quanLi.class.getName()).log(Level.SEVERE, null, ex);
        }
        //ket thuc.
        //ket thuc.
    }
    
    public static void update(Phong ph) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = ConnectDB.getConnection();
            
            //query
            String sql = "update student set fullname=?,gender=?,age=?,email=?,phone_number=? where id = ?";
            statement = connection.prepareCall(sql);
            
            
            
            statement.setString(1, ph.getTen());
            statement.setString(2, ph.getLoai());
//            statement.setInt(3, ph.g());
            statement.setString(3, ph.getTrangThai());
            statement.setString(4, ph.getGia());
            statement.setInt(5, ph.getId());
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(quanLi.class.getName()).log(Level.SEVERE, null, ex);
        } 
        //ket thuc. 
        //ket thuc.
    }
    
    public static void delete(int id) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        
        try {
            //lay tat ca danh sach sinh vien
            connection = ConnectDB.getConnection();            
            //query
            String sql = "delete from student where id = ?";
            statement = connection.prepareCall(sql);
            
            statement.setInt(1, id);
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(quanLi.class.getName()).log(Level.SEVERE, null, ex);
        } 
        //ket thuc. 
        //ket thuc.
    }
       public static String findByFullname(String tenPhong) {
//        List<Student> studentList = new ArrayList<>();
        
        Connection connection = null;
        PreparedStatement statement = null;
        String tt = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = ConnectDB.getConnection();
            
            //query
            String sql = "select * from phong where ten like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%"+tenPhong+"%");
            
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) {
                tt = resultSet.getString("trangThai");
//                System.out.println(tt);
//                Student std = new Student(resultSet.getInt("id"), 
//                        resultSet.getString("fullname"), resultSet.getString("gender"), 
//                        resultSet.getString("email"), resultSet.getString("phone_number"), 
//                        resultSet.getInt("age"));
//                studentList.add(std);
            }
        } catch (SQLException ex) {
            Logger.getLogger(quanLi.class.getName()).log(Level.SEVERE, null, ex);
        } 
        //ket thuc. 
        //ket thuc.
        
        return tt;
    }
    
//    public static List<Student> findByFullname(String fullname) {
//        List<Student> studentList = new ArrayList<>();
//        
//        Connection connection = null;
//        PreparedStatement statement = null;
//        
//        try {
//            //lay tat ca danh sach sinh vien
//            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management", "root", "");
//            
//            //query
//            String sql = "select * from student where fullname like ?";
//            statement = connection.prepareCall(sql);
//            statement.setString(1, "%"+fullname+"%");
//            
//            ResultSet resultSet = statement.executeQuery();
//            
//            while (resultSet.next()) {                
//                Student std = new Student(resultSet.getInt("id"), 
//                        resultSet.getString("fullname"), resultSet.getString("gender"), 
//                        resultSet.getString("email"), resultSet.getString("phone_number"), 
//                        resultSet.getInt("age"));
//                studentList.add(std);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            if(statement != null) {
//                try {
//                    statement.close();
//                } catch (SQLException ex) {
//                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//            
//            if (connection != null) {
//                try {
//                    connection.close();
//                } catch (SQLException ex) {
//                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        }
//        //ket thuc.
//        
//        return studentList;
//    }
}
    

