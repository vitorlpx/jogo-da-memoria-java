/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jogodamemoria;

/**
 *
 * @author bibop
 */
public class Sobre extends javax.swing.JFrame {

    /**
     * Creates new form Sobre
     */
    public Sobre() {
        initComponents();
        
    }
    public String SeparaTxt(String texto){
      return "<html><p>"+texto+"</p></html>";
  }   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 153, 51));
        setPreferredSize(new java.awt.Dimension(680, 680));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("SOBRE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(296, 6, 95, 48);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(SeparaTxt("Nosso squad desenvolveu o Jogo da Memória com o tema: Personagens Históricos. Tivemos o intuito de informar sobre essas pessoas importantes de uma forma divertida e dinâmica. Com o auxílio do nosso professor Allan, o nosso time é composto por:"));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(144, 60, 409, 132);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/Kevin.jpeg"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jLabel3.setPreferredSize(new java.awt.Dimension(101, 105));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(71, 242, 120, 114);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/Negao.jpeg"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jLabel4.setMaximumSize(new java.awt.Dimension(114, 105));
        jLabel4.setPreferredSize(new java.awt.Dimension(101, 105));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(291, 242, 117, 114);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/Camotax.jpeg"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jLabel5.setMaximumSize(new java.awt.Dimension(114, 105));
        jLabel5.setPreferredSize(new java.awt.Dimension(101, 105));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(495, 242, 122, 116);

        jLabel6.setMaximumSize(new java.awt.Dimension(114, 105));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(495, 444, 0, 0);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/Aninha.jpeg"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jLabel7.setMaximumSize(new java.awt.Dimension(114, 105));
        jLabel7.setPreferredSize(new java.awt.Dimension(101, 105));
        getContentPane().add(jLabel7);
        jLabel7.setBounds(71, 444, 119, 114);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/Guedes.jpeg"))); // NOI18N
        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jLabel8.setMaximumSize(new java.awt.Dimension(114, 105));
        jLabel8.setPreferredSize(new java.awt.Dimension(101, 105));
        getContentPane().add(jLabel8);
        jLabel8.setBounds(291, 444, 117, 113);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel9.setText("Kevin Santiago");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(71, 364, 134, 22);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel10.setText("Vitor Lopes");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(291, 364, 87, 22);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel11.setText("Camila Mota");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(506, 364, 105, 22);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel12.setText("Ana Lessa");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(71, 564, 78, 22);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel13.setText("Arthur Guedes");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(291, 564, 117, 22);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel14.setText("Bruno Primi");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(495, 564, 96, 22);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/Brunnuca.jpeg"))); // NOI18N
        jLabel15.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel15);
        jLabel15.setBounds(506, 444, 111, 114);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sobre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
