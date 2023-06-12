/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/Application.java to edit this template
 */
package View;

import ConnectDatabase.Connect;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author MRSTHAO
 */
public class ThongKe extends javax.swing.JFrame {

    /**
     * Creates new form ThongKe
     */
    /*
    public void JTable_ConnectDb(){
        try {
            String query = "SELECT * FROM users";
            Connection cnt = Connect.getConnection();
            Statement stm = cnt.createStatement();
            ResultSet rs = stm.executeQuery(query);
            DefaultTableModel model=(DefaultTableModel) ThongKe_Table.getModel(); //tạo liên kết model với User_Table
            // hoặc sau khi gán cho model thì có thể User_Table.setModel(model);
            while (rs.next()){
                Object objList[] = {
                    rs.getInt("id"),
                    rs.getString("username"),
                    rs.getString("password"),
                    rs.getString("fullname"),
                    rs.getInt("role"),
                    rs.getString("address"),
                    rs.getString("phone")
                };
                model.addRow(objList);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }*/
    public ThongKe() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Month_TextField = new javax.swing.JTextField();
        Year_TextField = new javax.swing.JTextField();
        ThongKe_Button = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        SumPaymentNhap_Label = new javax.swing.JLabel();
        SumPaymentXuat_Label = new javax.swing.JLabel();
        LoiNhuan_Label = new javax.swing.JLabel();
        SendGmail_Button = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Month_Label = new javax.swing.JLabel();
        Year_Label = new javax.swing.JLabel();
        MesMonth_Label = new javax.swing.JLabel();
        MesYear_Label = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("THỐNG KÊ DOANH THU THEO THÁNG");

        jLabel2.setText("Tháng");

        jLabel3.setText("Năm");

