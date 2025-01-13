/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sema.project;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.Vector;

/**
 *
 * @author semao
 */
public class Dashboard extends javax.swing.JFrame {


    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        //loadData();
    
    }



    public void setUser(String userName) {
        // Kullanıcı adını bir label veya başka bir bileşene atayabilirsiniz
        user_name.setText(userName);  // Örnek bir kullanıcı ismi gösterme
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        p_inbox = new javax.swing.JPanel();
        user_name = new javax.swing.JLabel();
        send_email = new javax.swing.JButton();
        show_inbox = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        table_inbox = new javax.swing.JTable();
        goPersonalize = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(233, 249, 249));

        p_inbox.setBackground(new java.awt.Color(213, 229, 236));

        user_name.setText("jLabel1");

        send_email.setText("send email");
        send_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                send_emailActionPerformed(evt);
            }
        });

        show_inbox.setText("show inbox mails");
        show_inbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_inboxActionPerformed(evt);
            }
        });

        table_inbox.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "subject", "sender", "data_received", "message"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane6.setViewportView(table_inbox);

        goPersonalize.setText("go personalize");
        goPersonalize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goPersonalizeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p_inboxLayout = new javax.swing.GroupLayout(p_inbox);
        p_inbox.setLayout(p_inboxLayout);
        p_inboxLayout.setHorizontalGroup(
            p_inboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_inboxLayout.createSequentialGroup()
                .addGroup(p_inboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_inboxLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(p_inboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(send_email)
                            .addGroup(p_inboxLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(user_name, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(show_inbox))
                .addGroup(p_inboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_inboxLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_inboxLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(goPersonalize)
                        .addGap(16, 16, 16))))
        );
        p_inboxLayout.setVerticalGroup(
            p_inboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_inboxLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(p_inboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_inboxLayout.createSequentialGroup()
                        .addComponent(user_name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(show_inbox))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(p_inboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(send_email)
                    .addComponent(goPersonalize))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Inbox", p_inbox);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void send_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_send_emailActionPerformed
        // TODO add your handling code here:
        String a = user_name.getText();

        sendEmail se = new sendEmail(a);
        se.setVisible(true);
        se.pack();
        se.setLocationRelativeTo(this);
        this.dispose();
    }//GEN-LAST:event_send_emailActionPerformed

    private void show_inboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_inboxActionPerformed
        // TODO add your handling code here:

        String url = "jdbc:mysql://localhost:3306/mailsystem"; // Veritabanı URL'si
        String user = "root"; // MySQL kullanıcı adı
        String password = "Magconboys1+"; // MySQL şifresi
        String a = user_name.getText();

        String query = "SELECT * FROM mail WHERE category = 'Sent' AND recipient ='" + a + "'";

        try (Connection conn = DriverManager.getConnection(url, user, password); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {

            // JTable için model oluştur
            DefaultTableModel model = (DefaultTableModel) table_inbox.getModel();
            model.setRowCount(0); // Mevcut satırları temizle

            // Sonuçları tabloya ekle
            while (rs.next()) {
                Vector<String> row = new Vector<>();
                row.add(String.valueOf(rs.getInt("id")));
                row.add(rs.getString("subject"));
                row.add(rs.getString("sender"));
                row.add(rs.getString("data_received"));
                row.add(rs.getString("message"));

                model.addRow(row);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Veritabanı hatası: " + e.getMessage());
        }


    }//GEN-LAST:event_show_inboxActionPerformed

    private void goPersonalizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goPersonalizeActionPerformed
        // TODO add your handling code here:
        String a = user_name.getText();
        personalize p = new personalize(a);
        p.setVisible(true);
        p.pack();
        p.setLocationRelativeTo(this);
        this.dispose();
        
    }//GEN-LAST:event_goPersonalizeActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton goPersonalize;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel p_inbox;
    private javax.swing.JButton send_email;
    private javax.swing.JButton show_inbox;
    private javax.swing.JTable table_inbox;
    private javax.swing.JLabel user_name;
    // End of variables declaration//GEN-END:variables
}
