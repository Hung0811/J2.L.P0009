/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Utils {
    Connection conn;
    Statement stm;
    
    public Utils(){
        getConnect();
    }

      public void getConnect(){
          try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=J2.L.P0009";
            conn=DriverManager.getConnection(url,"sa","nghung08112000");
            stm=conn.createStatement();
          } catch (Exception e) {
              System.out.println(e);
          }
    
    }
      
    public ResultSet executeQuery(String executeSql){
        if (conn!=null){
            try {
                return stm.executeQuery(executeSql);
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
            }
        }
        return null;
    }
    
    public int exexuteUpdate(String updateSql){
        if(conn!=null){
            try {
                return stm.executeUpdate(updateSql);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        return 0;
    }
}
