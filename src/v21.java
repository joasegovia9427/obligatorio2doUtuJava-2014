
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.*;

public class v21 extends JFrame
{
	public JLabel EM=new JLabel("***MENU Libros***");
	public JLabel EMnom=new JLabel("Nombre del Libro");
	public JTextField Tl1=new JTextField("Ingrese");
	public JButton BMlaceptar1=new JButton("Aceptar");
	public JTextField Tl2=new JTextField("Anote en tapa la ID");
	public v21()
	{
		super("***MENU Agregar Libros***");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(150,350);
		this.add(EM);
		this.add(EMnom);
		this.add(Tl1);
		this.add(BMlaceptar1);
		this.add(Tl2);
		
	}
}
