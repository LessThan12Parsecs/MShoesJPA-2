package presentacion.departamento;

import integracion.transacciones.conexion.Excepciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import presentacion.comando.IDEventos;
import presentacion.controlador.Controlador;
import negocio.departamento.TransferDepartamento;
import negocio.departamento.TransferProvDept;
import negocio.empleado.TransferEmpleado;

public class PanelDepartamento extends JPanel implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//Auxiliares
	private final Object VACIO = null;
	
    private javax.swing.JTextField activoDC;
    private javax.swing.JList activoDL;
    private javax.swing.JButton altaD;
    private javax.swing.JButton altaPA;
    private javax.swing.JList apellidosE1;
    private javax.swing.JButton bajaDB;
    private javax.swing.JButton consultarDC;
    private javax.swing.JTabbedPane departamento;
    private javax.swing.JPanel departamento1;
    private javax.swing.JList dniE2;
    private javax.swing.JTextField idDB;
    private javax.swing.JTextField idDC;
    private javax.swing.JTextField idDM;
    private javax.swing.JTextField idDepartamentoDE;
    private javax.swing.JList idDepartamentoDL;
    private javax.swing.JTextField idDepartamentoDN;
    private javax.swing.JTextField idDepartamentoDP;
    private javax.swing.JList idEmpleadoE1;
    private javax.swing.JList idProveedorD;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JButton listarDL;
    private javax.swing.JButton modificarDM;
    private javax.swing.JButton mostrarD;
    private javax.swing.JButton mostrarD1;
    private javax.swing.JTextField nombreDC;
    private javax.swing.JTextField nombreDE;
    private javax.swing.JList nombreDL;
    private javax.swing.JTextField nombreDM;
    private javax.swing.JTextField nombreDP;
    private javax.swing.JTextField nombreDa;
    private javax.swing.JList nombrePD;
    private javax.swing.JList fechaPD;
    private javax.swing.JButton nominaButton;
    private javax.swing.JTextField nominaDN;
    private javax.swing.JList nomreE1;
    
    //Listas listar
    private Integer[] listIDListar;
    private String[] listNombreListar;
    private Boolean[] listActivoListar;
    
    //Listas empleados dept
    private Integer[] listIDEListar;
    private String[] listDNIEListar;
    private String[] listNombreEListar;
    private String[] listApellidosEListar;
    
    //Listas proveedores dept
    private Integer[] listIDPListar;
    private String[] listNombrePListar;
    private String[] listFechaPListar;

	
	public PanelDepartamento() {
		initGUI();	
	}

	//Panel Cliente
	@SuppressWarnings("deprecation")
	private void initGUI() {
		
        
		
        jTabbedPane = new javax.swing.JTabbedPane();
       
       
        mostrarD = new javax.swing.JButton();
        mostrarD.addActionListener(this);
       
        departamento1 = new javax.swing.JPanel();
        departamento = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel31.setText("Nombre: ");
        nombreDa = new javax.swing.JTextField();
        altaD = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        idDB = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        bajaDB = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        nombreDM = new javax.swing.JTextField();
        modificarDM = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel42 = new javax.swing.JLabel();
        idDM = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        nombreDC = new javax.swing.JTextField();
        nombreDC.setEditable(false);
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        idDC = new javax.swing.JTextField();
        activoDC = new javax.swing.JTextField();
        activoDC.setEditable(false);
        consultarDC = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        listarDL = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        idDepartamentoDL = new javax.swing.JList();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        nombreDL = new javax.swing.JList();
        jLabel53 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jScrollPane19 = new javax.swing.JScrollPane();
        activoDL = new javax.swing.JList();
        jPanel7 = new javax.swing.JPanel();
        nominaDN = new javax.swing.JTextField();
        nominaDN.setEditable(false);
        nominaButton = new javax.swing.JButton();
        jLabel59 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        idDepartamentoDN = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jPanel17 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        idDepartamentoDE = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel33 = new javax.swing.JLabel();
        
        
        
        
       
        
        jScrollPane5 = new javax.swing.JScrollPane();
        idEmpleadoE1 = new javax.swing.JList();
        jScrollPane8 = new javax.swing.JScrollPane();
        nomreE1 = new javax.swing.JList();
        jScrollPane30 = new javax.swing.JScrollPane();
        apellidosE1 = new javax.swing.JList();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        dniE2 = new javax.swing.JList();
        nombreDE = new javax.swing.JTextField();
        nombreDE.hide();
        jPanel20 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        idDepartamentoDP = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel40 = new javax.swing.JLabel();
        mostrarD1 = new javax.swing.JButton();
        mostrarD1.addActionListener(this);
        jScrollPane7 = new javax.swing.JScrollPane();
        idProveedorD = new javax.swing.JList();
        jScrollPane31 = new javax.swing.JScrollPane();
        jScrollPane32 = new javax.swing.JScrollPane();
        nombrePD = new javax.swing.JList();
        fechaPD = new javax.swing.JList();
        jLabel41 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        nombreDP = new javax.swing.JTextField();
        nombreDP.setEditable(false);
        
        altaPA = new javax.swing.JButton();
       

        altaD.setText("Alta");
        altaD.addActionListener(this);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(617, Short.MAX_VALUE)
                .addComponent(altaD)
                .addGap(38, 38, 38))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nombreDa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreDa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 257, Short.MAX_VALUE)
                .addComponent(altaD)
                .addGap(42, 42, 42))
        );

        departamento.addTab("Alta", jPanel2);

        jLabel36.setText("ID Departamento:");

        bajaDB.setText("Baja");
        bajaDB.addActionListener(this);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel36)
                .addGap(47, 47, 47)
                .addComponent(idDB, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bajaDB)
                .addGap(45, 45, 45))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idDB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 269, Short.MAX_VALUE)
                .addComponent(bajaDB)
                .addGap(46, 46, 46))
        );

        departamento.addTab("Baja", jPanel3);

       

        modificarDM.setText("Modificar");
        modificarDM.addActionListener(this);

        jLabel39.setText("Nombre:");

        jLabel42.setText("ID Departamento: ");

        idDM.setToolTipText("");

        
        
        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(modificarDM)
                .addGap(38, 38, 38))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator5)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(idDM, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addGap(18, 18, 18)
                        .addComponent(nombreDM, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(502, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(idDM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreDM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addGap(151, 151, 151)
                .addComponent(modificarDM)
                .addGap(42, 42, 42))
        );
        
        

        departamento.addTab("Modificar", jPanel4);

        jLabel43.setText("Activo:");

       

        jLabel46.setText("ID Departamento:");

        idDC.setToolTipText("");

        consultarDC.setText("Consultar");
        consultarDC.addActionListener(this);
       

        jLabel48.setText("Nombre:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nombreDC, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addComponent(jLabel43)
                .addGap(18, 18, 18)
                .addComponent(activoDC, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(217, 217, 217))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator6)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(idDC, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(consultarDC)
                .addGap(39, 39, 39))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(idDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultarDC))
                .addGap(40, 40, 40)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(activoDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48)
                    .addComponent(jLabel43))
                .addGap(214, 214, 214))
        );

        departamento.addTab("Consultar", jPanel5);

        listarDL.setText("Listar");
        listarDL.addActionListener(this);

        jLabel50.setText("ID");

       
        jScrollPane17.setViewportView(idDepartamentoDL);

        jLabel51.setText("Nombre");

        jLabel52.setText("Activo");

       
        jScrollPane18.setViewportView(nombreDL);

       
        jScrollPane19.setViewportView(activoDL);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel50)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel53)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel51)
                         .addGap(120, 120, 120)
                        .addComponent(jLabel52)
                        .addGap(242, 242, 242))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jSeparator7)
                        .addContainerGap())
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addComponent(listarDL)
                        .addGap(59, 59, 59))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel52)
                        .addComponent(jLabel51)
                        .addComponent(jLabel50))
                    .addComponent(jLabel53))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                            .addComponent(jScrollPane19)
                            .addComponent(jScrollPane18))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(listarDL)
                        .addGap(21, 21, 21))))
        );

        departamento.addTab("Listar", jPanel6);

       

        nominaButton.setText("Nomina");
        nominaButton.addActionListener(this);
       

        jLabel59.setText("Nomina:");

        jLabel61.setText("ID Departamento: ");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel61)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(idDepartamentoDN, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel59)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nominaDN, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator12)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nominaButton)
                .addGap(110, 110, 110))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(idDepartamentoDN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nominaDN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(nominaButton)
                .addGap(88, 88, 88))
        );

        departamento.addTab("Nomina departamento", jPanel7);

        jLabel28.setText("ID Departamento: ");


        mostrarD.setText("Mostrar");
        

       
        jScrollPane5.setViewportView(idEmpleadoE1);

        
        jScrollPane8.setViewportView(nomreE1);

        
        jScrollPane30.setViewportView(apellidosE1);

        jLabel34.setText("ID");

        jLabel35.setText("DNI");

        jLabel37.setText("Nombre");

        jLabel38.setText("Apellidos");

       
        jScrollPane9.setViewportView(dniE2);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel28)
                .addGap(18, 18, 18)
                .addComponent(idDepartamentoDE, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jLabel33)
                .addGap(18, 18, 18)
                .addComponent(nombreDE, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(300, 300, 300)
                .addComponent(mostrarD)
                .addGap(14, 14, 14))
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel34)
                                .addGap(33, 33, 33))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel17Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel35)
                                .addGap(77, 77, 77)
                                .addComponent(jLabel37)
                                .addGap(70, 70, 70)
                                .addComponent(jLabel38))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(idDepartamentoDE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mostrarD)
                    .addComponent(jLabel33)
                    .addComponent(nombreDE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jLabel38)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane30, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addComponent(jScrollPane8)
                    .addComponent(jScrollPane9))
                .addContainerGap())
        );

        departamento.addTab("Empleados-Dept", jPanel17);
        
        jLabel29.setText("ID Departamento: ");

        jLabel40.setText("Nombre dept");

        mostrarD1.setText("Mostrar");
       

       
        jScrollPane7.setViewportView(idProveedorD);

       
        jScrollPane31.setViewportView(nombrePD);

        jLabel41.setText("ID");

        jLabel45.setText("Nombre");
        
        jScrollPane32.setViewportView(fechaPD);

        jLabel47.setText("Fecha contratacion");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel29)
                .addGap(18, 18, 18)
                .addComponent(idDepartamentoDP, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jLabel40)
                .addGap(18, 18, 18)
                .addComponent(nombreDP)
                .addGap(47, 47, 47)
                .addComponent(mostrarD1)
                .addGap(14, 14, 14))
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(jLabel41)
                .addGap(103, 103, 103)
                .addComponent(jLabel45)
                .addGap(125, 125, 125)
                .addComponent(jLabel47)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(idDepartamentoDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mostrarD1)
                    .addComponent(jLabel40)
                    .addComponent(nombreDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel45)
                        .addComponent(jLabel47))
                    .addComponent(jLabel41))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane31, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                    .addComponent(jScrollPane32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))
                .addContainerGap())
        );

        departamento.addTab("Proveedores-Dept", jPanel20);

        javax.swing.GroupLayout departamento1Layout = new javax.swing.GroupLayout(departamento1);
        departamento1.setLayout(departamento1Layout);
        departamento1Layout.setHorizontalGroup(
            departamento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(departamento1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(departamento)
                .addContainerGap())
        );
        departamento1Layout.setVerticalGroup(
            departamento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(departamento1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(departamento, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Departamento", departamento1);

        altaPA.setText("Alta");
       
      
        this.add(departamento1);

	}

	
	//ActionListener
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == altaD) {

			TransferDepartamento d = new TransferDepartamento();
			
			if(!nombreDa.getText().equals("")) {
				
				d.setNombre(nombreDa.getText());
				
				Controlador.getInstance().handleRequest(IDEventos.EVENTO_ALTA_DEPARTAMENTO, d);
			}
			else {
				JFrame frameError = new JFrame();
				JOptionPane.showMessageDialog(frameError, "Error de formato en los datos de entrada", "Error en alta", JOptionPane.WARNING_MESSAGE);
			}
		}
		
		else if(e.getSource() == bajaDB) {
			
			if(!idDB.getText().equals("")) {
				
				Controlador.getInstance().handleRequest(IDEventos.EVENTO_BAJA_DEPARTAMENTO, Integer.parseInt(idDB.getText()));
			}
			else {	
				JFrame frameError = new JFrame();
				JOptionPane.showMessageDialog(frameError, "Error de formato en los datos de entrada", "Error en baja", JOptionPane.WARNING_MESSAGE);
			}
		} 
		else if(e.getSource() == modificarDM) {
			
			TransferDepartamento d = new TransferDepartamento();
			
			if(!idDM.getText().equals("")){
				
					if(!nombreDM.getText().equals("")) {
						
					d.setNombre(nombreDM.getText());
					d.setID_Departamento(Integer.parseInt(idDM.getText()));
					
					Controlador.getInstance().handleRequest(IDEventos.EVENTO_MODIFICAR_DEPARTAMENTO, d);
				}
				else {
					JFrame frameError = new JFrame();
					JOptionPane.showMessageDialog(frameError, "Error de formato en los datos de entrada", "Error en modificar", JOptionPane.WARNING_MESSAGE);
				}
			} 
			else {
				JFrame frameError = new JFrame();
				JOptionPane.showMessageDialog(frameError, "Error de formato en los datos de entrada", "Error en modificar", JOptionPane.WARNING_MESSAGE);
			}
			
					
		} 
		else if(e.getSource() == consultarDC) {
			
			if(!idDC.getText().equals("")) {
				
				Controlador.getInstance().handleRequest(IDEventos.EVENTO_CONSULTAR_UN_DEPARTAMENTO, Integer.parseInt(idDC.getText()));
			}
			else {
				JFrame frameError = new JFrame();
				JOptionPane.showMessageDialog(frameError, "Error de formato en los datos de entrada", "Error en consultar un cliente", JOptionPane.WARNING_MESSAGE);
			}
		} 
		else if(e.getSource() == listarDL) {
			
			this.repaint();
			Controlador.getInstance().handleRequest(IDEventos.EVENTO_LISTAR_DEPARTAMENTOS, VACIO);	
			
		} 
		else if(e.getSource() == nominaButton) {
						
			if(!idDepartamentoDN.getText().equals("")) {
				
				Controlador.getInstance().handleRequest(IDEventos.EVENTO_NOMINA_DEPARTAMENTO, Integer.parseInt(idDepartamentoDN.getText()));
			}
			else {
				JFrame frameError = new JFrame();
				JOptionPane.showMessageDialog(frameError, "Error de formato en los datos de entrada", "Error al mostrar la nomina del departamento", JOptionPane.WARNING_MESSAGE);
			}	
				
		} 
		else if(e.getSource() == mostrarD) {
			
			if(!idDepartamentoDE.getText().equals("")) {
				this.repaint();
				Controlador.getInstance().handleRequest(IDEventos.EVENTO_EMPLEADOS_DEPARTAMENTO, Integer.parseInt(idDepartamentoDE.getText()));
			}
			else {
				JFrame frameError = new JFrame();
				JOptionPane.showMessageDialog(frameError, "Error de formato en los datos de entrada", "Error al mostrar los empleados del departamento", JOptionPane.WARNING_MESSAGE);
			}
		}
		else if(e.getSource() == mostrarD1) {
			
			if(!idDepartamentoDP.getText().equals("")) {
				this.repaint();
				Controlador.getInstance().handleRequest(IDEventos.EVENTO_PROVEEDORES_DEPARTAMENTO, Integer.parseInt(idDepartamentoDP.getText()));
			}
			else {
				JFrame frameError = new JFrame();
				JOptionPane.showMessageDialog(frameError, "Error de formato en los datos de entrada", "Error al mostrar los proveedores del departamento", JOptionPane.WARNING_MESSAGE);
			}
		}
		
	}
	
	 public void actualizarVentanaAlta(IDEventos idEvento, Object datos) {
			
			if ( IDEventos.EVENTO_ALTA_DEPARTAMENTO == idEvento ) {
				if(datos instanceof Boolean)
				{
					Boolean correcto = (Boolean) datos;
					
					if (correcto) {

			    		nombreDa.setText(""); 						
						
						JFrame frame = new JFrame();
			    		JOptionPane.showMessageDialog(frame,"Departamento dado de alta", "Correcto", JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						JFrame frame = new JFrame();
			    		JOptionPane.showMessageDialog(frame,"Error en alta departamento", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
			else if ( IDEventos.ERROR_EVENTO_ALTA_DEPARTAMENTO == idEvento ) {
				
				JFrame frame = new JFrame();
				
				if ( datos instanceof Excepciones ) {
					
		    		JOptionPane.showMessageDialog(frame,((Excepciones)datos).getMensaje(), "Error", JOptionPane.ERROR_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(frame, "Excepcion controlada", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
	}
	 
	 public void actualizarVentanaBorra(IDEventos idEvento, Object datos){
	    	
	    	if ( IDEventos.EVENTO_BAJA_DEPARTAMENTO == idEvento ) {

	    		if ( datos instanceof Boolean ) {

	    			Boolean correcto = (Boolean) datos;

	    			if (correcto) {
	    				
	    				idDB.setText("");

	    				JFrame frame = new JFrame();
			    		JOptionPane.showMessageDialog(frame,"Departamento dado de baja", "Correcto", JOptionPane.INFORMATION_MESSAGE);
	    			}
	    			else {

	    				JFrame frame = new JFrame();
			    		JOptionPane.showMessageDialog(frame,"Error en baja departamento", "Error", JOptionPane.ERROR_MESSAGE);
	    			}
	    		}
	    	}
	    	else if ( IDEventos.ERROR_EVENTO_BAJA_DEPARTAMENTO == idEvento) {

	    		if ( datos instanceof Excepciones ) {

	    			JFrame frame = new JFrame();
	    			JOptionPane.showMessageDialog(frame,((Excepciones)datos).getMensaje(), "Error", JOptionPane.ERROR_MESSAGE);
	    		}
	    		else {
	    			JFrame frame = new JFrame();
	    			JOptionPane.showMessageDialog(frame,"Excepcion controlada", "Error", JOptionPane.ERROR_MESSAGE);
	    		}
	    	}
	    }
	 
	 public void actualizarVentanaModificar(IDEventos idEvento, Object datos){
		    
	    	if ( IDEventos.EVENTO_MODIFICAR_DEPARTAMENTO == idEvento ) {
				
				if ( datos instanceof Boolean ) {
					
					Boolean correcto = (Boolean) datos;
					
					if (correcto) {
						
						idDM.setText("");
						nombreDM.setText("");
						
						JFrame frame = new JFrame();
						JOptionPane.showMessageDialog(frame, "Departamento modificado", "Correcto", JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						
						JFrame frame = new JFrame();
						JOptionPane.showMessageDialog(frame, "Error en modificar departamento", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
			else if ( IDEventos.ERROR_EVENTO_MODIFICAR_DEPARTAMENTO == idEvento) {
				
				if ( datos instanceof Excepciones ) {
					
					JFrame frame = new JFrame();
		    		JOptionPane.showMessageDialog(frame,((Excepciones)datos).getMensaje(), "Error", JOptionPane.ERROR_MESSAGE);
				}
				else {
					JFrame frame = new JFrame();
		    		JOptionPane.showMessageDialog(frame,"Excepcion controlada", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
	    }
	 
	 public void actualizarVentanaConsulta(IDEventos idEvento, Object datos) {
			
			if ( IDEventos.EVENTO_CONSULTAR_UN_DEPARTAMENTO == idEvento ) {
			
				if ( datos instanceof TransferDepartamento) {
					
					TransferDepartamento d = (TransferDepartamento) datos;
					
					if ( d != null ) {
						
						nombreDC.setText(d.getNombre());
						activoDC.setText(d.getActivo().toString());
					}		
				}
				else {
					JFrame frame = new JFrame();
		    		JOptionPane.showMessageDialog(frame,"Error al consultar el departamento", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
			else if ( IDEventos.ERROR_EVENTO_CONSULTAR_UN_DEPARTAMENTO == idEvento ) {
				
				JFrame frame = new JFrame();
				
				if ( datos instanceof Excepciones ) {
					
		    		JOptionPane.showMessageDialog(frame,((Excepciones)datos).getMensaje(), "Error", JOptionPane.ERROR_MESSAGE);
				}
				else {
					
		    		JOptionPane.showMessageDialog(frame,"Excepcion controlada", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		}
	
	@SuppressWarnings("serial")
	public void actualizarVentanaListar(IDEventos idEvento, Object datos) {

	    	if ( IDEventos.EVENTO_LISTAR_DEPARTAMENTOS == idEvento ) {
	    		
	    		if ( datos instanceof ArrayList) {

	    			
	    			 //Cargar datos en lists
	                @SuppressWarnings("unchecked")
	                ArrayList<TransferDepartamento> arrayListc = (ArrayList<TransferDepartamento>) datos;
	                listIDListar = new Integer[arrayListc.size()];
	                listNombreListar = new String[arrayListc.size()];
	                listActivoListar = new Boolean[arrayListc.size()];
	                
	                for(int i = 0; i < arrayListc.size(); i++) {
	                	listIDListar[i] = arrayListc.get(i).getID_Departamento();
	                	listNombreListar[i] = arrayListc.get(i).getNombre();
	                	listActivoListar[i] = arrayListc.get(i).getActivo();

	                	idDepartamentoDL.setSelectedIndex(i);
	                	nombreDL.setSelectedIndex(i);
	                	activoDL.setSelectedIndex(i); 	
	                }
	               
	                
	                idDepartamentoDL.setModel(new javax.swing.AbstractListModel() {
	                    Integer[] listIDModel = listIDListar;     
	                    public int getSize() { return listIDModel.length; }
	                    public Integer getElementAt(int i) { return listIDModel[i]; }
	                });
	                
	                nombreDL.setModel(new javax.swing.AbstractListModel() {
	                    String[] listDNIModel = listNombreListar;     
	                    public int getSize() { return listDNIModel.length; }
	                    public String getElementAt(int i) { return listDNIModel[i]; }
	                });
	                
	                activoDL.setModel(new javax.swing.AbstractListModel() {
	                    Boolean[] listNombreModel = listActivoListar;     
	                    public int getSize() { return listNombreModel.length; }
	                    public Boolean getElementAt(int i) { return listNombreModel[i]; }
	                });
	              
	    		}
	    		else {
	    			JFrame frame = new JFrame();
		    		JOptionPane.showMessageDialog(frame,"Error al listar departamentos", "Error", JOptionPane.ERROR_MESSAGE);
	    		}
	    	}
	    	else if ( IDEventos.ERROR_EVENTO_LISTAR_DEPARTAMENTOS== idEvento ) {

	    		if ( datos instanceof Excepciones ) {

	    			JFrame frame = new JFrame();
	    			JOptionPane.showMessageDialog(frame,((Excepciones)datos).getMensaje(), "Error", JOptionPane.ERROR_MESSAGE);
	    		}
	    		else {
	    			JFrame frame = new JFrame();
	    			JOptionPane.showMessageDialog(frame,"Excepcion controlada", "Error", JOptionPane.ERROR_MESSAGE);
	    		}
	    	}
	    }
	 
	 
	public void actualizarVentanaNominaDepartamento(IDEventos idEvento, Object datos) {

	    	if ( IDEventos.EVENTO_NOMINA_DEPARTAMENTO == idEvento ) {
	    		
	    		if ( datos instanceof Float) {

	    			Float nom = (Float) datos;
					
					if(nom != null){
						
						nominaDN.setText(nom.toString() + " €");	
					}
	    		}
	    		else {
	    			JFrame frame = new JFrame();
		    		JOptionPane.showMessageDialog(frame,"Error al calcular la nomina del departamento", "Error", JOptionPane.ERROR_MESSAGE);
	    		}
	    	}
	    	else if ( IDEventos.ERROR_EVENTO_NOMINA_DEPARTAMENTO== idEvento ) {

	    		if ( datos instanceof Excepciones ) {

	    			JFrame frame = new JFrame();
	    			JOptionPane.showMessageDialog(frame,((Excepciones)datos).getMensaje(), "Error", JOptionPane.ERROR_MESSAGE);
	    		}
	    		else {

	    			JFrame frame = new JFrame();
	    			JOptionPane.showMessageDialog(frame,"Excepcion controlada", "Error", JOptionPane.ERROR_MESSAGE);
	    		}
	    	}
	    }


	@SuppressWarnings("serial")
	public void actualizarVentanaEmpleadosDept(IDEventos idEvento, Object datos) {
		
		if ( IDEventos.EVENTO_EMPLEADOS_DEPARTAMENTO == idEvento ) {
    		
    		if ( datos instanceof ArrayList) {

    			
    			 //Cargar datos en lists
                @SuppressWarnings("unchecked")
                ArrayList<TransferEmpleado> arrayListc = (ArrayList<TransferEmpleado>) datos;
                listIDEListar = new Integer[arrayListc.size()];
                listDNIEListar = new String[arrayListc.size()];
                listNombreEListar = new String[arrayListc.size()];
                listApellidosEListar = new String[arrayListc.size()];
                
                for(int i = 0; i < arrayListc.size(); i++) {
                	listIDEListar[i] = arrayListc.get(i).getIDEmpleado();
                	listDNIEListar[i] = arrayListc.get(i).getDNI();
                	listNombreEListar[i] = arrayListc.get(i).getNombre();
                	listApellidosEListar[i] = arrayListc.get(i).getApellidos();

                	idEmpleadoE1.setSelectedIndex(i);
                	apellidosE1.setSelectedIndex(i);
                	dniE2.setSelectedIndex(i);
                	nomreE1.setSelectedIndex(i); 	
                }
               
                
                idEmpleadoE1.setModel(new javax.swing.AbstractListModel() {
                    Integer[] listIDModel = listIDEListar;     
                    public int getSize() { return listIDModel.length; }
                    public Integer getElementAt(int i) { return listIDModel[i]; }
                });
                
                apellidosE1.setModel(new javax.swing.AbstractListModel() {
                    String[] listDNIModel = listDNIEListar;     
                    public int getSize() { return listDNIModel.length; }
                    public String getElementAt(int i) { return listDNIModel[i]; }
                });
                
                dniE2.setModel(new javax.swing.AbstractListModel() {
                    String[] listNombreModel = listNombreEListar;     
                    public int getSize() { return listNombreModel.length; }
                    public String getElementAt(int i) { return listNombreModel[i]; }
                });
                
                nomreE1.setModel(new javax.swing.AbstractListModel() {
                    String[] listNombreModel = listApellidosEListar;     
                    public int getSize() { return listNombreModel.length; }
                    public String getElementAt(int i) { return listNombreModel[i]; }
                });
              
    		}
    		else {
    			JFrame frame = new JFrame();
	    		JOptionPane.showMessageDialog(frame,"Error al mostrar los empleados del departamento", "Error", JOptionPane.ERROR_MESSAGE);
    		}
    	}
    	else if ( IDEventos.ERROR_EVENTO_EMPLEADOS_DEPARTAMENTO== idEvento ) {

    		if ( datos instanceof Excepciones ) {

    			//Asi se borran pero peta si meto de primeras uno que no tenga empleados por no estar 
    			  listIDEListar = new Integer[1];
                  listDNIEListar = new String[1];
                  listNombreEListar = new String[1];
                  listApellidosEListar = new String[1];
    			
	    			for(int i = 0; i < listIDEListar.length; i++) {
	                	listIDEListar[i] = null;
	                	listDNIEListar[i] = null;
	                	listNombreEListar[i] = "";
	                	listApellidosEListar[i] = "";
	
	                }
    			
	    			idEmpleadoE1.setModel(new javax.swing.AbstractListModel() {
	                    Integer[] listIDModel = listIDEListar;     
	                    public int getSize() { return listIDModel.length; }
	                    public Integer getElementAt(int i) { return listIDModel[i]; }
	                });
	                
	                apellidosE1.setModel(new javax.swing.AbstractListModel() {
	                    String[] listDNIModel = listDNIEListar;     
	                    public int getSize() { return listDNIModel.length; }
	                    public String getElementAt(int i) { return listDNIModel[i]; }
	                });
	                
	                dniE2.setModel(new javax.swing.AbstractListModel() {
	                    String[] listNombreModel = listNombreEListar;     
	                    public int getSize() { return listNombreModel.length; }
	                    public String getElementAt(int i) { return listNombreModel[i]; }
	                });
	                
	                nomreE1.setModel(new javax.swing.AbstractListModel() {
	                    String[] listNombreModel = listApellidosEListar;     
	                    public int getSize() { return listNombreModel.length; }
	                    public String getElementAt(int i) { return listNombreModel[i]; }
	                });
    			
    			JFrame frame = new JFrame();
    			JOptionPane.showMessageDialog(frame,((Excepciones)datos).getMensaje(), "Error", JOptionPane.ERROR_MESSAGE);
    		}
    		else {
    			JFrame frame = new JFrame();
    			JOptionPane.showMessageDialog(frame,"Excepcion controlada", "Error", JOptionPane.ERROR_MESSAGE);
    		}
    	}
		
	}

	@SuppressWarnings({ "serial", "deprecation" })
	public void actualizarVentanaProveedoresDept(IDEventos idEvento, Object datos) {
		
		if ( IDEventos.EVENTO_PROVEEDORES_DEPARTAMENTO == idEvento ) {
    		
    		if ( datos instanceof ArrayList) {

    			
    			 //Cargar datos en lists
                @SuppressWarnings("unchecked")
                ArrayList<TransferProvDept> arrayListc = (ArrayList<TransferProvDept>) datos;
                listIDPListar = new Integer[arrayListc.size()];
                listNombrePListar = new String[arrayListc.size()];
                listFechaPListar = new String[arrayListc.size()];
               

                
                
                for(int i = 0; i < arrayListc.size(); i++) {
                	listIDPListar[i] = arrayListc.get(i).getID_Proveedor();
                	listNombrePListar[i] = arrayListc.get(i).getNombreProv();
                	listFechaPListar[i] = arrayListc.get(i).getFecha_Contratacion().toLocaleString();
                	nombreDP.setText(arrayListc.get(i).getNombreDept());

                	idProveedorD.setSelectedIndex(i);
                	nombrePD.setSelectedIndex(i);
                	fechaPD.setSelectedIndex(i);
                	
                }
               
                
                idProveedorD.setModel(new javax.swing.AbstractListModel() {
                    Integer[] listIDModel = listIDPListar;     
                    public int getSize() { return listIDModel.length; }
                    public Integer getElementAt(int i) { return listIDModel[i]; }
                });
                
                nombrePD.setModel(new javax.swing.AbstractListModel() {
                    String[] listNombreModel = listNombrePListar;     
                    public int getSize() { return listNombreModel.length; }
                    public String getElementAt(int i) { return listNombreModel[i]; }
                });
                
                fechaPD.setModel(new javax.swing.AbstractListModel() {
                	String[] listNombreModel = listFechaPListar;     
                    public int getSize() { return listNombreModel.length; }
                    public String getElementAt(int i) { return listNombreModel[i]; }
                });
              
    		}
    		else {
    			JFrame frame = new JFrame();
	    		JOptionPane.showMessageDialog(frame,"Error al mostrar los proveedores del departamento", "Error", JOptionPane.ERROR_MESSAGE);
    		}
    	}
    	else if ( IDEventos.ERROR_EVENTO_PROVEEDORES_DEPARTAMENTO== idEvento ) {

    		if ( datos instanceof Excepciones ) {

                listIDPListar = new Integer[1];
                listNombrePListar = new String[1];
                listFechaPListar = new String[1];
    			
    			for(int i = 0; i < listIDPListar.length; i++) {
    				listIDPListar[i] = null;
                	listNombrePListar[i] = "";
                	listFechaPListar[i] = "";

                }

    			idProveedorD.setModel(new javax.swing.AbstractListModel() {
                    Integer[] listIDModel = listIDPListar;     
                    public int getSize() { return listIDModel.length; }
                    public Integer getElementAt(int i) { return listIDModel[i]; }
                });
                
                nombrePD.setModel(new javax.swing.AbstractListModel() {
                    String[] listNombreModel = listNombrePListar;     
                    public int getSize() { return listNombreModel.length; }
                    public String getElementAt(int i) { return listNombreModel[i]; }
                });
                
                fechaPD.setModel(new javax.swing.AbstractListModel() {
                	String[] listNombreModel = listFechaPListar;     
                    public int getSize() { return listNombreModel.length; }
                    public String getElementAt(int i) { return listNombreModel[i]; }
                });
                
    			JFrame frame = new JFrame();
    			JOptionPane.showMessageDialog(frame,((Excepciones)datos).getMensaje(), "Error", JOptionPane.ERROR_MESSAGE);
    		}
    		else {
    			JFrame frame = new JFrame();
    			JOptionPane.showMessageDialog(frame,"Excepcion controlada", "Error", JOptionPane.ERROR_MESSAGE);
    		}
    	}
		
	}
	
}
