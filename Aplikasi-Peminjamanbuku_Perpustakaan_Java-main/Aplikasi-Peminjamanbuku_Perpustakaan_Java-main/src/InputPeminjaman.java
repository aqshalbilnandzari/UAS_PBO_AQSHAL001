/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
/**
 *
 * @author riama
 */
public class InputPeminjaman extends javax.swing.JFrame {
    String pinjam;
    String balik;
    /**
     * Creates new form InputPeminjaman
     */
    public InputPeminjaman(){
        initComponents();
        txtNama.setEditable(false);
        txtjdl.setEditable(false);
   
        try {
             BufferedImage beam = ImageIO.read(getClass().getResource("library.png"));
             setIconImage(beam); 
        } catch (IOException ex) {
            Logger.getLogger(splashscreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setTitle("Input Data Peminjaman");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtJumlah = new javax.swing.JTextField();
        txtNPM = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtIDbuku = new javax.swing.JTextField();
        btSubmit = new javax.swing.JButton();
        btReset = new javax.swing.JButton();
        txtjdl = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btKembali = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtJumlah.setText("Jumlah");
        txtJumlah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtJumlahMouseClicked(evt);
            }
        });
        txtJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahActionPerformed(evt);
            }
        });
        txtJumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtJumlahKeyTyped(evt);
            }
        });
        jPanel2.add(txtJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 470, 30));

        txtNPM.setText("NPM");
        txtNPM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNPMMouseClicked(evt);
            }
        });
        txtNPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNPMActionPerformed(evt);
            }
        });
        txtNPM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNPMKeyReleased(evt);
            }
        });
        jPanel2.add(txtNPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 470, 30));

        txtNama.setText("Nama");
        txtNama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNamaKeyReleased(evt);
            }
        });
        jPanel2.add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 470, 30));

        txtIDbuku.setText("Id Buku");
        txtIDbuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIDbukuMouseClicked(evt);
            }
        });
        txtIDbuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDbukuActionPerformed(evt);
            }
        });
        txtIDbuku.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIDbukuKeyReleased(evt);
            }
        });
        jPanel2.add(txtIDbuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 470, 30));

        btSubmit.setText("Submit");
        btSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSubmitActionPerformed(evt);
            }
        });
        jPanel2.add(btSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, -1, -1));

        btReset.setText("Reset");
        btReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetActionPerformed(evt);
            }
        });
        jPanel2.add(btReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, -1, -1));

        txtjdl.setText("Judul");
        jPanel2.add(txtjdl, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 470, 30));

        jLabel1.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Tanggal Kembali");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, -1, -1));

        jLabel2.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Tanggal Pinjam");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, -1));

        btKembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Backk.png"))); // NOI18N
        btKembali.setBorderPainted(false);
        btKembali.setContentAreaFilled(false);
        btKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKembaliActionPerformed(evt);
            }
        });
        jPanel2.add(btKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, 140, -1));

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("FORM INPUT PEMINJAMAN BUKU");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 460, 40));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setText("BACK");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 510, 50, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNPMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNPMMouseClicked
        txtNPM.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNPMMouseClicked

    private void txtIDbukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIDbukuMouseClicked
        txtIDbuku.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDbukuMouseClicked

    private void txtNamaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamaKeyReleased

        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaKeyReleased

    private void txtNPMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNPMKeyReleased
        try{
            String query = "SELECT nama FROM mahasiswa where npm = '"+txtNPM.getText()+"'";
            Connection conn = Koneksi.connectDB();
            Statement stm = conn.createStatement();
            ResultSet data = stm.executeQuery(query);

            if(data.next()){
                txtNama.setText(data.getString("nama"));
            }
            else{
                txtNama.setText("Nama");  
            }
        } catch(Exception b){
            JOptionPane.showMessageDialog(null, b.getMessage());
        }
    }//GEN-LAST:event_txtNPMKeyReleased

    private void txtIDbukuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDbukuKeyReleased
        try{
            String query = "SELECT judul FROM buku where id_buku = '"+txtIDbuku.getText()+"'";
            Connection conn = Koneksi.connectDB();
            Statement stm = conn.createStatement();
            ResultSet data = stm.executeQuery(query);

            if(data.next()){
                txtjdl.setText(data.getString("judul"));
            }
            else{
                txtjdl.setText("Judul");  
            }
        } catch(Exception b){
            JOptionPane.showMessageDialog(null, b.getMessage());
        }
    }//GEN-LAST:event_txtIDbukuKeyReleased

    private void btSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSubmitActionPerformed
        if(tgl.getDate().equals("")&&tglbalik.getDate().equals("")){
            JOptionPane.showMessageDialog(null,"Masih ada data kosong");
        } else {
            try{
                String idbuku;
                idbuku=txtIDbuku.getText();
                String query = "SELECT*FROM buku where id_buku = '"+idbuku+"'";
                Connection conn = Koneksi.connectDB();
                Statement stm = conn.createStatement();
                ResultSet data = stm.executeQuery(query);
                
                while(data.next()){
                    String jmlh = txtJumlah.getText();
                    String stk = data.getString(7);
                    int stok = Integer.parseInt(stk);
                    int jumlah = Integer.parseInt(jmlh);
                    
                    if(stok == 0){
                        JOptionPane.showMessageDialog(null,"Stok buku kosong!");
                    }
                    else if(jumlah>stok){
                      JOptionPane.showMessageDialog(null,"Stok buku tidak mencukupi!"); 
                    }
                    else{
                        try{
                            String sql1="SELECT*FROM pinjaman order by id_pinjam desc";
                            Connection conn1 = Koneksi.connectDB();
                            Statement stm1 = conn1.createStatement();
                            ResultSet res1 = stm1.executeQuery(sql1);
                            
                            String idpinjam;
                            if(res1.next()){
                                String no=res1.getString("id_pinjam").substring(1);
                                String id = ""+(Integer.parseInt(no)+1);
                                String nol=null;
                                
                                if(id.length()==1){
                                    nol="000";
                                } else if(id.length()==2){
                                    nol="00";
                                } else if(id.length()==3){
                                    nol="0";
                                } else if(id.length()==4){
                                    nol="";
                                }
                                
                                idpinjam = "P"+nol+id;
                            } else{
                                idpinjam = "P0001";
                            }
                            try {
                                int denda=0;
                                String query1 = "INSERT INTO pinjaman VALUES "
                                        + "('" + idpinjam+"','"+txtNPM.getText() + "','" + txtNama.getText() 
                                        + "','" + txtIDbuku.getText() + "','" + txtjdl.getText()  
                                        + "','" + txtJumlah.getText()+ "','" + pinjam
                                        + "','" + balik+ "','" + denda+ "','" + "Belum Kembali"+ "')";
                                java.sql.Connection kon1 = (Connection) Koneksi.connectDB();
                                java.sql.PreparedStatement mts = kon1.prepareStatement(query1);
                                mts.execute();
                                JOptionPane.showMessageDialog(null, "Penyimpanan Berhasil");
                                
                                try{
                                    String query2 = "SELECT*FROM buku where id_buku = '"+txtIDbuku.getText()+"'";
                                    Connection conn3 = Koneksi.connectDB();
                                    Statement st = conn3.createStatement();
                                    ResultSet data2 = st.executeQuery(query2);
                                    
                                    while(data2.next()){
                                        int jumlah1= Integer.parseInt(data2.getString(7));
                                        int jumlahpinjam = Integer.parseInt(txtJumlah.getText());
                                        int total = jumlah1-jumlahpinjam;
                                        
                                        try {
                                            String sql3 ="UPDATE buku SET stok = '"+total
                                                    +"' WHERE id_buku = '"+txtIDbuku.getText()+"'";
                                            Connection conn4 = Koneksi.connectDB();
                                            PreparedStatement pst=conn4.prepareStatement(sql3);
                                            pst.execute();
                                        } catch (Exception e) {
                                            JOptionPane.showMessageDialog(null, "Perubahan Gagal"+e.getMessage());
                                        }
                                    }
                                }
                                catch(Exception b){
                                    JOptionPane.showMessageDialog(null, b.getMessage());
                                }
                                
                                new DataPeminjaman().setVisible(true);
                                dispose();
                            
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(this, e.getMessage());
                            }
                        }
                        catch(Exception b){
                            JOptionPane.showMessageDialog(null,b.getMessage());
                        }
                    }
                }
            } catch(Exception b){
                JOptionPane.showMessageDialog(null,b.getMessage());
            }
        }
    }//GEN-LAST:event_btSubmitActionPerformed

    private void txtJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJumlahActionPerformed

    private void txtJumlahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtJumlahMouseClicked
        txtJumlah.setText(null);
    }//GEN-LAST:event_txtJumlahMouseClicked

    private void txtIDbukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDbukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDbukuActionPerformed

    private void tglPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tglPropertyChange