        Month_TextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Month_TextFieldKeyPressed(evt);
            }
        });

        Year_TextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Year_TextFieldKeyPressed(evt);
            }
        });

        ThongKe_Button.setText("Thống kê");
        ThongKe_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThongKe_ButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Tổng tiền nhập:");

        jLabel5.setText("Tổng tiền xuất:");

        jLabel6.setText("Lợi nhuận:");

        SumPaymentNhap_Label.setText("0");

        SumPaymentXuat_Label.setText("0");

        LoiNhuan_Label.setText("0");

        SendGmail_Button.setText("Gửi dữ liệu về Gmail");
        SendGmail_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendGmail_ButtonActionPerformed(evt);
            }
        });

        jLabel10.setText("Tháng:");

        jLabel11.setText("Năm:");

        Month_Label.setText("0");

        Year_Label.setText("0");

        MesMonth_Label.setText("    ");

        MesYear_Label.setText("    ");

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Contents");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel1)
                .addContainerGap(142, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SendGmail_Button)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ThongKe_Button)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(13, 13, 13)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Year_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                    .addComponent(Month_TextField))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MesMonth_Label)
                            .addComponent(MesYear_Label))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SumPaymentNhap_Label)
                            .addComponent(SumPaymentXuat_Label)
                            .addComponent(LoiNhuan_Label)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Month_Label)
                            .addComponent(Year_Label))))
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(ThongKe_Button)
                        .addGap(9, 9, 9)
                        .addComponent(SendGmail_Button))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(Month_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MesMonth_Label)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(Month_Label))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(Year_Label))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(Year_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(SumPaymentNhap_Label))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(SumPaymentXuat_Label))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(LoiNhuan_Label)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(MesYear_Label)))))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        int yes_no = JOptionPane.showConfirmDialog(this, "Thoát chương trình ?","Thoát",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(yes_no == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void ThongKe_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThongKe_ButtonActionPerformed
        // TODO add your handling code here:
        if(Month_TextField.getText().equals("") || Year_TextField.getText().equals("") ){
            JOptionPane.showMessageDialog(null,"Vui lòng nhập tháng năm");
        }
        else {            
            int m = Integer.parseInt(Month_TextField.getText());
            if(m == 0 || m>12) JOptionPane.showMessageDialog(null,"Tháng từ 1->12");
            int y = Integer.parseInt(Year_TextField.getText());
            
            int sumNhap=0; int sumXuat=0;
            try {
                String querynhap = "SELECT SUM(sumPayment) "
                        + "FROM phieunhap "
                        + "WHERE MONTH(dateIn) = "+m+" AND YEAR(dateIn) = "+y;
                String queryxuat = "SELECT SUM(sumPayment) "
                        + "FROM phieuxuat "
                        + "WHERE MONTH(dateOut) = "+m+" AND YEAR(dateOut) = "+y;
                Connection cnt = Connect.getConnection();
                Statement stm = cnt.createStatement();
                ResultSet rsnhap = stm.executeQuery(querynhap);
                while (rsnhap.next()){
                   sumNhap = rsnhap.getInt("SUM(sumPayment)");
                }
                ResultSet rsxuat = stm.executeQuery(queryxuat);
                while (rsxuat.next()){
                   sumXuat = rsxuat.getInt("SUM(sumPayment)");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
            
            Month_Label.setText(m+"");
            Year_Label.setText(y+"");
            SumPaymentNhap_Label.setText(sumNhap+"");
            SumPaymentXuat_Label.setText(sumXuat+"");
            LoiNhuan_Label.setText((sumXuat-sumNhap) + "");
        }
    }//GEN-LAST:event_ThongKe_ButtonActionPerformed

    private void SendGmail_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendGmail_ButtonActionPerformed
        // TODO add your handling code here:
        /*int m = Integer.parseInt(Month_Label.getText());
        int y = Integer.parseInt(Year_Label.getText());
        int sumNhap = Integer.parseInt(SumPaymentNhap_Label.getText());
        int sumXuat = Integer.parseInt(SumPaymentXuat_Label.getText());

        final String fromEmail = "quanlykhohangjava@gmail.com";
        final String password = "qlkh123456789";
        final String toEmail = "khanhtho10122002@gmail.com";
        final String subject = "Bao cao doanh thu cua thang "+m+"/"+y;
        final String body = "Doanh thu của tháng "+m+"/"+y+" :\n"
                + "Tổng tiền hàng đã nhập trong tháng: "+sumNhap+"\n"
                + "Tổng tiền hàng đã xuất trong tháng: "+sumXuat+"\n"
                + "Doanh thu trong tháng: "+(sumXuat-sumNhap);
        
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host
        props.put("mail.smtp.port", "587"); //TLS Port
        props.put("mail.smtp.auth", "true"); //enable authentication
        props.put("mail.smtp.starttls.enable", "true"); //enable STARTTLS
        Authenticator auth = new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        };
        Session session = Session.getInstance(props, auth);
        
        MimeMessage msg = new MimeMessage(session);
        //set message headers
        try {
            msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
            msg.addHeader("format", "flowed");
            msg.addHeader("Content-Transfer-Encoding", "8bit");
            msg.setFrom(new InternetAddress(fromEmail, "NoReply-JD"));
            msg.setReplyTo(InternetAddress.parse(fromEmail, false));
            msg.setSubject(subject, "UTF-8");
            msg.setText(body, "UTF-8");
            msg.setSentDate(new Date());
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));
            Transport.send(msg);
            JOptionPane.showMessageDialog(null, "Gửi thành công");
        } catch (MessagingException | UnsupportedEncodingException ex) {
            Logger.getLogger(ThongKe.class.getName()).log(Level.SEVERE, null, ex);
        }  */
    }//GEN-LAST:event_SendGmail_ButtonActionPerformed

    private void Month_TextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Month_TextFieldKeyPressed
        // TODO add your handling code here:
        String value = Month_TextField.getText();
        MesMonth_Label.setForeground(Color.RED);
        int l = value.length();
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            Month_TextField.setEditable(true);
            MesMonth_Label.setText("");
        } else {
            Month_TextField.setEditable(false);
            MesMonth_Label.setText("Chỉ nhập số(0-9)");
        }
    }//GEN-LAST:event_Month_TextFieldKeyPressed

    private void Year_TextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Year_TextFieldKeyPressed
        // TODO add your handling code here:
        String value = Year_TextField.getText();
        MesYear_Label.setForeground(Color.RED);
        int l = value.length();
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            Year_TextField.setEditable(true);
            MesYear_Label.setText("");
        } else {
            Year_TextField.setEditable(false);
            MesYear_Label.setText("Chỉ nhập số(0-9)");
        }
    }//GEN-LAST:event_Year_TextFieldKeyPressed

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
            java.util.logging.Logger.getLogger(ThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongKe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoiNhuan_Label;
    private javax.swing.JLabel MesMonth_Label;
    private javax.swing.JLabel MesYear_Label;
    private javax.swing.JLabel Month_Label;
    private javax.swing.JTextField Month_TextField;
    private javax.swing.JButton SendGmail_Button;
    private javax.swing.JLabel SumPaymentNhap_Label;
    private javax.swing.JLabel SumPaymentXuat_Label;
    private javax.swing.JButton ThongKe_Button;
    private javax.swing.JLabel Year_Label;
    private javax.swing.JTextField Year_TextField;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}
