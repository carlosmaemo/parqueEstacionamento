package telas;

import dao.ClienteDao;
import excepcao.ErroSistema;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Cliente;
<<<<<<< Updated upstream
import modelo.Veiculo;

public class CadastroVeiculo extends javax.swing.JFrame {

    VeiculoDao veiculoDao = new VeiculoDao();
    Veiculo veiculo_dados = new Veiculo();
    String click_tabela_veiculo;
    String click_tabela_cliente;
=======

public class CadastroVeiculo extends javax.swing.JFrame {

    ClienteDao clienteDao = new ClienteDao();
    String click_tabela;
>>>>>>> Stashed changes

    public CadastroVeiculo() throws ErroSistema {
        initComponents();

<<<<<<< Updated upstream
        veiculoDao.actualizar_veiculos(tbl_veiculos_cadastrados);
        veiculoDao.actualizar_clientes(tbl_clientes_cadastrados);
=======
        clienteDao.actualizar_clientes(tbl_veiculos_cadastrados);
>>>>>>> Stashed changes

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        alterar1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cor = new javax.swing.JComboBox<>();
        matricula = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_clientes_cadastrados = new javax.swing.JTable();
        btnPesquisarCliente = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        pesquisaCliente = new javax.swing.JTextField();
        marca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        modelo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tipo = new javax.swing.JComboBox<>();
        ano = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        endereco = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nrDocumento = new javax.swing.JTextField();
        apelido = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_veiculos_cadastrados = new javax.swing.JTable();
        pesquisaVeiculo = new javax.swing.JTextField();
        btnPesquisarVeiculo = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        alterar1.setBackground(new java.awt.Color(204, 204, 204));
        alterar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        alterar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-pesquisar-na-nuvem-24.png"))); // NOI18N
        alterar1.setText("Pesquisar");
        alterar1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        alterar1.setBorderPainted(false);
        alterar1.setFocusPainted(false);
        alterar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterar1ActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gestão e operações de funcionários", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N

        jButton10.setBackground(new java.awt.Color(204, 204, 204));
        jButton10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-reconhecimento-de-impressões-digitais-64.png"))); // NOI18N
        jButton10.setText("Controle de Acesso");
        jButton10.setBorder(null);
        jButton10.setBorderPainted(false);
        jButton10.setFocusPainted(false);
        jButton10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton10.setMaximumSize(new java.awt.Dimension(219, 69));
        jButton10.setMinimumSize(new java.awt.Dimension(219, 69));
        jButton10.setPreferredSize(new java.awt.Dimension(219, 69));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(204, 204, 204));
        jButton11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-adicionar-usuário-masculino-64.png"))); // NOI18N
        jButton11.setText("Cadastrar Funcionário");
        jButton11.setBorder(null);
        jButton11.setBorderPainted(false);
        jButton11.setFocusPainted(false);
        jButton11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(204, 204, 204));
        jButton12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-adicionar-à-área-de-transferência-64.png"))); // NOI18N
        jButton12.setText("Dados Estatísticos");
        jButton12.setBorder(null);
        jButton12.setBorderPainted(false);
        jButton12.setFocusPainted(false);
        jButton12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11)
                    .addComponent(jButton12))
                .addGap(11, 11, 11))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Veículo");
        setBackground(new java.awt.Color(204, 255, 204));
        setMinimumSize(new java.awt.Dimension(977, 515));
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/matricula.jpg"))); // NOI18N
        jLabel2.setText("Matricula:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/RGB_Circle_1-80_icon-icons.com_57282.png"))); // NOI18N
        jLabel11.setText("Cor:");

        cor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a cor...", "Rosa", "Vermelho", "Laranja", "Marrom", "Amarelo", "Cinza", "Verde", "Preto", "Castanho", "Azul", "Violeta", "Ciano", "Magenta" }));
        cor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cor.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        cor.setMinimumSize(new java.awt.Dimension(2, 19));
        cor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corActionPerformed(evt);
            }
        });

        matricula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        matricula.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        matricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matriculaActionPerformed(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N

        tbl_clientes_cadastrados.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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
        tbl_clientes_cadastrados.setShowVerticalLines(false);
        tbl_clientes_cadastrados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_clientes_cadastradosMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbl_clientes_cadastrados);

        btnPesquisarCliente.setBackground(new java.awt.Color(204, 204, 204));
        btnPesquisarCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPesquisarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-pesquisar-na-nuvem-24.png"))); // NOI18N
        btnPesquisarCliente.setText("Pesquisar");
        btnPesquisarCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnPesquisarCliente.setBorderPainted(false);
        btnPesquisarCliente.setFocusPainted(false);
        btnPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarClienteActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Pesquisa...");

        pesquisaCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pesquisaCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pesquisaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(pesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        marca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        marca.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/audi_logo_icon_145842.png"))); // NOI18N
        jLabel3.setText("Marca:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/car_23964.png"))); // NOI18N
        jLabel8.setText("Modelo:");

        modelo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        modelo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        modelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeloActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ManageNameExt_30180.png"))); // NOI18N
        jLabel12.setText("Tipo:");

        tipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o tipo...", "Ligeiro", "Pesado", "Especial" }));
        tipo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tipo.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        tipo.setMinimumSize(new java.awt.Dimension(2, 19));
        tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoActionPerformed(evt);
            }
        });

        ano.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ano.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-calendário-24.png"))); // NOI18N
        jLabel9.setText("Ano:");

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/avatar-homem.png"))); // NOI18N
        jLabel4.setText("Nome:");

        nome.setEditable(false);
        nome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        nome.setEnabled(false);
        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });

        endereco.setEditable(false);
        endereco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        endereco.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        endereco.setEnabled(false);
        endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/endereco-residencial.png"))); // NOI18N
        jLabel13.setText("Endereço:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/tooltip_edit_icon_135097.png"))); // NOI18N
        jLabel5.setText("Apelido:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Nº de Documento: ");

