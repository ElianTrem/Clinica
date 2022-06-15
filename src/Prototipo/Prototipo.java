/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototipo;

import desplazable.Desface;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import java.util.Calendar;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import javax.swing.JTextField;

/**
 *
 * @author El!an
 */
public class Prototipo extends javax.swing.JFrame {

    Desface desplace;
    private int xMouse;
    private int yMouse;

    public Prototipo() {
        initComponents();
        desplace = new Desface();
        setLocationRelativeTo(null);
        mostar();
        mostar2();
        mostrar3();
        Inicio.setVisible(true);
        Clientes.setVisible(false);
        Citas.setVisible(false);
        Tratamiento.setVisible(false);
        panelMod.setVisible(false);
        AggtraPanel.setVisible(false);
    }
    public static String confirmacion = "";
    public static String auxname, auxape, auxtel, auxmail, auxprice, auxnt, idcombo, idtrata, idtt;
    public static Date auxfen, auxlc;
    public static int identidad = 0;
    public static int aggomod = 0, agmodcita = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        Minimizar = new javax.swing.JPanel();
        MinimizarTxt = new javax.swing.JLabel();
        MenuPlegable = new javax.swing.JPanel();
        BtnCitas = new javax.swing.JLabel();
        Desplazo = new javax.swing.JLabel();
        BtnInicio = new javax.swing.JLabel();
        BtnCliente = new javax.swing.JLabel();
        BtnTratamiento = new javax.swing.JLabel();
        Inicio = new javax.swing.JPanel();
        favicon = new javax.swing.JLabel();
        modcontra = new javax.swing.JPanel();
        ModPass = new javax.swing.JLabel();
        panelMod = new javax.swing.JPanel();
        passTxt = new javax.swing.JPasswordField();
        Confpass = new javax.swing.JPasswordField();
        Confirmar = new javax.swing.JPanel();
        modTxt = new javax.swing.JLabel();
        Npass = new javax.swing.JLabel();
        confpasss = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        logout = new javax.swing.JPanel();
        lo = new javax.swing.JLabel();
        Clientes = new javax.swing.JPanel();
        Tabla = new javax.swing.JPanel();
        favicon4 = new javax.swing.JLabel();
        Scroll = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        IngresarBtn = new javax.swing.JPanel();
        Ingresartxt = new javax.swing.JLabel();
        EliminarBtn = new javax.swing.JPanel();
        Eliminartxt = new javax.swing.JLabel();
        ModificarBtn = new javax.swing.JPanel();
        Modificartxt = new javax.swing.JLabel();
        UpdateBtn = new javax.swing.JPanel();
        Updatetxt = new javax.swing.JLabel();
        AscBtn = new javax.swing.JPanel();
        Asctxt = new javax.swing.JLabel();
        DscBtn = new javax.swing.JPanel();
        DscTxt = new javax.swing.JLabel();
        Citas = new javax.swing.JPanel();
        favicon2 = new javax.swing.JLabel();
        Scroll1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        InrBtn = new javax.swing.JPanel();
        Aggcita = new javax.swing.JLabel();
        Delcitabtn = new javax.swing.JPanel();
        DelCita = new javax.swing.JLabel();
        ModcitarBtn = new javax.swing.JPanel();
        Modcita = new javax.swing.JLabel();
        reminderBtn = new javax.swing.JPanel();
        reminderMail = new javax.swing.JLabel();
        UpdateBtn2 = new javax.swing.JPanel();
        Actucitas = new javax.swing.JLabel();
        Addmodcitas = new javax.swing.JPanel();
        Clientecombox = new javax.swing.JComboBox<>();
        tratacombox = new javax.swing.JComboBox<>();
        txtFecha1 = new com.toedter.calendar.JDateChooser();
        Tratamiento = new javax.swing.JPanel();
        favicon1 = new javax.swing.JLabel();
        Scroll2 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        Addtrat = new javax.swing.JPanel();
        Addtra = new javax.swing.JLabel();
        Deltrat = new javax.swing.JPanel();
        Deltra = new javax.swing.JLabel();
        Modtrat = new javax.swing.JPanel();
        modtra = new javax.swing.JLabel();
        actutrat = new javax.swing.JPanel();
        Updatra = new javax.swing.JLabel();
        AggtraPanel = new javax.swing.JPanel();
        nombret = new javax.swing.JTextField();
        precio = new javax.swing.JTextField();
        ConTratamiento = new javax.swing.JPanel();
        Confi = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        jPanel1.setName(""); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(251, 248, 241));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(251, 248, 241));

        exitTxt.setBackground(new java.awt.Color(251, 248, 241));
        exitTxt.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        exitTxt.setForeground(new java.awt.Color(84, 186, 185));
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitTxt.setPreferredSize(new java.awt.Dimension(40, 40));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Minimizar.setBackground(new java.awt.Color(251, 248, 241));

        MinimizarTxt.setBackground(new java.awt.Color(251, 248, 241));
        MinimizarTxt.setFont(new java.awt.Font("Roboto Light", 0, 48)); // NOI18N
        MinimizarTxt.setForeground(new java.awt.Color(84, 186, 185));
        MinimizarTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MinimizarTxt.setText("-");
        MinimizarTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MinimizarTxt.setPreferredSize(new java.awt.Dimension(40, 40));
        MinimizarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizarTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MinimizarTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MinimizarTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout MinimizarLayout = new javax.swing.GroupLayout(Minimizar);
        Minimizar.setLayout(MinimizarLayout);
        MinimizarLayout.setHorizontalGroup(
            MinimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MinimizarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MinimizarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MinimizarLayout.setVerticalGroup(
            MinimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MinimizarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(MinimizarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap(1094, Short.MAX_VALUE)
                .addComponent(Minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 40));

        MenuPlegable.setBackground(new java.awt.Color(247, 236, 222));
        MenuPlegable.setLayout(null);

        BtnCitas.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        BtnCitas.setForeground(new java.awt.Color(84, 186, 185));
        BtnCitas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        BtnCitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/factura2.png"))); // NOI18N
        BtnCitas.setText("Citas");
        BtnCitas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        BtnCitas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCitas.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        BtnCitas.setIconTextGap(15);
        BtnCitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCitasMouseClicked(evt);
            }
        });
        MenuPlegable.add(BtnCitas);
        BtnCitas.setBounds(0, 160, 220, 50);

        Desplazo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Desplazo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/menu2.png"))); // NOI18N
        Desplazo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        Desplazo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Desplazo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DesplazoMouseClicked(evt);
            }
        });
        MenuPlegable.add(Desplazo);
        Desplazo.setBounds(0, 10, 220, 40);

        BtnInicio.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        BtnInicio.setForeground(new java.awt.Color(84, 186, 185));
        BtnInicio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        BtnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/inicio2.png"))); // NOI18N
        BtnInicio.setText("Inicio");
        BtnInicio.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        BtnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnInicio.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        BtnInicio.setIconTextGap(15);
        BtnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnInicioMouseClicked(evt);
            }
        });
        MenuPlegable.add(BtnInicio);
        BtnInicio.setBounds(0, 50, 220, 50);

        BtnCliente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        BtnCliente.setForeground(new java.awt.Color(84, 186, 185));
        BtnCliente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        BtnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/usuario2.png"))); // NOI18N
        BtnCliente.setText("Clientes");
        BtnCliente.setToolTipText("");
        BtnCliente.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        BtnCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCliente.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        BtnCliente.setIconTextGap(15);
        BtnCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnClienteMouseClicked(evt);
            }
        });
        MenuPlegable.add(BtnCliente);
        BtnCliente.setBounds(0, 100, 220, 50);

        BtnTratamiento.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        BtnTratamiento.setForeground(new java.awt.Color(84, 186, 185));
        BtnTratamiento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        BtnTratamiento.setIcon(new javax.swing.ImageIcon("C:\\Users\\elian\\OneDrive\\Desktop\\JAVA\\Prototipo\\src\\Icons\\medicina.png")); // NOI18N
        BtnTratamiento.setText("Tratamientos");
        BtnTratamiento.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        BtnTratamiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnTratamiento.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        BtnTratamiento.setIconTextGap(15);
        BtnTratamiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnTratamientoMouseClicked(evt);
            }
        });
        MenuPlegable.add(BtnTratamiento);
        BtnTratamiento.setBounds(0, 220, 220, 50);

        jPanel1.add(MenuPlegable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 220, 670));

        Inicio.setBackground(new java.awt.Color(233, 218, 193));
        Inicio.setPreferredSize(new java.awt.Dimension(50, 560));
        Inicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        favicon.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        favicon.setForeground(new java.awt.Color(255, 255, 255));
        favicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/logo1.png"))); // NOI18N
        favicon.setText("Clinica La Esperanza");
        Inicio.add(favicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(771, 13, -1, 91));

        modcontra.setBackground(new java.awt.Color(84, 186, 185));
        modcontra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modcontraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modcontraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modcontraMouseExited(evt);
            }
        });

        ModPass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ModPass.setText("Modificar contraseña");

        javax.swing.GroupLayout modcontraLayout = new javax.swing.GroupLayout(modcontra);
        modcontra.setLayout(modcontraLayout);
        modcontraLayout.setHorizontalGroup(
            modcontraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modcontraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ModPass, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );
        modcontraLayout.setVerticalGroup(
            modcontraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ModPass, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Inicio.add(modcontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 220, -1));

        panelMod.setBackground(new java.awt.Color(233, 218, 193));

        passTxt.setBackground(new java.awt.Color(251, 248, 241));
        passTxt.setForeground(new java.awt.Color(204, 204, 204));
        passTxt.setText("********");
        passTxt.setBorder(null);
        passTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passTxtMousePressed(evt);
            }
        });
        passTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTxtActionPerformed(evt);
            }
        });

        Confpass.setBackground(new java.awt.Color(251, 248, 241));
        Confpass.setForeground(new java.awt.Color(204, 204, 204));
        Confpass.setText("********");
        Confpass.setBorder(null);
        Confpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ConfpassMousePressed(evt);
            }
        });
        Confpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfpassActionPerformed(evt);
            }
        });

        Confirmar.setBackground(new java.awt.Color(84, 186, 185));
        Confirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfirmarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ConfirmarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ConfirmarMouseExited(evt);
            }
        });

        modTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        modTxt.setText("Cambiar");
        modTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ConfirmarLayout = new javax.swing.GroupLayout(Confirmar);
        Confirmar.setLayout(ConfirmarLayout);
        ConfirmarLayout.setHorizontalGroup(
            ConfirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConfirmarLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(modTxt)
                .addContainerGap())
        );
        ConfirmarLayout.setVerticalGroup(
            ConfirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(modTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Npass.setText("Digite nueva contraseña");

        confpasss.setText("Escriba nuevamente la contraseña");

        javax.swing.GroupLayout panelModLayout = new javax.swing.GroupLayout(panelMod);
        panelMod.setLayout(panelModLayout);
        panelModLayout.setHorizontalGroup(
            panelModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(panelModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confpasss)
                    .addComponent(Npass)
                    .addComponent(Confpass, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        panelModLayout.setVerticalGroup(
            panelModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(Npass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(confpasss)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Confpass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        Inicio.add(panelMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, 420, 400));

        logout.setBackground(new java.awt.Color(255, 0, 0));
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        lo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lo.setText("CERRAR SESION");

        javax.swing.GroupLayout logoutLayout = new javax.swing.GroupLayout(logout);
        logout.setLayout(logoutLayout);
        logoutLayout.setHorizontalGroup(
            logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutLayout.createSequentialGroup()
                .addComponent(lo)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        logoutLayout.setVerticalGroup(
            logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Inicio.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 100, 40));

        jPanel1.add(Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1220, 670));

        Clientes.setVisible(false);
        Clientes.setBackground(new java.awt.Color(204, 255, 255));
        Clientes.setPreferredSize(new java.awt.Dimension(50, 560));

        Tabla.setBackground(new java.awt.Color(239, 255, 253));
        Tabla.setPreferredSize(new java.awt.Dimension(50, 560));
        Tabla.setLayout(null);

        favicon4.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        favicon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/logo1.png"))); // NOI18N
        favicon4.setText("Clinica La Esperanza");
        Tabla.add(favicon4);
        favicon4.setBounds(760, 10, 426, 91);

        Scroll.setBackground(new java.awt.Color(239, 255, 253));
        Scroll.setBorder(null);
        Scroll.setToolTipText("");
        Scroll.setOpaque(false);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(133, 244, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Apellido", "Edad", "Telefono", "Correo", "Fecha de nacimiento", "Ultimo Chequeo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setFocusable(false);
        jTable1.setRowHeight(24);
        jTable1.setSelectionBackground(new java.awt.Color(66, 194, 255));
        jTable1.setShowHorizontalLines(false);
        jTable1.setShowVerticalLines(false);
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.setUpdateSelectionOnSort(false);
        jTable1.setVerifyInputWhenFocusTarget(false);
        Scroll.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(2);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(35);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(45);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(2);
            jTable1.getColumnModel().getColumn(3).setHeaderValue("Edad");
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(4).setHeaderValue("Telefono");
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(5).setHeaderValue("Correo");
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(75);
            jTable1.getColumnModel().getColumn(6).setHeaderValue("Fecha de nacimiento");
            jTable1.getColumnModel().getColumn(7).setResizable(false);
            jTable1.getColumnModel().getColumn(7).setHeaderValue("Ultimo Chequeo");
        }

        Tabla.add(Scroll);
        Scroll.setBounds(100, 110, 1100, 320);

        IngresarBtn.setBackground(new java.awt.Color(84, 186, 185));

        Ingresartxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Ingresartxt.setText("Ingresar");
        Ingresartxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IngresartxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IngresartxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IngresartxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout IngresarBtnLayout = new javax.swing.GroupLayout(IngresarBtn);
        IngresarBtn.setLayout(IngresarBtnLayout);
        IngresarBtnLayout.setHorizontalGroup(
            IngresarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IngresarBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Ingresartxt)
                .addGap(24, 24, 24))
        );
        IngresarBtnLayout.setVerticalGroup(
            IngresarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Ingresartxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Tabla.add(IngresarBtn);
        IngresarBtn.setBounds(100, 580, 100, 40);

        EliminarBtn.setBackground(new java.awt.Color(84, 186, 185));

        Eliminartxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Eliminartxt.setText("Eliminar ");
        Eliminartxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminartxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EliminartxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EliminartxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout EliminarBtnLayout = new javax.swing.GroupLayout(EliminarBtn);
        EliminarBtn.setLayout(EliminarBtnLayout);
        EliminarBtnLayout.setHorizontalGroup(
            EliminarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EliminarBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Eliminartxt)
                .addContainerGap())
        );
        EliminarBtnLayout.setVerticalGroup(
            EliminarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Eliminartxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Tabla.add(EliminarBtn);
        EliminarBtn.setBounds(210, 580, 100, 40);

        ModificarBtn.setBackground(new java.awt.Color(84, 186, 185));

        Modificartxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Modificartxt.setText("Modificar");
        Modificartxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModificartxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ModificartxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ModificartxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ModificarBtnLayout = new javax.swing.GroupLayout(ModificarBtn);
        ModificarBtn.setLayout(ModificarBtnLayout);
        ModificarBtnLayout.setHorizontalGroup(
            ModificarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModificarBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Modificartxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );
        ModificarBtnLayout.setVerticalGroup(
            ModificarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Modificartxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Tabla.add(ModificarBtn);
        ModificarBtn.setBounds(330, 580, 110, 40);

        UpdateBtn.setBackground(new java.awt.Color(84, 186, 185));

        Updatetxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Updatetxt.setText("Actualizar");
        Updatetxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdatetxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UpdatetxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UpdatetxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout UpdateBtnLayout = new javax.swing.GroupLayout(UpdateBtn);
        UpdateBtn.setLayout(UpdateBtnLayout);
        UpdateBtnLayout.setHorizontalGroup(
            UpdateBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpdateBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Updatetxt)
                .addGap(24, 24, 24))
        );
        UpdateBtnLayout.setVerticalGroup(
            UpdateBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Updatetxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Tabla.add(UpdateBtn);
        UpdateBtn.setBounds(480, 580, 110, 40);

        AscBtn.setBackground(new java.awt.Color(84, 186, 185));

        Asctxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Asctxt.setText("Ascendente");
        Asctxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AsctxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AsctxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AsctxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout AscBtnLayout = new javax.swing.GroupLayout(AscBtn);
        AscBtn.setLayout(AscBtnLayout);
        AscBtnLayout.setHorizontalGroup(
            AscBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AscBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Asctxt)
                .addGap(24, 24, 24))
        );
        AscBtnLayout.setVerticalGroup(
            AscBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Asctxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Tabla.add(AscBtn);
        AscBtn.setBounds(1060, 580, 140, 40);

        DscBtn.setBackground(new java.awt.Color(84, 186, 185));

        DscTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DscTxt.setText("Descendente");
        DscTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DscTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DscTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DscTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout DscBtnLayout = new javax.swing.GroupLayout(DscBtn);
        DscBtn.setLayout(DscBtnLayout);
        DscBtnLayout.setHorizontalGroup(
            DscBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DscBtnLayout.createSequentialGroup()
                .addComponent(DscTxt)
                .addGap(0, 11, Short.MAX_VALUE))
        );
        DscBtnLayout.setVerticalGroup(
            DscBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DscTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Tabla.add(DscBtn);
        DscBtn.setBounds(910, 580, 130, 40);

        javax.swing.GroupLayout ClientesLayout = new javax.swing.GroupLayout(Clientes);
        Clientes.setLayout(ClientesLayout);
        ClientesLayout.setHorizontalGroup(
            ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ClientesLayout.setVerticalGroup(
            ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(Clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1220, 670));

        Citas.setBackground(new java.awt.Color(254, 227, 236));
        Citas.setPreferredSize(new java.awt.Dimension(50, 560));
        Citas.setLayout(null);

        favicon2.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        favicon2.setForeground(new java.awt.Color(255, 255, 255));
        favicon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/logo1.png"))); // NOI18N
        favicon2.setText("Clinica La Esperanza");
        Citas.add(favicon2);
        favicon2.setBounds(780, 0, 426, 91);

        Scroll1.setBackground(new java.awt.Color(239, 255, 253));
        Scroll1.setBorder(null);
        Scroll1.setToolTipText("");
        Scroll1.setOpaque(false);

        jTable2.setAutoCreateRowSorter(true);
        jTable2.setBackground(new java.awt.Color(249, 197, 213));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Apellido", "Edad", "Correo", "Fecha Cita", "Tratamiento", "Costo", "Ultimo Chequeo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setAutoscrolls(false);
        jTable2.setRowHeight(24);
        jTable2.setSelectionBackground(new java.awt.Color(249, 153, 183));
        jTable2.setShowHorizontalLines(false);
        jTable2.setShowVerticalLines(false);
        jTable2.getTableHeader().setResizingAllowed(false);
        jTable2.getTableHeader().setReorderingAllowed(false);
        jTable2.setUpdateSelectionOnSort(false);
        jTable2.setVerifyInputWhenFocusTarget(false);
        Scroll1.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(2);
            jTable2.getColumnModel().getColumn(0).setHeaderValue("Id");
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(35);
            jTable2.getColumnModel().getColumn(1).setHeaderValue("Nombre");
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(45);
            jTable2.getColumnModel().getColumn(2).setHeaderValue("Apellido");
            jTable2.getColumnModel().getColumn(3).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setPreferredWidth(2);
            jTable2.getColumnModel().getColumn(3).setHeaderValue("Edad");
            jTable2.getColumnModel().getColumn(4).setResizable(false);
            jTable2.getColumnModel().getColumn(4).setPreferredWidth(200);
            jTable2.getColumnModel().getColumn(4).setHeaderValue("Correo");
            jTable2.getColumnModel().getColumn(5).setResizable(false);
            jTable2.getColumnModel().getColumn(5).setHeaderValue("Fecha Cita");
            jTable2.getColumnModel().getColumn(6).setResizable(false);
            jTable2.getColumnModel().getColumn(6).setHeaderValue("Tratamiento");
            jTable2.getColumnModel().getColumn(7).setResizable(false);
            jTable2.getColumnModel().getColumn(7).setHeaderValue("Costo");
            jTable2.getColumnModel().getColumn(8).setResizable(false);
            jTable2.getColumnModel().getColumn(8).setHeaderValue("Ultimo Chequeo");
        }

        Citas.add(Scroll1);
        Scroll1.setBounds(90, 90, 1119, 340);

        InrBtn.setBackground(new java.awt.Color(242, 120, 159));

        Aggcita.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Aggcita.setText("Ingresar");
        Aggcita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AggcitaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AggcitaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AggcitaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout InrBtnLayout = new javax.swing.GroupLayout(InrBtn);
        InrBtn.setLayout(InrBtnLayout);
        InrBtnLayout.setHorizontalGroup(
            InrBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InrBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Aggcita)
                .addGap(24, 24, 24))
        );
        InrBtnLayout.setVerticalGroup(
            InrBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Aggcita, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Citas.add(InrBtn);
        InrBtn.setBounds(90, 580, 100, 40);

        Delcitabtn.setBackground(new java.awt.Color(242, 120, 159));

        DelCita.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DelCita.setText("Eliminar ");
        DelCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DelCitaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DelCitaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DelCitaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout DelcitabtnLayout = new javax.swing.GroupLayout(Delcitabtn);
        Delcitabtn.setLayout(DelcitabtnLayout);
        DelcitabtnLayout.setHorizontalGroup(
            DelcitabtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DelcitabtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DelCita)
                .addContainerGap())
        );
        DelcitabtnLayout.setVerticalGroup(
            DelcitabtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DelCita, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Citas.add(Delcitabtn);
        Delcitabtn.setBounds(210, 580, 100, 40);

        ModcitarBtn.setBackground(new java.awt.Color(242, 120, 159));

        Modcita.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Modcita.setText("Modificar");
        Modcita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModcitaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ModcitaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ModcitaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ModcitarBtnLayout = new javax.swing.GroupLayout(ModcitarBtn);
        ModcitarBtn.setLayout(ModcitarBtnLayout);
        ModcitarBtnLayout.setHorizontalGroup(
            ModcitarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModcitarBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Modcita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );
        ModcitarBtnLayout.setVerticalGroup(
            ModcitarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Modcita, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Citas.add(ModcitarBtn);
        ModcitarBtn.setBounds(330, 580, 110, 40);

        reminderBtn.setBackground(new java.awt.Color(242, 120, 159));

        reminderMail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        reminderMail.setText("Enviar Recordatorio");
        reminderMail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reminderMailMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reminderMailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reminderMailMouseExited(evt);
            }
        });

        javax.swing.GroupLayout reminderBtnLayout = new javax.swing.GroupLayout(reminderBtn);
        reminderBtn.setLayout(reminderBtnLayout);
        reminderBtnLayout.setHorizontalGroup(
            reminderBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reminderBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(reminderMail)
                .addGap(38, 38, 38))
        );
        reminderBtnLayout.setVerticalGroup(
            reminderBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reminderMail, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Citas.add(reminderBtn);
        reminderBtn.setBounds(820, 580, 200, 40);

        UpdateBtn2.setBackground(new java.awt.Color(242, 120, 159));

        Actucitas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Actucitas.setText("Actualizar");
        Actucitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ActucitasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ActucitasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ActucitasMouseExited(evt);
            }
        });

        javax.swing.GroupLayout UpdateBtn2Layout = new javax.swing.GroupLayout(UpdateBtn2);
        UpdateBtn2.setLayout(UpdateBtn2Layout);
        UpdateBtn2Layout.setHorizontalGroup(
            UpdateBtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpdateBtn2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Actucitas)
                .addGap(24, 24, 24))
        );
        UpdateBtn2Layout.setVerticalGroup(
            UpdateBtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Actucitas, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Citas.add(UpdateBtn2);
        UpdateBtn2.setBounds(480, 580, 110, 40);

        Addmodcitas.setBackground(new java.awt.Color(254, 227, 236));

        Clientecombox.setMaximumRowCount(100);

        tratacombox.setMaximumRowCount(100);

        javax.swing.GroupLayout AddmodcitasLayout = new javax.swing.GroupLayout(Addmodcitas);
        Addmodcitas.setLayout(AddmodcitasLayout);
        AddmodcitasLayout.setHorizontalGroup(
            AddmodcitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddmodcitasLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(Clientecombox, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(tratacombox, 0, 316, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(txtFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        AddmodcitasLayout.setVerticalGroup(
            AddmodcitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddmodcitasLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(AddmodcitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFecha1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tratacombox, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(Clientecombox))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        Citas.add(Addmodcitas);
        Addmodcitas.setBounds(240, 450, 960, 100);

        jPanel1.add(Citas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1220, 670));

        Tratamiento.setBackground(new java.awt.Color(233, 218, 193));
        Tratamiento.setPreferredSize(new java.awt.Dimension(50, 560));
        Tratamiento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        favicon1.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        favicon1.setForeground(new java.awt.Color(255, 255, 255));
        favicon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/logo1.png"))); // NOI18N
        favicon1.setText("Clinica La Esperanza");
        Tratamiento.add(favicon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(771, 13, -1, 91));

        Scroll2.setBackground(new java.awt.Color(239, 255, 253));
        Scroll2.setBorder(null);
        Scroll2.setToolTipText("");
        Scroll2.setOpaque(false);

        jTable3.setAutoCreateRowSorter(true);
        jTable3.setBackground(new java.awt.Color(233, 218, 193));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Id", "Tratamiento", "Costo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setFillsViewportHeight(true);
        jTable3.setFocusCycleRoot(true);
        jTable3.setRowHeight(24);
        jTable3.setSelectionBackground(new java.awt.Color(190, 140, 99));
        jTable3.setShowHorizontalLines(false);
        jTable3.setShowVerticalLines(false);
        jTable3.getTableHeader().setResizingAllowed(false);
        jTable3.getTableHeader().setReorderingAllowed(false);
        jTable3.setUpdateSelectionOnSort(false);
        jTable3.setVerifyInputWhenFocusTarget(false);
        Scroll2.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setResizable(false);
            jTable3.getColumnModel().getColumn(0).setPreferredWidth(2);
            jTable3.getColumnModel().getColumn(1).setResizable(false);
            jTable3.getColumnModel().getColumn(1).setPreferredWidth(35);
            jTable3.getColumnModel().getColumn(2).setResizable(false);
            jTable3.getColumnModel().getColumn(2).setPreferredWidth(45);
        }

        Tratamiento.add(Scroll2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 890, 310));

        Addtrat.setBackground(new java.awt.Color(190, 140, 99));

        Addtra.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Addtra.setText("Ingresar");
        Addtra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddtraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddtraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddtraMouseExited(evt);
            }
        });

        javax.swing.GroupLayout AddtratLayout = new javax.swing.GroupLayout(Addtrat);
        Addtrat.setLayout(AddtratLayout);
        AddtratLayout.setHorizontalGroup(
            AddtratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddtratLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Addtra)
                .addGap(24, 24, 24))
        );
        AddtratLayout.setVerticalGroup(
            AddtratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Addtra, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Tratamiento.add(Addtrat, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 590, -1, -1));

        Deltrat.setBackground(new java.awt.Color(190, 140, 99));

        Deltra.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Deltra.setText("Eliminar ");
        Deltra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeltraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DeltraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DeltraMouseExited(evt);
            }
        });

        javax.swing.GroupLayout DeltratLayout = new javax.swing.GroupLayout(Deltrat);
        Deltrat.setLayout(DeltratLayout);
        DeltratLayout.setHorizontalGroup(
            DeltratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeltratLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Deltra)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DeltratLayout.setVerticalGroup(
            DeltratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Deltra, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Tratamiento.add(Deltrat, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 590, -1, -1));

        Modtrat.setBackground(new java.awt.Color(190, 140, 99));

        modtra.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        modtra.setText("Modificar");
        modtra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modtraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modtraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modtraMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ModtratLayout = new javax.swing.GroupLayout(Modtrat);
        Modtrat.setLayout(ModtratLayout);
        ModtratLayout.setHorizontalGroup(
            ModtratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModtratLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(modtra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );
        ModtratLayout.setVerticalGroup(
            ModtratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(modtra, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Tratamiento.add(Modtrat, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 590, -1, -1));

        actutrat.setBackground(new java.awt.Color(190, 140, 99));

        Updatra.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Updatra.setText("Actualizar");
        Updatra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdatraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UpdatraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UpdatraMouseExited(evt);
            }
        });

        javax.swing.GroupLayout actutratLayout = new javax.swing.GroupLayout(actutrat);
        actutrat.setLayout(actutratLayout);
        actutratLayout.setHorizontalGroup(
            actutratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actutratLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Updatra)
                .addGap(24, 24, 24))
        );
        actutratLayout.setVerticalGroup(
            actutratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Updatra, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Tratamiento.add(actutrat, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 590, -1, -1));

        AggtraPanel.setBackground(new java.awt.Color(233, 218, 193));

        nombret.setBackground(new java.awt.Color(251, 248, 241));
        nombret.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        nombret.setForeground(new java.awt.Color(204, 204, 204));
        nombret.setText("Ingrese el nombre del tratamiento");
        nombret.setBorder(null);
        nombret.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombretMousePressed(evt);
            }
        });
        nombret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombretActionPerformed(evt);
            }
        });

        precio.setBackground(new java.awt.Color(251, 248, 241));
        precio.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        precio.setForeground(new java.awt.Color(204, 204, 204));
        precio.setText("Ingrese el precio del tratamiento");
        precio.setBorder(null);
        precio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                precioMousePressed(evt);
            }
        });
        precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioActionPerformed(evt);
            }
        });

        ConTratamiento.setBackground(new java.awt.Color(190, 140, 99));

        Confi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Confi.setText("Confirmar");
        Confi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ConfiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ConfiMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ConTratamientoLayout = new javax.swing.GroupLayout(ConTratamiento);
        ConTratamiento.setLayout(ConTratamientoLayout);
        ConTratamientoLayout.setHorizontalGroup(
            ConTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConTratamientoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Confi)
                .addGap(24, 24, 24))
        );
        ConTratamientoLayout.setVerticalGroup(
            ConTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Confi, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout AggtraPanelLayout = new javax.swing.GroupLayout(AggtraPanel);
        AggtraPanel.setLayout(AggtraPanelLayout);
        AggtraPanelLayout.setHorizontalGroup(
            AggtraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AggtraPanelLayout.createSequentialGroup()
                .addGroup(AggtraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AggtraPanelLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(nombret, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AggtraPanelLayout.createSequentialGroup()
                        .addGap(386, 386, 386)
                        .addComponent(ConTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        AggtraPanelLayout.setVerticalGroup(
            AggtraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AggtraPanelLayout.createSequentialGroup()
                .addGroup(AggtraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombret, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ConTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        Tratamiento.add(AggtraPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 890, -1));

        jPanel1.add(Tratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1220, 670));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void DesplazoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DesplazoMouseClicked
        //Despliega el menu dependiendo la poscision.
        if (MenuPlegable.getX() == 0) {
            desplace.desplazarIzquierda(MenuPlegable, MenuPlegable.getX(), -170, 10, 5);

        } else if (MenuPlegable.getX() == -170) {
            desplace.desplazarDerecha(MenuPlegable, MenuPlegable.getX(), 0, 10, 5);
        }
    }//GEN-LAST:event_DesplazoMouseClicked

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        //Redimensiona el componente para ecitar errores al momento de desplazarce.
        MenuPlegable.setSize(new Dimension(MenuPlegable.getWidth(), this.getHeight()));
    }//GEN-LAST:event_formComponentResized

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        System.exit(0);//Sale del programa

    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        //hover de la X en rojo
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(new Color(251, 248, 243));
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        //hover regresando al color original
        exitBtn.setBackground(new Color(251, 248, 243));
        exitTxt.setForeground(new Color(84, 186, 185));
    }//GEN-LAST:event_exitTxtMouseExited

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        //Obtine la poscicion del Header
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        //Mueve el programa a la poscicion arrastrada
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

//Mustra panel visible inicio y cierra el menu desplegable
    private void BtnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnInicioMouseClicked
        Inicio.setVisible(true);
        Clientes.setVisible(false);
        Citas.setVisible(false);
        Tratamiento.setVisible(false);
        if (MenuPlegable.getX() == 0) {
            desplace.desplazarIzquierda(MenuPlegable, MenuPlegable.getX(), -170, 10, 5);
        }

    }//GEN-LAST:event_BtnInicioMouseClicked
//Mustra panel visible Cliente y cierra el menu desplegable
    private void BtnClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnClienteMouseClicked
        Inicio.setVisible(false);
        Clientes.setVisible(true);
        Citas.setVisible(false);
        Tratamiento.setVisible(false);
        mostar();
        if (MenuPlegable.getX() == 0) {
            desplace.desplazarIzquierda(MenuPlegable, MenuPlegable.getX(), -170, 10, 5);
        }
    }//GEN-LAST:event_BtnClienteMouseClicked
