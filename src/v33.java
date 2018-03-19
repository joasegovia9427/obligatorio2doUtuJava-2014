
import java.awt.FlowLayout;
import javax.swing.*;

public class v33 extends JFrame
{
	public JLabel EM=new JLabel("***MENU Usuarios***");
	public JLabel EM1=new JLabel("Ingrese CI a modificar");
	public JTextField Tle=new JTextField("ingrese....");
	public JButton BMlaceptar1=new JButton("Aceptar");
	public JTextField Tl1=new JTextField("Nombre del Usuario");
	public JTextField Tl2=new JTextField("CI del user");
	public JTextField Tl3=new JTextField("Cantidad de undidades prestadas");
	public JTextField Tl4=new JTextField("Multa");
	
	public v33()
	{
		super("***MENU Modificar Usuarios***");
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
