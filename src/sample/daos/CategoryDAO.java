/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.daos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sample.dtos.CategoryDTO;
import sample.utils.Utils;

/**
 *
 * @author Admin
 */
public class CategoryDAO {
    Utils utils;

    public CategoryDAO() {
        utils=new Utils();
    }
    
    public List<CategoryDTO> getData() throws SQLException{
        List<CategoryDTO> list=new ArrayList<>();
        String sql="SELECT CategoryID, CategoryName FROM Category";
        ResultSet rs=utils.executeQuery(sql);
        while(rs.next()){
            String id=rs.getString("CategoryID");
            String name=rs.getString("CategoryName");
            list.add(new CategoryDTO(id, name));
        }
        return list;
    }
    
    public int addNew(CategoryDTO category){
        String sql="INSERT INTO Category VALUES('"+category.getId()+"','"+category.getName()+"')";
        return utils.exexuteUpdate(sql);
    }
    
    public void deleteCategory(String name){
        String sql="DELETE FROM Category WHERE CategoryName='"+name+"'";
        utils.exexuteUpdate(sql);
    }
    
    public String findID(String name) throws SQLException{
        String sql="SELECT CategoryID FROM Category WHERE CategoryName='"+name+"'";
        ResultSet rs= utils.executeQuery(sql);
        if(rs.next()){
            return rs.getString("CategoryID");
        }
        return null;
    }
}
