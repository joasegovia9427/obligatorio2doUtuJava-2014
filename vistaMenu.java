import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.*;

public class vistaMenu extends JFrame
{
	public JLabel EM=new JLabel("***MENU PRINCIPAL***");
	public JLabel EMl=new JLabel("Opciones de Libro");
	public JLabel EMu=new JLabel("Opciones de Usuario");
	public JButton BMl=new JButton("Libro");
	public JButton BMu=new JButton("Usuario");
	public JButton Bexit=new JButton("Salir");
	
	public vistaMenu()
	{
		super("***MENU PRINCIPAL***");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(100,250);
		this.add(EM);
		this.add(EMl);
		this.add(BMl);
		this.add(EMu);
		this.add(BMu);
		this.add(Bexit);
		
		
	}
}
