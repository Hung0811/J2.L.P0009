
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import sample.daos.CategoryDAO;
import sample.daos.ProductDAO;
import sample.dtos.CategoryDTO;
import sample.dtos.ProductDTO;
import sample.tablemodel.ProductTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class UI extends javax.swing.JFrame {
    CategoryDAO categoryDao;
    ProductDAO productDao;
    DefaultListModel modelList;
    ProductTableModel modelTable;
    /**
     * Creates new form UI
     */
    public UI() {
        initComponents();
        categoryDao=new CategoryDAO();
        productDao=new ProductDAO();
        modelList= new DefaultListModel();
        this.listCategory.setModel(modelList);
        loadCategory();
    }

    public void loadCategory(){
        try {
            List<CategoryDTO> list=categoryDao.getData();
            for(CategoryDTO category: list){
                modelList.addElement(category.getName());
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnSaveNew = new javax.swing.JButton();
        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listCategory = new javax.swing.JList();
        jPanel3 = new javax.swing.JPanel();
        btnAddCategory = new javax.swing.JButton();
        btnDeleteCategory = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCategory = new javax.swing.JTextField();
        txtProductID = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        txtProductName = new javax.swing.JTextField();
        txtProductPrice = new javax.swing.JTextField();
        btnNewProduct = new javax.swing.JButton();
        btnAddProduct = new javax.swing.JButton();
        btnUpdateProduct = new javax.swing.JButton();
        btnDeleteProduct = new javax.swing.JButton();

        jDialog1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jDialog1.setResizable(false);
        jDialog1.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                jDialog1WindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                jDialog1WindowClosing(evt);
            }
        });
        jDialog1.getContentPane().setLayout(null);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Category ID:");
        jDialog1.getContentPane().add(jLabel6);
        jLabel6.setBounds(63, 47, 80, 17);

        txtID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jDialog1.getContentPane().add(txtID);
        txtID.setBounds(155, 44, 232, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Category Name:");
        jDialog1.getContentPane().add(jLabel7);
        jLabel7.setBounds(42, 98, 101, 17);

        txtName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jDialog1.getContentPane().add(txtName);
        txtName.setBounds(155, 95, 232, 30);

        btnSaveNew.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSaveNew.setText("Save");
        btnSaveNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveNewActionPerformed(evt);
            }
        });
        jDialog1.getContentPane().add(btnSaveNew);
        btnSaveNew.setBounds(353, 148, 63, 25);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PROGRAM MANAGER PRODUCTS");

        listCategory.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Product Category", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        listCategory.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        listCategory.setToolTipText("");
        listCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listCategoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listCategory);

        btnAddCategory.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAddCategory.setText("New Category");
        btnAddCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCategoryActionPerformed(evt);
            }
        });
        jPanel3.add(btnAddCategory);

        btnDeleteCategory.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDeleteCategory.setText("Delete Category");
        btnDeleteCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCategoryActionPerformed(evt);
            }
        });
        jPanel3.add(btnDeleteCategory);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jSplitPane2.setLeftComponent(jPanel1);

        tblProduct.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblProduct);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Category");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Product ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Product name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Quantity");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Price");

        txtCategory.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCategory.setEnabled(false);

        txtProductID.setEditable(false);
        txtProductID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtQuantity.setEditable(false);
        txtQuantity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtProductName.setEditable(false);
        txtProductName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtProductPrice.setEditable(false);
        txtProductPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnNewProduct.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNewProduct.setText("New");
        btnNewProduct.setEnabled(false);
        btnNewProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewProductActionPerformed(evt);
            }
        });

        btnAddProduct.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAddProduct.setText("Add");
        btnAddProduct.setEnabled(false);
        btnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductActionPerformed(evt);
            }
        });

        btnUpdateProduct.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnUpdateProduct.setText("Update");
        btnUpdateProduct.setEnabled(false);
        btnUpdateProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateProductActionPerformed(evt);
            }
        });

        btnDeleteProduct.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDeleteProduct.setText("Delete");
        btnDeleteProduct.setEnabled(false);
        btnDeleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteProductActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCategory, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                            .addComponent(txtProductID)
                            .addComponent(txtProductName)
                            .addComponent(txtQuantity)
                            .addComponent(txtProductPrice)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addComponent(btnNewProduct)
                        .addGap(18, 18, 18)
                        .addComponent(btnAddProduct)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdateProduct)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteProduct)))
                .addContainerGap(96, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtProductID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(txtProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNewProduct)
                    .addComponent(btnAddProduct)
                    .addComponent(btnUpdateProduct)
                    .addComponent(btnDeleteProduct))
                .addContainerGap())
        );

        jSplitPane2.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductActionPerformed
        // TODO add your handling code here:
        String msg = null;
        try {
            String id=txtProductID.getText().trim();
            String name=txtProductName.getText().trim();
            int price=Integer.parseInt(txtProductPrice.getText().trim());
            int quantity=Integer.parseInt(txtQuantity.getText().trim());
            if(!id.equals("") && !name.equals("") && price>0 && quantity>=0){
                productDao.addNew(new ProductDTO(id, name, price, quantity), txtCategory.getText());
                modelTable.getData().add(new ProductDTO(id, name, price, quantity));
                this.tblProduct.updateUI();
                txtProductID.setEditable(false);
                msg="Add Sucessfully!";
            }
            else{
                msg="input is not valid";
            }
        } catch (Exception e) {
            msg="input is not valid";
        }finally{
            JOptionPane.showMessageDialog(this, msg);
            
        }
        
    }//GEN-LAST:event_btnAddProductActionPerformed

    private void btnAddCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCategoryActionPerformed
        // TODO add your handling code here:
        jDialog1.setVisible(true);
        this.jDialog1.setSize(480, 230);
    }//GEN-LAST:event_btnAddCategoryActionPerformed

    private void btnSaveNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveNewActionPerformed
        // TODO add your handling code here:
        String id=txtID.getText().trim();
        String name=txtName.getText().trim();
        if (!id.isEmpty() && !name.isEmpty()){
            if (categoryDao.addNew(new CategoryDTO(id, name))!=0){
                modelList.addElement(name);
                this.jDialog1.dispose();
            }
        }else{
            JOptionPane.showMessageDialog(this, "Input is not valid");
        }
    }//GEN-LAST:event_btnSaveNewActionPerformed

    private void jDialog1WindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jDialog1WindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_jDialog1WindowClosing

    private void btnDeleteCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCategoryActionPerformed
        // TODO add your handling code here:
        String name=(String)this.listCategory.getSelectedValue();
        if (name!=null){
            categoryDao.deleteCategory(name);
            modelList.removeElement(name);
        }
    }//GEN-LAST:event_btnDeleteCategoryActionPerformed

    private void jDialog1WindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jDialog1WindowClosed
        // TODO add your handling code here:
        txtID.setText("");
        txtName.setText("");
    }//GEN-LAST:event_jDialog1WindowClosed

    private void listCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listCategoryMouseClicked
        // TODO add your handling code here:
        String name=(String)listCategory.getSelectedValue();
        if(name!=null){
            String[] header={"Product ID", "Product Name", "Price", "Quantity"};
            modelTable=new ProductTableModel(header);
            this.tblProduct.setModel(modelTable);
            try {
                   String categoryID=categoryDao.findID(name);
                   List<ProductDTO> list=productDao.getData(categoryID);
                   for(ProductDTO product: list){
                   modelTable.getData().add(product);
                   txtCategory.setText(name);
                   }
            } catch (Exception e) {
                System.out.println(e);
            }        
            btnAddProduct.setEnabled(true);
            btnNewProduct.setEnabled(true);
            btnUpdateProduct.setEnabled(true);
            btnDeleteProduct.setEnabled(true);
        }
    }//GEN-LAST:event_listCategoryMouseClicked

    private void tblProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductMouseClicked
        // TODO add your handling code here:
        txtProductID.setEditable(false);
        txtProductName.setEditable(true);
        txtProductPrice.setEditable(true);
        txtQuantity.setEditable(true);
        int index=tblProduct.getSelectedRow();
        
        ProductDTO product=modelTable.getData().get(index);
        txtProductID.setText(product.getId());
        txtProductName.setText(product.getName());
        txtProductPrice.setText(""+product.getPrice());
        txtQuantity.setText(""+product.getQuantity());
    }//GEN-LAST:event_tblProductMouseClicked

    private void btnNewProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewProductActionPerformed
        // TODO add your handling code here:
        txtProductID.setEditable(true);
          txtProductName.setEditable(true);
        txtProductPrice.setEditable(true);
        txtQuantity.setEditable(true);
        txtProductID.setText("");
        txtProductName.setText("");
        txtProductPrice.setText("");
        txtQuantity.setText("");
    }//GEN-LAST:event_btnNewProductActionPerformed

    private void btnUpdateProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateProductActionPerformed
        // TODO add your handling code here:
        String msg=null;
        try {
            int index=tblProduct.getSelectedRow();
            String id=txtProductID.getText().trim();
            String name=txtProductName.getText().trim();
            int price=Integer.parseInt(txtProductPrice.getText().trim());
            int quantity=Integer.parseInt(txtQuantity.getText().trim());
            if(!name.equals("") && price>0 && quantity>=0){
            productDao.updateProduct(new ProductDTO(id, name, price, quantity));
            modelTable.getData().set(index, new ProductDTO(id, name, price, quantity));
            tblProduct.updateUI();
            msg="Update Successfully!";
            }else{
                msg="data is not valid!";      
            }
        } catch (Exception e) {
             msg="data is not valid!";           
        }finally{
            JOptionPane.showMessageDialog(this, msg);
        }
    }//GEN-LAST:event_btnUpdateProductActionPerformed

    private void btnDeleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteProductActionPerformed
        // TODO add your handling code here:
        try {
            int index=tblProduct.getSelectedRow();
            ProductDTO product=modelTable.getData().get(index);
            productDao.deleteProduct(product.getId());
            modelTable.getData().remove(index);
            tblProduct.updateUI();
            JOptionPane.showMessageDialog(this, "Delete Sucessfully!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Delete Fail!");
        }
      
        
            
        
    }//GEN-LAST:event_btnDeleteProductActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCategory;
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JButton btnDeleteCategory;
    private javax.swing.JButton btnDeleteProduct;
    private javax.swing.JButton btnNewProduct;
    private javax.swing.JButton btnSaveNew;
    private javax.swing.JButton btnUpdateProduct;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JList listCategory;
    private javax.swing.JTable tblProduct;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtProductID;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtProductPrice;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}


// them du lieu cho database
