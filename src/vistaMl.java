import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.*;

public class vistaMl extends JFrame
{
	public JLabel EM=new JLabel("***MENU Libros***");
	public JLabel EMl=new JLabel("Opciones de Libro");
	public JButton BMladd=new JButton("Agregar Libro");
	public JButton BMlview=new JButton("Ver Libro");
	public JButton BMldel=new JButton("Eliminar Libro");
	public JButton BMlmod=new JButton("Modificar Libro");
	public JButton BMlget=new JButton("Retirar Libro");
	public JButton BMlback=new JButton("Devolver Libro");
	public JButton Blreturn=new JButton("Volver al Menu Principal");
	
	public vistaMl()
	{
		super("***MENU Libros***");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(150,350);
		this.add(BMladd);
		this.add(BMlview);
		this.add(BMldel);
		this.add(BMlmod);
		this.add(BMlget);
		this.add(BMlback);
		this.add(Blreturn);
		
	}
}
