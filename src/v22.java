
import java.awt.FlowLayout;
import javax.swing.*;

public class v22 extends JFrame
{
	public JLabel EM=new JLabel("***MENU Libros***");
	public JLabel EM1=new JLabel("Ingrese ID a consultar");
	public JTextField Tle=new JTextField("ingrese....");
	public JButton BMlaceptar1=new JButton("Aceptar");
	public JTextField Tl1=new JTextField("Nombre del Libro");
	public JTextField Tl2=new JTextField("ID del libro");
	public JTextField Tl3=new JTextField("Cantidad de undidades de libros");
	public JTextField Tl4=new JTextField("Cantidad de libros disponibles");
	public v22()
	{
		super("***MENU Consultar Libros***");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(150,350);
		this.add(EM1);
		this.add(Tle);
		this.add(BMlaceptar1);
		this.add(Tl1);
		this.add(Tl2);
		this.add(Tl3);
		this.add(Tl4);
		
	}
}
