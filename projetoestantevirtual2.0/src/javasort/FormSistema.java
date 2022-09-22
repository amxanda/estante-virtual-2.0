package javasort;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormSistema extends javax.swing.JFrame {

    ArrayList<Dados> lista = new ArrayList<>();
    Comparator<Dados> compareID
            = (Dados a1, Dados a2)
            -> a1.getId() - a2.getId();
    Comparator<Dados> compareNome
            = (Dados a1, Dados a2)
            -> a1.getNome().compareTo(a2.getNome());
    Comparator<Dados> compareAutor
            = (Dados a1, Dados a2)
            -> a1.getAutor().compareTo(a2.getAutor());
    Comparator<Dados> compareAno
            = (Dados a1, Dados a2)
            -> a1.getAno() - a2.getAno();
    Comparator<Dados> comparePaginas
            = (Dados a1, Dados a2)
            -> a1.getPaginas() - a2.getPaginas();
    Comparator<Dados> compareIdioma
            = (Dados a1, Dados a2)
            -> a1.getIdioma().compareTo(a2.getIdioma());
    Comparator<Dados> compareEditora
            = (Dados a1, Dados a2)
            -> a1.getEditora().compareTo(a2.getEditora());

    public FormSistema() {
        initComponents();
        carregaArquivo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaDados = new javax.swing.JTable();
        btnBusca = new javax.swing.JButton();
        opBin = new javax.swing.JRadioButton();
        opSeq = new javax.swing.JRadioButton();
        btnOrdNome = new javax.swing.JButton();
        cbOrdena = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtBusca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelaDados.setAutoCreateRowSorter(true);
        tabelaDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Autor", "Ano", "Páginas", "Idioma", "Editora"
            }
        ));
        jScrollPane1.setViewportView(tabelaDados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 880, 540));

        btnBusca.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javasort/botao buscar.png"))); // NOI18N
        btnBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActionPerformed(evt);
            }
        });
        getContentPane().add(btnBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 630, 110, 30));

        buttonGroup1.add(opBin);
        opBin.setText("Binária");
        getContentPane().add(opBin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 600, 100, -1));

        buttonGroup1.add(opSeq);
        opSeq.setText("Sequencial");
        getContentPane().add(opSeq, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 600, 100, -1));

        btnOrdNome.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnOrdNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javasort/check-list.png"))); // NOI18N
        btnOrdNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdNomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnOrdNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 480, 140, 40));

        cbOrdena.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nome", "Autor", "Ano", "Páginas", "Idioma", "Editora" }));
        cbOrdena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOrdenaActionPerformed(evt);
            }
        });
        getContentPane().add(cbOrdena, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 450, 230, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javasort/icon.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 64)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 51, 0));
        jLabel1.setText("Estante Virtual");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 650, 100));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javasort/Sem título-1.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, -1, 420));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javasort/botao pesquisa.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 540, -1, -1));
        getContentPane().add(txtBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 540, 190, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javasort/bg.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1290, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void carregaArquivo() {
        String csvFile = "livros.csv";
        String line = "";
        String[] leitura = null;
        try ( BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                Dados livro = new Dados();
                leitura = line.split(";");
                livro.setId(Integer.parseInt(leitura[0]));
                livro.setNome(leitura[1]);
                livro.setAutor(leitura[2]);
                livro.setAno(Integer.parseInt(leitura[3]));
                livro.setPaginas(Integer.parseInt(leitura[4]));
                livro.setIdioma(leitura[5]);
                livro.setEditora(leitura[6]);

                lista.add(livro);
            }// fim percurso no arquivo
            mostra();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //https://1bestcsharp.blogspot.com/2016/03/java-populate-jtable-from-arraylist.html
    void mostra() {
        //limpando a tabela
        tabelaDados.setModel(new DefaultTableModel(null, new String[]{"ID", "Nome", "Autor", "Ano", "Páginas", "Idioma", "Editora"}));

        DefaultTableModel model
                = (DefaultTableModel) tabelaDados.getModel();
        Object rowData[] = new Object[7];// qtd colunas
        for (Dados d : lista) {
            rowData[0] = d.getId();
            rowData[1] = d.getNome();
            rowData[2] = d.getAutor();
            rowData[3] = d.getAno();
            rowData[4] = d.getPaginas();
            rowData[5] = d.getIdioma();
            rowData[6] = d.getEditora();
            model.addRow(rowData);
        }// fim preenche modelo
    }// fim mostra

    private void btnOrdNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdNomeActionPerformed
        switch (cbOrdena.getSelectedIndex()) {
            case 0:
                lista.sort(compareID);
                break;
            case 1:
                lista.sort(compareNome);
                break;
            case 2:
                lista.sort(compareAutor);
                break;
            case 3:
                lista.sort(compareAno);
                break;
            case 4:
                lista.sort(comparePaginas);
                break;
            case 5:
                lista.sort(compareIdioma);
                break;
            case 6:
                lista.sort(compareEditora);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Erro!");
        }
        mostra();
    }//GEN-LAST:event_btnOrdNomeActionPerformed

    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed
        int cont = 0;
        switch (cbOrdena.getSelectedIndex()) {
            case 0:
                break;
            case 1:
                if (opSeq.isSelected()) {
                    for (Dados d : lista) {
                        cont++;
                        if (d.getNome().equalsIgnoreCase(txtBusca.getText())) {
                            JOptionPane.showMessageDialog(null, "Livro encontrado com " + cont + " comparações");
                            break;
                        }
                    }
                }// fim if Sequencial;
                else {
                    Dados d = new Dados();
                    d.setNome(txtBusca.getText()); // alterar atributo de acordo com a seleção
                    // definir o comparator caso não seja o padrão na chamado da busca binária
                    int pos = Collections.binarySearch(lista, d, compareNome); // int pos = Collections.binarySearch(lista,d,compareTempMax);
                    JOptionPane.showMessageDialog(null, "Livro encontrado na posição " + pos);
                }// fim else binary
                break;
            case 2:
                if (opSeq.isSelected()) {
                    for (Dados d : lista) {
                        cont++;
                        if (d.getAutor().equalsIgnoreCase(txtBusca.getText())) {
                            JOptionPane.showMessageDialog(null, "Autor encontrado com " + cont + " comparações");
                            break;
                        }
                    }
                }// fim if Sequencial;
                else {
                    Dados d = new Dados();
                    d.setAutor(txtBusca.getText()); // alterar atributo de acordo com a seleção
                    // definir o comparator caso não seja o padrão na chamado da busca binária
                    int pos = Collections.binarySearch(lista, d, compareAutor); // int pos = Collections.binarySearch(lista,d,compareTempMax);
                    JOptionPane.showMessageDialog(null, "Autor encontrado na posição " + pos);
                }// fim else binary
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                if (opSeq.isSelected()) {
                    for (Dados d : lista) {
                        cont++;
                        if (d.getEditora().equalsIgnoreCase(txtBusca.getText())) {
                            JOptionPane.showMessageDialog(null, "Editora encontrada com " + cont + " comparações");
                            break;
                        }
                    }
                }// fim if Sequencial;
                else {
                    Dados d = new Dados();
                    d.setEditora(txtBusca.getText()); // alterar atributo de acordo com a seleção
                    // definir o comparator caso não seja o padrão na chamado da busca binária
                    int pos = Collections.binarySearch(lista, d, compareEditora); // int pos = Collections.binarySearch(lista,d,compareTempMax);
                    JOptionPane.showMessageDialog(null, "Editora encontrado na posição " + pos);
                }// fim else binary
                break;
            default:
                JOptionPane.showMessageDialog(null, "Erro!");
        }// switch
    }//GEN-LAST:event_btnBuscaActionPerformed

    private void cbOrdenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOrdenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbOrdenaActionPerformed

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
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnOrdNome;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbOrdena;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton opBin;
    private javax.swing.JRadioButton opSeq;
    private javax.swing.JTable tabelaDados;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables
}
