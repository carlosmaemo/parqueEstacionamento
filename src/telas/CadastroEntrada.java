package telas;

import dao.ClienteDao;
import dao.EntradaDao;
import dao.VeiculoDao;
import excepcao.ErroSistema;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.Checklist;
import modelo.Cliente;
import modelo.Entrada;
import modelo.Preco;
import modelo.Vaga;
import modelo.Veiculo;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import util.Conecxao;

public class CadastroEntrada extends javax.swing.JFrame {

    EntradaDao entradaDao = new EntradaDao();
    Veiculo dados_veiculo = new Veiculo();
    Entrada dados_entrada = new Entrada();
    Entrada dados_entrada2 = new Entrada();
    Vaga dados_vaga = new Vaga();
    Preco dados_preco = new Preco();
    String click_tabela_veiculo;
    String click_tabela_entrada;
    String nomeUsuariox;
    double valorTotalPreco;

    double valorP;
    double trocoP;
    double dividaP;
    String operadorP;
    String relatorioDuracao;

    public CadastroEntrada(String nomeUsuario) throws ErroSistema {
        initComponents();

        nomeUsuariox = nomeUsuario;
        operador.setText(nomeUsuario);
        entradaDao.actualizar_data(data);
        entradaDao.actualizar_vagas(vaga);
        entradaDao.actualizar_veiculos(tbl_veiculos_cadastrados);
        entradaDao.actualizar_entradas(tbl_entradas_cadastrados);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_veiculos_cadastrados = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        pesquisaVeiculo = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        nrDocumento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        matricula = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        marca = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cor = new javax.swing.JTextField();
        tipo = new javax.swing.JTextField();
        modelo = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        ano = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        data = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        vaga = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        preco = new javax.swing.JTextField();
        operador = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        espacoDisponivel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        luzes = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        carroceria = new javax.swing.JTextField();
        pneu = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        pressao = new javax.swing.JTextField();
        vidros = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        observacao = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_entradas_cadastrados = new javax.swing.JTable();
        pesquisaEntrada = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        histNome = new javax.swing.JLabel();
        histValor = new javax.swing.JLabel();
        histHora = new javax.swing.JLabel();
        histValorTotal = new javax.swing.JLabel();
        histMatricula = new javax.swing.JLabel();
        histData = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        opTroco = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        opOperador = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        opDivida = new javax.swing.JLabel();
        opValorPagar = new javax.swing.JFormattedTextField();
        btnTerminar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Entrada");
        setBackground(new java.awt.Color(204, 255, 204));
        setMinimumSize(new java.awt.Dimension(977, 515));
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Veiculos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N

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
        tbl_veiculos_cadastrados.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbl_veiculos_cadastrados.setAutoscrolls(false);
        tbl_veiculos_cadastrados.setShowVerticalLines(false);
        tbl_veiculos_cadastrados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_veiculos_cadastradosMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbl_veiculos_cadastrados);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Pesquisa...");

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

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pesquisaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(pesquisaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Nome:");

        nome.setEditable(false);
        nome.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nome.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        nome.setEnabled(false);
        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Nº de Doc...:");

        nrDocumento.setEditable(false);
        nrDocumento.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nrDocumento.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        nrDocumento.setEnabled(false);
        nrDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nrDocumentoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Matricula:");

        matricula.setEditable(false);
        matricula.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        matricula.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        matricula.setEnabled(false);
        matricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matriculaActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Cor:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Tipo:");

        marca.setEditable(false);
        marca.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        marca.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        marca.setEnabled(false);
        marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Marca:");

        cor.setEditable(false);
        cor.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cor.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cor.setEnabled(false);
        cor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corActionPerformed(evt);
            }
        });

        tipo.setEditable(false);
        tipo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tipo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tipo.setEnabled(false);
        tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoActionPerformed(evt);
            }
        });

        modelo.setEditable(false);
        modelo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        modelo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        modelo.setEnabled(false);
        modelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeloActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Modelo:");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Ano:");

        ano.setEditable(false);
        ano.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        ano.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ano.setEnabled(false);
        ano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(nrDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(cor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nrDocumento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Entrada", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Hora/Data:");

        data.setEditable(false);
        data.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        data.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        data.setEnabled(false);
        data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Vaga:");

        vaga.setEditable(true);
        vaga.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        vaga.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        vaga.setEnabled(false);
        vaga.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        vaga.setMinimumSize(new java.awt.Dimension(2, 19));
        vaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vagaActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Valor/Hora:");

        preco.setEditable(false);
        preco.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        preco.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        preco.setEnabled(false);
        preco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precoActionPerformed(evt);
            }
        });

        operador.setEditable(false);
        operador.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        operador.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        operador.setEnabled(false);
        operador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operadorActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Operador:");

        btnActualizar.setBackground(new java.awt.Color(204, 204, 204));
        btnActualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-pesquisar-na-nuvem-24.png"))); // NOI18N
        btnActualizar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnActualizar.setBorderPainted(false);
        btnActualizar.setEnabled(false);
        btnActualizar.setFocusPainted(false);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("Disponível:");

        espacoDisponivel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        espacoDisponivel.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(operador)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(vaga, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(espacoDisponivel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(preco, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(vaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(espacoDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(preco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(operador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Checklist", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Luzes:");
        jLabel18.setPreferredSize(new java.awt.Dimension(50, 17));

        luzes.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        luzes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        luzes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luzesActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Vidros e faróis:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Carroceria:");

        carroceria.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        carroceria.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        carroceria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carroceriaActionPerformed(evt);
            }
        });

        pneu.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        pneu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pneu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pneuActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Pneu reserva:");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Pressão dos pneus:");

        pressao.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        pressao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pressao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pressaoActionPerformed(evt);
            }
        });

        vidros.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        vidros.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        vidros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vidrosActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Observações:");

        observacao.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        observacao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        observacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                observacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pressao))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(luzes, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(carroceria)))
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(observacao, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(vidros, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pneu)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(luzes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vidros, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carroceria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pneu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(observacao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pressao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
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
                .addComponent(btnCadastrar)
                .addGap(10, 10, 10)
                .addComponent(btnRemover)
                .addGap(10, 10, 10)
                .addComponent(btnCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCadastrar, btnCancelar, btnRemover});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)))
                .addGap(5, 5, 5))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCadastrar, btnCancelar, btnRemover});

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tbl_entradas_cadastrados.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tbl_entradas_cadastrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Entrada", "ID Veiculo", "ID Cliente", "ID Vaga", "Preço", "Preço Total", "Data Entrada", "Data Saida", "Operador", "Vaga", "Localização", "Descrição", "Matricula", "Marca", "Modelo", "Cor", "Tipo", "Ano", "Nome", "Nrº Documento", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_entradas_cadastrados.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbl_entradas_cadastrados.setAutoscrolls(false);
        tbl_entradas_cadastrados.setShowVerticalLines(false);
        tbl_entradas_cadastrados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_entradas_cadastradosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_entradas_cadastrados);

        pesquisaEntrada.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        pesquisaEntrada.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pesquisaEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaEntradaActionPerformed(evt);
            }
        });
        pesquisaEntrada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pesquisaEntradaKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Pesquisa...");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pesquisaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(390, 390, 390)))
                .addGap(10, 10, 10))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pesquisaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Entradas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Nome:");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("Matricula:");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Valor por Hora:");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("VALOR TOTAL:");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("Data Entrada:");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("Hora de Estacionamento:");

        histNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        histNome.setText("                                ");

        histValor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        histValor.setText("           ");

        histHora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        histHora.setText("      ");

        histValorTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        histValorTotal.setText("       ");

        histMatricula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        histMatricula.setText("                                  ");

        histData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        histData.setText("                        ");

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setText("Valor entregue:");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText("Troco:");

        opTroco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        opTroco.setText("                        ");

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText("Operador:");

        opOperador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        opOperador.setText("                                ");

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setText("Saldo em Dívida:");

        opDivida.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        opDivida.setText("                        ");

        opValorPagar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        opValorPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opValorPagarActionPerformed(evt);
            }
        });
        opValorPagar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                opValorPagarKeyReleased(evt);
            }
        });

        btnTerminar1.setBackground(new java.awt.Color(204, 204, 204));
        btnTerminar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTerminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-pesquisar-na-nuvem-24.png"))); // NOI18N
        btnTerminar1.setText("Terminar");
        btnTerminar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTerminar1.setEnabled(false);
        btnTerminar1.setFocusPainted(false);
        btnTerminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(histNome, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(histValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(histValorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(histHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(opOperador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                        .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(opValorPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(histData, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(histMatricula, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel36))
                                .addGap(11, 11, 11)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(opDivida, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                    .addComponent(opTroco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnTerminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel8Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel28, jLabel30, jLabel33, jLabel34, jLabel36});

        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(histNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(histMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(histValor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(histData, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(histHora, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opValorPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(histValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opDivida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTerminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nrDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nrDocumentoActionPerformed

    }//GEN-LAST:event_nrDocumentoActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        String id = null;
        
        if (nome.getText().isEmpty() | matricula.getText().isEmpty() | luzes.getText().isEmpty() | carroceria.getText().isEmpty() | pressao.getText().isEmpty() | vidros.getText().isEmpty() | pneu.getText().isEmpty() | observacao.getText().isEmpty() | data.getText().isEmpty() | preco.getText().isEmpty() | operador.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Preencha todos os campos.", "Campo Vazio!", JOptionPane.WARNING_MESSAGE);

        } else {

            Entrada entrada = new Entrada();
            Checklist checklist = new Checklist();

            entrada.setIdVeiculo(dados_entrada.getIdVeiculo());
            entrada.setIdCliente(dados_entrada.getIdCliente());
            entrada.setPreco(Double.parseDouble(preco.getText()));
            entrada.setPrecoTotal(Double.parseDouble(preco.getText()));
            entrada.setDataEntrada(data.getText());
            entrada.setDataSaida(null);
            entrada.setOperador(operador.getText());
            entrada.setVagaNome(vaga.getSelectedItem().toString());
            entrada.setVeiculoMatricula(dados_entrada.getVeiculoMatricula());
            entrada.setVeiculoMarca(dados_entrada.getVeiculoMarca());
            entrada.setVeiculoModelo(dados_entrada.getVeiculoModelo());
            entrada.setVeiculoCor(dados_entrada.getVeiculoCor());
            entrada.setVeiculoTipo(dados_entrada.getVeiculoTipo());
            entrada.setVeiculoAno(dados_entrada.getVeiculoAno());
            entrada.setClienteNome(dados_entrada.getClienteNome());
            entrada.setClienteNrDocumento(dados_entrada.getClienteNrDocumento());
            entrada.setEstado("dentro");

            checklist.setIdVeiculo(dados_entrada.getIdVeiculo());
            checklist.setLuzes(luzes.getText());
            checklist.setCarroceria(carroceria.getText());
            checklist.setPressao(pressao.getText());
            checklist.setVidros(vidros.getText());
            checklist.setPneu(pneu.getText());
            checklist.setObservacao(observacao.getText());

            try {

                if (entradaDao.verificar_entrada(dados_entrada.getVeiculoMatricula()) == true) {

                    JOptionPane.showMessageDialog(null, "O veículo já encontra-se no parque", "Veículo Dentro!", JOptionPane.WARNING_MESSAGE);

                } else if (entradaDao.verificar_lotacao(vaga.getSelectedItem().toString()) == true) {

                    JOptionPane.showMessageDialog(null, "Não há espaço na vaga selecionada", "Vaga Lotada!", JOptionPane.WARNING_MESSAGE);

                } else {

                    id = entradaDao.salvar(entrada, checklist);

                    nome.setText("");
                    nrDocumento.setText("");
                    matricula.setText("");
                    cor.setText("");
                    marca.setText("");
                    tipo.setText("");
                    modelo.setText("");
                    ano.setText("");
                    preco.setText("");

                    luzes.setText("");
                    vidros.setText("");
                    carroceria.setText("");
                    pneu.setText("");
                    pressao.setText("");
                    observacao.setText("");

                    histNome.setText("");
                    histValor.setText("");
                    histHora.setText("");
                    histValorTotal.setText("");
                    histMatricula.setText("");
                    histData.setText("");

                    opTroco.setText("");
                    opDivida.setText("");
                    opValorPagar.setText("");
                    opOperador.setText("");

                    entradaDao.verificar_espaco_disponivel(espacoDisponivel, vaga.getSelectedItem().toString());

                    entradaDao.actualizar_entradas(tbl_entradas_cadastrados);
                }

                Connection conexao = Conecxao.getConexao();

                // TROCAR ENDERECO QUANDO TROCAR A MAQUINA
                String src = "/Users/cmaemo/Desktop/Proxmeru/Repositórios/parqueEstacionamento/src/relatorio/ticket.jasper";

                Map<String, Object> params = new HashMap<>();
                params.put("idEntrada", id);

                JasperPrint jprint = null;

                jprint = JasperFillManager.fillReport(src, params, conexao);

                JasperViewer jview = new JasperViewer(jprint, false);
                jview.setVisible(true);

            } catch (ErroSistema | JRException ex) {
                Logger.getLogger(CadastroEntrada.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void tbl_entradas_cadastradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_entradas_cadastradosMouseClicked

        try {

            int linha = tbl_entradas_cadastrados.getSelectedRow();
            click_tabela_entrada = (tbl_entradas_cadastrados.getModel().getValueAt(linha, 0).toString());

            Entrada entrada_p = entradaDao.carregar_entrada(click_tabela_entrada);

            Checklist checklist_p = entradaDao.carregar_checklist(click_tabela_entrada);

            dados_entrada2.setDataEntrada(entrada_p.getDataEntrada());
            dados_entrada2.setPreco(entrada_p.getPreco());
            dados_entrada2.setIdEntrada(entrada_p.getIdEntrada());

            histNome.setText(entrada_p.getClienteNome());
            histValor.setText(String.valueOf(entrada_p.getPreco()) + " mt");

            String data1 = entrada_p.getDataEntrada();

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            String data2 = dtf.format(now);

            Date dataEntrada = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(data1);
            Date dataActual = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(data2);

            long duracaoTempo = dataActual.getTime() - dataEntrada.getTime();
            long duracao = (duracaoTempo / (1000 * 60 * 60)) % 24;

            histHora.setText(String.valueOf(duracao) + " horas");

            relatorioDuracao = String.valueOf(duracao) + " horas";

            double preco1 = entrada_p.getPreco();

            double valorTotal = preco1 * duracao;

            if (valorTotal == 0) {
                valorTotal = preco1;
            }

            valorTotalPreco = valorTotal;

            histValorTotal.setText(String.valueOf(valorTotal) + " mt");
            histMatricula.setText(entrada_p.getVeiculoMatricula());
            histData.setText(entrada_p.getDataEntrada());

            opOperador.setText(nomeUsuariox);
            opTroco.setText("0.0 mt");
            opDivida.setText(String.valueOf(valorTotalPreco) + " mt");

            luzes.setText(checklist_p.getLuzes());
            vidros.setText(checklist_p.getVidros());
            carroceria.setText(checklist_p.getCarroceria());
            pneu.setText(checklist_p.getPneu());
            pressao.setText(checklist_p.getPressao());
            observacao.setText(checklist_p.getObservacao());

            if (click_tabela_entrada != null || click_tabela_entrada.isEmpty() == false) {
                btnCadastrar.setEnabled(false);
                btnActualizar.setEnabled(false);
                vaga.setEnabled(false);
                btnRemover.setEnabled(true);
                btnTerminar1.setEnabled(true);
            }

        } catch (ErroSistema ex) {
            Logger.getLogger(CadastroEntrada.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(CadastroEntrada.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_tbl_entradas_cadastradosMouseClicked

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed

        if (click_tabela_entrada != null) {
            try {
                entradaDao.deletar(Integer.parseInt(click_tabela_entrada));

                nome.setText("");
                nrDocumento.setText("");
                matricula.setText("");
                cor.setText("");
                marca.setText("");
                tipo.setText("");
                modelo.setText("");
                ano.setText("");
                preco.setText("");

                luzes.setText("");
                vidros.setText("");
                carroceria.setText("");
                pneu.setText("");
                pressao.setText("");
                observacao.setText("");

                histNome.setText("");
                histValor.setText("");
                histHora.setText("");
                histValorTotal.setText("");
                histMatricula.setText("");
                histData.setText("");

                opTroco.setText("");
                opDivida.setText("");
                opValorPagar.setText("");
                opOperador.setText("");

                entradaDao.verificar_espaco_disponivel(espacoDisponivel, vaga.getSelectedItem().toString());

                entradaDao.actualizar_entradas(tbl_entradas_cadastrados);

            } catch (ErroSistema ex) {
                Logger.getLogger(CadastroEntrada.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void pesquisaEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisaEntradaActionPerformed

    private void matriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matriculaActionPerformed

    private void tbl_veiculos_cadastradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_veiculos_cadastradosMouseClicked

        try {

            int linha = tbl_veiculos_cadastrados.getSelectedRow();
            click_tabela_veiculo = (tbl_veiculos_cadastrados.getModel().getValueAt(linha, 0).toString());

            Veiculo veiculo_p = entradaDao.carregar_veiculo(click_tabela_veiculo);

            nome.setText(veiculo_p.getNomeCliente() + " " + veiculo_p.getApelidoCliente());
            nrDocumento.setText(veiculo_p.getNrDocumentoCliente());
            matricula.setText(veiculo_p.getMatricula());
            cor.setText(veiculo_p.getCor());
            marca.setText(veiculo_p.getMarca());
            tipo.setText(veiculo_p.getTipo());
            modelo.setText(veiculo_p.getModelo());
            ano.setText(veiculo_p.getAno());

            entradaDao.actualizar_preco(preco, veiculo_p);

            dados_entrada.setClienteNome(nome.getText());
            dados_entrada.setClienteNrDocumento(nrDocumento.getText());
            dados_entrada.setVeiculoMatricula(matricula.getText());
            dados_entrada.setVeiculoCor(cor.getText());
            dados_entrada.setVeiculoMarca(marca.getText());
            dados_entrada.setVeiculoTipo(tipo.getText());
            dados_entrada.setVeiculoModelo(modelo.getText());
            dados_entrada.setVeiculoAno(ano.getText());
            dados_entrada.setIdVeiculo(veiculo_p.getIdVeiculo());
            dados_entrada.setIdCliente(veiculo_p.getIdCliente());

            histNome.setText("");
            histValor.setText("");
            histHora.setText("");
            histValorTotal.setText("");
            histMatricula.setText("");
            histData.setText("");

            opTroco.setText("");
            opDivida.setText("");
            opValorPagar.setText("");
            opOperador.setText("");

            if (click_tabela_veiculo != null || click_tabela_veiculo.isEmpty() == false) {
                btnCadastrar.setEnabled(true);
                btnActualizar.setEnabled(true);
                vaga.setEnabled(true);
                btnRemover.setEnabled(false);
                btnTerminar1.setEnabled(false);
            }

        } catch (ErroSistema ex) {
            Logger.getLogger(CadastroEntrada.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_tbl_veiculos_cadastradosMouseClicked

    private void pesquisaVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaVeiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisaVeiculoActionPerformed

    private void corActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_corActionPerformed

    private void vagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vagaActionPerformed

        try {

            entradaDao.verificar_espaco_disponivel(espacoDisponivel, vaga.getSelectedItem().toString());

        } catch (ErroSistema ex) {
            Logger.getLogger(CadastroEntrada.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_vagaActionPerformed

    private void precoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precoActionPerformed

    private void operadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_operadorActionPerformed

    private void luzesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luzesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_luzesActionPerformed

    private void carroceriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carroceriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carroceriaActionPerformed

    private void pneuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pneuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pneuActionPerformed

    private void pressaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pressaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pressaoActionPerformed

    private void vidrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vidrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vidrosActionPerformed

    private void observacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_observacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_observacaoActionPerformed

    private void tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoActionPerformed

    private void marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marcaActionPerformed

    private void modeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modeloActionPerformed

    private void anoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anoActionPerformed

    private void dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        entradaDao.actualizar_data(data);

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void pesquisaVeiculoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisaVeiculoKeyPressed

        try {
            entradaDao.carregar_veiculo_filtro(pesquisaVeiculo.getText(), tbl_veiculos_cadastrados);
        } catch (ErroSistema ex) {
            Logger.getLogger(CadastroVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_pesquisaVeiculoKeyPressed

    private void pesquisaEntradaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisaEntradaKeyPressed

        try {
            entradaDao.carregar_entrada_filtro(pesquisaEntrada.getText(), tbl_entradas_cadastrados);
        } catch (ErroSistema ex) {
            Logger.getLogger(CadastroVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_pesquisaEntradaKeyPressed

    private void btnTerminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminar1ActionPerformed

        if (click_tabela_entrada == null) {

            JOptionPane.showMessageDialog(null, "Nenhuma entrada selecionado.", "Entrada não selecionado", JOptionPane.WARNING_MESSAGE);

        } else if (opValorPagar.getText() == null || opValorPagar.getText().isEmpty() == true) {

            JOptionPane.showMessageDialog(null, "Insira o valor a pagar.", "Valor inválido", JOptionPane.WARNING_MESSAGE);

        } else {

            try {

                dados_entrada2.setOpValor(valorP);
                dados_entrada2.setOpTroco(trocoP);
                dados_entrada2.setOpDivida(dividaP);
                dados_entrada2.setOpOperador(operadorP);

                entradaDao.actualizar_dados_entrada(dados_entrada2, nomeUsuariox);

                histNome.setText("");
                histValor.setText("");
                histHora.setText("");
                histValorTotal.setText("");
                histMatricula.setText("");
                histData.setText("");

                opValorPagar.setText("");
                opOperador.setText("");
                opDivida.setText("");
                opTroco.setText("");

                luzes.setText("");
                vidros.setText("");
                carroceria.setText("");
                pneu.setText("");
                pressao.setText("");
                observacao.setText("");

                btnTerminar1.setEnabled(false);

                entradaDao.verificar_espaco_disponivel(espacoDisponivel, vaga.getSelectedItem().toString());

                entradaDao.actualizar_entradas(tbl_entradas_cadastrados);

                Connection conexao = Conecxao.getConexao();

                // TROCAR ENDERECO QUANDO TROCAR A MAQUINA
                String src = "/Users/cmaemo/Desktop/Proxmeru/Repositórios/parqueEstacionamento/src/relatorio/factura.jasper";

                Map<String, Object> params = new HashMap<>();
                params.put("idEntrada", click_tabela_entrada);
                params.put("duracao", relatorioDuracao);

                JasperPrint jprint = null;

                jprint = JasperFillManager.fillReport(src, params, conexao);

                JasperViewer jview = new JasperViewer(jprint, false);
                jview.setVisible(true);

            } catch (ErroSistema | ParseException | JRException ex) {
                Logger.getLogger(CadastroEntrada.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_btnTerminar1ActionPerformed

    private void opValorPagarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_opValorPagarKeyReleased

        if (opValorPagar.getText().isEmpty() == false) {

            double valor = Double.valueOf(opValorPagar.getText());
            double precoTot = valorTotalPreco;
            double troco;
            double divida = 0;

            if (valor > precoTot) {
                troco = valor - precoTot;
                opTroco.setText(String.valueOf(troco) + " mt");
                opDivida.setText("0.0 mt");
            } else {
                troco = 0;
                divida = precoTot - valor;
                opDivida.setText(String.valueOf(divida) + " mt");
                opTroco.setText("0.0 mt");
            }

            valorP = valor;
            trocoP = troco;
            dividaP = divida;
            operadorP = nomeUsuariox;

        } else {

            opTroco.setText("0.0 mt");
            opDivida.setText(String.valueOf(valorTotalPreco) + " mt");

        }

    }//GEN-LAST:event_opValorPagarKeyReleased

    private void opValorPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opValorPagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opValorPagarActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroEntrada.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroEntrada.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroEntrada.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroEntrada.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CadastroEntrada(null).setVisible(true);

                } catch (ErroSistema ex) {
                    Logger.getLogger(CadastroEntrada.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ano;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnTerminar1;
    private javax.swing.JTextField carroceria;
    private javax.swing.JTextField cor;
    private javax.swing.JTextField data;
    private javax.swing.JLabel espacoDisponivel;
    private javax.swing.JLabel histData;
    private javax.swing.JLabel histHora;
    private javax.swing.JLabel histMatricula;
    private javax.swing.JLabel histNome;
    private javax.swing.JLabel histValor;
    private javax.swing.JLabel histValorTotal;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField luzes;
    private javax.swing.JTextField marca;
    private javax.swing.JTextField matricula;
    private javax.swing.JTextField modelo;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField nrDocumento;
    private javax.swing.JTextField observacao;
    private javax.swing.JLabel opDivida;
    private javax.swing.JLabel opOperador;
    private javax.swing.JLabel opTroco;
    private javax.swing.JFormattedTextField opValorPagar;
    private javax.swing.JTextField operador;
    private javax.swing.JTextField pesquisaEntrada;
    private javax.swing.JTextField pesquisaVeiculo;
    private javax.swing.JTextField pneu;
    private javax.swing.JTextField preco;
    private javax.swing.JTextField pressao;
    private javax.swing.JTable tbl_entradas_cadastrados;
    private javax.swing.JTable tbl_veiculos_cadastrados;
    private javax.swing.JTextField tipo;
    private javax.swing.JComboBox<String> vaga;
    private javax.swing.JTextField vidros;
    // End of variables declaration//GEN-END:variables
}