//Mustra panel visible citas y cierra el menu desplegable
    private void BtnCitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCitasMouseClicked
        Inicio.setVisible(false);
        Clientes.setVisible(false);
        Citas.setVisible(true);
        Tratamiento.setVisible(false);
        mostar2();
        fillcombo();
        if (MenuPlegable.getX() == 0) {
            desplace.desplazarIzquierda(MenuPlegable, MenuPlegable.getX(), -170, 10, 5);
        }
    }//GEN-LAST:event_BtnCitasMouseClicked

    private void IngresartxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresartxtMouseClicked
        new AddClientePanel().setVisible(true);
    }//GEN-LAST:event_IngresartxtMouseClicked

    private void IngresartxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresartxtMouseEntered
        IngresarBtn.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_IngresartxtMouseEntered

    private void IngresartxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresartxtMouseExited
        IngresarBtn.setBackground(new Color(84, 186, 185));
    }//GEN-LAST:event_IngresartxtMouseExited

    private void EliminartxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminartxtMouseClicked
        if (jTable1.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "Error, porfavor seleccione un registro que borrar", "Error Al Ingresar Datos", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                int fila = jTable1.getSelectedRow();
                int id = Integer.parseInt(jTable1.getValueAt(fila, 0).toString());
                identidad = id;
                try {
                    conexionBD conex = new conexionBD();
                    ResultSet r = conex.consultar("select nombre FROM cliente WHERE idc=" + id);
                    while (r.next()) {
                        confirmacion = (r.getString("nombre"));
                        System.out.println(confirmacion + " Esta es la variable");
                    }
                    DeletePanel ventana = new DeletePanel();
                    ventana.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Prototipo.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error, porfavor seleccione un registro que borrar", "Error Al Ingresar Datos", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_EliminartxtMouseClicked

    private void EliminartxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminartxtMouseEntered
        EliminarBtn.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_EliminartxtMouseEntered

    private void EliminartxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminartxtMouseExited
        EliminarBtn.setBackground(new Color(84, 186, 185));
    }//GEN-LAST:event_EliminartxtMouseExited

    private void ModificartxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificartxtMouseClicked
        if (jTable1.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "Error, porfavor seleccione un registro que modificar", "Error Al Ingresar Datos", JOptionPane.ERROR_MESSAGE);

        } else {
            int fila = jTable1.getSelectedRow();
            int id = Integer.parseInt(jTable1.getValueAt(fila, 0).toString());
            identidad = id;

            try {
                conexionBD conex = new conexionBD();
                ResultSet r = conex.consultar("select nombre,apellido,telefono,mail,fechan,lastcheck FROM cliente WHERE idc=" + id);

                while (r.next()) {
                    auxname = r.getString("nombre");
                    auxape = r.getString("apellido");
                    auxtel = r.getString("telefono");
                    auxmail = r.getString("mail");
                    auxfen = new Date(r.getDate("fechan").getTime());
                    auxlc = new Date(r.getDate("lastcheck").getTime());
                    new ModClientePanel().setVisible(true);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Prototipo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_ModificartxtMouseClicked

    private void ModificartxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificartxtMouseEntered
        ModificarBtn.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_ModificartxtMouseEntered

    private void ModificartxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificartxtMouseExited
        ModificarBtn.setBackground(new Color(84, 186, 185));
    }//GEN-LAST:event_ModificartxtMouseExited

    private void UpdatetxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdatetxtMouseClicked
        // TODO add your handling code here:
        mostar();
    }//GEN-LAST:event_UpdatetxtMouseClicked

    private void UpdatetxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdatetxtMouseEntered
        // TODO add your handling code here:
        UpdateBtn.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_UpdatetxtMouseEntered

    private void UpdatetxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdatetxtMouseExited
        // TODO add your handling code here:
        UpdateBtn.setBackground(new Color(84, 186, 185));
    }//GEN-LAST:event_UpdatetxtMouseExited

    private void AsctxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AsctxtMouseClicked
        // TODO add your handling code here:
        Color myColor = new Color(239, 255, 253);
        Scroll.getViewport().setBackground(myColor);
        jTable1.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setForeground(myColor);
        jTable1.getTableHeader().setForeground(new Color(255, 255, 255));
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(new Color(66, 194, 255));

        for (int i = 0; i < jTable1.getModel().getColumnCount(); i++) {
            jTable1.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);//Obtiene todas las columnas necesarias
        }
        conexionBD conex = new conexionBD();//Conecta con la BD
        ResultSet r = conex.consultar("SELECT * FROM cliente order by apellido asc;");//Declara la consulta de los datos
        DefaultTableModel modelo = new DefaultTableModel();//Ubica las columnas  
        modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0); //indica el inicio para ingresar datos desde la columna 0
        try {
            while (r.next()) {//Mientras haya objetos en la tabla de BD los obtendra
                modelo.addRow(new Object[]{r.getString("idc"), r.getString("nombre"), r.getString("apellido"),
                    r.getString("edad"), r.getString("telefono"), r.getString("mail"), r.getString("fechan"), r.getString("lastcheck")});

            }
            jTable1.setModel(modelo);//Obtiene el modelo terminado de la tabla con todos los datos y la muestra

        } catch (SQLException ex) {
            Logger.getLogger(Prototipo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AsctxtMouseClicked

    private void AsctxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AsctxtMouseEntered
        // TODO add your handling code here:
        AscBtn.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_AsctxtMouseEntered

    private void AsctxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AsctxtMouseExited
        // TODO add your handling code here:
        AscBtn.setBackground(new Color(84, 186, 185));
    }//GEN-LAST:event_AsctxtMouseExited

    private void DscTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DscTxtMouseClicked
        Color myColor = new Color(239, 255, 253);
        Scroll.getViewport().setBackground(myColor);
        jTable1.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setForeground(myColor);
        jTable1.getTableHeader().setForeground(new Color(255, 255, 255));
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(new Color(66, 194, 255));

        for (int i = 0; i < jTable1.getModel().getColumnCount(); i++) {
            jTable1.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);//Obtiene todas las columnas necesarias
        }
        conexionBD conex = new conexionBD();//Conecta con la BD
        ResultSet r = conex.consultar("SELECT * FROM cliente order by apellido desc;");//Declara la consulta de los datos
        DefaultTableModel modelo = new DefaultTableModel();//Ubica las columnas  
        modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0); //indica el inicio para ingresar datos desde la columna 0
        try {
            while (r.next()) {//Mientras haya objetos en la tabla de BD los obtendra
                modelo.addRow(new Object[]{r.getString("idc"), r.getString("nombre"), r.getString("apellido"),
                    r.getString("edad"), r.getString("telefono"), r.getString("mail"), r.getString("fechan"), r.getString("lastcheck")});

            }
            jTable1.setModel(modelo);//Obtiene el modelo terminado de la tabla con todos los datos y la muestra

        } catch (SQLException ex) {
            Logger.getLogger(Prototipo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DscTxtMouseClicked

    private void DscTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DscTxtMouseEntered
        // TODO add your handling code here:
        DscBtn.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_DscTxtMouseEntered

    private void DscTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DscTxtMouseExited
        // TODO add your handling code here:
        DscBtn.setBackground(new Color(84, 186, 185));
    }//GEN-LAST:event_DscTxtMouseExited

    private void BtnTratamientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnTratamientoMouseClicked
        // TODO add your handling code here:
        Inicio.setVisible(false);
        Clientes.setVisible(false);
        Citas.setVisible(false);
        Tratamiento.setVisible(true);
        mostrar3();
        if (MenuPlegable.getX() == 0) {
            desplace.desplazarIzquierda(MenuPlegable, MenuPlegable.getX(), -170, 10, 5);
        }
    }//GEN-LAST:event_BtnTratamientoMouseClicked

    private void passTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passTxtMousePressed
        if (String.valueOf(passTxt.getPassword()).equals("********")) {
            passTxt.setText("");
            passTxt.setForeground(Color.black);
        }
    }//GEN-LAST:event_passTxtMousePressed

    private void passTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passTxtActionPerformed

    private void ConfpassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfpassMousePressed
        if (String.valueOf(Confpass.getPassword()).equals("********")) {
            Confpass.setText("");
            Confpass.setForeground(Color.black);
        }
    }//GEN-LAST:event_ConfpassMousePressed

    private void ConfpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfpassActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_ConfpassActionPerformed

    private void modTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modTxtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_modTxtMouseClicked

    private void modTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modTxtMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_modTxtMouseEntered

    private void modTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modTxtMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_modTxtMouseExited

    private void modcontraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modcontraMouseClicked
        panelMod.setVisible(true);
    }//GEN-LAST:event_modcontraMouseClicked

    private void modcontraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modcontraMouseEntered
        // TODO add your handling code here:
        modcontra.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_modcontraMouseEntered

    private void modcontraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modcontraMouseExited
        modcontra.setBackground(new Color(84, 186, 185));
    }//GEN-LAST:event_modcontraMouseExited

    private void ConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmarMouseClicked
        String us = Login.User;
        String a = String.valueOf(passTxt.getPassword());
        String b = String.valueOf(Confpass.getPassword());

        if (a.equals(b)) {
            conexionBD conex = new conexionBD();//Select usercol,contra FROM usuario WHERE usercol
            String consulta = "UPDATE usuario SET contra= '" + b + "' WHERE usercol='" + us + "'";
            int repuesta = conex.accionesEdit(consulta);
            if (repuesta > 0) {
                panelMod.setVisible(false);
                JOptionPane.showMessageDialog(null, "Modificacion Exitosa", "Modificacion con exito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Error al Modificar los datos del Cliente", "Error Al Modificar", JOptionPane.INFORMATION_MESSAGE);
            }

        }
    }//GEN-LAST:event_ConfirmarMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void AggcitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AggcitaMouseClicked
        // TODO add your handling code here:
        String idctemp="";
        String idttemp="";
        int bandera = 0;
        if (((JTextField) txtFecha1.getDateEditor().getUiComponent()).getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error porfavor porporcione una fecha de cita", "Error Al Ingresar Datos", JOptionPane.ERROR_MESSAGE);
            bandera++;
        }
        String day = null;
        String month = null;
        Addmodcitas.setVisible(true);
        String idc = String.valueOf(Clientecombox.getSelectedItem().toString());//Convierte el seleccionado a txt
        String idt = String.valueOf(tratacombox.getSelectedItem().toString());
        String unidad = idc.charAt(1) +"";//Obtiene el segundo valor esto se hace por si es una decena 10
        String uni = idc.charAt(1) +"";
        if ("-".equals(unidad)) {
            idctemp = idc.substring(0,1);
        } else  {
            idctemp = idc.substring(0, 2);
        };
        if ("-".equals(uni)) {
            idttemp = idt.substring(0,1);
        } else {
            idttemp = idt.substring(0, 2);
        };
        int dia = txtFecha1.getCalendar().get(Calendar.DAY_OF_MONTH);
        int mes = txtFecha1.getCalendar().get(Calendar.MONTH) + 1;
        String year = Integer.toString(txtFecha1.getCalendar().get(Calendar.YEAR));

        if (dia < 10) {
            day = "0" + Integer.toString(dia);
        } else {
            day = Integer.toString(dia);
        }
        if (mes < 10) {
            month = "0" + Integer.toString(mes);
        } else {
            month = Integer.toString(mes);
        }
        String fecha1 = (day + "/" + month + "/" + year);
        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate FecNac = LocalDate.parse(fecha1, date);
        LocalDate FecAct = LocalDate.now();
        Period periodo = Period.between(FecAct, FecNac);
        String cita = (periodo.getDays() + "");
        int consulta = Integer.parseInt(cita);
        if (bandera == 0) {
            if (consulta > 0) {
                conexionBD conex = new conexionBD();
                String pedir = "Insert into citas(fecha,idcliente,idtratamiento) values " + "(" + "'" + FecNac + "'," + idctemp + "," + idttemp + ");";
                System.out.println(pedir);//Debuger
                int repuesta = conex.accionesEdit(pedir);
                if (repuesta > 0) {
                    JOptionPane.showMessageDialog(null, "Datos Ingresado Correctamente", "Insertado Correctamente", JOptionPane.INFORMATION_MESSAGE);
                    mostar2();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error, porfavor rellene correctamente los campos, poner fechas futuras", "Error Al Ingresar Datos", JOptionPane.ERROR_MESSAGE);
            }
        }


    }//GEN-LAST:event_AggcitaMouseClicked

    private void AggcitaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AggcitaMouseEntered
        // TODO add your handling code here:
        InrBtn.setBackground(new Color(255, 51, 153));

    }//GEN-LAST:event_AggcitaMouseEntered

    private void AggcitaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AggcitaMouseExited
        // TODO add your handling code here:
        InrBtn.setBackground(new Color(242, 120, 159));

    }//GEN-LAST:event_AggcitaMouseExited

    private void DelCitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DelCitaMouseClicked
        // TODO add your handling code here:
        if (jTable2.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "Error, porfavor seleccione los datos del registro", "Error Al Modificar", JOptionPane.INFORMATION_MESSAGE);
        } else {
            int fila = jTable2.getSelectedRow();
            int id = Integer.parseInt(jTable2.getValueAt(fila, 0).toString());
            conexionBD conex = new conexionBD();
            int i = JOptionPane.showConfirmDialog(this, "¿Desea ELIMINAR la cita?", "¿Desea ELIMINAR la cita?", JOptionPane.YES_NO_OPTION);
            if (i == 0) {
                String consulta = "Delete FROM citas WHERE idcitas=" + id;
                System.out.println(consulta);
                int repuesta = conex.accionesEdit(consulta);

                if (repuesta > 0) {
                    JOptionPane.showMessageDialog(null, "Clente borraro con Exito", "Se Elimino Correctamente", JOptionPane.INFORMATION_MESSAGE);
                    AggtraPanel.setVisible(true);
                    aggomod = 0;
                } else {
                    JOptionPane.showMessageDialog(null, "Error Al Borrar la cita", "Error Al Borrar", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_DelCitaMouseClicked

    private void DelCitaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DelCitaMouseEntered
        // TODO add your handling code here:
        Delcitabtn.setBackground(new Color(255, 51, 153));
    }//GEN-LAST:event_DelCitaMouseEntered

    private void DelCitaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DelCitaMouseExited
        // TODO add your handling code here:
        Delcitabtn.setBackground(new Color(242, 120, 159));
    }//GEN-LAST:event_DelCitaMouseExited

    private void ModcitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModcitaMouseClicked
        // TODO add your handling code here:

        if (jTable2.getSelectionModel().isSelectionEmpty()) {//Si no hay nada seleccionado
            JOptionPane.showMessageDialog(null, "Error, porfavor seleccione un registro que modificar", "Error Al Ingresar Datos", JOptionPane.ERROR_MESSAGE);
        } else {
            int fila = jTable2.getSelectedRow();//Se guarda solo 1 vez
            int id = Integer.parseInt(jTable2.getValueAt(fila, 0).toString());
            int bandera = 0;
            if (((JTextField) txtFecha1.getDateEditor().getUiComponent()).getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error porfavor porporcione una fecha de cita", "Error Al Ingresar Datos", JOptionPane.ERROR_MESSAGE);
                bandera++;
            }
            String day = null;
            String month = null;
            int dia = txtFecha1.getCalendar().get(Calendar.DAY_OF_MONTH);
            int mes = txtFecha1.getCalendar().get(Calendar.MONTH) + 1;
            String year = Integer.toString(txtFecha1.getCalendar().get(Calendar.YEAR));
            if (dia < 10) {
                day = "0" + Integer.toString(dia);
            } else {
                day = Integer.toString(dia);
            }
            if (mes < 10) {
                month = "0" + Integer.toString(mes);
            } else {
                month = Integer.toString(mes);
            }
            String fecha1 = (day + "/" + month + "/" + year);
            DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate FecNac = LocalDate.parse(fecha1, date);
            LocalDate FecAct = LocalDate.now();
            Period periodo = Period.between(FecAct, FecNac);
            String cita = (periodo.getDays() + "");
            int llamado = Integer.parseInt(cita);
            if (llamado > 0) {
                if (bandera == 0) {
                    conexionBD conex = new conexionBD();
                    String consulta = "UPDATE citas SET fecha= '" + FecNac + "' WHERE idcitas=" + id;
                    int repuesta = conex.accionesEdit(consulta);
                    if (repuesta > 0) {
                        JOptionPane.showMessageDialog(null, "Modificacion de Fecha Exitosa", "Modificacion con exito", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error al Modificar los datos de la cita", "Error Al Modificar", JOptionPane.INFORMATION_MESSAGE);
            }

        }


    }//GEN-LAST:event_ModcitaMouseClicked

    private void ModcitaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModcitaMouseEntered
        // TODO add your handling code here:
        ModcitarBtn.setBackground(new Color(255, 51, 153));

    }//GEN-LAST:event_ModcitaMouseEntered

    private void ModcitaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModcitaMouseExited
        // TODO add your handling code here:
        ModcitarBtn.setBackground(new Color(242, 120, 159));
    }//GEN-LAST:event_ModcitaMouseExited

    private void reminderMailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reminderMailMouseClicked
        // TODO add your handling code here:
        if (jTable2.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "Error, porfavor seleccione los datos del Cliente", "Error Al Modificar", JOptionPane.INFORMATION_MESSAGE);
        } else {
            int fila = jTable2.getSelectedRow();
            String idename = jTable2.getValueAt(fila, 1).toString();
            String direccion = jTable2.getValueAt(fila, 4).toString();
            String fecita = jTable2.getValueAt(fila, 5).toString();
            try {
                mailsender(idename, fecita, direccion);
            } catch (MessagingException ex) {
                Logger.getLogger(Prototipo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_reminderMailMouseClicked

    private void reminderMailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reminderMailMouseEntered
        // TODO add your handling code here:
        reminderBtn.setBackground(new Color(255, 51, 153));
    }//GEN-LAST:event_reminderMailMouseEntered

    private void reminderMailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reminderMailMouseExited
        // TODO add your handling code here:
        reminderBtn.setBackground(new Color(242, 120, 159));
    }//GEN-LAST:event_reminderMailMouseExited

    private void AddtraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddtraMouseClicked
        // TODO add your handling code here:
        AggtraPanel.setVisible(true);
        aggomod = 1;
    }//GEN-LAST:event_AddtraMouseClicked

    private void AddtraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddtraMouseEntered
        // TODO add your handling code here:
        Addtrat.setBackground(new Color(153, 102, 0));
    }//GEN-LAST:event_AddtraMouseEntered

    private void AddtraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddtraMouseExited
        // TODO add your handling code here:
        Addtrat.setBackground(new Color(190, 140, 99));
    }//GEN-LAST:event_AddtraMouseExited

    private void DeltraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeltraMouseClicked
        // TODO add your handling code here:
        if (jTable3.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "Error, porfavor seleccione los datos del Tratamiento", "Error Al Modificar", JOptionPane.INFORMATION_MESSAGE);
        } else {
            int fila = jTable3.getSelectedRow();
            int id = Integer.parseInt(jTable3.getValueAt(fila, 0).toString());
            conexionBD conex = new conexionBD();
            int i = JOptionPane.showConfirmDialog(this, "¿Desea modificar el Tratamiento?", "¿Desea modificar el Tratamiento?", JOptionPane.YES_NO_OPTION);
            if (i == 0) {
                String consulta = "Delete FROM tratamiento WHERE idt=" + id;
                System.out.println(consulta);
                int repuesta = conex.accionesEdit(consulta);

                if (repuesta > 0) {
                    JOptionPane.showMessageDialog(null, "Tratamiento borrado con Exito", "Se Elimino Correctamente", JOptionPane.INFORMATION_MESSAGE);
                   AggtraPanel.setVisible(false);
                    aggomod = 0;
                } else {
                    JOptionPane.showMessageDialog(null, "Error Al Borrar el Tratamiento", "Error Al Borrar", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_DeltraMouseClicked

    private void DeltraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeltraMouseEntered
        // TODO add your handling code here:
        Deltrat.setBackground(new Color(153, 102, 0));

    }//GEN-LAST:event_DeltraMouseEntered

    private void DeltraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeltraMouseExited
        // TODO add your handling code here:
        Deltrat.setBackground(new Color(190, 140, 99));
    }//GEN-LAST:event_DeltraMouseExited

    private void modtraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modtraMouseClicked
        if (jTable3.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "Error, porfavor seleccione los datos del Tratamietno", "Error Al Modificar", JOptionPane.INFORMATION_MESSAGE);
        } else {
            AggtraPanel.setVisible(true);
            int fila = jTable3.getSelectedRow();
            int id = Integer.parseInt(jTable3.getValueAt(fila, 0).toString());
            idtt = Integer.toString(id);
            try {
                conexionBD conex = new conexionBD();
                ResultSet r = conex.consultar("select nombret,costo FROM tratamiento WHERE idt=" + idtt);
                while (r.next()) {
                    auxnt = r.getString("nombret");
                    auxprice = r.getString("costo");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Prototipo.class.getName()).log(Level.SEVERE, null, ex);
            }
            nombret.setText(auxnt + "");
            precio.setText(auxprice + "");
        }
    }//GEN-LAST:event_modtraMouseClicked

    private void modtraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modtraMouseEntered
        // TODO add your handling code here:
        Modtrat.setBackground(new Color(153, 102, 0));
    }//GEN-LAST:event_modtraMouseEntered

    private void modtraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modtraMouseExited
        // TODO add your handling code here:
        Modtrat.setBackground(new Color(190, 140, 99));
    }//GEN-LAST:event_modtraMouseExited

    private void UpdatraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdatraMouseClicked
        // TODO add your handling code here:
        mostrar3();
    }//GEN-LAST:event_UpdatraMouseClicked

    private void UpdatraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdatraMouseEntered
        // TODO add your handling code here:
        actutrat.setBackground(new Color(153, 102, 0));
    }//GEN-LAST:event_UpdatraMouseEntered

    private void UpdatraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdatraMouseExited
        // TODO add your handling code here:
        actutrat.setBackground(new Color(190, 140, 99));
    }//GEN-LAST:event_UpdatraMouseExited

    private void ActucitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActucitasMouseClicked
        // TODO add your handling code here:
        mostar2();
    }//GEN-LAST:event_ActucitasMouseClicked

    private void ActucitasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActucitasMouseEntered
        // TODO add your handling code here:
        UpdateBtn2.setBackground(new Color(255, 51, 153));
    }//GEN-LAST:event_ActucitasMouseEntered

    private void ActucitasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActucitasMouseExited
        // TODO add your handling code here:
        UpdateBtn2.setBackground(new Color(242, 120, 159));
    }//GEN-LAST:event_ActucitasMouseExited

    private void ConfirmarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmarMouseEntered
        Confirmar.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_ConfirmarMouseEntered

    private void ConfirmarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmarMouseExited
        Confirmar.setBackground(new Color(84, 186, 185));
    }//GEN-LAST:event_ConfirmarMouseExited

    private void nombretMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombretMousePressed
        if (nombret.getText().equals("Ingrese el nombre del tratamiento")) {
            nombret.setText("");
            nombret.setForeground(Color.black);
        }
    }//GEN-LAST:event_nombretMousePressed

    private void precioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_precioMousePressed
        if (precio.getText().equals("Ingrese el precio del tratamiento")) {
            precio.setText("");
            precio.setForeground(Color.black);
        }
    }//GEN-LAST:event_precioMousePressed

    private void nombretActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombretActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombretActionPerformed

    private void precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioActionPerformed

    private void ConfiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfiMouseClicked
        // TODO add your handling code here:
        int bandera = 0;
        if (aggomod == 1) {

            if (nombret.getText().equals("Ingrese el nombre del tratamiento") || nombret.getText().isEmpty() || isNumeric(nombret.getText()) == true) {
                bandera++;
            }
            if (precio.getText().equals("Ingrese el precio del tratamiento") || precio.getText().isEmpty() || isNumeric(precio.getText()) == false) {
                bandera++;
            }
            if (bandera == 0) {
                conexionBD conex = new conexionBD();
                String consulta = "Insert into tratamiento(nombret,costo) values " + "(" + "'" + nombret.getText() + "'," + precio.getText() + ");";
                System.out.println(consulta);//Debuger
                int repuesta = conex.accionesEdit(consulta);
                if (repuesta > 0) {
                    JOptionPane.showMessageDialog(null, "Datos Ingresado Correctamente", "Insertado Correctamente", JOptionPane.INFORMATION_MESSAGE);
                    aggomod = 0;
                    AggtraPanel.setVisible(false);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error, porfavor rellene correctamente los campos, solo poner texto donde se le pide y poner numero donde se le pide", "Error Al Ingresar Datos", JOptionPane.ERROR_MESSAGE);
                aggomod = 0;
                AggtraPanel.setVisible(false);
            }
        } else {
            if (nombret.getText().equals("Ingrese el nombre del tratamiento") || nombret.getText().isEmpty() || isNumeric(nombret.getText()) == true) {
                bandera++;
            }
            if (precio.getText().equals("Ingrese el precio del tratamiento") || precio.getText().isEmpty() || isNumeric(precio.getText()) == false) {
                bandera++;
            }
            if (bandera == 0) {
                conexionBD conex = new conexionBD();
                String consulta = "UPDATE tratamiento SET nombret=" + "'" + nombret.getText() + "',costo=" + precio.getText() + " WHERE idt=" + idtt;
                System.out.println(consulta);//Debuger
                int repuesta = conex.accionesEdit(consulta);
                if (repuesta > 0) {
                    JOptionPane.showMessageDialog(null, "Modificacion Exitosa", "Modificacion con exito", JOptionPane.INFORMATION_MESSAGE);
                    AggtraPanel.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Modificar los datos del tratamiento", "Error Al Modificar", JOptionPane.INFORMATION_MESSAGE);
                    AggtraPanel.setVisible(false);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error, porfavor rellene correctamente los campos, solo poner texto donde se le pide y poner numero donde se le pide", "Error Al Ingresar Datos", JOptionPane.ERROR_MESSAGE);
                aggomod = 0;
            }
        }
    }//GEN-LAST:event_ConfiMouseClicked

    private void ConfiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfiMouseEntered
        // TODO add your handling code here:
        Confi.setBackground(new Color(153, 102, 0));
    }//GEN-LAST:event_ConfiMouseEntered

    private void ConfiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfiMouseExited
        // TODO add your handling code here:
        Confi.setBackground(new Color(190, 140, 99));
    }//GEN-LAST:event_ConfiMouseExited

    private void MinimizarTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarTxtMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(ICONIFIED);
        this.setExtendedState(1);
    }//GEN-LAST:event_MinimizarTxtMouseClicked

    private void MinimizarTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarTxtMouseEntered
        // TODO add your handling code here:
        Minimizar.setBackground(Color.BLUE);
         Minimizar.setForeground( Color.white);
    }//GEN-LAST:event_MinimizarTxtMouseEntered

    private void MinimizarTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarTxtMouseExited
        // TODO add your handling code here:
        Minimizar.setBackground(new Color(251, 248, 243));
        Minimizar.setForeground(new Color(84, 186, 185));
    }//GEN-LAST:event_MinimizarTxtMouseExited
    void mostar() {//personaliza y crea la tabla
        Color myColor = new Color(239, 255, 253);
        Scroll.getViewport().setBackground(myColor);
        jTable1.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setForeground(myColor);
        jTable1.getTableHeader().setForeground(new Color(255, 255, 255));
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(new Color(66, 194, 255));

        for (int i = 0; i < jTable1.getModel().getColumnCount(); i++) {
            jTable1.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);//Obtiene todas las columnas necesarias
        }
        conexionBD conex = new conexionBD();//Conecta con la BD
        ResultSet r = conex.consultar("SELECT * FROM cliente");//Declara la consulta de los datos
        DefaultTableModel modelo = new DefaultTableModel();//Ubica las columnas  
        modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0); //indica el inicio para ingresar datos desde la columna 0
        try {
            while (r.next()) {//Mientras haya objetos en la tabla de BD los obtendra
                modelo.addRow(new Object[]{r.getString("idc"), r.getString("nombre"), r.getString("apellido"),
                    r.getString("edad"), r.getString("telefono"), r.getString("mail"), r.getString("fechan"), r.getString("lastcheck")});

            }
            jTable1.setModel(modelo);//Obtiene el modelo terminado de la tabla con todos los datos y la muestra

        } catch (SQLException ex) {
            Logger.getLogger(Prototipo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    void mostar2() {//personaliza y crea la tabla
        Color myColor = new Color(254, 227, 236);
        Scroll1.getViewport().setBackground(myColor);
        jTable2.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        jTable2.getTableHeader().setOpaque(false);
        jTable2.getTableHeader().setForeground(myColor);
        jTable2.getTableHeader().setForeground(new Color(249, 153, 183));
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(new Color(249, 153, 183));

        for (int i = 0; i < jTable2.getModel().getColumnCount(); i++) {
            jTable2.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);//Obtiene todas las columnas necesarias
        }
        conexionBD conex = new conexionBD();//Conecta con la BD       
        DefaultTableModel modelo = new DefaultTableModel();//Ubica las columnas  
        modelo = (DefaultTableModel) jTable2.getModel();
        modelo.setRowCount(0); //indica el inicio para ingresar datos desde la columna 0
        try {
            String idt = "";
            String idcl = "";
            String fech = "";
            String idcitas = "";
            ResultSet citas = conex.consultar("select * FROM citas");
            while (citas.next()) {//Se detiene en cada fila
                idcitas = citas.getString("idcitas");
                fech = citas.getString("fecha");
                idcl = citas.getString("idcliente");//Obtiene el id
                idt = citas.getString("idtratamiento");
                ResultSet clientes = conex.consultar("select nombre,apellido,edad,telefono,mail,lastcheck FROM cliente where idc=" + idcl);
                while (clientes.next()) {
                    String auxn = clientes.getString("nombre");
                    String auxa = clientes.getString("apellido");
                    String auxed = clientes.getString("edad");
                    String auxm = clientes.getString("mail");
                    String aulc = clientes.getString("lastcheck");
                    ResultSet tratamiento = conex.consultar("select nombret,costo FROM tratamiento where idt=" + idt);
                    while (tratamiento.next()) {
                        String auxnom = tratamiento.getString("nombret");
                        String auxcost = tratamiento.getString("costo");
                        modelo.addRow(new Object[]{idcitas, auxn, auxa, auxed, auxm, fech, auxnom, auxcost, aulc});
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Prototipo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void mostrar3() {
        //190,140,99 Cafe oscuro
        Color myColor = new Color(233, 218, 193);
        Scroll2.getViewport().setBackground(myColor);
        jTable3.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        jTable3.getTableHeader().setOpaque(false);
        jTable3.getTableHeader().setForeground(myColor);
        jTable3.getTableHeader().setForeground(new Color(190, 140, 99));
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(new Color(190, 140, 99));
        for (int i = 0; i < jTable3.getModel().getColumnCount(); i++) {
            jTable3.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);//Obtiene todas las columnas necesarias
        }
        conexionBD conex = new conexionBD();//Conecta con la BD
        ResultSet r = conex.consultar("SELECT * FROM tratamiento order by idt asc");//Declara la consulta de los datos
        DefaultTableModel modelo = new DefaultTableModel();//Ubica las columnas  
        modelo = (DefaultTableModel) jTable3.getModel();
        modelo.setRowCount(0); //indica el inicio para ingresar datos desde la columna 0
        try {
            while (r.next()) {//Mientras haya objetos en la tabla de BD los obtendra
                modelo.addRow(new Object[]{r.getString("idt"), r.getString("nombret"), r.getString("costo")});
            }
            jTable3.setModel(modelo);//Obtiene el modelo terminado de la tabla con todos los datos y la muestra
        } catch (SQLException ex) {
            Logger.getLogger(Prototipo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void fillcombo() {
        Clientecombox.addItem("Seleccione una opcion");
        tratacombox.addItem("seleccione una opcion");
        String tempcliente, temptrata;
        conexionBD conex = new conexionBD();//Conecta con la BD
        ResultSet r = conex.consultar("SELECT * FROM cliente");//Declara la consulta de los datos
        ResultSet t = conex.consultar("SELECT * FROM tratamiento order by idt asc");//Declara la consulta de los datos
        try {
            Clientecombox.removeAll();
            while (r.next()) {//Mientras haya objetos en la tabla de BD los obtendra
                idcombo = r.getString("idc");
                String tempnombre = r.getString("nombre");
                String tempapellido = r.getString("apellido");
                tempcliente = idcombo + "- " + tempnombre + " " + tempapellido;
                Clientecombox.addItem(tempcliente);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Prototipo.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            tratacombox.removeAll();
            while (t.next()) {//Mientras haya objetos en la tabla de BD los obtendra
                idtrata = t.getString("idt");
                String tempnombre = t.getString("nombret");
                temptrata = idtrata + "-" + tempnombre;
                tratacombox.addItem(temptrata);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Prototipo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    void mailsender(String nombre, String fecha, String c) throws AddressException, MessagingException {
        String correo = "clinicadentallaesperanza@gmail.com";
        String contra = "mwznkylnrthqlzww";
        String correoDestino = c;//Add Variable correo obtenida del while
        Properties p = new Properties();
        p.put("mail.smtp.host", "smtp.gmail.com");
        p.setProperty("mail.smtp.starttls.enable", "true");
        p.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        p.setProperty("mail.smtp.port", "587");
        p.setProperty("mail.smtp.user", correo);
        p.setProperty("mail.smtp.auth", "true");
        Session s = Session.getDefaultInstance(p);

        BodyPart texto = new MimeBodyPart();
        texto.setText("Hola " + nombre + ". Se solicita su presencia el dia " + fecha + " a la hora acordada, de ser posible 15 minutos antes para evitar inconvenientes.\n"
                + "Gracias por preferirnos!\n\n" + "MENSAJE AUTOMATIZADO FAVOR NO CONTESTAR");
        BodyPart adjunto = new MimeBodyPart();

        adjunto.setDataHandler(new DataHandler(new FileDataSource("C:/firma/firma.jpg")));
        adjunto.setFileName("firma.jpg");
        MimeMultipart m = new MimeMultipart();
        m.addBodyPart(texto);
        m.addBodyPart(adjunto);

        MimeMessage mensaje = new MimeMessage(s);
        mensaje.setFrom(new InternetAddress(correo));
        mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(correoDestino));
        mensaje.setSubject("Recordadtorio de su cita");//Adjuntar fecha en el constructor
        mensaje.setContent(m);

        Transport t = s.getTransport("smtp");
        t.connect(correo, contra);
        t.sendMessage(mensaje, mensaje.getAllRecipients());
        t.close();
        JOptionPane.showMessageDialog(null, "Mensaje Enviado");
    }

    private boolean isNumeric(String cadena) {

        boolean resultado;

        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }

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
            java.util.logging.Logger.getLogger(Prototipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prototipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prototipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prototipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prototipo().setVisible(true);

            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Actucitas;
    private javax.swing.JPanel Addmodcitas;
    private javax.swing.JLabel Addtra;
    private javax.swing.JPanel Addtrat;
    private javax.swing.JLabel Aggcita;
    private javax.swing.JPanel AggtraPanel;
    private javax.swing.JPanel AscBtn;
    private javax.swing.JLabel Asctxt;
    private javax.swing.JLabel BtnCitas;
    private javax.swing.JLabel BtnCliente;
    private javax.swing.JLabel BtnInicio;
    private javax.swing.JLabel BtnTratamiento;
    private javax.swing.JPanel Citas;
    private javax.swing.JComboBox<String> Clientecombox;
    private javax.swing.JPanel Clientes;
    private javax.swing.JPanel ConTratamiento;
    private javax.swing.JLabel Confi;
    private javax.swing.JPanel Confirmar;
    private javax.swing.JPasswordField Confpass;
    private javax.swing.JLabel DelCita;
    private javax.swing.JPanel Delcitabtn;
    private javax.swing.JLabel Deltra;
    private javax.swing.JPanel Deltrat;
    private javax.swing.JLabel Desplazo;
    private javax.swing.JPanel DscBtn;
    private javax.swing.JLabel DscTxt;
    private javax.swing.JPanel EliminarBtn;
    private javax.swing.JLabel Eliminartxt;
    private javax.swing.JPanel IngresarBtn;
    private javax.swing.JLabel Ingresartxt;
    private javax.swing.JPanel Inicio;
    private javax.swing.JPanel InrBtn;
    private javax.swing.JPanel MenuPlegable;
    private javax.swing.JPanel Minimizar;
    private javax.swing.JLabel MinimizarTxt;
    private javax.swing.JLabel ModPass;
    private javax.swing.JLabel Modcita;
    private javax.swing.JPanel ModcitarBtn;
    private javax.swing.JPanel ModificarBtn;
    private javax.swing.JLabel Modificartxt;
    private javax.swing.JPanel Modtrat;
    private javax.swing.JLabel Npass;
    private javax.swing.JScrollPane Scroll;
    private javax.swing.JScrollPane Scroll1;
    private javax.swing.JScrollPane Scroll2;
    private javax.swing.JPanel Tabla;
    private javax.swing.JPanel Tratamiento;
    private javax.swing.JPanel UpdateBtn;
    private javax.swing.JPanel UpdateBtn2;
    private javax.swing.JLabel Updatetxt;
    private javax.swing.JLabel Updatra;
    private javax.swing.JPanel actutrat;
    private javax.swing.JLabel confpasss;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel favicon;
    private javax.swing.JLabel favicon1;
    private javax.swing.JLabel favicon2;
    private javax.swing.JLabel favicon4;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lo;
    private javax.swing.JPanel logout;
    private javax.swing.JLabel modTxt;
    private javax.swing.JPanel modcontra;
    private javax.swing.JLabel modtra;
    private javax.swing.JTextField nombret;
    private javax.swing.JPanel panelMod;
    private javax.swing.JPasswordField passTxt;
    private javax.swing.JTextField precio;
    private javax.swing.JPanel reminderBtn;
    private javax.swing.JLabel reminderMail;
    private javax.swing.JComboBox<String> tratacombox;
    private com.toedter.calendar.JDateChooser txtFecha1;
    // End of variables declaration//GEN-END:variables
}
