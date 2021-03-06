package practica6;
import java.text.DecimalFormat;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lio
 */
public class Practica6 extends javax.swing.JFrame {
    int arreglo[] = new int[20];
    String numerosantes = "", numerosnuevos = "";
    DecimalFormat df = new DecimalFormat("0");
        
    public void quick_sort( int arr[], int inicio, int fin ){
        numerosnuevos = "";
        int abajo = inicio;
        int arriba = fin;
        int i;
        int enmedio = arreglo[(inicio+fin)/2];  

        if( inicio>=fin ) return;
        do {
            while( arreglo[abajo]<enmedio ) abajo++;
            while( arreglo[arriba]>enmedio ) arriba--;
            if( abajo<= arriba ) {
                int tmp = arreglo[abajo];
                arreglo[abajo++] = arreglo[arriba];
                arreglo[arriba--] = tmp;
            }
        }while( abajo<=arriba );

        quick_sort( arreglo, inicio, arriba );
        quick_sort( arreglo, abajo, fin );
    }
    /**
     * Creates new form Practica6
     */
    public Practica6() {
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

        botonBurbuja = new javax.swing.JButton();
        botonQuickSort = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textNumerosAleatorios = new javax.swing.JTextField();
        textNumerosOrdenados = new javax.swing.JTextField();
        botonGenerarNumeros = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonBurbuja.setText("Burbuja");
        botonBurbuja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBurbujaActionPerformed(evt);
            }
        });

        botonQuickSort.setText("Rapido");
        botonQuickSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQuickSortActionPerformed(evt);
            }
        });

        jLabel1.setText("Números Aleatorios");

        jLabel2.setText("Números Ordenados");

        textNumerosAleatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNumerosAleatoriosActionPerformed(evt);
            }
        });

        textNumerosOrdenados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNumerosOrdenadosActionPerformed(evt);
            }
        });

        botonGenerarNumeros.setText("Generar");
        botonGenerarNumeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGenerarNumerosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(297, 297, 297)
                                    .addComponent(botonGenerarNumeros))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(textNumerosOrdenados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
                                    .addComponent(textNumerosAleatorios, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botonQuickSort)
                        .addGap(133, 133, 133)
                        .addComponent(botonBurbuja)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(botonGenerarNumeros))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textNumerosAleatorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textNumerosOrdenados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonBurbuja)
                    .addComponent(botonQuickSort))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonBurbujaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBurbujaActionPerformed
        // TODO add your handling code here:
        
        numerosnuevos = "";
        
        
        
        
        int i = arreglo.length;

        while(--i>=0 ) {
        for( int j=0; j<i; j++ ) {
        if( arreglo[j]>arreglo[j+1] ) {
        int tmp = arreglo[j];
        arreglo[j] = arreglo[j+1];
        arreglo[j+1] = tmp;
        }
        }
        }
        
        for( i=0; i<arreglo.length; i++ )
            numerosnuevos += df.format(arreglo[i])+", ";
    
        textNumerosOrdenados.setText(numerosnuevos+"\b\b ");
    }//GEN-LAST:event_botonBurbujaActionPerformed

    private void textNumerosAleatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNumerosAleatoriosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNumerosAleatoriosActionPerformed

    private void textNumerosOrdenadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNumerosOrdenadosActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_textNumerosOrdenadosActionPerformed

    private void botonGenerarNumerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGenerarNumerosActionPerformed
        // TODO add your handling code here:
        numerosantes = "";
        for( int i=0; i<arreglo.length; i++ ) {
            arreglo[i] = (int)( Math.random() * 30.0);
            numerosantes += df.format(arreglo[i])+", ";
        }   
        textNumerosAleatorios.setText(numerosantes+"\b\b ");
    }//GEN-LAST:event_botonGenerarNumerosActionPerformed

    private void botonQuickSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQuickSortActionPerformed
        // TODO add your handling code here:
        int i;
        quick_sort( arreglo, 0, arreglo.length-1 );
        for( i=0; i<arreglo.length; i++ )
            numerosnuevos += df.format(arreglo[i])+", ";
        textNumerosOrdenados.setText(numerosnuevos+"\b\b ");
    }//GEN-LAST:event_botonQuickSortActionPerformed

   
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(Practica6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Practica6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Practica6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Practica6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Practica6().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBurbuja;
    private javax.swing.JButton botonGenerarNumeros;
    private javax.swing.JButton botonQuickSort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField textNumerosAleatorios;
    private javax.swing.JTextField textNumerosOrdenados;
    // End of variables declaration//GEN-END:variables
}
