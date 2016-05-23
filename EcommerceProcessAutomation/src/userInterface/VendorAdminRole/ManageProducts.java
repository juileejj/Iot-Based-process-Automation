/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.VendorAdminRole;

import business.Enterprise.VendorStoreEnterprise;
import business.Network.Network;
import business.Organization.Organization;
import business.Product.Product;
import com.onbarcode.barcode.Code39;
import com.onbarcode.barcode.IBarcode;
import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Juilee
 */
public class ManageProducts extends javax.swing.JPanel {
private JPanel userProcessContainer;
private VendorStoreEnterprise enterprise;
    /**
     * Creates new form ManageProducts
     */
    public ManageProducts(JPanel userProcessContainer,VendorStoreEnterprise enterprise) {
        initComponents();
        this.userProcessContainer= userProcessContainer;
        this.enterprise= enterprise;
        populate();
         updatePanel.setVisible(false);
    }
    public void populate()
    {
          DefaultTableModel model = (DefaultTableModel) ProductJTable.getModel();
        model.setRowCount(0);
        for (Product p:enterprise.getProductCatalog().getProductList()) {
            if (p != null) {
                Object[] row = new Object[4];
                row[0] = p;
                row[1]=p.getProductType();
                row[2]=p.getPrice();
                row[3]=p.getAvailability();
                model.addRow(row);
            }
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

        btnDeleteLocation = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnAddProduct = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        updatePanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtAvail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        typeCombo = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        txtProdName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        submitJButton = new javax.swing.JButton();
        btnCancelPanel = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        btnDeleteLocation.setText("Delete Location");
        btnDeleteLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteLocationActionPerformed(evt);
            }
        });

        ProductJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Type", "Price", "Availability"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ProductJTable);

        jLabel1.setText("Manage Product Catalog");

        btnAddProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cart-icon_small.png"))); // NOI18N
        btnAddProduct.setText("Add Product");
        btnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductActionPerformed(evt);
            }
        });

        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back_icon.gif"))); // NOI18N
        backJButton.setText(" Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Availability");

        jLabel5.setText("Type");

        typeCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select", "Apparel", "Automotive", "Baby", "Beauty", "Books", "Cell Phones and Accessories", "Electronics", "Gourmet", "Grocery", "Health and Personal Care", "Home and Garden", "Home Improvement", "Industrial and Scientific", "Jewelry", "Magazines and Newspapers", "Music ", "Musical Instruments", "Office Products", "Pet Supplies", "Shoes", "Software", "Sporting Goods", "Toys and Games", "Video/DVD", "Video Games", "Watches", " " }));

        jLabel2.setText("Name");

        jLabel3.setText("Price");

        submitJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/checkok.png"))); // NOI18N
        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        btnCancelPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Action-cancel-icon.png"))); // NOI18N
        btnCancelPanel.setText("Cancel");
        btnCancelPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelPanelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout updatePanelLayout = new javax.swing.GroupLayout(updatePanel);
        updatePanel.setLayout(updatePanelLayout);
        updatePanelLayout.setHorizontalGroup(
            updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatePanelLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updatePanelLayout.createSequentialGroup()
                        .addComponent(submitJButton)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelPanel))
                    .addGroup(updatePanelLayout.createSequentialGroup()
                        .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(31, 31, 31)
                        .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtProdName)
                            .addComponent(txtPrice)
                            .addComponent(txtAvail)
                            .addComponent(typeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(68, 68, 68))
        );
        updatePanelLayout.setVerticalGroup(
            updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtProdName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtAvail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(typeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitJButton)
                    .addComponent(btnCancelPanel))
                .addContainerGap())
        );

        btnDelete.setText("Delete Product");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update Product");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAddProduct)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelete))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(updatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backJButton)
                .addGap(18, 18, 18)
                .addComponent(updatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductActionPerformed
         AddProductJPanel panel = new AddProductJPanel(userProcessContainer,enterprise);
        userProcessContainer.add("AddProductJPanel",panel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);  // TODO add your handling code here:
    }//GEN-LAST:event_btnAddProductActionPerformed

    private void btnDeleteLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteLocationActionPerformed
            // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteLocationActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRow= ProductJTable.getSelectedRow();
        if(selectedRow>=0)
        {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult= JOptionPane.showConfirmDialog(null,"Would you like to delete this product?","Warning",dialogButton);
            if(dialogResult==JOptionPane.YES_OPTION)
            {
                Product product= (Product)ProductJTable.getValueAt(selectedRow,0);
                enterprise.getProductCatalog().removeProduct(product);
                populate();
                //resetField()
            }
        }else
        {
            JOptionPane.showMessageDialog(null,"Please select a row first");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed
public Code39 barcodeDisplay(String str) {
        Code39 barcode = new Code39();
        barcode.setData(str);
        barcode.setExtension(false);
        barcode.setAddCheckSum(true);
        barcode.setN(3.0f);
        barcode.setI(1.0f);
        barcode.setShowStartStopInText(true);
        barcode.setUom(IBarcode.UOM_PIXEL);
        barcode.setX(1f);
        barcode.setY(75f);
        barcode.setLeftMargin(0f);
        barcode.setRightMargin(0f);
        barcode.setTopMargin(0f);
        barcode.setBottomMargin(0f);
        barcode.setResolution(72);
        barcode.setShowText(true);
        barcode.setTextFont(new Font("Arial", 0, 12));
        barcode.setTextMargin(6);
        return barcode;
    }
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
       updatePanel.setVisible(true); 
int selectedRow=ProductJTable.getSelectedRow();
if(selectedRow<0)
{
    JOptionPane.showMessageDialog(null,"Please select a row first");
}
else
{
    Product p=(Product)ProductJTable.getValueAt(selectedRow,0);
    txtProdName.setText(p.getProdName());
    txtPrice.setText(String.valueOf(p.getPrice()));
    txtAvail.setText(String.valueOf(p.getAvailability()));
    typeCombo.setSelectedItem(p.getProductType());    
}


// TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        try {
int selectedRow=ProductJTable.getSelectedRow();
if(selectedRow<0)
{
    JOptionPane.showMessageDialog(null,"Please select a row first");
}
else
{
    Product p=(Product)ProductJTable.getValueAt(selectedRow,0);
            if (!typeCombo.getSelectedItem().toString().equalsIgnoreCase("--Select")) { 
                p.setProdName(txtProdName.getText().trim());
                p.setAvailability(Integer.parseInt(txtAvail.getText().trim()));
                p.setPrice(Float.parseFloat(txtPrice.getText().trim()));
                p.setProductType(typeCombo.getSelectedItem().toString());
                Code39 barcode = barcodeDisplay(p.getBarcode());
                barcode.setRotate(IBarcode.ROTATE_0);
                ImageIcon img = new ImageIcon(barcode.drawBarcode());
                //                   Label barcodeLabel= new Label(img);
                //                   jLabel1.setIcon(img);
                JOptionPane.showMessageDialog(this, "Please approve product- " + p.getProdName(), "RFID Scanner", JOptionPane.WARNING_MESSAGE);
                int dialogResult = JOptionPane.showConfirmDialog(this, img, "Scan Barcode", JOptionPane.YES_NO_OPTION);

                if (dialogResult == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(this, "Product- " + p.getProdName()+ "updated successfully","Success Message", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(this, "Attempt unsuccessful", "Error Message", JOptionPane.ERROR_MESSAGE);

                }
            } else {
                JOptionPane.showMessageDialog(this, "Please select a product type", "Error Message", JOptionPane.ERROR_MESSAGE);
            }
}
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Attempt unsuccessful", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void btnCancelPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelPanelActionPerformed
      updatePanel.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelPanelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ProductJTable;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JButton btnCancelPanel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDeleteLocation;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField txtAvail;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProdName;
    private javax.swing.JComboBox typeCombo;
    private javax.swing.JPanel updatePanel;
    // End of variables declaration//GEN-END:variables
}