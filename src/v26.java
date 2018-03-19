
import java.awt.FlowLayout;
import javax.swing.*;

public class v26 extends JFrame
{
	public JLabel EM=new JLabel("***MENU Libros***");
	public JLabel EM1=new JLabel("Ingrese ID a devolver");
	public JTextField Tle=new JTextField("ingrese....");
	public JButton BMlaceptar1=new JButton("Aceptar");
	public JTextField Tl1=new JTextField("Nombre");
	public JTextField Tl2=new JTextField("ID");
	public JButton BMlaceptar2=new JButton("Devolver");
	public v26()
	{
		super("***MENU Devolver Libros***");
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
