
import java.awt.FlowLayout;
import javax.swing.*;

public class v24 extends JFrame
{
	public JLabel EM=new JLabel("***MENU Libros***");
	public JLabel EM1=new JLabel("Ingrese ID a retirar");
	public JTextField Tle=new JTextField("ingrese....");
	public JButton BMlaceptar1=new JButton("Aceptar");
	public JTextField Tl1=new JTextField("Disponibilidad");
	public JTextField Tl2=new JTextField("Permiso (user)");
	public JButton BMlaceptar2=new JButton("Retirar");
	public v24()
	{
		super("***MENU Retirar Libros***");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(150,350);
		this.add(EM1);
		this.add(Tle);
		this.add(BMlaceptar1);
		this.add(Tl1);
		this.add(Tl2);
		this.add(BMlaceptar2);
		
	}
}
