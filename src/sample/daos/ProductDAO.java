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
import sample.dtos.ProductDTO;
import sample.utils.Utils;

/**
 *
 * @author Admin
 */
public class ProductDAO {
    Utils utils;

    public ProductDAO() {
        utils=new Utils();
    }
    
    public List<ProductDTO> getData(String categoryID) throws SQLException{
            List<ProductDTO> list=new ArrayList<>();
        String sql="SELECT ProductID, ProductName, Price, Quantity FROM Products WHERE CategoryID='"+categoryID+"'";
        ResultSet rs=utils.executeQuery(sql);
        while(rs.next()){
            String id=rs.getString("ProductID");
            String name=rs.getString("ProductName");
            int price=rs.getInt("Price");
            int quantity=rs.getInt("Quantity");
            list.add(new ProductDTO(id, name, price, quantity));
        }
        return list;
    }
    
    public void addNew(ProductDTO product, String categoryName) throws SQLException{
        CategoryDAO dao=new CategoryDAO();
        String categoryID=dao.findID(categoryName);
        String sql="INSERT INTO Products VALUES('"+product.getId()+"','"+product.getName()+"',"+product.getPrice()+","+product.getQuantity()+",'"+categoryID+"')";
        utils.exexuteUpdate(sql);
    }
    
    public void updateProduct(ProductDTO product){
        String sql="UPDATE Products SET ProductName='"+product.getName()+"', Price="+product.getPrice()+", Quantity="+product.getQuantity()+" WHERE ProductID='"+product.getId()+"'";
        utils.exexuteUpdate(sql);
    }
    
    public void deleteProduct(String id){
        String sql="DELETE FROM Products WHERE ProductID='"+id+"'";
        utils.exexuteUpdate(sql);
    }
}