if (tgl.getDate() != null) {
     SimpleDateFormat FormatTanggal = new SimpleDateFormat("dd MMMM yyyy");
     pinjam = FormatTanggal.format(tgl.getDate());
}
        // TODO add your handling code here:
    }//GEN-LAST:event_tglPropertyChange

    private void tglbalikPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tglbalikPropertyChange
        if (tglbalik.getDate() != null) {
            SimpleDateFormat FormatTanggal = new SimpleDateFormat("dd MMMM yyyy");
            balik = FormatTanggal.format(tglbalik.getDate());
        }
    }//GEN-LAST:event_tglbalikPropertyChange

    private void btKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKembaliActionPerformed
    new DataPeminjaman().setVisible(true);
        dispose();
    }//GEN-LAST:event_btKembaliActionPerformed

    private void txtJumlahKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJumlahKeyTyped
        char c = evt.getKeyChar();
        if (! ((Character.isDigit(c) ||
                (c == KeyEvent.VK_BACK_SPACE) ||
                (c == KeyEvent.VK_DELETE))
                ))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtJumlahKeyTyped

    private void txtNPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNPMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNPMActionPerformed

    private void btResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btResetActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btKembali;
    private javax.swing.JButton btReset;
    private javax.swing.JButton btSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtIDbuku;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtNPM;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtjdl;
    // End of variables declaration//GEN-END:variables
}
