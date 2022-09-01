/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cons.visao;
import cons.persistencia.ConsultorDAO;
import cons.modelos.Consultor;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LucasKaosu
 */
public class TelaListaDeConsultor extends javax.swing.JFrame {

    /**
     * Creates new form TelaListaDeProjetos
     */
    public TelaListaDeConsultor() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonListar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProjetos = new javax.swing.JTable();
        jButtonHome = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de Consultores");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lista de Consultores");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1114, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
        );

        jButtonListar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonListar.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jButtonListar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonListar.setText("Listar Consultores");
        jButtonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarActionPerformed(evt);
            }
        });

        jTableProjetos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Consultor", "Nome", "Telefone 1", "Telefone 2", "Telefone 3", "Email 1", "Email 2", "Email 3"
            }
        ));
        jScrollPane1.setViewportView(jTableProjetos);

        jButtonHome.setBackground(new java.awt.Color(255, 255, 255));
        jButtonHome.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jButtonHome.setForeground(new java.awt.Color(0, 0, 0));
        jButtonHome.setText("Home");
        jButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHomeActionPerformed(evt);
            }
        });

        jButtonBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonBuscar.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jButtonBuscar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome");

        jLabel4.setText("ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonHome)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonListar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldID)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBuscar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonListar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonHome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarActionPerformed
        try {
            ConsultorDAO bd = new ConsultorDAO();
            ArrayList<Consultor> dadosDosConsultores = null;
            dadosDosConsultores = bd.listagemDeConsultores();
            DefaultTableModel model =  (DefaultTableModel) jTableProjetos.getModel();
            model.setNumRows(0);
            for(int pos = 0; pos < dadosDosConsultores.size(); pos++){
                Consultor objetoConsultor = dadosDosConsultores.get(pos);
                String[] linha = new String[8];
                linha[0]= objetoConsultor.getId_Consultor()+ "";
                linha[1]= objetoConsultor.getNome_Consultor();
                linha[2]= objetoConsultor.getTelefone_Consultor_1();
                linha[3]= objetoConsultor.getTelefone_Consultor_2();
                linha[4]= objetoConsultor.getTelefone_Consultor_3();
                linha[5]= objetoConsultor.getEmail_Consultor_1();
                linha[6]= objetoConsultor.getEmail_Consultor_2();
                linha[7]= objetoConsultor.getEmail_Consultor_3();
                model.addRow(linha);
            }  
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro.getMessage());
        }
    }//GEN-LAST:event_jButtonListarActionPerformed

    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
        TelaDeAcesso telaAcesso = new TelaDeAcesso();
        telaAcesso.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonHomeActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        try {
            ConsultorDAO bd = new ConsultorDAO();
            if( !"".equals(jTextFieldID.getText())){
                int id_consultor = Integer.parseInt(jTextFieldID.getText());
                ArrayList<Consultor> dadosDosConsultores = null;
                dadosDosConsultores = bd.consultaListaConsultoresID(id_consultor);
                DefaultTableModel model =  (DefaultTableModel) jTableProjetos.getModel();
                model.setNumRows(0);
                for(int pos = 0; pos < dadosDosConsultores.size(); pos++){
                    Consultor objetoConsultor = dadosDosConsultores.get(pos);
                    String[] linha = new String[8];
                    linha[0]= objetoConsultor.getId_Consultor()+ "";
                    linha[1]= objetoConsultor.getNome_Consultor();
                    linha[2]= objetoConsultor.getTelefone_Consultor_1();
                    linha[3]= objetoConsultor.getTelefone_Consultor_2();
                    linha[4]= objetoConsultor.getTelefone_Consultor_3();
                    linha[5]= objetoConsultor.getEmail_Consultor_1();
                    linha[6]= objetoConsultor.getEmail_Consultor_2();
                    linha[7]= objetoConsultor.getEmail_Consultor_3();
                    model.addRow(linha);
            }} 
            else if( !"".equals(jTextFieldNome.getText())) {
                String nome_consultor = jTextFieldNome.getText();
                Consultor consultor = new Consultor(0, nome_consultor, "","","","","","");
                ArrayList<Consultor> dadosDosConsultores = null;
                dadosDosConsultores = bd.consultaListaConsultoresNome(consultor);
                DefaultTableModel model =  (DefaultTableModel) jTableProjetos.getModel();
                model.setNumRows(0);
                for(int pos = 0; pos < dadosDosConsultores.size(); pos++){
                    Consultor objetoConsultor = dadosDosConsultores.get(pos);
                    String[] linha = new String[8];
                    linha[0]= objetoConsultor.getId_Consultor()+ "";
                    linha[1]= objetoConsultor.getNome_Consultor();
                    linha[2]= objetoConsultor.getTelefone_Consultor_1();
                    linha[3]= objetoConsultor.getTelefone_Consultor_2();
                    linha[4]= objetoConsultor.getTelefone_Consultor_3();
                    linha[5]= objetoConsultor.getEmail_Consultor_1();
                    linha[6]= objetoConsultor.getEmail_Consultor_2();
                    linha[7]= objetoConsultor.getEmail_Consultor_3();
                    model.addRow(linha);       
            }}
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro.getMessage());
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaListaDeConsultor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaListaDeConsultor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaListaDeConsultor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaListaDeConsultor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaListaDeConsultor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JButton jButtonListar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProjetos;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
