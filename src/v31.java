
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.*;

public class v31 extends JFrame
{
	public JLabel EM=new JLabel("***MENU Usuarios***");
	public JLabel EMnom=new JLabel("Nombre del Usuario");
	public JTextField Tl1=new JTextField("Nombre del Usuario");
	public JTextField Tl2=new JTextField("Ingrese CI");
	public JButton BMlaceptar1=new JButton("Aceptar");
	
	public v31()
	{
		super("***MENU Agregar Usuarios***");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(150,350);
		this.add(EM);
		this.add(EMnom);
		this.add(Tl1);
		this.add(Tl2);
		this.add(BMlaceptar1);
			
		
	}
}
