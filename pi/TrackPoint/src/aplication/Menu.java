/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplication;

import aplication.cliente.AlterarCliente;
import aplication.cliente.CadastrarCliente;
import aplication.cliente.ExcluirCliente;
import aplication.cliente.BuscarCliente;
import aplication.cliente.ListarCliente;
import aplication.pedido.AlterarPedido;
import aplication.pedido.BuscarPedido;
import aplication.pedido.ExcluirPedido;
import aplication.pedido.ListarPedido;
import aplication.rastrear.AlterarRastrear;
import aplication.rastrear.BuscarRastrear;
import aplication.rastrear.ExcluirRastrear;
import aplication.rastrear.ListarRastrear;

/**
 *
 * @author lucas
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Menu() {
        initComponents();
    }
    
    public Menu(String cargo) {
        initComponents();
        if(cargo.equalsIgnoreCase("Cliente")){
            mnuPedidos.setVisible(false);
            mnuClientes.setVisible(false);
            mnuRastrear.setVisible(false);
        }
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
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuClientes = new javax.swing.JMenu();
        itmCadastrarCliente = new javax.swing.JMenuItem();
        itmAlterarCliente = new javax.swing.JMenuItem();
        itmBuscarCliente = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        itmExcluirCliente = new javax.swing.JMenuItem();
        itmListarCliente = new javax.swing.JMenuItem();
        mnuPedidos = new javax.swing.JMenu();
        itmAlterarPedido = new javax.swing.JMenuItem();
        itmBuscarPedido = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        itmExcluirPedido = new javax.swing.JMenuItem();
        itmListarPedido = new javax.swing.JMenuItem();
        mnuRastrear = new javax.swing.JMenu();
        itmAlterarRastrear = new javax.swing.JMenuItem();
        itmBuscarRastrear = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        itmExcluirRastrear = new javax.swing.JMenuItem();
        itmListarRastrear = new javax.swing.JMenuItem();
        mnuBuscar = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trackPointMenu.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 370));

        mnuClientes.setText("Clientes");

        itmCadastrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cadastrar.png"))); // NOI18N
        itmCadastrarCliente.setText("Cadastrar");
        itmCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastrarClienteActionPerformed(evt);
            }
        });
        mnuClientes.add(itmCadastrarCliente);

        itmAlterarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alterar.png"))); // NOI18N
        itmAlterarCliente.setText("Alterar");
        itmAlterarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAlterarClienteActionPerformed(evt);
            }
        });
        mnuClientes.add(itmAlterarCliente);

        itmBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        itmBuscarCliente.setText("Buscar");
        itmBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmBuscarClienteActionPerformed(evt);
            }
        });
        mnuClientes.add(itmBuscarCliente);
        mnuClientes.add(jSeparator3);

        itmExcluirCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excluir.png"))); // NOI18N
        itmExcluirCliente.setText("Excluir");
        itmExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExcluirClienteActionPerformed(evt);
            }
        });
        mnuClientes.add(itmExcluirCliente);

        itmListarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/listar.png"))); // NOI18N
        itmListarCliente.setText("Listar");
        itmListarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmListarClienteActionPerformed(evt);
            }
        });
        mnuClientes.add(itmListarCliente);

        jMenuBar1.add(mnuClientes);

        mnuPedidos.setText("Pedidos");

        itmAlterarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alterar.png"))); // NOI18N
        itmAlterarPedido.setText("Alterar");
        itmAlterarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAlterarPedidoActionPerformed(evt);
            }
        });
        mnuPedidos.add(itmAlterarPedido);

        itmBuscarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        itmBuscarPedido.setText("Buscar");
        itmBuscarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmBuscarPedidoActionPerformed(evt);
            }
        });
        mnuPedidos.add(itmBuscarPedido);
        mnuPedidos.add(jSeparator2);

        itmExcluirPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excluir.png"))); // NOI18N
        itmExcluirPedido.setText("Excluir");
        itmExcluirPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExcluirPedidoActionPerformed(evt);
            }
        });
        mnuPedidos.add(itmExcluirPedido);

        itmListarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/listar.png"))); // NOI18N
        itmListarPedido.setText("Listar");
        itmListarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmListarPedidoActionPerformed(evt);
            }
        });
        mnuPedidos.add(itmListarPedido);

        jMenuBar1.add(mnuPedidos);

        mnuRastrear.setText("Rastrear");

        itmAlterarRastrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alterar.png"))); // NOI18N
        itmAlterarRastrear.setText("Alterar");
        itmAlterarRastrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAlterarRastrearActionPerformed(evt);
            }
        });
        mnuRastrear.add(itmAlterarRastrear);

        itmBuscarRastrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        itmBuscarRastrear.setText("Buscar");
        itmBuscarRastrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmBuscarRastrearActionPerformed(evt);
            }
        });
        mnuRastrear.add(itmBuscarRastrear);
        mnuRastrear.add(jSeparator4);

        itmExcluirRastrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excluir.png"))); // NOI18N
        itmExcluirRastrear.setText("Excluir");
        itmExcluirRastrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExcluirRastrearActionPerformed(evt);
            }
        });
        mnuRastrear.add(itmExcluirRastrear);

        itmListarRastrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/listar.png"))); // NOI18N
        itmListarRastrear.setText("Listar");
        itmListarRastrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmListarRastrearActionPerformed(evt);
            }
        });
        mnuRastrear.add(itmListarRastrear);

        jMenuBar1.add(mnuRastrear);

        mnuBuscar.setText("Buscar");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        jMenuItem1.setText("Buscar Produto");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuBuscar.add(jMenuItem1);

        jMenuBar1.add(mnuBuscar);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(720, 402));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itmCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastrarClienteActionPerformed
        new CadastrarCliente().setVisible(true);
    }//GEN-LAST:event_itmCadastrarClienteActionPerformed

    private void itmAlterarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAlterarClienteActionPerformed
        new AlterarCliente().setVisible(true);
    }//GEN-LAST:event_itmAlterarClienteActionPerformed

    private void itmBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmBuscarClienteActionPerformed
        new BuscarCliente().setVisible(true);
    }//GEN-LAST:event_itmBuscarClienteActionPerformed

    private void itmExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExcluirClienteActionPerformed
        new ExcluirCliente().setVisible(true);
    }//GEN-LAST:event_itmExcluirClienteActionPerformed

    private void itmListarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmListarClienteActionPerformed
        new ListarCliente().setVisible(true);
    }//GEN-LAST:event_itmListarClienteActionPerformed

    private void itmAlterarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAlterarPedidoActionPerformed
       new AlterarPedido().setVisible(true);
    }//GEN-LAST:event_itmAlterarPedidoActionPerformed

    private void itmBuscarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmBuscarPedidoActionPerformed
        new BuscarPedido().setVisible(true);
    }//GEN-LAST:event_itmBuscarPedidoActionPerformed

    private void itmExcluirPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExcluirPedidoActionPerformed
        new ExcluirPedido().setVisible(true);
    }//GEN-LAST:event_itmExcluirPedidoActionPerformed

    private void itmListarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmListarPedidoActionPerformed
        new ListarPedido().setVisible(true);
    }//GEN-LAST:event_itmListarPedidoActionPerformed

    private void itmAlterarRastrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAlterarRastrearActionPerformed
        new AlterarRastrear().setVisible(true);
    }//GEN-LAST:event_itmAlterarRastrearActionPerformed

    private void itmBuscarRastrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmBuscarRastrearActionPerformed
        new BuscarRastrear().setVisible(true);
    }//GEN-LAST:event_itmBuscarRastrearActionPerformed

    private void itmExcluirRastrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExcluirRastrearActionPerformed
        new ExcluirRastrear().setVisible(true);
    }//GEN-LAST:event_itmExcluirRastrearActionPerformed

    private void itmListarRastrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmListarRastrearActionPerformed
        new ListarRastrear().setVisible(true);
    }//GEN-LAST:event_itmListarRastrearActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new BuscarRastrear().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itmAlterarCliente;
    private javax.swing.JMenuItem itmAlterarPedido;
    private javax.swing.JMenuItem itmAlterarRastrear;
    private javax.swing.JMenuItem itmBuscarCliente;
    private javax.swing.JMenuItem itmBuscarPedido;
    private javax.swing.JMenuItem itmBuscarRastrear;
    private javax.swing.JMenuItem itmCadastrarCliente;
    private javax.swing.JMenuItem itmExcluirCliente;
    private javax.swing.JMenuItem itmExcluirPedido;
    private javax.swing.JMenuItem itmExcluirRastrear;
    private javax.swing.JMenuItem itmListarCliente;
    private javax.swing.JMenuItem itmListarPedido;
    private javax.swing.JMenuItem itmListarRastrear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JMenu mnuBuscar;
    private javax.swing.JMenu mnuClientes;
    private javax.swing.JMenu mnuPedidos;
    private javax.swing.JMenu mnuRastrear;
    // End of variables declaration//GEN-END:variables
}