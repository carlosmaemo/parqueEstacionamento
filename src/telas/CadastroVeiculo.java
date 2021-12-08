package telas;

import dao.ClienteDao;
import dao.VeiculoDao;
import excepcao.ErroSistema;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Veiculo;

public class CadastroVeiculo extends javax.swing.JFrame {

    VeiculoDao veiculoDao = new VeiculoDao();
    Veiculo veiculo_dados = new Veiculo();
    String click_tabela_veiculo;
    String click_tabela_cliente;

    public CadastroVeiculo() throws ErroSistema {
        initComponents();

        btnCadastrar.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnRemover.setEnabled(false);
        veiculoDao.actualizar_veiculos(tbl_veiculos_cadastrados);
        veiculoDao.actualizar_clientes(tbl_clientes_cadastrados);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_clientes_cadastrados = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        pesquisaCliente = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        endereco = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nrDocumento = new javax.swing.JTextField();
        apelido = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        modelo = new javax.swing.JTextField();
        marca = new javax.swing.JTextField();
        matricula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ano = new javax.swing.JTextField();
        tipo = new javax.swing.JComboBox<>();
        cor = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_veiculos_cadastrados = new javax.swing.JTable();
        pesquisaVeiculo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Veículo");
        setBackground(new java.awt.Color(204, 255, 204));
        setMinimumSize(new java.awt.Dimension(977, 515));
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N

        tbl_clientes_cadastrados.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tbl_clientes_cadastrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Apelido", "Endereço", "Sexo", "Tipo de Doc", "Nr. de Doc", "Contacto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_clientes_cadastrados.setAutoscrolls(false);
        tbl_clientes_cadastrados.setShowVerticalLines(false);
        tbl_clientes_cadastrados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_clientes_cadastradosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tbl_clientes_cadastradosMouseEntered(evt);
            }
        });
        jScrollPane4.setViewportView(tbl_clientes_cadastrados);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Pesquisar...");

        pesquisaCliente.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        pesquisaCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pesquisaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaClienteActionPerformed(evt);
            }
        });
        pesquisaCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pesquisaClienteKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N
        jPanel7.setSize(new java.awt.Dimension(100, 100));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Nome:");

        nome.setEditable(false);
        nome.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });

        endereco.setEditable(false);
        endereco.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        endereco.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Endereço:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Apelido:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Nº de Doc.....:");

        nrDocumento.setEditable(false);
        nrDocumento.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nrDocumento.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        nrDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nrDocumentoActionPerformed(evt);
            }
        });

        apelido.setEditable(false);
        apelido.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        apelido.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        apelido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apelidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(nrDocumento))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(apelido)))
                .addGap(11, 11, 11))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apelido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(endereco))
                    .addComponent(nrDocumento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        jPanel7Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {endereco, nrDocumento});

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        modelo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        modelo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        modelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeloActionPerformed(evt);
            }
        });

        marca.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        marca.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaActionPerformed(evt);
            }
        });

        matricula.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        matricula.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        matricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matriculaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Matricula:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Marca:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Modelo:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Cor:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Tipo:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Ano:");

        ano.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        ano.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anoActionPerformed(evt);
            }
        });

        tipo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o tipo...", "Ligeiro", "Pesado", "Especial" }));
        tipo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tipo.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        tipo.setMinimumSize(new java.awt.Dimension(2, 19));
        tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoActionPerformed(evt);
            }
        });

        cor.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a cor...", "Rosa", "Vermelho", "Laranja", "Marrom", "Amarelo", "Cinza", "Verde", "Preto", "Castanho", "Azul", "Violeta", "Ciano", "Magenta" }));
        cor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cor.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        cor.setMinimumSize(new java.awt.Dimension(2, 19));
        cor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(marca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tipo, 0, 200, Short.MAX_VALUE)
                    .addComponent(ano)
                    .addComponent(cor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ano, jLabel11, jLabel12, jLabel9, marca, matricula, modelo});

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(11, 11, 11))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(11, 11, 11))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnCadastrar.setBackground(new java.awt.Color(204, 204, 204));
        btnCadastrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-mais-24(1).png"))); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnCadastrar.setBorderPainted(false);
        btnCadastrar.setEnabled(false);
        btnCadastrar.setFocusPainted(false);
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnAlterar.setBackground(new java.awt.Color(204, 204, 204));
        btnAlterar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-crie-um-novo-24.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnAlterar.setBorderPainted(false);
        btnAlterar.setEnabled(false);
        btnAlterar.setFocusPainted(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnRemover.setBackground(new java.awt.Color(204, 204, 204));
        btnRemover.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-excluir-24(1).png"))); // NOI18N
        btnRemover.setText("Remover");
        btnRemover.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnRemover.setBorderPainted(false);
        btnRemover.setEnabled(false);
        btnRemover.setFocusPainted(false);
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(204, 204, 204));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-excluir-24.png"))); // NOI18N
        btnCancelar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnCancelar.setBorderPainted(false);
        btnCancelar.setFocusPainted(false);
        btnCancelar.setLabel("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterar, btnCadastrar, btnCancelar, btnRemover});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCancelar)
                        .addComponent(btnRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAlterar, btnCadastrar, btnCancelar, btnRemover});

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tbl_veiculos_cadastrados.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tbl_veiculos_cadastrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Apelido", "Endereço", "Sexo", "Tipo de Doc", "Nr. de Doc", "Contacto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_veiculos_cadastrados.setAutoscrolls(false);
        tbl_veiculos_cadastrados.setShowVerticalLines(false);
        tbl_veiculos_cadastrados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_veiculos_cadastradosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_veiculos_cadastrados);

        pesquisaVeiculo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        pesquisaVeiculo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pesquisaVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaVeiculoActionPerformed(evt);
            }
        });
        pesquisaVeiculo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pesquisaVeiculoKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Pesquisar...");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pesquisaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pesquisaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nrDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nrDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nrDocumentoActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:

        if (nome.getText().isEmpty() | apelido.getText().isEmpty() | endereco.getText().isEmpty() | nrDocumento.getText().isEmpty() | matricula.getText().isEmpty() | marca.getText().isEmpty() | modelo.getText().isEmpty() | ano.getText().isEmpty() | cor.getSelectedItem().toString().equals("Selecione a cor...") | tipo.getSelectedItem().toString().equals("Selecione o tipo...")) {

            JOptionPane.showMessageDialog(null, "Preencha todos os campos.", "Campo Vazio!", JOptionPane.WARNING_MESSAGE);

        } else {

            Veiculo veiculo = new Veiculo();

            veiculo.setIdCliente(veiculo_dados.getIdCliente());
            veiculo.setMatricula(matricula.getText());
            veiculo.setMarca(marca.getText());
            veiculo.setModelo(modelo.getText());
            veiculo.setCor(cor.getSelectedItem().toString());
            veiculo.setTipo(tipo.getSelectedItem().toString());
            veiculo.setAno(ano.getText());
            veiculo.setNomeCliente(veiculo_dados.getNomeCliente());
            veiculo.setApelidoCliente(veiculo_dados.getApelidoCliente());
            veiculo.setEnderecoCliente(veiculo_dados.getEnderecoCliente());
            veiculo.setNrDocumentoCliente(veiculo_dados.getNrDocumentoCliente());

            try {
                if (veiculoDao.verificar_veiculo(veiculo.getMatricula()) == true) {
                    JOptionPane.showMessageDialog(null, "O veículo já encontra-se cadastrado", "Veículo Existente!", JOptionPane.WARNING_MESSAGE);
                } else {
                    veiculoDao.salvar(veiculo);

                    nome.setText("");
                    apelido.setText("");
                    endereco.setText("");
                    nrDocumento.setText("");
                    matricula.setText("");
                    marca.setText("");
                    modelo.setText("");
                    ano.setText("");
                    cor.setSelectedIndex(0);
                    tipo.setSelectedIndex(0);

                    veiculoDao.actualizar_veiculos(tbl_veiculos_cadastrados);
                }
            } catch (ErroSistema ex) {
                Logger.getLogger(CadastroVeiculo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:

        if (nome.getText().isEmpty() | apelido.getText().isEmpty() | endereco.getText().isEmpty() | nrDocumento.getText().isEmpty() | matricula.getText().isEmpty() | marca.getText().isEmpty() | modelo.getText().isEmpty() | ano.getText().isEmpty() | cor.getSelectedItem().toString().equals("Selecione a cor...") | tipo.getSelectedItem().toString().equals("Selecione o tipo...")) {

            JOptionPane.showMessageDialog(null, "Preencha todos os campos.", "Campo Vazio!", JOptionPane.WARNING_MESSAGE);

        } else {

            try {

                Veiculo veiculo = new Veiculo();

                veiculo.setIdVeiculo(veiculo_dados.getIdVeiculo());
                veiculo.setIdCliente(veiculo_dados.getIdCliente());
                veiculo.setMatricula(matricula.getText());
                veiculo.setMarca(marca.getText());
                veiculo.setModelo(modelo.getText());
                veiculo.setCor(cor.getSelectedItem().toString());
                veiculo.setTipo(tipo.getSelectedItem().toString());
                veiculo.setAno(ano.getText());
                veiculo.setNomeCliente(veiculo_dados.getNomeCliente());
                veiculo.setApelidoCliente(veiculo_dados.getApelidoCliente());
                veiculo.setEnderecoCliente(veiculo_dados.getEnderecoCliente());
                veiculo.setNrDocumentoCliente(veiculo_dados.getNrDocumentoCliente());

                veiculoDao.actualizar_dados_veiculo(veiculo);

                nome.setText("");
                apelido.setText("");
                endereco.setText("");
                nrDocumento.setText("");
                matricula.setText("");
                marca.setText("");
                modelo.setText("");
                ano.setText("");
                cor.setSelectedIndex(0);
                tipo.setSelectedIndex(0);

                veiculoDao.actualizar_veiculos(tbl_veiculos_cadastrados);

            } catch (ErroSistema ex) {
                Logger.getLogger(CadastroVeiculo.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void tbl_veiculos_cadastradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_veiculos_cadastradosMouseClicked

        try {

            int linha = tbl_veiculos_cadastrados.getSelectedRow();
            click_tabela_veiculo = (tbl_veiculos_cadastrados.getModel().getValueAt(linha, 0).toString());

            Veiculo veiculo_p = veiculoDao.carregar_veiculo(click_tabela_veiculo);

            matricula.setText(veiculo_p.getMatricula());
            marca.setText(veiculo_p.getMarca());
            modelo.setText(veiculo_p.getModelo());
            ano.setText(veiculo_p.getAno());
            cor.setSelectedItem(veiculo_p.getCor());
            tipo.setSelectedItem(veiculo_p.getTipo());

            nome.setText(veiculo_p.getNomeCliente());
            apelido.setText(veiculo_p.getApelidoCliente());
            endereco.setText(veiculo_p.getEnderecoCliente());
            nrDocumento.setText(veiculo_p.getNrDocumentoCliente());

            veiculo_dados.setIdCliente(veiculo_p.getIdCliente());
            veiculo_dados.setIdVeiculo(veiculo_p.getIdVeiculo());
            veiculo_dados.setMatricula(veiculo_p.getMatricula());
            veiculo_dados.setMarca(veiculo_p.getMarca());
            veiculo_dados.setModelo(veiculo_p.getModelo());
            veiculo_dados.setCor(veiculo_p.getCor());
            veiculo_dados.setTipo(veiculo_p.getTipo());
            veiculo_dados.setAno(veiculo_p.getAno());

            veiculo_dados.setNomeCliente(veiculo_p.getNomeCliente());
            veiculo_dados.setApelidoCliente(veiculo_p.getApelidoCliente());
            veiculo_dados.setEnderecoCliente(veiculo_p.getEnderecoCliente());
            veiculo_dados.setNrDocumentoCliente(veiculo_p.getNrDocumentoCliente());

            if (click_tabela_veiculo != null || click_tabela_veiculo.isEmpty() == false) {
                btnAlterar.setEnabled(true);
                btnRemover.setEnabled(true);
                btnCadastrar.setEnabled(false);
            }

        } catch (ErroSistema ex) {
            Logger.getLogger(CadastroVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_tbl_veiculos_cadastradosMouseClicked

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed

        if (click_tabela_veiculo != null) {
            try {
                veiculoDao.deletar(Integer.parseInt(click_tabela_veiculo));

                nome.setText("");
                apelido.setText("");
                endereco.setText("");
                nrDocumento.setText("");
                matricula.setText("");
                marca.setText("");
                modelo.setText("");
                ano.setText("");
                cor.setSelectedIndex(0);
                tipo.setSelectedIndex(0);

                veiculoDao.actualizar_veiculos(tbl_veiculos_cadastrados);

            } catch (ErroSistema ex) {
                Logger.getLogger(CadastroVeiculo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void corActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_corActionPerformed

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void pesquisaVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaVeiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisaVeiculoActionPerformed

    private void matriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matriculaActionPerformed

    private void tbl_clientes_cadastradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_clientes_cadastradosMouseClicked

        try {

            int linha = tbl_clientes_cadastrados.getSelectedRow();
            click_tabela_cliente = (tbl_clientes_cadastrados.getModel().getValueAt(linha, 0).toString());

            Cliente cliente_p = veiculoDao.carregar_cliente(click_tabela_cliente);

            nome.setText(cliente_p.getNome());
            apelido.setText(cliente_p.getApelido());
            endereco.setText(cliente_p.getEndereco());
            nrDocumento.setText(cliente_p.getNrDocumento());

            veiculo_dados.setIdCliente(cliente_p.getIdCliente());
            veiculo_dados.setNomeCliente(cliente_p.getNome());
            veiculo_dados.setApelidoCliente(cliente_p.getApelido());
            veiculo_dados.setEnderecoCliente(cliente_p.getEndereco());
            veiculo_dados.setNrDocumentoCliente(cliente_p.getNrDocumento());

            matricula.setText("");
            marca.setText("");
            modelo.setText("");
            ano.setText("");
            cor.setSelectedIndex(0);
            tipo.setSelectedIndex(0);

            if (click_tabela_cliente != null || click_tabela_cliente.isEmpty() == false) {
                btnCadastrar.setEnabled(true);
                btnAlterar.setEnabled(false);
                btnRemover.setEnabled(false);
            }

        } catch (ErroSistema ex) {
            Logger.getLogger(CadastroVeiculo.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_tbl_clientes_cadastradosMouseClicked

    private void marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marcaActionPerformed

    private void modeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modeloActionPerformed

    private void tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoActionPerformed

    private void anoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anoActionPerformed

    private void pesquisaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisaClienteActionPerformed

    private void apelidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apelidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apelidoActionPerformed

    private void enderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoActionPerformed

    private void pesquisaClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisaClienteKeyPressed

        try {
            veiculoDao.carregar_cliente_filtro(pesquisaCliente.getText(), tbl_clientes_cadastrados);
        } catch (ErroSistema ex) {
            Logger.getLogger(CadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_pesquisaClienteKeyPressed

    private void pesquisaVeiculoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisaVeiculoKeyPressed

        try {
            veiculoDao.carregar_veiculo_filtro(pesquisaVeiculo.getText(), tbl_veiculos_cadastrados);
        } catch (ErroSistema ex) {
            Logger.getLogger(CadastroVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_pesquisaVeiculoKeyPressed

    private void tbl_clientes_cadastradosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_clientes_cadastradosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_clientes_cadastradosMouseEntered

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroVeiculo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroVeiculo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroVeiculo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroVeiculo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CadastroVeiculo().setVisible(true);

                } catch (ErroSistema ex) {
                    Logger.getLogger(CadastroVeiculo.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ano;
    private javax.swing.JTextField apelido;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JComboBox<String> cor;
    private javax.swing.JTextField endereco;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField marca;
    private javax.swing.JTextField matricula;
    private javax.swing.JTextField modelo;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField nrDocumento;
    private javax.swing.JTextField pesquisaCliente;
    private javax.swing.JTextField pesquisaVeiculo;
    private javax.swing.JTable tbl_clientes_cadastrados;
    private javax.swing.JTable tbl_veiculos_cadastrados;
    private javax.swing.JComboBox<String> tipo;
    // End of variables declaration//GEN-END:variables
}
