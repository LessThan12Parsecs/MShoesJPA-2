package presentacion.proveedor;

import integracion.transacciones.conexion.Excepciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import presentacion.comando.IDEventos;
import presentacion.controlador.Controlador;
import negocio.departamento.TransferProvDept;
import negocio.proveedor.TransferProveedor;

public class PanelProveedor extends JPanel implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//Auxiliares
	private final Object VACIO = null;
	
    private javax.swing.JTextField activoPC;
    private javax.swing.JList activoPL;
    private javax.swing.JButton altaPA;
    private javax.swing.JButton asignarPDA;
    private javax.swing.JButton bajaPB;
    private javax.swing.JButton consultarPC;
    private javax.swing.JButton eliminarPDE;
    private javax.swing.JTextField idDepartamentoPDA;
    private javax.swing.JTextField idDepartamentoPDE;
    private javax.swing.JTextField idPM;
    private javax.swing.JTextField idProveedorPB;
    private javax.swing.JTextField idProveedorPC;
    private javax.swing.JTextField idProveedorPDA;
    private javax.swing.JTextField idProveedorPDE;
    private javax.swing.JList idProveedorPL;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JButton listar2;
    private javax.swing.JButton modificarPM;
    private javax.swing.JTextField nombrePA;
    private javax.swing.JTextField nombrePC;
    private javax.swing.JList nombrePL;
    private javax.swing.JTextField nombrePM;
    private javax.swing.JPanel proveedor;
    
    //Listas listar
    private Integer[] listIDListar;
    private String[] listNombreListar;
    private Boolean[] listActivoListar;
    
	
	public PanelProveedor() {
		initGUI();	
	}

	//Panel Cliente
	private void initGUI() {
		
        proveedor = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        altaPA = new javax.swing.JButton();
        jLabel63 = new javax.swing.JLabel();
        nombrePA = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        idProveedorPB = new javax.swing.JTextField();
        bajaPB = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        idProveedorPC = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        nombrePC = new javax.swing.JTextField();
        nombrePC.setEditable(false);
        jSeparator10 = new javax.swing.JSeparator();
        consultarPC = new javax.swing.JButton();
        jLabel74 = new javax.swing.JLabel();
        activoPC = new javax.swing.JTextField();
        activoPC.setEditable(false);
        jPanel11 = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        jScrollPane22 = new javax.swing.JScrollPane();
        activoPL = new javax.swing.JList();
        jScrollPane23 = new javax.swing.JScrollPane();
        idProveedorPL = new javax.swing.JList();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        listar2 = new javax.swing.JButton();
        jScrollPane26 = new javax.swing.JScrollPane();
        nombrePL = new javax.swing.JList();
        jSeparator11 = new javax.swing.JSeparator();
        jPanel18 = new javax.swing.JPanel();
        jLabel95 = new javax.swing.JLabel();
        idProveedorPDA = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        idDepartamentoPDA = new javax.swing.JTextField();
        asignarPDA = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        eliminarPDE = new javax.swing.JButton();
        jLabel96 = new javax.swing.JLabel();
        idProveedorPDE = new javax.swing.JTextField();
        jLabel97 = new javax.swing.JLabel();
        idDepartamentoPDE = new javax.swing.JTextField();
        jPanel21 = new javax.swing.JPanel();
        nombrePM = new javax.swing.JTextField();
        modificarPM = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel49 = new javax.swing.JLabel();
        idPM = new javax.swing.JTextField();

     

        altaPA.setText("Alta");
        altaPA.addActionListener(this);

        jLabel63.setText("Nombre:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(altaPA)
                .addGap(46, 46, 46))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel63)
                .addGap(31, 31, 31)
                .addComponent(nombrePA, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(nombrePA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(264, 264, 264)
                .addComponent(altaPA)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Alta", jPanel8);

        jLabel69.setText("ID Proveedor: ");

        bajaPB.setText("Baja");
        bajaPB.addActionListener(this);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(602, 602, 602)
                        .addComponent(bajaPB))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel69)
                        .addGap(35, 35, 35)
                        .addComponent(idProveedorPB, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(idProveedorPB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 250, Short.MAX_VALUE)
                .addComponent(bajaPB)
                .addGap(60, 60, 60))
        );

        jTabbedPane3.addTab("Baja", jPanel9);

        jLabel72.setText("ID Proveedor: ");

        jLabel73.setText("Nombre:");

        consultarPC.setText("Consultar");
        consultarPC.addActionListener(this);

        jLabel74.setText("Activo: ");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator10)
                .addContainerGap())
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel72)
                .addGap(18, 18, 18)
                .addComponent(idProveedorPC, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(consultarPC)
                .addGap(61, 61, 61))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel73)
                .addGap(28, 28, 28)
                .addComponent(nombrePC, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(jLabel74)
                .addGap(43, 43, 43)
                .addComponent(activoPC, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel72)
                            .addComponent(idProveedorPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(consultarPC)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombrePC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel73)
                    .addComponent(jLabel74)
                    .addComponent(activoPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Consultar", jPanel10);

        
        modificarPM.setText("Modificar");
        modificarPM.addActionListener(this);

        jLabel44.setText("Nombre:");

        jLabel49.setText("ID Proveedor: ");

        idPM.setToolTipText("");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addContainerGap(589, Short.MAX_VALUE)
                        .addComponent(modificarPM))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel44)
                        .addGap(39, 39, 39)
                        .addComponent(nombrePM, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(38, 38, 38))
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator8)
                .addContainerGap())
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(idPM, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(529, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(idPM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombrePM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44))
                .addGap(143, 143, 143)
                .addComponent(modificarPM)
                .addGap(42, 42, 42))
        );

        jTabbedPane3.addTab("Modificar", jPanel21);
        
        
        jLabel77.setText("ID");

       
        jScrollPane22.setViewportView(activoPL);

       
        jScrollPane23.setViewportView(idProveedorPL);

        jLabel79.setText("Nombre");

        jLabel80.setText("Activo");

        listar2.setText("Listar");
        listar2.addActionListener(this);

        
        jScrollPane26.setViewportView(nombrePL);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jSeparator11)
                .addContainerGap())
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(204, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listar2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel77)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel79)
                        .addGap(107, 107, 107)
                        .addComponent(jLabel80)
                        .addGap(214, 214, 214))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel80)
                    .addComponent(jLabel77))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                    .addComponent(jScrollPane26, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane23, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listar2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Listar", jPanel11);

        jLabel95.setText("ID Departamento");

        jLabel81.setText("ID Proveedor: ");

        asignarPDA.setText("Asignar");
        asignarPDA.addActionListener(this);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel81)
                .addGap(18, 18, 18)
                .addComponent(idProveedorPDA, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addComponent(jLabel95)
                .addGap(18, 18, 18)
                .addComponent(idDepartamentoPDA, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addComponent(asignarPDA)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel95)
                    .addComponent(idDepartamentoPDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idProveedorPDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel81))
                .addGap(76, 76, 76)
                .addComponent(asignarPDA)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Asignar Prov a Dept", jPanel18);

        eliminarPDE.setText("Eliminar");
        eliminarPDE.addActionListener(this);

        jLabel96.setText("ID Departamento");

        jLabel97.setText("ID Proveedor: ");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel97)
                .addGap(18, 18, 18)
                .addComponent(idProveedorPDE, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                .addComponent(jLabel96)
                .addGap(27, 27, 27)
                .addComponent(idDepartamentoPDE, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addComponent(eliminarPDE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel97)
                    .addComponent(idProveedorPDE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel96)
                    .addComponent(idDepartamentoPDE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addComponent(eliminarPDE)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Eliminar Prov de Dept", jPanel19);


        javax.swing.GroupLayout proveedorLayout = new javax.swing.GroupLayout(proveedor);
        proveedor.setLayout(proveedorLayout);
        proveedorLayout.setHorizontalGroup(
            proveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proveedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3)
                .addContainerGap())
        );
        proveedorLayout.setVerticalGroup(
            proveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proveedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3)
                .addContainerGap())
        );
  
        this.add(proveedor);

	}

	
	//ActionListener
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == altaPA) {

			TransferProveedor p = new TransferProveedor();
			
			if(!nombrePA.getText().equals("")) {
				
				p.setNombre(nombrePA.getText());
				
				Controlador.getInstance().handleRequest(IDEventos.EVENTO_ALTA_PROVEEDOR, p);
			}
			else {
				JFrame frameError = new JFrame();
				JOptionPane.showMessageDialog(frameError, "Error de formato en los datos de entrada", "Error en alta", JOptionPane.WARNING_MESSAGE);
			}
		}
		
		else if(e.getSource() == bajaPB) {
			
			if(!idProveedorPB.getText().equals("")) {
				
				Controlador.getInstance().handleRequest(IDEventos.EVENTO_BAJA_PROVEEDOR, Integer.parseInt(idProveedorPB.getText()));
			}
			else {	
				JFrame frameError = new JFrame();
				JOptionPane.showMessageDialog(frameError, "Error de formato en los datos de entrada", "Error en baja", JOptionPane.WARNING_MESSAGE);
			}
			
			
			
		} 
		else if(e.getSource() == modificarPM) {
			
			TransferProveedor p = new TransferProveedor();
			
			if(!idPM.getText().equals("")){
				
				if(!nombrePM.getText().equals("")) {
					
					p.setNombre(nombrePM.getText());
					p.setIDProveedor(Integer.parseInt(idPM.getText()));
				
					Controlador.getInstance().handleRequest(IDEventos.EVENTO_MODIFICAR_PROVEEDOR, p);
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
		else if(e.getSource() == consultarPC) {
			
			if(!idProveedorPC.getText().equals("")) {
				
				Controlador.getInstance().handleRequest(IDEventos.EVENTO_CONSULTAR_UN_PROVEEDOR, Integer.parseInt(idProveedorPC.getText()));
			}
			else {
				JFrame frameError = new JFrame();
				JOptionPane.showMessageDialog(frameError, "Error de formato en los datos de entrada", "Error en consultar un departamento", JOptionPane.WARNING_MESSAGE);
			}
		} 
		else if(e.getSource() == listar2) {
			
			this.repaint();
			Controlador.getInstance().handleRequest(IDEventos.EVENTO_LISTAR_PROVEEDORES, VACIO);	
			
		} 
		else if(e.getSource() == asignarPDA) {
			
			TransferProvDept provDept = new TransferProvDept();
			
			if(!idProveedorPDA.getText().equals("") && !idDepartamentoPDA.getText().equals("")) {
				
				provDept.setID_Proveedor(Integer.parseInt(idProveedorPDA.getText()));
				provDept.setID_Departamento(Integer.parseInt(idDepartamentoPDA.getText()));
				
				Controlador.getInstance().handleRequest(IDEventos.EVENTO_ANADIR_PROVEEDOR_DEPARTAMENTO, provDept);
			}
			else {
				JFrame frameError = new JFrame();
				JOptionPane.showMessageDialog(frameError, "Error de formato en los datos de entrada", "Error al asignar proveedor a departamento", JOptionPane.WARNING_MESSAGE);
			}	
				
		} 
		else if(e.getSource() == eliminarPDE) {
			
			TransferProvDept provDept = new TransferProvDept();
			
			if(!idProveedorPDE.getText().equals("") && !idDepartamentoPDE.getText().equals("")) {
				
				provDept.setID_Proveedor(Integer.parseInt(idProveedorPDE.getText()));
				provDept.setID_Departamento(Integer.parseInt(idDepartamentoPDE.getText()));
				
				Controlador.getInstance().handleRequest(IDEventos.EVENTO_ELIMINAR_PROVEEDOR_DEPARTAMENTO, provDept);
			}
			else {
				JFrame frameError = new JFrame();
				JOptionPane.showMessageDialog(frameError, "Error de formato en los datos de entrada", "Error al eliminar proveedor de departamento", JOptionPane.WARNING_MESSAGE);
			}	
		}
		
	}
	
	 public void actualizarVentanaAlta(IDEventos idEvento, Object datos) {
			
			if ( IDEventos.EVENTO_ALTA_PROVEEDOR == idEvento ) {
				if(datos instanceof Boolean)
				{
					Boolean correcto = (Boolean) datos;
					
					if (correcto) {

						nombrePA.setText("");
			    		
						JFrame frame = new JFrame();
			    		JOptionPane.showMessageDialog(frame,"Proveedor dado de alta", "Correcto", JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						JFrame frame = new JFrame();
			    		JOptionPane.showMessageDialog(frame,"Error en alta proveedor", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
			else if ( IDEventos.ERROR_EVENTO_ALTA_PROVEEDOR == idEvento ) {
				
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
	    	
	    	if ( IDEventos.EVENTO_BAJA_PROVEEDOR == idEvento ) {

	    		if ( datos instanceof Boolean ) {

	    			Boolean correcto = (Boolean) datos;

	    			if (correcto) {
	    				
	    				idProveedorPB.setText("");

	    				JFrame frame = new JFrame();
			    		JOptionPane.showMessageDialog(frame,"Proveedor dado de baja", "Correcto", JOptionPane.INFORMATION_MESSAGE);
	    			}
	    			else {

	    				JFrame frame = new JFrame();
			    		JOptionPane.showMessageDialog(frame,"Error en baja proveedor", "Error", JOptionPane.ERROR_MESSAGE);
	    			}
	    		}
	    	}
	    	else if ( IDEventos.ERROR_EVENTO_BAJA_PROVEEDOR == idEvento) {

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
		    
	    	if ( IDEventos.EVENTO_MODIFICAR_PROVEEDOR == idEvento ) {
				
				if ( datos instanceof Boolean ) {
					
					Boolean correcto = (Boolean) datos;
					
					if (correcto) {
						
						idPM.setText("");
						nombrePM.setText("");
						
						JFrame frame = new JFrame();
						JOptionPane.showMessageDialog(frame, "Proveedor modificado", "Correcto", JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						
						JFrame frame = new JFrame();
						JOptionPane.showMessageDialog(frame, "Error en modificar proveedor", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
			else if ( IDEventos.ERROR_EVENTO_MODIFICAR_PROVEEDOR == idEvento) {
				
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
			
			if ( IDEventos.EVENTO_CONSULTAR_UN_PROVEEDOR == idEvento ) {
			
				if ( datos instanceof TransferProveedor) {
					
					TransferProveedor p = (TransferProveedor) datos;
					
					if ( p != null ) {
						
						nombrePC.setText(p.getNombre());
						activoPC.setText(p.getActivo().toString());
					}		
				}
				else {
					JFrame frame = new JFrame();
		    		JOptionPane.showMessageDialog(frame,"Error al consultar el proveedor", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
			else if ( IDEventos.ERROR_EVENTO_CONSULTAR_UN_PROVEEDOR == idEvento ) {
				
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

	    	if ( IDEventos.EVENTO_LISTAR_PROVEEDORES == idEvento ) {
	    		
	    		if ( datos instanceof ArrayList) {

	    			
	    			 //Cargar datos en lists
	                @SuppressWarnings("unchecked")
	                ArrayList<TransferProveedor> arrayListc = (ArrayList<TransferProveedor>) datos;
	                listIDListar = new Integer[arrayListc.size()];
	                listNombreListar = new String[arrayListc.size()];
	                listActivoListar = new Boolean[arrayListc.size()];
	                
	                for(int i = 0; i < arrayListc.size(); i++) {
	                	listIDListar[i] = arrayListc.get(i).getIDProveedor();
	                	listNombreListar[i] = arrayListc.get(i).getNombre();
	                	listActivoListar[i] = arrayListc.get(i).getActivo();

	                	idProveedorPL.setSelectedIndex(i);
	                	nombrePL.setSelectedIndex(i);
	                	activoPL.setSelectedIndex(i);
	                }
	               
	                
	                idProveedorPL.setModel(new javax.swing.AbstractListModel() {
	                    Integer[] listIDModel = listIDListar;     
	                    public int getSize() { return listIDModel.length; }
	                    public Integer getElementAt(int i) { return listIDModel[i]; }
	                });
	                
	                nombrePL.setModel(new javax.swing.AbstractListModel() {
	                    String[] listNombreModel = listNombreListar;     
	                    public int getSize() { return listNombreModel.length; }
	                    public String getElementAt(int i) { return listNombreModel[i]; }
	                });
	                
	                activoPL.setModel(new javax.swing.AbstractListModel() {
	                	Boolean[] listActivoModel = listActivoListar;     
	                    public int getSize() { return listActivoModel.length; }
	                    public Boolean getElementAt(int i) { return listActivoModel[i]; }
	                });
	    			

	    		}
	    		else {
	    			JFrame frame = new JFrame();
		    		JOptionPane.showMessageDialog(frame,"Error al listar proveedores", "Error", JOptionPane.ERROR_MESSAGE);
	    		}
	    	}
	    	else if ( IDEventos.ERROR_EVENTO_LISTAR_PROVEEDORES == idEvento ) {

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

	 	public void actualizarVentanaAnadir(IDEventos idEvento, Object datos) {

	    	if ( IDEventos.EVENTO_ANADIR_PROVEEDOR_DEPARTAMENTO == idEvento ) {
	    		
	    		if ( datos instanceof Boolean) {

	    			Boolean correcto = (Boolean) datos;
	    			
	                if(correcto) {
	                	
	                	idProveedorPDA.setText("");
	                	idDepartamentoPDA.setText("");
	                	
	                	JFrame frame = new JFrame();
						JOptionPane.showMessageDialog(frame, "Proveedor asignado al departamento", "Correcto", JOptionPane.INFORMATION_MESSAGE);
	                }
	                else {
		    			JFrame frame = new JFrame();
			    		JOptionPane.showMessageDialog(frame,"Error al asignar proveedor a departamento", "Error", JOptionPane.ERROR_MESSAGE);
		    		}
	      		}
	    	}
	    	else if ( IDEventos.ERROR_EVENTO_ANADIR_PROVEEDOR_DEPARTAMENTO== idEvento ) {

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
	 	
	 	public void actualizarVentanaEliminar(IDEventos idEvento, Object datos) {

	    	if ( IDEventos.EVENTO_ELIMINAR_PROVEEDOR_DEPARTAMENTO == idEvento ) {
	    		
	    		if ( datos instanceof Boolean) {

	    			Boolean correcto = (Boolean) datos;
	    			
	                if(correcto) {
	                	
	                	idProveedorPDE.setText("");
	                	idDepartamentoPDE.setText("");
	                	
	                	JFrame frame = new JFrame();
						JOptionPane.showMessageDialog(frame, "Proveedor eliminado del departamento", "Correcto", JOptionPane.INFORMATION_MESSAGE);
	                }
	                else {
		    			JFrame frame = new JFrame();
			    		JOptionPane.showMessageDialog(frame,"Error al eliminar proveedor de departamento", "Error", JOptionPane.ERROR_MESSAGE);
		    		}
	      		}
	    	}
	    	else if ( IDEventos.ERROR_EVENTO_ELIMINAR_PROVEEDOR_DEPARTAMENTO== idEvento ) {

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