<<<<<<< Updated upstream
        nrDocumento.setEditable(false);
=======
>>>>>>> Stashed changes
        nrDocumento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nrDocumento.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        nrDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nrDocumentoActionPerformed(evt);
            }
        });

        apelido.setEditable(false);
        apelido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        apelido.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        apelido.setEnabled(false);
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
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel13))
                .addGap(11, 11, 11)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< Updated upstream
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nrDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(apelido)))
=======
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(apelido)
                    .addComponent(nrDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
>>>>>>> Stashed changes
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(apelido, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(endereco, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                    .addComponent(nrDocumento, javax.swing.GroupLayout.Alignment.LEADING))
<<<<<<< Updated upstream
                .addContainerGap(11, Short.MAX_VALUE))
=======
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
>>>>>>> Stashed changes
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(matricula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(marca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modelo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tipo, 0, 235, Short.MAX_VALUE)
                            .addComponent(ano)))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11)))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(11, 11, 11))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnCadastrar.setBackground(new java.awt.Color(204, 204, 204));
        btnCadastrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-mais-24(1).png"))); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnCadastrar.setBorderPainted(false);
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
        btnRemover.setFocusPainted(false);
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
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
                .addComponent(btnCadastrar)
                .addGap(11, 11, 11)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(btnRemover)
                .addGap(11, 11, 11)
                .addComponent(btnCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterar, btnCadastrar, btnCancelar, btnRemover});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAlterar, btnCadastrar, btnCancelar, btnRemover});

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tbl_veiculos_cadastrados.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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
        tbl_veiculos_cadastrados.setShowVerticalLines(false);
        tbl_veiculos_cadastrados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_veiculos_cadastradosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_veiculos_cadastrados);

        pesquisaVeiculo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pesquisaVeiculo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pesquisaVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaVeiculoActionPerformed(evt);
            }
        });

        btnPesquisarVeiculo.setBackground(new java.awt.Color(204, 204, 204));
        btnPesquisarVeiculo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPesquisarVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-pesquisar-na-nuvem-24.png"))); // NOI18N
        btnPesquisarVeiculo.setText("Pesquisar");
        btnPesquisarVeiculo.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnPesquisarVeiculo.setBorderPainted(false);
        btnPesquisarVeiculo.setFocusPainted(false);
        btnPesquisarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarVeiculoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Pesquisa...");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPane3)
                .addGap(5, 5, 5))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(pesquisaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnPesquisarVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPesquisarVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesquisaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
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
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nrDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nrDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nrDocumentoActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:

<<<<<<< Updated upstream
        if (nome.getText().isEmpty() | apelido.getText().isEmpty() | endereco.getText().isEmpty() | nrDocumento.getText().isEmpty() | matricula.getText().isEmpty() | marca.getText().isEmpty() | modelo.getText().isEmpty() | ano.getText().isEmpty() | cor.getSelectedItem().toString().equals("Selecione a cor...") | tipo.getSelectedItem().toString().equals("Selecione o tipo...")) {
=======
        if (nome.getText().isEmpty() | nrDocumento.getText().isEmpty() | nome.getText().isEmpty() | matricula.getText().isEmpty() | sexo.getSelectedItem().toString().equals("Selecione o sexo...") | cor.getSelectedItem().toString().equals("Selecione o tipo...")) {
>>>>>>> Stashed changes

            JOptionPane.showMessageDialog(null, "Preencha todos os campos.", "Campo Vazio!", JOptionPane.WARNING_MESSAGE);

        } else {

<<<<<<< Updated upstream
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

=======
            Cliente cliente = new Cliente();
            cliente.setNome(nome.getText());
            cliente.setApelido(nrDocumento.getText());
            cliente.setContacto(nome.getText());
            cliente.setEndereco(endereco.getText());
            cliente.setSexo(sexo.getSelectedItem().toString());
            cliente.setTipoDocumento(cor.getSelectedItem().toString());
            cliente.setNrDocumento(matricula.getText());

            try {
                if (clienteDao.verificar_cliente(cliente.getIdCliente()) == true) {
                    JOptionPane.showMessageDialog(null, "O cliente já encontra-se cadastrado", "Paciente Existente!", JOptionPane.WARNING_MESSAGE);
                } else {
                    clienteDao.salvar(cliente);
>>>>>>> Stashed changes
                    nome.setText("");
                    nrDocumento.setText("");
                    endereco.setText("");
                    nome.setText("");
                    matricula.setText("");
<<<<<<< Updated upstream
                    marca.setText("");
                    modelo.setText("");
                    ano.setText("");
=======
                    sexo.setSelectedIndex(0);
>>>>>>> Stashed changes
                    cor.setSelectedIndex(0);
                    endereco.setText("");

                    clienteDao.actualizar_clientes(tbl_veiculos_cadastrados);
                }
            } catch (ErroSistema ex) {
                Logger.getLogger(CadastroVeiculo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:

<<<<<<< Updated upstream
        if (nome.getText().isEmpty() | apelido.getText().isEmpty() | endereco.getText().isEmpty() | nrDocumento.getText().isEmpty() | matricula.getText().isEmpty() | marca.getText().isEmpty() | modelo.getText().isEmpty() | ano.getText().isEmpty() | cor.getSelectedItem().toString().equals("Selecione a cor...") | tipo.getSelectedItem().toString().equals("Selecione o tipo...")) {
=======
        if (nome.getText().isEmpty() | nrDocumento.getText().isEmpty() | nome.getText().isEmpty() | matricula.getText().isEmpty() | sexo.getSelectedItem().toString().equals("Selecione o sexo...") | cor.getSelectedItem().toString().equals("Selecione o tipo...")) {
>>>>>>> Stashed changes

            JOptionPane.showMessageDialog(null, "Preencha todos os campos.", "Campo Vazio!", JOptionPane.WARNING_MESSAGE);

        } else {

            try {
<<<<<<< Updated upstream

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
=======
                Cliente cliente = new Cliente();
                cliente.setNome(nome.getText());
                cliente.setApelido(nrDocumento.getText());
                cliente.setContacto(nome.getText());
                cliente.setEndereco(endereco.getText());
                cliente.setSexo(sexo.getSelectedItem().toString());
                cliente.setTipoDocumento(cor.getSelectedItem().toString());
                cliente.setNrDocumento(matricula.getText());
                cliente.setIdCliente(Integer.parseInt(click_tabela));

                clienteDao.actualizar_dados_cliente(cliente);
>>>>>>> Stashed changes

                nome.setText("");
                nrDocumento.setText("");
                endereco.setText("");
                nome.setText("");
                matricula.setText("");
<<<<<<< Updated upstream
                marca.setText("");
                modelo.setText("");
                ano.setText("");
                cor.setSelectedIndex(0);
                tipo.setSelectedIndex(0);
=======
                sexo.setSelectedIndex(0);
                cor.setSelectedIndex(0);
                endereco.setText("");
>>>>>>> Stashed changes

                clienteDao.actualizar_clientes(tbl_veiculos_cadastrados);

            } catch (ErroSistema ex) {
                Logger.getLogger(CadastroVeiculo.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void tbl_veiculos_cadastradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_veiculos_cadastradosMouseClicked

        try {
            
            int linha = tbl_veiculos_cadastrados.getSelectedRow();
<<<<<<< Updated upstream
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

=======
            click_tabela = (tbl_veiculos_cadastrados.getModel().getValueAt(linha, 0).toString());
            
            Cliente cliente_p = clienteDao.carregar_cliente(click_tabela);
            
            nome.setText(cliente_p.getNome());
            nrDocumento.setText(cliente_p.getApelido());
            endereco.setText(cliente_p.getEndereco());
            sexo.setSelectedItem(cliente_p.getSexo());
            cor.setSelectedItem(cliente_p.getTipoDocumento());
            nome.setText(cliente_p.getContacto());
            matricula.setText(cliente_p.getNrDocumento());
            
>>>>>>> Stashed changes
        } catch (ErroSistema ex) {
            Logger.getLogger(CadastroVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_tbl_veiculos_cadastradosMouseClicked

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed

<<<<<<< Updated upstream
        if (click_tabela_veiculo != null) {
=======
        if (click_tabela != null) {
>>>>>>> Stashed changes
            try {
                clienteDao.deletar(Integer.parseInt(click_tabela));
                
                nome.setText("");
                nrDocumento.setText("");
                endereco.setText("");
                nome.setText("");
                matricula.setText("");
                sexo.setSelectedIndex(0);
                cor.setSelectedIndex(0);
                endereco.setText("");
                
                clienteDao.actualizar_clientes(tbl_veiculos_cadastrados);
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

<<<<<<< Updated upstream
    private void btnPesquisarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarVeiculoActionPerformed

        try {
            veiculoDao.carregar_veiculo_filtro(pesquisaVeiculo.getText(), tbl_veiculos_cadastrados);
=======
    private void alterar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterar1ActionPerformed

        try {
            clienteDao.carregar_cliente_filtro(pesquisaVeiculo.getText(), tbl_veiculos_cadastrados);
        } catch (ErroSistema ex) {
            Logger.getLogger(CadastroVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_alterar1ActionPerformed

    private void btnPesquisarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarVeiculoActionPerformed

        try {
            clienteDao.carregar_cliente_filtro(pesquisaVeiculo.getText(), tbl_veiculos_cadastrados);
>>>>>>> Stashed changes
        } catch (ErroSistema ex) {
            Logger.getLogger(CadastroVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnPesquisarVeiculoActionPerformed

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void pesquisaVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaVeiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisaVeiculoActionPerformed

    private void matriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matriculaActionPerformed

<<<<<<< Updated upstream
    private void tbl_clientes_cadastradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_clientes_cadastradosMouseClicked
=======
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        ControleAcesso controleAcesso = new ControleAcesso(userx);
        controleAcesso.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed
>>>>>>> Stashed changes

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:

<<<<<<< Updated upstream
            int linha = tbl_clientes_cadastrados.getSelectedRow();
            click_tabela_cliente = (tbl_clientes_cadastrados.getModel().getValueAt(linha, 0).toString());
=======
        CadastroFuncionario cadastroFuncionario = new CadastroFuncionario();
        cadastroFuncionario.setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed
>>>>>>> Stashed changes

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:

<<<<<<< Updated upstream
            nome.setText(cliente_p.getNome());
            apelido.setText(cliente_p.getApelido());
            endereco.setText(cliente_p.getEndereco());
            nrDocumento.setText(cliente_p.getNrDocumento());

            veiculo_dados.setIdCliente(cliente_p.getIdCliente());
            veiculo_dados.setNomeCliente(cliente_p.getNome());
            veiculo_dados.setApelidoCliente(cliente_p.getApelido());
            veiculo_dados.setEnderecoCliente(cliente_p.getEndereco());
            veiculo_dados.setNrDocumentoCliente(cliente_p.getNrDocumento());

        } catch (ErroSistema ex) {
            Logger.getLogger(CadastroVeiculo.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

=======
        DadosEstatisticos dadosEstatisticos = new DadosEstatisticos();
        dadosEstatisticos.setVisible(true);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void tbl_clientes_cadastradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_clientes_cadastradosMouseClicked
        // TODO add your handling code here:
>>>>>>> Stashed changes
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

    private void btnPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarClienteActionPerformed

    private void apelidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apelidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apelidoActionPerformed

    private void enderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CadastroVeiculo().setVisible(true);
                } catch (ErroSistema ex) {
                    Logger.getLogger(CadastroVeiculo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterar1;
    private javax.swing.JTextField ano;
    private javax.swing.JTextField apelido;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnPesquisarCliente;
    private javax.swing.JButton btnPesquisarVeiculo;
    private javax.swing.JButton btnRemover;
    private javax.swing.JComboBox<String> cor;
    private javax.swing.JTextField endereco;
<<<<<<< Updated upstream
=======
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
>>>>>>> Stashed changes
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
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
