/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package design;

import br.edu.entities.Candidato;
import javax.swing.ImageIcon;


/**
 *
 * @author joaog
 */
public class Main extends javax.swing.JFrame { 
    
    
    private Candidato getulioECafe;
    private Candidato lulaEHaddad;
    private Candidato candidatoSelect = null;
    private String numeroDig = "";
    
    public Main() {
        this(1000, 1000);
    }
    
    public Main(int votosGetulio, int votosLula) {
        initComponents();
        
        getulioECafe = new Candidato("Getúlio Vargas", "PTB", "Café", "52", "src/images/getulio.jpg", "src/images/café.jpg");
        lulaEHaddad = new Candidato("Lula", "PT", "Haddad", "13", "src/images/lule.jpg", "src/images/haddad.jpg");
        
        getulioECafe.setVotos(votosGetulio);
        lulaEHaddad.setVotos(votosLula);
    }
    
    private void limparCampos() {
    nCandidato.setText(""); 
    nVice.setText("");
    nPartido.setText("");
    
    Image.setIcon(null);
    ImageVice.setIcon(null);
}
    
    private void verificaNumDig(String numero) {
        candidatoSelect = null;
        
        if (numero.equals(getulioECafe.getNumero())) {
            candidatoSelect = getulioECafe;
        } else if (numero.equals(lulaEHaddad.getNumero())) {
            candidatoSelect = lulaEHaddad;
        }
    
    if (candidatoSelect != null) {
            //so atualiza os campo
            nCandidato.setText(candidatoSelect.getNPresidente());
            nPartido.setText(candidatoSelect.getPartido());
            nVice.setText(candidatoSelect.getNVice());

            //vai mudar a fotinha do nosso presidas
            String caminhoImagemPresidente = candidatoSelect.getCaminhoImagem();
            ImageIcon imagemPresidente = new ImageIcon(caminhoImagemPresidente);
            java.awt.Image imgPresidente = imagemPresidente.getImage();
            java.awt.Image imgPresidenteRed = imgPresidente.getScaledInstance(Image.getWidth(), Image.getHeight(), java.awt.Image.SCALE_SMOOTH);
            Image.setIcon(new ImageIcon(imgPresidenteRed));
            
            // aq muda aa fotina do vice
            String caminhoImagemVice = candidatoSelect.getCaminhoImagemVice();
            ImageIcon imagemVice = new ImageIcon(caminhoImagemVice);
            java.awt.Image imgVice = imagemVice.getImage();
            java.awt.Image imgViceRed = imgVice.getScaledInstance(ImageVice.getWidth(), ImageVice.getHeight(), java.awt.Image.SCALE_SMOOTH);
            ImageVice.setIcon(new ImageIcon(imgViceRed));
        }
    }
    
    private void mostrarTelaFinal() {
        telaFim telaFinal = new telaFim(getulioECafe.getVotos(), lulaEHaddad.getVotos());
        telaFinal.setVisible(true);
        this.dispose();
    }

