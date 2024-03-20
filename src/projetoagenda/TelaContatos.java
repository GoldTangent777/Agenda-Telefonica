package projetoagenda;

import connexao.ConnMysql;
import entites.Pessoa;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class TelaContatos extends javax.swing.JFrame {

    public TelaContatos() {
        initComponents();
        DefaultTableModel model = (DefaultTableModel) tabelaContatos.getModel();
        tabelaContatos.setRowSorter(new TableRowSorter(model));
        verTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        telaPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeContato = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        emailContato = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        telefoneContato = new javax.swing.JTextField();
        botaoAdicionar = new javax.swing.JButton();
        botaoEditar = new javax.swing.JButton();
        botaoRemover = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaContatos = new javax.swing.JTable();
        botaoLimparTabela = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciamento de Contatos");

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("Gerenciamento de clientes");

        jLabel2.setText("Nome:");

        jLabel3.setText("Email:");

        jLabel4.setText("Telefone:");

        botaoAdicionar.setText("Adicionar");
        botaoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarActionPerformed(evt);
            }
        });

        botaoEditar.setText("Editar");
        botaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarActionPerformed(evt);
            }
        });

        botaoRemover.setText("Remover");
        botaoRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverActionPerformed(evt);
            }
        });

        tabelaContatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Email", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaContatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaContatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaContatos);

        botaoLimparTabela.setText("Limpar Tabela");
        botaoLimparTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparTabelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout telaPrincipalLayout = new javax.swing.GroupLayout(telaPrincipal);
        telaPrincipal.setLayout(telaPrincipalLayout);
        telaPrincipalLayout.setHorizontalGroup(
            telaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaPrincipalLayout.createSequentialGroup()
                .addGroup(telaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaPrincipalLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel1))
                    .addGroup(telaPrincipalLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(telaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(telaPrincipalLayout.createSequentialGroup()
                                .addComponent(botaoAdicionar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botaoEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botaoRemover)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoLimparTabela))
                            .addGroup(telaPrincipalLayout.createSequentialGroup()
                                .addGroup(telaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(telaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nomeContato)
                                    .addComponent(emailContato, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                                .addGap(95, 95, 95)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(telefoneContato, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(46, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        telaPrincipalLayout.setVerticalGroup(
            telaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(telaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomeContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(telefoneContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(telaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(emailContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(telaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoAdicionar)
                    .addComponent(botaoEditar)
                    .addComponent(botaoRemover)
                    .addComponent(botaoLimparTabela))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(telaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(telaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaContatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaContatosMouseClicked
        nomeContato.setText(tabelaContatos.getValueAt(tabelaContatos.getSelectedRow(), 1).toString());
        emailContato.setText(tabelaContatos.getValueAt(tabelaContatos.getSelectedRow(), 2).toString());
        telefoneContato.setText(tabelaContatos.getValueAt(tabelaContatos.getSelectedRow(), 3).toString());
    }//GEN-LAST:event_tabelaContatosMouseClicked

    private void botaoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarActionPerformed
        DefaultTableModel model = (DefaultTableModel) tabelaContatos.getModel();
        String nome = nomeContato.getText();
        String email = emailContato.getText();
        String telefone = telefoneContato.getText();

        Pessoa p = new Pessoa(nome, email, telefone);
        if (p.validarNome == true && p.validarEmail == true && p.validarTelefone == true) {
            ConnMysql conn = new ConnMysql();
            conn.insert(p);

            Object[] dados = {nome, email, telefone};
            model.addRow(dados);
            verTabela();
            limparEspacos();
        }
    }//GEN-LAST:event_botaoAdicionarActionPerformed

    private void botaoRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverActionPerformed
        DefaultTableModel model = (DefaultTableModel) tabelaContatos.getModel();

        if (tabelaContatos.getSelectedRow() != -1) {
            ConnMysql conn = new ConnMysql();
            Pessoa p = new Pessoa();
            p.setId((int) tabelaContatos.getValueAt(tabelaContatos.getSelectedRow(), 0));
            conn.delete(p);
            model.removeRow(tabelaContatos.getSelectedRow());
            limparEspacos();
            verTabela();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha existente!!",
                    "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botaoRemoverActionPerformed

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
        DefaultTableModel model = new DefaultTableModel();
        ConnMysql conn = new ConnMysql();
        Pessoa p = new Pessoa();

        if (tabelaContatos.getSelectedRow() != -1) {
            p.setNome(nomeContato.getText());
            p.setEmail(emailContato.getText());
            p.setTelefone(telefoneContato.getText());
            p.setId((int) tabelaContatos.getValueAt(tabelaContatos.getSelectedRow(), 0));

            if (p.validarNome == true && p.validarTelefone == true && p.validarEmail == true) {
                conn.edit(p);

                tabelaContatos.setValueAt(nomeContato.getText(), tabelaContatos.getSelectedRow(), 1);
                tabelaContatos.setValueAt(emailContato.getText(), tabelaContatos.getSelectedRow(), 2);
                tabelaContatos.setValueAt(telefoneContato.getText(), tabelaContatos.getSelectedRow(), 3);
            }
            verTabela();
            limparEspacos();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha existente!!",
                    "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botaoEditarActionPerformed

    private void botaoLimparTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparTabelaActionPerformed
        ConnMysql conn = new ConnMysql();
        conn.cleanTablel();
        verTabela();
    }//GEN-LAST:event_botaoLimparTabelaActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaContatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaContatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaContatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaContatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaContatos().setVisible(true);
            }
        });
    }

    public void verTabela() {
        DefaultTableModel model = (DefaultTableModel) tabelaContatos.getModel();
        model.setRowCount(0);
        ConnMysql conn = new ConnMysql();

        for (Pessoa p : conn.read()) {
            model.addRow(new Object[]{
                p.getId(),
                p.getNome(),
                p.getEmail(),
                p.getTelefone()
            });
        }
    }

    public void limparEspacos() {
        nomeContato.setText("");
        emailContato.setText("");
        telefoneContato.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdicionar;
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoLimparTabela;
    private javax.swing.JButton botaoRemover;
    private javax.swing.JTextField emailContato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomeContato;
    private javax.swing.JTable tabelaContatos;
    private javax.swing.JPanel telaPrincipal;
    private javax.swing.JTextField telefoneContato;
    // End of variables declaration//GEN-END:variables
}
