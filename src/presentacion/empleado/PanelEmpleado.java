package presentacion.empleado;

import integracion.transacciones.conexion.Excepciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import presentacion.comando.IDEventos;
import presentacion.controlador.Controlador;
import negocio.empleado.TransferEmpleado;
import negocio.empleado.TransferEmpleadoTCompleto;
import negocio.empleado.TransferEmpleadoTParcial;

public class PanelEmpleado extends JPanel implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//Auxiliares
	private final Object VACIO = null;	

	private javax.swing.JTextField DNIA;
    private javax.swing.JTextField DNIC;
    private javax.swing.JTextField DNIM;
    private javax.swing.JTextField DNIM1;
    private javax.swing.ButtonGroup TipoEmpleado;
    private javax.swing.JTextField activoC;
    private javax.swing.JList activoE;
    private javax.swing.JPanel altaCliente;
    private javax.swing.JButton altaE;
    private javax.swing.JTextField apellidosA;
    private javax.swing.JTextField apellidosC;
    private javax.swing.JList apellidosE;
    private javax.swing.JTextField apellidosM;
    private javax.swing.JPanel bajaCliente;
    private javax.swing.JButton bajaE;
    private javax.swing.JButton consultarE;
    private javax.swing.JPanel consultarUnCliente;
    private javax.swing.JList dniE;
    private javax.swing.JPanel empleado;
    private javax.swing.JTextField horasA;
    private javax.swing.JTextField horasC;
    private javax.swing.JTextField horasM;
    private javax.swing.JTextField idB;
    private javax.swing.JTextField idC;
    private javax.swing.JTextField idDepartamentoA;
    private javax.swing.JTextField idDepartamentoC;
    private javax.swing.JList idDepartamentoE;
    private javax.swing.JList idEmpleadoE;
    private javax.swing.JTextField idEmpleadoN;
    private javax.swing.JTextField idM;
    private javax.swing.JTextField impuestoA;
    private javax.swing.JTextField impuestoC;
    private javax.swing.JTextField impuestoM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel listarClientes;
    private javax.swing.JButton listarE;
    private javax.swing.JPanel modificarCliente;
    private javax.swing.JButton modificarE;
    private javax.swing.JTextField nombreA;
    private javax.swing.JTextField nombreC;
    private javax.swing.JTextField nombreM;
    private javax.swing.JList nominaE;
    private javax.swing.JTextField nominaEN;
    private javax.swing.JButton nominaEmpleado;
    private javax.swing.JList nomreE;
    private javax.swing.JTextField salarioHoraC;
    private javax.swing.JTextField salarioHorasA;
    private javax.swing.JTextField salarioHorasM;
    private javax.swing.JTextField suedloA;
    private javax.swing.JTextField sueldoC;
    private javax.swing.JTextField sueldoM;
    private javax.swing.JRadioButton tiempoCompletoA;
    private javax.swing.JRadioButton tiempoCompletoC;
    private javax.swing.JRadioButton tiempoCompletoM;
    private javax.swing.JRadioButton tiempoParcialA;
    private javax.swing.JRadioButton tiempoParcialC;
    private javax.swing.JRadioButton tiempoParcialM;
    private javax.swing.JList tipoEmpleadoE;
    
    
    //Listas listar
    private Integer[] listIDListar;
    private String[] listDNIListar;
    private String[] listNombreListar;
    private String[] listApellidoListar;
    private String[] listTipoEmpleado;
    private Float[] listNomina;
    private Integer[] listID_Dept;
    private Boolean[] listActivoListar;

    
	
	public PanelEmpleado() {
		initGUI();	
	}

	//Panel Empleado
	private void initGUI() {
		
        
		 TipoEmpleado = new javax.swing.ButtonGroup();
		 
	        empleado = new javax.swing.JPanel();
	        jTabbedPane1 = new javax.swing.JTabbedPane();
	        bajaCliente = new javax.swing.JPanel();
	        idB = new javax.swing.JTextField();
	        jLabel9 = new javax.swing.JLabel();
	        bajaE = new javax.swing.JButton();
	        modificarCliente = new javax.swing.JPanel();
	        jLabel5 = new javax.swing.JLabel();
	        DNIM = new javax.swing.JTextField();
	        nombreM = new javax.swing.JTextField();
	        jLabel6 = new javax.swing.JLabel();
	        jLabel7 = new javax.swing.JLabel();
	        apellidosM = new javax.swing.JTextField();
	        modificarE = new javax.swing.JButton();
	        modificarE.addActionListener(this);
	        jSeparator1 = new javax.swing.JSeparator();
	        idM = new javax.swing.JTextField();
	        jLabel10 = new javax.swing.JLabel();
	        jLabel84 = new javax.swing.JLabel();
	        impuestoM = new javax.swing.JTextField();
	        sueldoM = new javax.swing.JTextField();
	        horasM = new javax.swing.JTextField();
	        tiempoParcialM = new javax.swing.JRadioButton();
	        tiempoParcialM.addActionListener(this);
	        salarioHorasM = new javax.swing.JTextField();
	        tiempoCompletoM = new javax.swing.JRadioButton();
	        tiempoCompletoM.addActionListener(this);
	        jLabel85 = new javax.swing.JLabel();
	        jLabel86 = new javax.swing.JLabel();
	        jLabel87 = new javax.swing.JLabel();
	        jLabel88 = new javax.swing.JLabel();
	        jLabel15 = new javax.swing.JLabel();
	        DNIM1 = new javax.swing.JTextField();
	        consultarUnCliente = new javax.swing.JPanel();
	        jLabel11 = new javax.swing.JLabel();
	        idC = new javax.swing.JTextField();
	        jSeparator2 = new javax.swing.JSeparator();
	        nombreC = new javax.swing.JTextField();
	        nombreC.setEditable(false);
	        apellidosC = new javax.swing.JTextField();
	        apellidosC.setEditable(false);
	        jLabel12 = new javax.swing.JLabel();
	        jLabel13 = new javax.swing.JLabel();
	        jLabel14 = new javax.swing.JLabel();
	        DNIC = new javax.swing.JTextField();
	        DNIC.setEditable(false);
	        jLabel16 = new javax.swing.JLabel();
	        activoC = new javax.swing.JTextField();
	        activoC.setEditable(false);
	        consultarE = new javax.swing.JButton();
	        jLabel89 = new javax.swing.JLabel();
	        impuestoC = new javax.swing.JTextField();
	        impuestoC.setEditable(false);
	        sueldoC = new javax.swing.JTextField();
	        sueldoC.setEditable(false);
	        horasC = new javax.swing.JTextField();
	        horasC.setEditable(false);
	        tiempoParcialC = new javax.swing.JRadioButton();
	        tiempoParcialC.setEnabled(false);;
	        salarioHoraC = new javax.swing.JTextField();
	        salarioHoraC.setEditable(false);
	        tiempoCompletoC = new javax.swing.JRadioButton();
	        tiempoCompletoC.setEnabled(false);
	        jLabel90 = new javax.swing.JLabel();
	        jLabel91 = new javax.swing.JLabel();
	        jLabel92 = new javax.swing.JLabel();
	        jLabel93 = new javax.swing.JLabel();
	        jLabel22 = new javax.swing.JLabel();
	        idDepartamentoC = new javax.swing.JTextField(11);
	        idDepartamentoC.setEditable(false);
	       
	        altaCliente = new javax.swing.JPanel();
	        nombreA = new javax.swing.JTextField();
	        apellidosA = new javax.swing.JTextField();
	        jLabel1 = new javax.swing.JLabel();
	        jLabel2 = new javax.swing.JLabel();
	        jLabel3 = new javax.swing.JLabel();
	        altaE = new javax.swing.JButton();
	        DNIA = new javax.swing.JTextField();
	        tiempoParcialA = new javax.swing.JRadioButton();
	        tiempoParcialA.addActionListener(this);
	        tiempoCompletoA = new javax.swing.JRadioButton();
	        tiempoCompletoA.addActionListener(this);
	        jLabel4 = new javax.swing.JLabel();
	        jLabel76 = new javax.swing.JLabel();
	        jLabel78 = new javax.swing.JLabel();
	        jLabel82 = new javax.swing.JLabel();
	        jLabel83 = new javax.swing.JLabel();
	        salarioHorasA = new javax.swing.JTextField();
	        horasA = new javax.swing.JTextField();
	        suedloA = new javax.swing.JTextField();
	        impuestoA = new javax.swing.JTextField();
	        jLabel8 = new javax.swing.JLabel();
	        idDepartamentoA = new javax.swing.JTextField();
	        listarClientes = new javax.swing.JPanel();
	        jSeparator3 = new javax.swing.JSeparator();
	        jLabel17 = new javax.swing.JLabel();
	        jLabel18 = new javax.swing.JLabel();
	        jLabel19 = new javax.swing.JLabel();
	        jLabel20 = new javax.swing.JLabel();
	        jLabel21 = new javax.swing.JLabel();
	        jLabel23 = new javax.swing.JLabel();
	        listarE = new javax.swing.JButton();
	        jPanel12 = new javax.swing.JPanel();
	        jScrollPane2 = new javax.swing.JScrollPane();
	        idEmpleadoE = new javax.swing.JList();
	        jPanel13 = new javax.swing.JPanel();
	        jScrollPane3 = new javax.swing.JScrollPane();
	        dniE = new javax.swing.JList();
	        jPanel14 = new javax.swing.JPanel();
	        jScrollPane4 = new javax.swing.JScrollPane();
	        nomreE = new javax.swing.JList();
	        jPanel15 = new javax.swing.JPanel();
	        jScrollPane24 = new javax.swing.JScrollPane();
	        activoE = new javax.swing.JList();
	        jScrollPane27 = new javax.swing.JScrollPane();
	        tipoEmpleadoE = new javax.swing.JList();
	        jScrollPane28 = new javax.swing.JScrollPane();
	        nominaE = new javax.swing.JList();
	        jScrollPane29 = new javax.swing.JScrollPane();
	        apellidosE = new javax.swing.JList();
	        jScrollPane6 = new javax.swing.JScrollPane();
	        idDepartamentoE = new javax.swing.JList();
	        jLabel24 = new javax.swing.JLabel();
	        jLabel25 = new javax.swing.JLabel();
	        jPanel16 = new javax.swing.JPanel();
	        jLabel26 = new javax.swing.JLabel();
	        idEmpleadoN = new javax.swing.JTextField();
	        jSeparator4 = new javax.swing.JSeparator();
	        jLabel27 = new javax.swing.JLabel();
	        nominaEN = new javax.swing.JTextField();
	        nominaEN.setEditable(false);
	        nominaEmpleado = new javax.swing.JButton();
	       
	        jLabel31 = new javax.swing.JLabel();
	       
     
	        //Ocultar componentes
	        salarioHorasA.setVisible(false);
	        salarioHorasM.setVisible(false);
	        salarioHoraC.setVisible(false);
	        horasA.setVisible(false);
	        horasM.setVisible(false);
	        horasC.setVisible(false);
	        suedloA.setVisible(false);
	        sueldoM.setVisible(false);
	        sueldoC.setVisible(false);
	        impuestoA.setVisible(false);
	        impuestoM.setVisible(false);
	        impuestoC.setVisible(false);
	        jLabel76.setVisible(false);
			 jLabel78.setVisible(false);
			 jLabel82.setVisible(false);
			 jLabel83.setVisible(false);
			 jLabel93.setVisible(false);
			 jLabel89.setVisible(false);
			 jLabel91.setVisible(false);
			 jLabel90.setVisible(false);
			 jLabel88.setVisible(false);
			 jLabel84.setVisible(false);
			 jLabel86.setVisible(false);
			 jLabel85.setVisible(false);
	        
	       
	        jLabel1.setText("DNI:");

	        jLabel2.setText("Nombre:");

	        jLabel3.setText("Apellidos:");

	        altaE.setText("Alta");
	        altaE.addActionListener(this);

	       

	        TipoEmpleado.add(tiempoParcialA);
	        tiempoParcialA.setText("Tiempo parcial");

	        TipoEmpleado.add(tiempoCompletoA);
	        tiempoCompletoA.setText("Tiempo completo");

	        jLabel4.setText("Tipo empleado");

	        jLabel76.setText("Salario horas:");

	        jLabel78.setText("Horas:");

	        jLabel82.setText("Sueldo:");

	        jLabel83.setText("Impuesto (%):");

	       
	        jLabel8.setText("ID Departamento:");

	      

	        javax.swing.GroupLayout altaClienteLayout = new javax.swing.GroupLayout(altaCliente);
	        altaCliente.setLayout(altaClienteLayout);
	        altaClienteLayout.setHorizontalGroup(
	            altaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, altaClienteLayout.createSequentialGroup()
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addComponent(altaE)
	                .addGap(19, 19, 19))
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, altaClienteLayout.createSequentialGroup()
	                .addGroup(altaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, altaClienteLayout.createSequentialGroup()
	                        .addGap(28, 28, 28)
	                        .addGroup(altaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(altaClienteLayout.createSequentialGroup()
	                                .addComponent(jLabel8)
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                                .addComponent(idDepartamentoA, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addGap(0, 0, Short.MAX_VALUE))
	                            .addGroup(altaClienteLayout.createSequentialGroup()
	                                .addComponent(jLabel1)
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                                .addComponent(DNIA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addGap(78, 78, 78)
	                                .addComponent(jLabel2)
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                .addComponent(nombreA, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
	                                .addComponent(jLabel3))))
	                    .addGroup(altaClienteLayout.createSequentialGroup()
	                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                        .addGroup(altaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                            .addGroup(altaClienteLayout.createSequentialGroup()
	                                .addGroup(altaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                    .addComponent(tiempoParcialA)
	                                    .addGroup(altaClienteLayout.createSequentialGroup()
	                                        .addComponent(jLabel78)
	                                        .addGap(18, 18, 18)
	                                        .addComponent(horasA, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
	                                    .addGroup(altaClienteLayout.createSequentialGroup()
	                                        .addComponent(jLabel76)
	                                        .addGap(18, 18, 18)
	                                        .addComponent(salarioHorasA, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                                .addGap(41, 41, 41)
	                                .addGroup(altaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                    .addGroup(altaClienteLayout.createSequentialGroup()
	                                        .addComponent(jLabel82)
	                                        .addGap(18, 18, 18)
	                                        .addComponent(suedloA, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
	                                    .addComponent(tiempoCompletoA)
	                                    .addGroup(altaClienteLayout.createSequentialGroup()
	                                        .addComponent(jLabel83)
	                                        .addGap(18, 18, 18)
	                                        .addComponent(impuestoA, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
	                            .addGroup(altaClienteLayout.createSequentialGroup()
	                                .addComponent(jLabel4)
	                                .addGap(159, 159, 159)))))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addComponent(apellidosA, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(50, 50, 50))
	        );
	        altaClienteLayout.setVerticalGroup(
	            altaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, altaClienteLayout.createSequentialGroup()
	                .addGap(64, 64, 64)
	                .addGroup(altaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(DNIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(nombreA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabel1)
	                    .addComponent(jLabel2)
	                    .addComponent(jLabel3)
	                    .addComponent(apellidosA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(18, 18, 18)
	                .addGroup(altaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(idDepartamentoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabel8))
	                .addGap(20, 20, 20)
	                .addComponent(jLabel4)
	                .addGap(16, 16, 16)
	                .addGroup(altaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(tiempoParcialA)
	                    .addComponent(tiempoCompletoA))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
	                .addGroup(altaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel76)
	                    .addComponent(jLabel82)
	                    .addComponent(salarioHorasA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(suedloA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(34, 34, 34)
	                .addGroup(altaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel78)
	                    .addComponent(jLabel83)
	                    .addComponent(horasA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(impuestoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(51, 51, 51)
	                .addComponent(altaE)
	                .addGap(16, 16, 16))
	        );

	        jTabbedPane1.addTab("Alta", altaCliente);

        jLabel9.setText("ID Empleado:");

        bajaE.setText("Baja");
        bajaE.addActionListener(this);

        javax.swing.GroupLayout bajaClienteLayout = new javax.swing.GroupLayout(bajaCliente);
        bajaCliente.setLayout(bajaClienteLayout);
        bajaClienteLayout.setHorizontalGroup(
            bajaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bajaClienteLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(idB, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bajaClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bajaE)
                .addGap(65, 65, 65))
        );
        bajaClienteLayout.setVerticalGroup(
            bajaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bajaClienteLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(bajaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 249, Short.MAX_VALUE)
                .addComponent(bajaE)
                .addGap(50, 50, 50))
        );

        jTabbedPane1.addTab("Baja", bajaCliente);

        jLabel5.setText("DNI:");

       

        jLabel6.setText("Nombre:");

        jLabel7.setText("Apellidos:");

        modificarE.setText("Modificar");

        jLabel10.setText("ID Empleado");

        jLabel84.setText("Horas:");

       

        TipoEmpleado.add(tiempoParcialM);
        tiempoParcialM.setText("Tiempo parcial");

        TipoEmpleado.add(tiempoCompletoM);
        tiempoCompletoM.setText("Tiempo completo");

        jLabel85.setText("Impuesto (%):");

        jLabel86.setText("Sueldo:");

        jLabel87.setText("Tipo empleado");

        jLabel88.setText("Salario horas:");

        jLabel15.setText("ID Departamento:");

       

        javax.swing.GroupLayout modificarClienteLayout = new javax.swing.GroupLayout(modificarCliente);
        modificarCliente.setLayout(modificarClienteLayout);
        modificarClienteLayout.setHorizontalGroup(
            modificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modificarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modificarClienteLayout.createSequentialGroup()
                .addGroup(modificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, modificarClienteLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(modificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(modificarClienteLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DNIM, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(modificarClienteLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(DNIM1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(modificarClienteLayout.createSequentialGroup()
                        .addContainerGap(183, Short.MAX_VALUE)
                        .addGroup(modificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(modificarClienteLayout.createSequentialGroup()
                                .addGroup(modificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(modificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modificarClienteLayout.createSequentialGroup()
                                            .addComponent(jLabel87)
                                            .addGap(157, 157, 157))
                                        .addGroup(modificarClienteLayout.createSequentialGroup()
                                            .addGroup(modificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tiempoParcialM)
                                                .addGroup(modificarClienteLayout.createSequentialGroup()
                                                    .addComponent(jLabel88)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(salarioHorasM, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(modificarClienteLayout.createSequentialGroup()
                                                    .addComponent(jLabel84)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(horasM, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(41, 41, 41)
                                            .addGroup(modificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(modificarClienteLayout.createSequentialGroup()
                                                    .addComponent(jLabel86)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(sueldoM, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(tiempoCompletoM)
                                                .addGroup(modificarClienteLayout.createSequentialGroup()
                                                    .addComponent(jLabel85)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(impuestoM, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addComponent(apellidosM, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(modificarClienteLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(nombreM, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(293, 293, 293)))))
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modificarClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(modificarE)
                .addGap(19, 19, 19))
            .addGroup(modificarClienteLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(idM, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        modificarClienteLayout.setVerticalGroup(
            modificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modificarClienteLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(modificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(modificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(apellidosM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(modificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DNIM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel87)
                .addGap(18, 18, 18)
                .addGroup(modificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tiempoParcialM)
                    .addComponent(tiempoCompletoM))
                .addGap(29, 29, 29)
                .addGroup(modificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel88)
                    .addComponent(jLabel86)
                    .addComponent(salarioHorasM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sueldoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(modificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel84)
                    .addComponent(jLabel85)
                    .addComponent(horasM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(impuestoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(modificarE)
                .addGap(16, 16, 16))
        );

        jTabbedPane1.addTab("Modificar", modificarCliente);

        jLabel11.setText("ID Empleado:");

        jLabel12.setText("DNI:");

        jLabel13.setText("Nombre:");

        jLabel14.setText("Apellidos:");

       

        jLabel16.setText("Activo:");

        consultarE.setText("Consultar");
        consultarE.addActionListener(this);
        

        jLabel89.setText("Horas:");

       

       

        TipoEmpleado.add(tiempoParcialC);
        tiempoParcialC.setText("Tiempo parcial");

        TipoEmpleado.add(tiempoCompletoC);
        tiempoCompletoC.setText("Tiempo completo");

        jLabel90.setText("Impuesto:");

        jLabel91.setText("Sueldo:");

        jLabel92.setText("Tipo empleado");

        jLabel93.setText("Salario horas:");

        jLabel22.setText("ID Departamento:");

        javax.swing.GroupLayout consultarUnClienteLayout = new javax.swing.GroupLayout(consultarUnCliente);
        consultarUnCliente.setLayout(consultarUnClienteLayout);
        consultarUnClienteLayout.setHorizontalGroup(
            consultarUnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultarUnClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addContainerGap())
            .addGroup(consultarUnClienteLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(idC, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 337, Short.MAX_VALUE)
                .addComponent(consultarE)
                .addGap(53, 53, 53))
            .addGroup(consultarUnClienteLayout.createSequentialGroup()
                .addGroup(consultarUnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(consultarUnClienteLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addGroup(consultarUnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(consultarUnClienteLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(consultarUnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consultarUnClienteLayout.createSequentialGroup()
                                        .addComponent(jLabel92)
                                        .addGap(157, 157, 157))
                                    .addGroup(consultarUnClienteLayout.createSequentialGroup()
                                        .addGroup(consultarUnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tiempoParcialC)
                                            .addGroup(consultarUnClienteLayout.createSequentialGroup()
                                                .addComponent(jLabel93)
                                                .addGap(18, 18, 18)
                                                .addComponent(salarioHoraC, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(consultarUnClienteLayout.createSequentialGroup()
                                                .addComponent(jLabel89)
                                                .addGap(18, 18, 18)
                                                .addComponent(horasC, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(41, 41, 41)
                                        .addGroup(consultarUnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(consultarUnClienteLayout.createSequentialGroup()
                                                .addComponent(jLabel91)
                                                .addGap(18, 18, 18)
                                                .addComponent(sueldoC, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(tiempoCompletoC)
                                            .addGroup(consultarUnClienteLayout.createSequentialGroup()
                                                .addComponent(jLabel90)
                                                .addGap(18, 18, 18)
                                                .addComponent(impuestoC, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addComponent(activoC, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(consultarUnClienteLayout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addGroup(consultarUnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(consultarUnClienteLayout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(18, 18, 18)
                                .addComponent(idDepartamentoC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(consultarUnClienteLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(nombreC, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(consultarUnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(consultarUnClienteLayout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(jLabel12)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(DNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 314, Short.MAX_VALUE)
                    .addComponent(jLabel14)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(apellidosC, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(39, 39, 39)))
        );
        consultarUnClienteLayout.setVerticalGroup(
            consultarUnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultarUnClienteLayout.createSequentialGroup()
                .addGroup(consultarUnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(consultarUnClienteLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(consultarUnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(idC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consultarUnClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(consultarE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(consultarUnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(consultarUnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(consultarUnClienteLayout.createSequentialGroup()
                        .addGroup(consultarUnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(activoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel92)
                        .addGap(18, 18, 18)
                        .addGroup(consultarUnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tiempoParcialC)
                            .addComponent(tiempoCompletoC))
                        .addGap(29, 29, 29)
                        .addGroup(consultarUnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel93)
                            .addComponent(jLabel91)
                            .addComponent(salarioHoraC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sueldoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(consultarUnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel89)
                            .addComponent(jLabel90)
                            .addComponent(horasC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(impuestoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(consultarUnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel22)
                        .addComponent(idDepartamentoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(consultarUnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(consultarUnClienteLayout.createSequentialGroup()
                    .addGap(106, 106, 106)
                    .addGroup(consultarUnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DNIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(jLabel14)
                        .addComponent(apellidosC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(290, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Consultar", consultarUnCliente);

        //LISTAS
        
        jScrollPane2.setViewportView(idEmpleadoE);

        
        jScrollPane3.setViewportView(dniE);

        
        jScrollPane4.setViewportView(nomreE);

        
        jScrollPane29.setViewportView(apellidosE);

        
        jScrollPane27.setViewportView(tipoEmpleadoE);

        
        jScrollPane28.setViewportView(nominaE);

        
        jScrollPane6.setViewportView(idDepartamentoE);
        
        jScrollPane24.setViewportView(activoE);

        jLabel17.setText("ID");

        jLabel18.setText("DNI");

        jLabel19.setText("Nombre");

        jLabel20.setText("Apellidos");

        jLabel21.setText("Tipo Empleado");

        jLabel23.setText("Activo");

        listarE.setText("Listar");
        listarE.addActionListener(this);


        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );


        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );


        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane27)
                    .addComponent(jScrollPane29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                    .addComponent(jScrollPane28, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                    .addComponent(jScrollPane24))
                .addContainerGap())
        );

        jLabel24.setText("Nomina");

        jLabel25.setText("ID Dept");

        javax.swing.GroupLayout listarClientesLayout = new javax.swing.GroupLayout(listarClientes);
        listarClientes.setLayout(listarClientesLayout);
        listarClientesLayout.setHorizontalGroup(
            listarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listarClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listarClientesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(listarE))
                    .addGroup(listarClientesLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel18)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel19)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel20)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel21)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel24)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel25)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel23)
                        .addGap(12, 12, 12))
                    .addGroup(listarClientesLayout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 395, Short.MAX_VALUE)))
                .addContainerGap())
        );
        listarClientesLayout.setVerticalGroup(
            listarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listarClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel23)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(listarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listarE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Listar", listarClientes);

        jLabel26.setText("ID Empleado: ");

       

        jLabel27.setText("Nomina: ");

        nominaEmpleado.setText("Nomina");
        nominaEmpleado.addActionListener(this);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel26)
                        .addGap(18, 18, 18)
                        .addComponent(idEmpleadoN, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel27)
                        .addGap(18, 18, 18)
                        .addComponent(nominaEN, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(nominaEmpleado)
                .addGap(105, 105, 105))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(idEmpleadoN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(nominaEN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addComponent(nominaEmpleado)
                .addGap(76, 76, 76))
        );

        jTabbedPane1.addTab("Nomina Empleado", jPanel16);

        javax.swing.GroupLayout empleadoLayout = new javax.swing.GroupLayout(empleado);
        empleado.setLayout(empleadoLayout);
        empleadoLayout.setHorizontalGroup(
            empleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empleadoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jTabbedPane1)
                .addGap(21, 21, 21))
        );
        empleadoLayout.setVerticalGroup(
            empleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empleadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );


        jLabel31.setText("Nombre:");

       

      
        this.add(empleado);

	}

	
	//ActionListener
	public void actionPerformed(ActionEvent e) {
		
		 if(e.getSource() == tiempoCompletoA) {
			 
				 salarioHorasA.setText("");
				 horasA.setText("");
				 salarioHorasA.setVisible(false);
				 horasA.setVisible(false);
				 suedloA.setVisible(true);
				 impuestoA.setVisible(true);
				 jLabel76.setVisible(false);
				 jLabel78.setVisible(false);
				 jLabel82.setVisible(true);
				 jLabel83.setVisible(true);
				 this.repaint();
		 }
		 else if(e.getSource() == tiempoParcialA) {
			 salarioHorasA.setVisible(true);
			 horasA.setVisible(true);
			 suedloA.setVisible(false);
			 impuestoA.setVisible(false);
			 suedloA.setText("");
			 impuestoA.setText("");
			 jLabel76.setVisible(true);
			 jLabel78.setVisible(true);
			 jLabel82.setVisible(false);
			 jLabel83.setVisible(false);
			 this.repaint();
		 }
		 else if(e.getSource() == tiempoParcialM) {
			 salarioHorasM.setText("");
			 horasM.setText("");
			 salarioHorasM.setVisible(true);
			 horasM.setVisible(true);
			 sueldoM.setVisible(false);
			 impuestoM.setVisible(false);
			 jLabel88.setVisible(true);
			 jLabel84.setVisible(true);
			 jLabel86.setVisible(false);
			 jLabel85.setVisible(false);
			 this.repaint();
		 }
		 else if(e.getSource() == tiempoCompletoM) {

			 salarioHorasM.setText("");
			 horasM.setText("");
			 salarioHorasM.setVisible(false);
			 horasM.setVisible(false);
			 sueldoM.setVisible(true);
			 impuestoM.setVisible(true);
			 jLabel88.setVisible(false);
			 jLabel84.setVisible(false);
			 jLabel86.setVisible(true);
			 jLabel85.setVisible(true);
			 this.repaint();
		 }
       
		else if(e.getSource() == altaE) {

			
			if(!DNIA.getText().equals("") && !nombreA.getText().equals("") && !apellidosA.getText().equals("") && !idDepartamentoA.getText().equals("")) {
				
				
				
				if(tiempoParcialA.isSelected()) {
					TransferEmpleado emParcial = new TransferEmpleadoTParcial();
				      
					if(!salarioHorasA.getText().equals("") && !horasA.getText().equals("")) {
						emParcial.setDNI(DNIA.getText());
						emParcial.setNombre(nombreA.getText());
						emParcial.setApellidos(apellidosA.getText());
						emParcial.setDepartamento_emp(Integer.parseInt(idDepartamentoA.getText()));
						((TransferEmpleadoTParcial)emParcial).setSalarioHoras(Float.parseFloat(salarioHorasA.getText()));
						((TransferEmpleadoTParcial)emParcial).setHoras(Float.parseFloat(horasA.getText()));
						
						Controlador.getInstance().handleRequest(IDEventos.EVENTO_ALTA_EMPLEADO, emParcial);
					}
					else {
						JFrame frameError = new JFrame();
						JOptionPane.showMessageDialog(frameError, "Error de formato en los datos de entrada", "Error en alta", JOptionPane.WARNING_MESSAGE);
					}
				}
				else if(tiempoCompletoA.isSelected()) {
				      
					TransferEmpleado emCompleto = new TransferEmpleadoTCompleto();

					if(!suedloA.getText().equals("") && !impuestoA.getText().equals("")) {
						emCompleto.setDNI(DNIA.getText());
						emCompleto.setNombre(nombreA.getText());
						emCompleto.setApellidos(apellidosA.getText());
						emCompleto.setDepartamento_emp(Integer.parseInt(idDepartamentoA.getText()));
						((TransferEmpleadoTCompleto)emCompleto).setSalario(Float.parseFloat(suedloA.getText()));
						((TransferEmpleadoTCompleto)emCompleto).setImpuesto(Float.parseFloat(impuestoA.getText()));
						
						Controlador.getInstance().handleRequest(IDEventos.EVENTO_ALTA_EMPLEADO, emCompleto);

					}
					else {
						JFrame frameError = new JFrame();
						JOptionPane.showMessageDialog(frameError, "Error de formato en los datos de entrada", "Error en alta", JOptionPane.WARNING_MESSAGE);
					}
				}
				else {
					JFrame frameError = new JFrame();
					JOptionPane.showMessageDialog(frameError, "Error de formato en los datos de entrada", "Error en alta", JOptionPane.WARNING_MESSAGE);
				}
				
				
				
			}
			else {
				JFrame frameError = new JFrame();
				JOptionPane.showMessageDialog(frameError, "Error de formato en los datos de entrada", "Error en alta", JOptionPane.WARNING_MESSAGE);
			}
		}
		
		else if(e.getSource() == bajaE) {
			
			if(!idB.getText().equals("")) {
				
				Controlador.getInstance().handleRequest(IDEventos.EVENTO_BAJA_EMPLEADO, Integer.parseInt(idB.getText()));
			}
			else {	
				JFrame frameError = new JFrame();
				JOptionPane.showMessageDialog(frameError, "Error de formato en los datos de entrada", "Error en baja", JOptionPane.WARNING_MESSAGE);
			}
				
			
		} 
		else if(e.getSource() == modificarE) {
			
			
			if(!idM.getText().equals("")){
			
				if(!DNIM.getText().equals("") && !nombreM.getText().equals("") && !apellidosM.getText().equals("") && !DNIM1.getText().equals("")) {
					
					
					
					if(tiempoParcialM.isSelected()) {
						TransferEmpleado emParcial = new TransferEmpleadoTParcial();
					      
						if(!salarioHorasM.getText().equals("") && !horasM.getText().equals("")) {
							emParcial.setIDEmpleado(Integer.parseInt(idM.getText()));
							emParcial.setDNI(DNIM.getText());
							emParcial.setNombre(nombreM.getText());
							emParcial.setApellidos(apellidosM.getText());
							emParcial.setDepartamento_emp(Integer.parseInt(DNIM1.getText()));
							((TransferEmpleadoTParcial)emParcial).setSalarioHoras(Float.parseFloat(salarioHorasM.getText()));
							((TransferEmpleadoTParcial)emParcial).setHoras(Float.parseFloat(horasM.getText()));
							
							Controlador.getInstance().handleRequest(IDEventos.EVENTO_MODIFICAR_EMPLEADO, emParcial);
						}
						else {
							JFrame frameError = new JFrame();
							JOptionPane.showMessageDialog(frameError, "Error de formato en los datos de entrada", "Error en modificar", JOptionPane.WARNING_MESSAGE);
						}
					}
					else if(tiempoCompletoM.isSelected()) {
					      
						TransferEmpleado emCompleto = new TransferEmpleadoTCompleto();
	
						if(!sueldoM.getText().equals("") && !impuestoM.getText().equals("")) {
							emCompleto.setIDEmpleado(Integer.parseInt(idM.getText()));
							emCompleto.setDNI(DNIM.getText());
							emCompleto.setNombre(nombreM.getText());
							emCompleto.setApellidos(apellidosM.getText());
							emCompleto.setDepartamento_emp(Integer.parseInt(DNIM1.getText()));
							((TransferEmpleadoTCompleto)emCompleto).setSalario(Float.parseFloat(sueldoM.getText()));
							((TransferEmpleadoTCompleto)emCompleto).setImpuesto(Float.parseFloat(impuestoM.getText()));
							
							Controlador.getInstance().handleRequest(IDEventos.EVENTO_MODIFICAR_EMPLEADO, emCompleto);
	
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
			
			} 
			else {
				JFrame frameError = new JFrame();
				JOptionPane.showMessageDialog(frameError, "Error de formato en los datos de entrada", "Error en modificar", JOptionPane.WARNING_MESSAGE);
			}
			
					
		} 
		else if(e.getSource() == consultarE) {
			
			if(!idC.getText().equals("")) {
				
				this.repaint();
				Controlador.getInstance().handleRequest(IDEventos.EVENTO_CONSULTAR_UN_EMPLEADO, Integer.parseInt(idC.getText()));
			}
			else {
				JFrame frameError = new JFrame();
				JOptionPane.showMessageDialog(frameError, "Error de formato en los datos de entrada", "Error en consultar un Empleado", JOptionPane.WARNING_MESSAGE);
			}
		} 
		else if(e.getSource() == listarE) {
			
			this.repaint();
			Controlador.getInstance().handleRequest(IDEventos.EVENTO_LISTAR_EMPLEADOS, VACIO);	
			
		} 
		else if(e.getSource() == nominaEmpleado) {
			
			
			if(!idEmpleadoN.getText().equals("")){
				Controlador.getInstance().handleRequest(IDEventos.EVENTO_NOMINA_EMPLEADO, Integer.parseInt(idEmpleadoN.getText()));	
			}
			else {
				JFrame frameError = new JFrame();
				JOptionPane.showMessageDialog(frameError, "Error de formato en los datos de entrada", "Error al mostrar la nomina del empleado", JOptionPane.WARNING_MESSAGE);
			}
			
		}
				
	} 

	
	 public void actualizarVentanaAlta(IDEventos idEvento, Object datos) {
			
			if ( IDEventos.EVENTO_ALTA_EMPLEADO == idEvento ) {
				if(datos instanceof Boolean)
				{
					Boolean correcto = (Boolean) datos;
					
					if (correcto) {

			    		DNIA.setText(""); 
						nombreA.setText(""); 
						apellidosA.setText("");
						idDepartamentoA.setText("");
						salarioHorasA.setText("");
						suedloA.setText("");
						horasA.setText("");
						impuestoA.setText("");
						salarioHorasA.setVisible(false);
						suedloA.setVisible(false);
						horasA.setVisible(false);
						impuestoA.setVisible(false);
						TipoEmpleado.clearSelection();
						jLabel76.setVisible(false);
						 jLabel78.setVisible(false);
						 jLabel82.setVisible(false);
						 jLabel83.setVisible(false);
						
						
						JFrame frame = new JFrame();
			    		JOptionPane.showMessageDialog(frame,"Empleado dado de alta", "Correcto", JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						JFrame frame = new JFrame();
			    		JOptionPane.showMessageDialog(frame,"Error en alta empleado", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
			else if ( IDEventos.ERROR_EVENTO_ALTA_EMPLEADO == idEvento ) {
				
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
	    	
	    	if ( IDEventos.EVENTO_BAJA_EMPLEADO == idEvento ) {

	    		if ( datos instanceof Boolean ) {

	    			Boolean correcto = (Boolean) datos;

	    			if (correcto) {
	    				
	    				idB.setText("");

	    				JFrame frame = new JFrame();
			    		JOptionPane.showMessageDialog(frame,"Empleado dado de baja", "Correcto", JOptionPane.INFORMATION_MESSAGE);
	    			}
	    			else {

	    				JFrame frame = new JFrame();
			    		JOptionPane.showMessageDialog(frame,"Error en baja Empleado", "Error", JOptionPane.ERROR_MESSAGE);
	    			}
	    		}
	    	}
	    	else if ( IDEventos.ERROR_EVENTO_BAJA_EMPLEADO == idEvento) {

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
		    
	    	if ( IDEventos.EVENTO_MODIFICAR_EMPLEADO == idEvento ) {
				
				if ( datos instanceof Boolean ) {
					
					Boolean correcto = (Boolean) datos;
					
					if (correcto) {
						
						idM.setText("");
						DNIM.setText("");
						nombreM.setText("");
						apellidosM.setText("");
						DNIM1.setText("");
						salarioHorasM.setText("");
						sueldoM.setText("");
						horasM.setText("");
						impuestoM.setText("");
						salarioHorasM.setVisible(false);
						sueldoM.setVisible(false);
						horasM.setVisible(false);
						impuestoM.setVisible(false);
						TipoEmpleado.clearSelection();
						jLabel88.setVisible(false);
						 jLabel84.setVisible(false);
						 jLabel86.setVisible(false);
						 jLabel85.setVisible(false);
						 
						
						
						
						JFrame frame = new JFrame();
						JOptionPane.showMessageDialog(frame, "Empleado modificado", "Correcto", JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						
						JFrame frame = new JFrame();
						JOptionPane.showMessageDialog(frame, "Error en modificar Empleado", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
			else if ( IDEventos.ERROR_EVENTO_MODIFICAR_EMPLEADO == idEvento) {
				
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
			
			if ( IDEventos.EVENTO_CONSULTAR_UN_EMPLEADO == idEvento ) {
			
				if ( datos instanceof TransferEmpleadoTCompleto) {
					
					TransferEmpleadoTCompleto em = (TransferEmpleadoTCompleto) datos;
					
					 jLabel93.setVisible(false);
					 jLabel89.setVisible(false);
					 jLabel91.setVisible(true);
					 jLabel90.setVisible(true);
					 tiempoCompletoC.setEnabled(true);
					 tiempoParcialC.setEnabled(false);

					 
					if ( em != null ) {
						
						DNIC.setText(em.getDNI());
						nombreC.setText(em.getNombre());
						apellidosC.setText(em.getApellidos());
						activoC.setText(em.getActivo().toString());
						if(em.getDepartamento_emp()!=null) {
							idDepartamentoC.setText(em.getDepartamento_emp().toString());
						}
						else {
							idDepartamentoC.setText("Sin asignar");

						}
						tiempoParcialC.setSelected(false);
						tiempoCompletoC.setSelected(true);
						salarioHoraC.setText("");
						salarioHoraC.setVisible(false);
						horasC.setText("");
						horasC.setVisible(false);
						sueldoC.setText(em.getSalario().toString() + " €");
						sueldoC.setVisible(true);
						impuestoC.setText(em.getImpuesto().toString() + " %");
						impuestoC.setVisible(true);
						
					}		
				}
				else if ( datos instanceof TransferEmpleadoTParcial) {
					
					TransferEmpleadoTParcial em = (TransferEmpleadoTParcial) datos;
					
					 jLabel93.setVisible(true);
					 jLabel89.setVisible(true);
					 jLabel91.setVisible(false);
					 jLabel90.setVisible(false);
					 tiempoCompletoC.setEnabled(false);
					 tiempoParcialC.setEnabled(true);

					if ( em != null ) {
						
						DNIC.setText(em.getDNI());
						nombreC.setText(em.getNombre());
						apellidosC.setText(em.getApellidos());
						activoC.setText(em.getActivo().toString());
						if(em.getDepartamento_emp()!=null) {
							idDepartamentoC.setText(em.getDepartamento_emp().toString());
						}
						else {
							idDepartamentoC.setText("Sin asignar");

						}
						tiempoParcialC.setSelected(true);
						tiempoCompletoC.setSelected(false);
						salarioHoraC.setText(em.getSalarioHoras().toString() + " €");
						salarioHoraC.setVisible(true);
						horasC.setText(em.getHoras().toString());
						horasC.setVisible(true);
						sueldoC.setText("");
						sueldoC.setVisible(false);
						impuestoC.setText("");
						impuestoC.setVisible(false);
						
					}		
				}
				else {
					JFrame frame = new JFrame();
		    		JOptionPane.showMessageDialog(frame,"Error al consultar el Empleado", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
			else if ( IDEventos.ERROR_EVENTO_CONSULTAR_UN_EMPLEADO == idEvento ) {
				
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

	    	if ( IDEventos.EVENTO_LISTAR_EMPLEADOS == idEvento ) {
	    		
	    		if ( datos instanceof ArrayList) {

	    			
	    			 //Cargar datos en lists
	                @SuppressWarnings("unchecked")
	                ArrayList<TransferEmpleado> arrayListc = (ArrayList<TransferEmpleado>) datos;
	                listIDListar = new Integer[arrayListc.size()];
	                listDNIListar = new String[arrayListc.size()];
	                listNombreListar = new String[arrayListc.size()];
	                listApellidoListar = new String[arrayListc.size()];
	                listTipoEmpleado = new String[arrayListc.size()];
	                listNomina = new Float[arrayListc.size()];
	                listID_Dept = new Integer[arrayListc.size()];
	                listActivoListar = new Boolean[arrayListc.size()];
	                
	                for(int i = 0; i < arrayListc.size(); i++) {
	                	listIDListar[i] = arrayListc.get(i).getIDEmpleado();
	                	listDNIListar[i] = arrayListc.get(i).getDNI();
	                	listNombreListar[i] = arrayListc.get(i).getNombre();
	                	listApellidoListar[i] = arrayListc.get(i).getApellidos();
	                	if(arrayListc.get(i) instanceof TransferEmpleadoTParcial) {
	                		listTipoEmpleado[i] = "T.Parcial";
	                	}
	                	else if(arrayListc.get(i) instanceof TransferEmpleadoTCompleto) {
	                		listTipoEmpleado[i] = "T.Completo";
	                	}
	                	listNomina[i] = arrayListc.get(i).getNomina();
	                	if(arrayListc.get(i).getDepartamento_emp() != null) {
	                		listID_Dept[i] = arrayListc.get(i).getDepartamento_emp();
	                	}
	                	else {
	                		listID_Dept[i] = 0;
	                	}
	                	listActivoListar[i] = arrayListc.get(i).getActivo();

	                	idEmpleadoE.setSelectedIndex(i);
	                	dniE.setSelectedIndex(i);
	                	nomreE.setSelectedIndex(i);
	                	apellidosE.setSelectedIndex(i);
	                	tipoEmpleadoE.setSelectedIndex(i);
	                	nominaE.setSelectedIndex(i);
	                	idDepartamentoE.setSelectedIndex(i);
	                	activoE.setSelectedIndex(i);

	                	
	                }
	               
	                
	                idEmpleadoE.setModel(new javax.swing.AbstractListModel() {
	                    Integer[] listIDModel = listIDListar;     
	                    public int getSize() { return listIDModel.length; }
	                    public Integer getElementAt(int i) { return listIDModel[i]; }
	                });
	                
	                dniE.setModel(new javax.swing.AbstractListModel() {
	                    String[] listDNIModel = listDNIListar;     
	                    public int getSize() { return listDNIModel.length; }
	                    public String getElementAt(int i) { return listDNIModel[i]; }
	                });
	                
	                nomreE.setModel(new javax.swing.AbstractListModel() {
	                    String[] listNombreModel = listNombreListar;     
	                    public int getSize() { return listNombreModel.length; }
	                    public String getElementAt(int i) { return listNombreModel[i]; }
	                });
	                
	                apellidosE.setModel(new javax.swing.AbstractListModel() {
	                    String[] listApellidoModel = listApellidoListar;     
	                    public int getSize() { return listApellidoModel.length; }
	                    public String getElementAt(int i) { return listApellidoModel[i]; }
	                });
	                
	                tipoEmpleadoE.setModel(new javax.swing.AbstractListModel() {
	                    String[] listLimiteModel = listTipoEmpleado;     
	                    public int getSize() { return listLimiteModel.length; }
	                    public String getElementAt(int i) { return listLimiteModel[i]; }
	                });
	                
	                nominaE.setModel(new javax.swing.AbstractListModel() {
	                    Float[] listNewsModel = listNomina;     
	                    public int getSize() { return listNewsModel.length; }
	                    public Float getElementAt(int i) { return listNewsModel[i]; }
	                });
	                
	                idDepartamentoE.setModel(new javax.swing.AbstractListModel() {
	                	Integer[] listActivoModel = listID_Dept;     
	                    public int getSize() { return listActivoModel.length; }
	                    public Integer getElementAt(int i) { return listActivoModel[i]; }
	                });
	                
	                activoE.setModel(new javax.swing.AbstractListModel() {
	                	Boolean[] listActivoModel = listActivoListar;     
	                    public int getSize() { return listActivoModel.length; }
	                    public Boolean getElementAt(int i) { return listActivoModel[i]; }
	                });
	    			

	    		}
	    		else {
	    			JFrame frame = new JFrame();
		    		JOptionPane.showMessageDialog(frame,"Error al listar empleados", "Error", JOptionPane.ERROR_MESSAGE);
	    		}
	    	}
	    	else if ( IDEventos.ERROR_EVENTO_LISTAR_EMPLEADOS== idEvento ) {

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

	public void actualizarVentanaNomina(IDEventos evento_actual, Object datos) {
		
		if(IDEventos.EVENTO_NOMINA_EMPLEADO == evento_actual){
			
			if(datos instanceof Float) {
				
				Float nom = (Float) datos;
				
				if(nom != null){
					
					nominaEN.setText(nom.toString() + " €");
					
				}
			}
		}
		else if ( IDEventos.ERROR_EVENTO_NOMINA_EMPLEADO== evento_actual) {

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
	
}
