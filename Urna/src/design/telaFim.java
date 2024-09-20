/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package design;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.Timer;

/**
 *
 * @author joaog
 */
public class telaFim extends javax.swing.JFrame {

    
    private DateTimeFormatter formato = DateTimeFormatter.ofPattern("EEEE, dd/MM/yyyy HH:mm:ss");
    
    private int votosGetulio;
    private int votosLula;
    /**
     * Creates new form telaFim
     */
    public telaFim(int votosGetulio, int votosLula) {
        
        this.votosGetulio = votosGetulio;
        this.votosLula = votosLula;
        initComponents();
        
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.isControlDown() && e.getKeyCode() == KeyEvent.VK_R) {
                    reiniciarUrna(); 
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {}
        });

        setFocusable(true);
        
        setVotosGetulio(votosGetulio);
        setVotosLula(votosLula);
        
         iniciarAtualizacaoTempo();
    }
    
    private void iniciarAtualizacaoTempo() {
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //pega tempo live
                LocalDateTime agora = LocalDateTime.now();
                
                //a formatação pra dia daa sem + dd/mm/yyyy etc
                String timeForm = agora.format(formato);
                Time.setText(timeForm);
            }
        });
        timer.start(); 
    }
    
    private void reiniciarUrna() {
        System.out.println("Reiniciando a urna...");
        this.dispose();
        Main novaTelaPrincipal = new Main(votosGetulio, votosLula);
        novaTelaPrincipal.setVisible(true);
    }
    
    public void setVotosGetulio(int votos) {
        lblVotosGetulio.setText("Getúlio: " + votos + " votos");
    }
    
    public void setVotosLula(int votos) {
        lblVotosLula.setText("Lula: " + votos + " votos");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fimLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblVotosGetulio = new javax.swing.JLabel();
        lblVotosLula = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1700, 800));
        setResizable(false);

        fimLabel.setFont(new java.awt.Font("Segoe UI", 1, 100)); // NOI18N
        fimLabel.setForeground(new java.awt.Color(0, 0, 0));
        fimLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fimLabel.setText("FIM");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("VOTOU");

        lblVotosGetulio.setText("Votos getulio");

        lblVotosLula.setText("Votos Lula");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblVotosGetulio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 766, Short.MAX_VALUE)
                        .addComponent(fimLabel)
                        .addGap(748, 748, 748))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVotosLula)
                            .addComponent(Time))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Time)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 295, Short.MAX_VALUE)
                .addComponent(fimLabel)
                .addGap(273, 273, 273)
                .addComponent(lblVotosLula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblVotosGetulio))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(telaFim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaFim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaFim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaFim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaFim(1000, 1000).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Time;
    private javax.swing.JLabel fimLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblVotosGetulio;
    private javax.swing.JLabel lblVotosLula;
    // End of variables declaration//GEN-END:variables

}
