/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author Familia Hernández
 */
public class Vista extends javax.swing.JFrame {

    /**
     * Creates new form Vista
     */
    public Vista() {
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

        jb_suma = new javax.swing.JButton();
        jl_Numero1 = new javax.swing.JLabel();
        jtf_numero1 = new javax.swing.JTextField();
        jtf_numero2 = new javax.swing.JTextField();
        jb_multiplicacion = new javax.swing.JButton();
        jb_division = new javax.swing.JButton();
        jb_resta = new javax.swing.JButton();
        jl_Titulo = new javax.swing.JLabel();
        jl_Numero2 = new javax.swing.JLabel();
        jl_messaje1 = new javax.swing.JLabel();
        jl_resultado = new javax.swing.JLabel();
        jb_modulo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(" Ivan Tic 41");
        setForeground(new java.awt.Color(153, 153, 153));

        jb_suma.setBackground(new java.awt.Color(51, 153, 255));
        jb_suma.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jb_suma.setForeground(new java.awt.Color(255, 255, 255));
        jb_suma.setText("Suma");
        jb_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_sumaActionPerformed(evt);
            }
        });

        jl_Numero1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jl_Numero1.setText("Numero1");

        jtf_numero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_numero1ActionPerformed(evt);
            }
        });

        jb_multiplicacion.setBackground(new java.awt.Color(51, 153, 255));
        jb_multiplicacion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jb_multiplicacion.setForeground(new java.awt.Color(255, 255, 255));
        jb_multiplicacion.setText("Multiplicacion");
        jb_multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_multiplicacionActionPerformed(evt);
            }
        });

        jb_division.setBackground(new java.awt.Color(51, 153, 255));
        jb_division.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jb_division.setForeground(new java.awt.Color(255, 255, 255));
        jb_division.setText("Division");
        jb_division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_divisionActionPerformed(evt);
            }
        });

        jb_resta.setBackground(new java.awt.Color(51, 153, 255));
        jb_resta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jb_resta.setForeground(new java.awt.Color(255, 255, 255));
        jb_resta.setText("Resta");
        jb_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_restaActionPerformed(evt);
            }
        });

        jl_Titulo.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jl_Titulo.setText("\"Calculadora\"");

        jl_Numero2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jl_Numero2.setText("Numero2");

        jl_messaje1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jl_messaje1.setText("El Resultado Es:");

        jl_resultado.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N

        jb_modulo.setBackground(new java.awt.Color(51, 153, 255));
        jb_modulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jb_modulo.setForeground(new java.awt.Color(255, 255, 255));
        jb_modulo.setText("Modulo");
        jb_modulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_moduloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jl_messaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jl_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jb_suma, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb_resta, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jb_division, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb_multiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jl_Numero1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jl_Numero2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtf_numero1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jtf_numero2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jb_modulo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jl_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jl_Titulo)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Numero2)
                    .addComponent(jl_Numero1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_numero2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_numero1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_suma, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_multiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jb_modulo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_resta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_division, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_messaje1)
                    .addComponent(jl_resultado))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_sumaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_sumaActionPerformed

    private void jtf_numero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_numero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_numero1ActionPerformed

    private void jb_multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_multiplicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_multiplicacionActionPerformed

    private void jb_divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_divisionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_divisionActionPerformed

    private void jb_restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_restaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_restaActionPerformed

    private void jb_moduloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_moduloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_moduloActionPerformed

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jb_division;
    public javax.swing.JButton jb_modulo;
    public javax.swing.JButton jb_multiplicacion;
    public javax.swing.JButton jb_resta;
    public javax.swing.JButton jb_suma;
    public javax.swing.JLabel jl_Numero1;
    public javax.swing.JLabel jl_Numero2;
    public javax.swing.JLabel jl_Titulo;
    public javax.swing.JLabel jl_messaje1;
    public javax.swing.JLabel jl_resultado;
    public javax.swing.JTextField jtf_numero1;
    public javax.swing.JTextField jtf_numero2;
    // End of variables declaration//GEN-END:variables

    public class jl_mensaje {

        public static void setText(String string) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public jl_mensaje() {
        }
    }

    
}