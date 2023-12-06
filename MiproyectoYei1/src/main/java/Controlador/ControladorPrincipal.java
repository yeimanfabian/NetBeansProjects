package Controlador;

import Modelo.ModeloCliente;
import Modelo.ModeloProveeedor;
import Modelo.Modelo_Productos;
import Modelo.modeloUsuario;     
import Vista.FacturaCom;
import Vista.NuevoCli;
import Vista.Nuevo_Productos;
import Vista.Nuevo_provedor;
import Vista.Principal;
import Vista.Usuarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class ControladorPrincipal implements ActionListener, ChangeListener, DocumentListener{

    Principal prin = new Principal();
    Usuarios usu = new Usuarios();
    NuevoCli cli = new NuevoCli();
    Nuevo_provedor provee = new Nuevo_provedor();
    Nuevo_Productos produc = new Nuevo_Productos();
    ControladorUsuario controusu = new ControladorUsuario();
    ControladorCliente controcli = new ControladorCliente();
    Controlador_Proveedor contropro = new Controlador_Proveedor();
    ControladorProducto controproduc = new ControladorProducto();
    modeloUsuario modusu = new modeloUsuario();
   FacturaCom factcompr = new FacturaCom();
    ModeloCliente modocli = new ModeloCliente();
    Modelo_Productos modoproduc   = new Modelo_Productos();
    ModeloProveeedor modoprove = new ModeloProveeedor ();
    
            
    public ControladorPrincipal() {                
        prin.getBtnNueva().addActionListener(this);
        prin.getjButton1().addActionListener(this);
        prin.getBtnProducto().addActionListener(this);
        prin.getBtnProvedor().addActionListener(this);
        prin.getBtnFactura().addActionListener(this);
        prin.getBtnNueva().addActionListener(this);
        usu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        cli.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        provee.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        produc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ComponentListener l = null;
        factcompr .getNuevaftura().addComponentListener(l);
        
    }

    public void iniciarPrincipal(int valor) {
        prin.setLocationRelativeTo(null);//Centra la ventana
        prin.setTitle("Principal");//Le da titulo a la ventana
        prin.setExtendedState(JFrame.MAXIMIZED_BOTH);//Maximiza la ventana
        prin.getJtPrincipal().setSelectedIndex(valor);
        prin.setVisible(true);//Se visualiza la ventana
        gestionUsuario();//llamo al metodo de Gestion usuario
        gestionCliente();
    }

    public void gestionarPestanas() {

    }

    public void gestionUsuario() {
      modusu.MostrarTablaUsuarios(prin.getJpUsuario(), "", "Usuario");

        prin.getTpPrincipal().equals(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {

            }
        });
        prin.getJtPrincipal().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                prin.getBtnProducto().setText("");
                prin.getJtPrincipal().setForeground(new java.awt.Color(0, 0, 0));
            }
        });
        //Para darle clic al boton de editar
        prin.getJtPrincipal().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = prin.getTbUsuario().rowAtPoint(e.getPoint());
                int colum = prin.getTbUsuario().columnAtPoint(e.getPoint());
                modusu.setDoc(Integer.parseInt(prin.getTbUsuario()
                        
                        .getValueAt(fila, 0).toString()));

                if (colum == 9) {
                    prin.setVisible(false);
                    prin.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    controusu.actualizarUsuario(modusu.getDoc());
                }
                if (colum == 10) {
                    controusu.eliminarUsuario(modusu.getDoc());
                    JOptionPane.showMessageDialog(null, "Registro Eliminado");
                    modusu.mostrarTablaUsuario(prin.getJpUsuario(), "", "Usuario");
                }
            }
        });
    }

    public void gestionCliente() {
                modocli.mostrarTablaCliente(prin.getJtcliente(), "", "Cliente");

    }
    

    public void gestionProveedor() {

    }

    public void gestionProducto() {

    }

    public void gestionFacturacompra() {

    }

    public void gestionVenta() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(prin.getBtnNueva())) {
            prin.setVisible(false);
            controusu.ControladorUsuarios();
        }
        if (e.getSource().equals(prin.getBtnCliente())) {
            prin.setVisible(false);
            controcli.controlCliente();
        }
        if (e.getSource().equals(prin.getBtnProvedor())) {
            prin.setVisible(false);
            contropro.controlProveedor();
        }
        if (e.getSource().equals(prin.getBtnProducto())) {
            prin.setVisible(false);
            controproduc.controlProducto();

        }
        if (e.getSource().equals(prin.getBtnProvedor())) {
            prin.setVisible(false);
            factcompr.setLocationRelativeTo(null);
            factcompr.setTitle("Nueva Factura Compra");
            factcompr.setVisible(true);
        }
        if (e.getSource().equals(prin.getBtnNueva())) {
            prin.setVisible(false);
            prin.setLocationRelativeTo(null);
            prin.setTitle("Nueva Venta");
            prin.setVisible(true);
        }
    }

    
    @Override
    public void stateChanged(ChangeEvent e) {
        int seleccionar = prin.getJtPrincipal().hashCode();
        if (seleccionar == 0) {
            gestionUsuario();
        }
        if (seleccionar == 1) {
            gestionCliente();
        }
        if (seleccionar == 2) {
            gestionProveedor();
        }
        if (seleccionar == 3) {
            gestionProducto();
        }
        if (seleccionar == 4) {
            gestionFacturacompra();
        }
        if (seleccionar == 5) {
            gestionVenta();
        }
    }

   @Override
    public void insertUpdate(DocumentEvent e) {
        modusu.mostrarTablaUsuario(prin.getJpUsuario(), prin.getBtnUsuario().getText(), "Usuario");
        modocli.mostrarTablaCliente(prin.getJtcliente(), prin.getBtnCliente(). getText (), "Cliente");
        modoprove.mostrarTablaProveedor(prin.getBtnProvedor(), prin.getBtnProveeedor(), "Proveedor");
        modusu.mostrarTablaProducto(prin.getTbpro(), prin.getBtnProducto().getText(), "Producto");
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        modusu.mostrarTablaUsuario(prin.getJpUsuario(), prin.getBtnUsuario().getText(), "Usuario");
        modocli.mostrarTablaCliente(prin.getJtcliente(), prin.getBtnCliente().getText(), "Cliente");
        modoprove.mostrarTablaProveedor(prin.getBtnProvedor(), prin.getBtnProveeedor(), "Proveedor");
        modoproduc.mostrarTablaProducto(prin.getBtnProductos(), prin.getBtnProducto().getText(), "Producto");
    }


    @Override

    public void changedUpdate(DocumentEvent e) {
    modusu.mostrarTablaUsuario(prin.getJpUsuario(), prin.getBtnUsuario().getText(), "Usuario");
 modocli.mostrarTablaCliente(prin.getJtcliente(), prin.getBtnCliente().getText(), "Cliente");
        modoprove.mostrarTablaProveedor(prin.getBtnProvedor(), prin.getBtnProveeedor(), "Proveedor");
        modoproduc.mostrarTablaProducto(prin.getBtnProductos(), prin.getBtnProducto().getText(), "Producto");

    }

    JPanel getUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    }

    

    

   
    

    

    
    

    
    

    
   

 
    

   
    

    

  
