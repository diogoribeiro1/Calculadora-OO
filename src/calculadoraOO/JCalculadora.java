/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculadoraOO;

/**
 *
 * @author diogo
 */
public class JCalculadora extends javax.swing.JFrame {

    /**
     * Creates new form JCalculadora
     */
    public JCalculadora() {
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

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnPoint = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnExecutar = new javax.swing.JButton();
        btnAc = new javax.swing.JButton();
        btnPorcento = new javax.swing.JButton();
        btnDivisao = new javax.swing.JButton();
        btnSomar = new javax.swing.JButton();
        btnSubtrair = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        lblMsg = new javax.swing.JLabel();
        lblExpressao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        btn4.setBackground(new java.awt.Color(204, 204, 204));
        btn4.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        btn4.setForeground(new java.awt.Color(0, 0, 0));
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(204, 204, 204));
        btn5.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        btn5.setForeground(new java.awt.Color(0, 0, 0));
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(255, 153, 0));
        btn6.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(204, 204, 204));
        btn1.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        btn1.setForeground(new java.awt.Color(0, 0, 0));
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(204, 204, 204));
        btn2.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        btn2.setForeground(new java.awt.Color(0, 0, 0));
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(255, 153, 0));
        btn3.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btnPoint.setBackground(new java.awt.Color(204, 204, 204));
        btnPoint.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        btnPoint.setForeground(new java.awt.Color(0, 0, 0));
        btnPoint.setText(".");
        btnPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPointActionPerformed(evt);
            }
        });

        btn0.setBackground(new java.awt.Color(204, 204, 204));
        btn0.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        btn0.setForeground(new java.awt.Color(0, 0, 0));
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnExecutar.setBackground(new java.awt.Color(255, 153, 0));
        btnExecutar.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        btnExecutar.setForeground(new java.awt.Color(255, 255, 255));
        btnExecutar.setText("=");
        btnExecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExecutarActionPerformed(evt);
            }
        });

        btnAc.setBackground(new java.awt.Color(204, 204, 204));
        btnAc.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        btnAc.setForeground(new java.awt.Color(0, 0, 0));
        btnAc.setText("AC");
        btnAc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcActionPerformed(evt);
            }
        });

        btnPorcento.setBackground(new java.awt.Color(204, 204, 204));
        btnPorcento.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        btnPorcento.setForeground(new java.awt.Color(0, 0, 0));
        btnPorcento.setText("%");
        btnPorcento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorcentoActionPerformed(evt);
            }
        });

        btnDivisao.setBackground(new java.awt.Color(255, 153, 0));
        btnDivisao.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        btnDivisao.setForeground(new java.awt.Color(255, 255, 255));
        btnDivisao.setText("÷");
        btnDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisaoActionPerformed(evt);
            }
        });

        btnSomar.setBackground(new java.awt.Color(204, 204, 204));
        btnSomar.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        btnSomar.setForeground(new java.awt.Color(0, 0, 0));
        btnSomar.setText("+");
        btnSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSomarActionPerformed(evt);
            }
        });

        btnSubtrair.setBackground(new java.awt.Color(204, 204, 204));
        btnSubtrair.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        btnSubtrair.setForeground(new java.awt.Color(0, 0, 0));
        btnSubtrair.setText("-");
        btnSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtrairActionPerformed(evt);
            }
        });

        btnMultiplicar.setBackground(new java.awt.Color(255, 153, 0));
        btnMultiplicar.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        btnMultiplicar.setForeground(new java.awt.Color(255, 255, 255));
        btnMultiplicar.setText("x");
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(204, 204, 204));
        btn7.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        btn7.setForeground(new java.awt.Color(0, 0, 0));
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(204, 204, 204));
        btn8.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        btn8.setForeground(new java.awt.Color(0, 0, 0));
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(255, 153, 0));
        btn9.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        panel.setBackground(new java.awt.Color(255, 255, 255));

        lblMsg.setFont(new java.awt.Font("Kinnari", 1, 30)); // NOI18N

        lblExpressao.setFont(new java.awt.Font("Kinnari", 1, 16)); // NOI18N

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblExpressao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lblExpressao, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnAc, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnExecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnPorcento, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(58, 58, 58))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAc, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPorcento, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
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

    Calculadora calc = new Calculadora();
    String operacao;
    
    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed
        try {
            lblExpressao.setText(lblExpressao.getText() + " x ");
            calc.setValor1(Double.parseDouble(lblMsg.getText()));
            lblMsg.setText("");
            calc.setOperacao("mult");
            operacao = "mult";
        } catch (NumberFormatException e) {
            lblExpressao.setText("");
        }
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void btnSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtrairActionPerformed
        try {
            lblExpressao.setText(lblExpressao.getText() + " - ");
            calc.setValor1(Double.parseDouble(lblMsg.getText()));
            lblMsg.setText("");
            calc.setOperacao("subtr");
            operacao = "sub";
        } catch (NumberFormatException e) {
            lblMsg.setText(lblMsg.getText() + "-");
        }
    }//GEN-LAST:event_btnSubtrairActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        lblExpressao.setText(lblExpressao.getText() + "0");
        lblMsg.setText(lblMsg.getText() + "0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        lblExpressao.setText(lblExpressao.getText() + "1");
        lblMsg.setText(lblMsg.getText() + "1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        lblExpressao.setText(lblExpressao.getText() + "2");
        lblMsg.setText(lblMsg.getText() + "2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        lblExpressao.setText(lblExpressao.getText() + "3");
        lblMsg.setText(lblMsg.getText() + "3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        lblExpressao.setText(lblExpressao.getText() + "4");
        lblMsg.setText(lblMsg.getText() + "4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        lblExpressao.setText(lblExpressao.getText() + "5");
        lblMsg.setText(lblMsg.getText() + "5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        lblExpressao.setText(lblExpressao.getText() + "6");
        lblMsg.setText(lblMsg.getText() + "6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        lblExpressao.setText(lblExpressao.getText() + "7");
        lblMsg.setText(lblMsg.getText() + "7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        lblExpressao.setText(lblExpressao.getText() + "8");
        lblMsg.setText(lblMsg.getText() + "8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        lblExpressao.setText(lblExpressao.getText() + "9");
        lblMsg.setText(lblMsg.getText() + "9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnAcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcActionPerformed
        calc.setValor1(0.0);
        calc.setValor2(0.0);
        calc.setOperacao("");
        operacao = "";
        lblMsg.setText("");
        lblExpressao.setText("");
    }//GEN-LAST:event_btnAcActionPerformed

    private void btnExecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExecutarActionPerformed
        try {
            calc.setValor2(Double.parseDouble(lblMsg.getText()));
            if (calc.getOperacao().equals("soma")) {
                lblExpressao.setText(String.valueOf(calc.getValor1() + " + " + calc.getValor2() + " ="));
                lblMsg.setText(String.valueOf(calc.somar(calc.getValor1(), calc.getValor2())));
            } else if (calc.getOperacao().equals("subtr")) {
                lblExpressao.setText(String.valueOf(calc.getValor1() + " - " + calc.getValor2() + " ="));
                lblMsg.setText(String.valueOf(calc.subtrair(calc.getValor1(), calc.getValor2())));
            } else if (calc.getOperacao().equals("mult")) {
                lblExpressao.setText(String.valueOf(calc.getValor1() + " x " + calc.getValor2() + " ="));
                lblMsg.setText(String.valueOf(calc.multiplicar(calc.getValor1(), calc.getValor2())));
            } else if (calc.getOperacao().equals("div")) {
                lblExpressao.setText(String.valueOf(calc.getValor1() + " ÷ " + calc.getValor2() + " ="));
                lblMsg.setText(String.valueOf(calc.dividir(calc.getValor1(), calc.getValor2())));
            } else if (calc.getOperacao().equals("porcent")) {
                if (operacao == "sum") {
                    lblExpressao.setText(String.valueOf(calc.getValor1() + " + " + calc.getValor2() + "% " + "="));
                    lblMsg.setText(String.valueOf(calc.porcento(calc.getValor1(), calc.getValor2())));
                } else if (operacao == "sub") {
                    lblExpressao.setText(String.valueOf(calc.getValor1() + " - " + calc.getValor2() + "% " + "="));
                    lblMsg.setText(String.valueOf(calc.menosporcento(calc.getValor1(), calc.getValor2())));
                } else if (operacao == "mult"){
                    lblExpressao.setText(String.valueOf(calc.getValor1() + " x " + calc.getValor2() + "% " + "="));
                    lblMsg.setText(String.valueOf(calc.multporcento(calc.getValor1(), calc.getValor2())));
                } else if (operacao == "div"){
                    lblExpressao.setText(String.valueOf(calc.getValor1() + " ÷ " + calc.getValor2() + "% " + "="));
                    lblMsg.setText(String.valueOf(calc.divporcento(calc.getValor1(), calc.getValor2())));
                }
                else {
                    lblExpressao.setText(String.valueOf(calc.getValor2() + "% " + "="));
                    lblMsg.setText(String.valueOf(calc.porcento(calc.getValor2())));
                }
            } else {
                lblMsg.setText("Escolha uma Operação");
            }
        } catch (NumberFormatException e) {
        } catch (NullPointerException e) {
        }
    }//GEN-LAST:event_btnExecutarActionPerformed

    private void btnPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPointActionPerformed
        lblExpressao.setText(lblExpressao.getText() + ".");
        lblMsg.setText(lblMsg.getText() + ".");
    }//GEN-LAST:event_btnPointActionPerformed

    private void btnPorcentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorcentoActionPerformed
        try {
            calc.setOperacao("porcent"); 
        } catch (NumberFormatException e) {
        } catch (NullPointerException e) {
        }
    }//GEN-LAST:event_btnPorcentoActionPerformed

    private void btnDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisaoActionPerformed
        try {
            lblExpressao.setText(lblExpressao.getText() + " ÷ ");
            calc.setValor1(Double.parseDouble(lblMsg.getText()));
            lblMsg.setText("");
            calc.setOperacao("div");
            operacao = "div";
        } catch (NumberFormatException e) {
            lblExpressao.setText("");
        }
    }//GEN-LAST:event_btnDivisaoActionPerformed

    private void btnSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSomarActionPerformed
        try {
            lblExpressao.setText(lblExpressao.getText() + " + ");
            calc.setValor1(Double.parseDouble(lblMsg.getText()));
            lblMsg.setText("");
            calc.setOperacao("soma");
            operacao = "sum";
        } catch (NumberFormatException e) {
            lblExpressao.setText("");
        }
    }//GEN-LAST:event_btnSomarActionPerformed

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
            java.util.logging.Logger.getLogger(JCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAc;
    private javax.swing.JButton btnDivisao;
    private javax.swing.JButton btnExecutar;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnPoint;
    private javax.swing.JButton btnPorcento;
    private javax.swing.JButton btnSomar;
    private javax.swing.JButton btnSubtrair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel lblExpressao;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
