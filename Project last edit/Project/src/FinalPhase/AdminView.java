/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalPhase;

import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Omar Alomory
 */
public class AdminView extends javax.swing.JFrame {

    private ArrayList<String> foodMenu;
    private ArrayList<Double> foodPrice;
    private String userName;
    private Login log;

    public void add(String foodName, double foodPrice, int index) {
        if (index == -1) {
            this.foodMenu.add(foodName);
            this.foodPrice.add(foodPrice);
        } else {
            this.foodMenu.add(index, foodName);
            this.foodPrice.add(index, foodPrice);
        }

    }

    public void delete(int index) {
        this.foodMenu.remove(index);
        this.foodPrice.remove(index);
    }

    public void printMenu() {
        jTextArea1.setText("");
        jTextArea1.setText(
                  "===================================\n"
                + "   Price                     Item\n"
                + "===================================\n");
        String result = "";
        for (int i = 0; i < foodMenu.size(); i++) {
            result = String.format("(%-2d). %-22s %.2f", (i + 1), foodMenu.get(i),foodPrice.get(i));
            jTextArea1.append(result);
            jTextArea1.append("\n");
        }
    }

    public void resetDefult() {
        foodMenu = new ArrayList();
        foodPrice = new ArrayList();

        foodMenu.add("Burger[Big]");
        foodMenu.add("Burger[Small]");
        foodMenu.add("Chicken");
        foodMenu.add("Salad");
        foodMenu.add("Apple Juice");
        foodMenu.add("Orange Juice");
        foodMenu.add("Green Tea");
        foodMenu.add("Tea O");
        foodPrice.add(4.99);
        foodPrice.add(2.99);
        foodPrice.add(7.99);
        foodPrice.add(0.99);
        foodPrice.add(3.50);
        foodPrice.add(3.00);
        foodPrice.add(2.00);
        foodPrice.add(2.50);
        String result = "";
        jTextArea1.setText("");
        jTextArea1.setText(
                  "===================================\n"
                + "   Price                     Item\n"
                + "===================================\n");
        for (int i = 0; i < foodMenu.size(); i++) {
            /*
            "(%d). %-15s Price: %.2f", (i + 1), menu[i], menuPrices[i])
             */
             result = String.format("(%-2d). %-22s %.2f", (i + 1), foodMenu.get(i),foodPrice.get(i));
            jTextArea1.append(result);
            jTextArea1.append("\n");
        }

    }

    public AdminView(ArrayList<String> foodMinu, ArrayList<Double> foodPrice,String userName,Login log) {
        this.log = log;
        foodMenu = new ArrayList(foodMinu);
        this.foodPrice = new ArrayList(foodPrice);
        this.userName = userName;
        
        initComponents();
        userNamejLabel.setText("Welcome "+this.userName);
        printMenu();
    }

    public AdminView() {

        initComponents();
        printMenu();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        foodNameTextField = new javax.swing.JTextField();
        foodPriceTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rowNumberTextField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        BackToMainButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        userNamejLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Interface");
        setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/restop.png")));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Admin ");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Reset Defults");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Food Name");

        jLabel3.setText("Food Price ");

        jLabel4.setText("Row Number");

        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("To Delete Just put the Row Number");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 0, 0), new java.awt.Color(204, 0, 0)));

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        BackToMainButton.setText("Back to Main");
        BackToMainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMainButtonActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(204, 204, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin.png"))); // NOI18N

        userNamejLabel.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        userNamejLabel.setForeground(new java.awt.Color(0, 0, 0));
        userNamejLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(BackToMainButton)
                .addGap(115, 115, 115)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(foodNameTextField)
                                .addComponent(foodPriceTextField)
                                .addComponent(rowNumberTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))))
                    .addComponent(userNamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 865, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1))
                    .addComponent(BackToMainButton))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(userNamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(foodNameTextField)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(foodPriceTextField)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rowNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int result = JOptionPane.showConfirmDialog(null, "You want to restore defult?", "Restore defult",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            resetDefult();
        } else if (result == JOptionPane.NO_OPTION) {

        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
        if (rowNumberTextField.getText().isEmpty()) {
            rowNumberTextField.setText(-1 + "");
            add(foodNameTextField.getText(), Double.parseDouble(foodPriceTextField.getText()), Integer.parseInt(rowNumberTextField.getText()));
        } else {
            add(foodNameTextField.getText(), Double.parseDouble(foodPriceTextField.getText()), Integer.parseInt(rowNumberTextField.getText()) - 1);
        }
        printMenu();
        foodNameTextField.setText("");
        foodPriceTextField.setText("");
        rowNumberTextField.setText("");
        }catch(NumberFormatException | NullPointerException a){
            foodNameTextField.setText("");
        foodPriceTextField.setText("");
        rowNumberTextField.setText("");
            JOptionPane.showMessageDialog(null, a.getMessage(), a.getClass().getSimpleName(), JOptionPane.ERROR_MESSAGE);
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            
            delete(Integer.parseInt(rowNumberTextField.getText()) - 1);
            printMenu();
            foodNameTextField.setText("");
            foodPriceTextField.setText("");
            rowNumberTextField.setText("");
        } catch (NullPointerException |NumberFormatException a) {
            foodNameTextField.setText("");
            foodPriceTextField.setText("");
            rowNumberTextField.setText("");
            JOptionPane.showMessageDialog(null, a.getMessage(), a.getClass().getSimpleName(), JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BackToMainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMainButtonActionPerformed
        int result = JOptionPane.showConfirmDialog(null, "Do You really want to exit > < ?", "Logout",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            this.dispose();
            MainMenu main = new MainMenu(foodMenu, foodPrice,log);
            main.setVisible(true);
        } else if (result == JOptionPane.NO_OPTION) {

        }

    }//GEN-LAST:event_BackToMainButtonActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AdminView().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToMainButton;
    private javax.swing.JTextField foodNameTextField;
    private javax.swing.JTextField foodPriceTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField rowNumberTextField;
    private javax.swing.JLabel userNamejLabel;
    // End of variables declaration//GEN-END:variables
}
