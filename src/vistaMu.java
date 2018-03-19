import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.*;

public class vistaMu extends JFrame
{
	public JLabel EM=new JLabel("***MENU Usuarios***");
	public JLabel EMu=new JLabel("Opciones de Usuario");
	public JButton BMuadd=new JButton("Agregar Usuario");
	public JButton BMuview=new JButton("Ver Usuario");
	public JButton BMudel=new JButton("Eliminar Usuario");
	public JButton BMumod=new JButton("Modificar Usuario");
	public JButton Bureturn=new JButton("Volver al Menu Principal");
	
	public vistaMu()
	{
		super("***MENU Usuarios***");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(150,350);
		this.add(BMuadd);
		this.add(BMuview);
		this.add(BMudel);
		this.add(BMumod);
		this.add(Bureturn);
		
	}
}