    private void attNum() {
        numDig.setText(numeroDig);
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
        campoNumero = new javax.swing.JLabel();
        campoVice = new javax.swing.JLabel();
        campoNome = new javax.swing.JLabel();
        campoPartido = new javax.swing.JLabel();
        numDig = new javax.swing.JLabel();
        nCandidato = new javax.swing.JLabel();
        nPartido = new javax.swing.JLabel();
        nVice = new javax.swing.JLabel();
        instrucoes = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        teclado = new javax.swing.JPanel();
        b1 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        bCorrige = new javax.swing.JButton();
        bConfirma = new javax.swing.JButton();
        bBranco = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Image = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ImageVice = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1700, 800));
        setPreferredSize(new java.awt.Dimension(1700, 800));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("SEU VOTO PARA");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("PRESIDENTE");

        campoNumero.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        campoNumero.setForeground(new java.awt.Color(0, 0, 0));
        campoNumero.setText("NÚMERO:");

        campoVice.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        campoVice.setForeground(new java.awt.Color(102, 102, 102));
        campoVice.setText("VICE:");

        campoNome.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        campoNome.setForeground(new java.awt.Color(102, 102, 102));
        campoNome.setText("NOME:");

        campoPartido.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        campoPartido.setForeground(new java.awt.Color(102, 102, 102));
        campoPartido.setText("PARTIDO:");

        numDig.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N

        nCandidato.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        nPartido.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        nVice.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel4.setText("APERTE A TECLA");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("LARANJA PARA REINICIAR ESTE VOTO");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("VERDE PARA CONFIRMAR ESTE VOTO");

        teclado.setBackground(new java.awt.Color(51, 51, 51));

        b1.setBackground(new java.awt.Color(0, 0, 0));
        b1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        b1.setForeground(new java.awt.Color(255, 255, 255));
        b1.setText("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b3.setBackground(new java.awt.Color(0, 0, 0));
        b3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        b3.setForeground(new java.awt.Color(255, 255, 255));
        b3.setText("3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b2.setBackground(new java.awt.Color(0, 0, 0));
        b2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        b2.setForeground(new java.awt.Color(255, 255, 255));
        b2.setText("2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b6.setBackground(new java.awt.Color(0, 0, 0));
        b6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        b6.setForeground(new java.awt.Color(255, 255, 255));
        b6.setText("6");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b5.setBackground(new java.awt.Color(0, 0, 0));
        b5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        b5.setForeground(new java.awt.Color(255, 255, 255));
        b5.setText("5");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b4.setBackground(new java.awt.Color(0, 0, 0));
        b4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        b4.setForeground(new java.awt.Color(255, 255, 255));
        b4.setText("4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b9.setBackground(new java.awt.Color(0, 0, 0));
        b9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        b9.setForeground(new java.awt.Color(255, 255, 255));
        b9.setText("9");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        b8.setBackground(new java.awt.Color(0, 0, 0));
        b8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        b8.setForeground(new java.awt.Color(255, 255, 255));
        b8.setText("8");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b7.setBackground(new java.awt.Color(0, 0, 0));
        b7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        b7.setForeground(new java.awt.Color(255, 255, 255));
        b7.setText("7");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b0.setBackground(new java.awt.Color(0, 0, 0));
        b0.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        b0.setForeground(new java.awt.Color(255, 255, 255));
        b0.setText("0");
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });

        bCorrige.setBackground(new java.awt.Color(255, 153, 51));
        bCorrige.setForeground(new java.awt.Color(0, 0, 0));
        bCorrige.setText("CORRIGE");
        bCorrige.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCorrigeActionPerformed(evt);
            }
        });

        bConfirma.setBackground(new java.awt.Color(51, 204, 0));
        bConfirma.setForeground(new java.awt.Color(0, 0, 0));
        bConfirma.setText("CONFIRMA");
        bConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConfirmaActionPerformed(evt);
            }
        });

        bBranco.setBackground(new java.awt.Color(255, 255, 255));
        bBranco.setForeground(new java.awt.Color(0, 0, 0));
        bBranco.setText("BRANCO");
        bBranco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBrancoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tecladoLayout = new javax.swing.GroupLayout(teclado);
        teclado.setLayout(tecladoLayout);
        tecladoLayout.setHorizontalGroup(
            tecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tecladoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(tecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(tecladoLayout.createSequentialGroup()
                            .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(tecladoLayout.createSequentialGroup()
                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(tecladoLayout.createSequentialGroup()
                        .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(tecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(tecladoLayout.createSequentialGroup()
                                .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tecladoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bCorrige, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
            .addGroup(tecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tecladoLayout.createSequentialGroup()
                    .addContainerGap(296, Short.MAX_VALUE)
                    .addComponent(bConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(38, 38, 38)))
        );
        tecladoLayout.setVerticalGroup(
            tecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tecladoLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(tecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(tecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCorrige, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
            .addGroup(tecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tecladoLayout.createSequentialGroup()
                    .addContainerGap(456, Short.MAX_VALUE)
                    .addComponent(bConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(38, 38, 38)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Image, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Image, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ImageVice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ImageVice, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(instrucoes)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoNumero)
                                    .addComponent(campoPartido)
                                    .addComponent(campoNome)
                                    .addComponent(campoVice))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nVice)
                                    .addComponent(nCandidato)
                                    .addComponent(nPartido)
                                    .addComponent(numDig)))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 695, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(teclado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(54, 54, 54)
                                .addComponent(jLabel2)
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(campoNumero)
                                    .addComponent(numDig))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(campoNome)
                                    .addComponent(nCandidato))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(campoVice)
                                    .addComponent(nVice))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(campoPartido)
                                    .addComponent(nPartido))
                                .addGap(110, 110, 110))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(teclado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(instrucoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addGap(61, 61, 61)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(74, 74, 74))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
         if (numeroDig.length() < 2) {
            numeroDig += "1";
            attNum();
            verificaNumDig(numeroDig);
            
        }
    }//GEN-LAST:event_b1ActionPerformed

    
    
    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        if (numeroDig.length() < 2) {
            numeroDig += "2";
            attNum();
            verificaNumDig(numeroDig);
        }
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        if (numeroDig.length() < 2) {
            numeroDig += "3";
            attNum();
            verificaNumDig(numeroDig);
        }

    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        if (numeroDig.length() < 2) {
            numeroDig += "4";
            attNum();
            verificaNumDig(numeroDig);
        }

    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        if (numeroDig.length() < 2) {
            numeroDig += "5";
            attNum();
            verificaNumDig(numeroDig);
        }
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        if (numeroDig.length() < 2) {
            numeroDig += "6";
            attNum();
            verificaNumDig(numeroDig);
        }
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        if (numeroDig.length() < 2) {
            numeroDig += "7";
            attNum();
            verificaNumDig(numeroDig);
        }
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        if (numeroDig.length() < 2) {
            numeroDig += "8";
            attNum();
            verificaNumDig(numeroDig);
        }
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        if (numeroDig.length() < 2) {
            numeroDig += "9";
            attNum();
            verificaNumDig(numeroDig);
        }
    }//GEN-LAST:event_b9ActionPerformed

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
        if (numeroDig.length() < 2) {
            numeroDig += "0";
            attNum();
            verificaNumDig(numeroDig);
        }
    }//GEN-LAST:event_b0ActionPerformed

    private void bCorrigeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCorrigeActionPerformed
        numeroDig = "";
        campoNumero.setText("NÚMERO:");
        campoNome.setText("NOME:");
        limparCampos();
        attNum();
    }//GEN-LAST:event_bCorrigeActionPerformed

    private void bConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConfirmaActionPerformed
        numeroDig = "";
        campoNumero.setText("");
        limparCampos();
        
        if (candidatoSelect != null) {
            candidatoSelect.addVoto(); 
            System.out.println("Voto registrado para: " + candidatoSelect.getNPresidente());
        }
         mostrarTelaFinal();
        
    }//GEN-LAST:event_bConfirmaActionPerformed

    private void bBrancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBrancoActionPerformed
              
        this.dispose(); 
        telaFim telaFinal = new telaFim(getulioECafe.getVotos(), lulaEHaddad.getVotos()); 
        telaFinal.setVisible(true);
    }//GEN-LAST:event_bBrancoActionPerformed

    
    
    
    
    
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Image;
    private javax.swing.JLabel ImageVice;
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bBranco;
    private javax.swing.JButton bConfirma;
    private javax.swing.JButton bCorrige;
    private javax.swing.JLabel campoNome;
    private javax.swing.JLabel campoNumero;
    private javax.swing.JLabel campoPartido;
    private javax.swing.JLabel campoVice;
    private javax.swing.JSeparator instrucoes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nCandidato;
    private javax.swing.JLabel nPartido;
    private javax.swing.JLabel nVice;
    private javax.swing.JLabel numDig;
    private javax.swing.JPanel teclado;
    // End of variables declaration//GEN-END:variables
}
