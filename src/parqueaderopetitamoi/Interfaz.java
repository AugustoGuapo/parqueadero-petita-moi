/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package parqueaderopetitamoi;

import javax.swing.table.DefaultTableModel;



/**
 *
 * @author user
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
    }
    
    GestionFacturas clientes;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        tbxCantidadClientes = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnGenerar = new javax.swing.JButton();
        btnOrdenarBurbuja = new javax.swing.JButton();
        btnOrdenarIntercambio = new javax.swing.JButton();
        btnOrdenarQuicksort = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Cliente", "Vehiculo", "# de horas", "Valor"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jLabel1.setText("CANTIDAD DE CLIENTES");

        btnGenerar.setText("GENERAR");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        btnOrdenarBurbuja.setText("BURBUJA");
        btnOrdenarBurbuja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarBurbujaActionPerformed(evt);
            }
        });

        btnOrdenarIntercambio.setText("INTERCAMBIO");
        btnOrdenarIntercambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarIntercambioActionPerformed(evt);
            }
        });

        btnOrdenarQuicksort.setText("QUICKSORT");
        btnOrdenarQuicksort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarQuicksortActionPerformed(evt);
            }
        });

        jLabel2.setText("METODOS DE ORDENAMIENTO");

        jLabel3.setText("PARQUEADERO PETITA MOI");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(81, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(tbxCantidadClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(btnGenerar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel2)
                            .addComponent(btnOrdenarBurbuja)
                            .addComponent(btnOrdenarIntercambio)
                            .addComponent(btnOrdenarQuicksort))
                        .addGap(81, 81, 81))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbxCantidadClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrdenarBurbuja))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerar)
                    .addComponent(btnOrdenarIntercambio))
                .addGap(18, 18, 18)
                .addComponent(btnOrdenarQuicksort)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarTabla() {
        DefaultTableModel modelo = new DefaultTableModel(new String[]{"Codigo","Cliente","Vehiculo","# de horas", "Valor"}, 0);
        for (int i = 0; i < clientes.getCantFacturas(); i++) {
            Factura aux = clientes.getFacturas(i);
            Object[] o = new Object [] {aux.getCodigo(),aux.getCliente(), aux.getVehiculo(), aux.getNroHoras(), aux.getValor()};
            modelo.addRow(o);
        }
        tabla.setModel(modelo);
    }
    
    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        clientes = new GestionFacturas(Integer.parseInt(tbxCantidadClientes.getText()));
        clientes.llenarFacturas();
        mostrarTabla();
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnOrdenarBurbujaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarBurbujaActionPerformed
        clientes.ordenarBurbuja();
        mostrarTabla();
    }//GEN-LAST:event_btnOrdenarBurbujaActionPerformed

    private void btnOrdenarIntercambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarIntercambioActionPerformed
        clientes.ordenarIntercambio();
        mostrarTabla();
    }//GEN-LAST:event_btnOrdenarIntercambioActionPerformed

    private void btnOrdenarQuicksortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarQuicksortActionPerformed
        clientes.ordenarQuickSort(0, clientes.getCantFacturas() - 1);
        mostrarTabla();
    }//GEN-LAST:event_btnOrdenarQuicksortActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnOrdenarBurbuja;
    private javax.swing.JButton btnOrdenarIntercambio;
    private javax.swing.JButton btnOrdenarQuicksort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField tbxCantidadClientes;
    // End of variables declaration//GEN-END:variables
}