import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cotrolador implements ActionListener
{
	vistaMenu objVistaM=null;
	vistaMl objVistaMl=null;
	vistaMu objVistaMu=null;
	modelo objModelo=null;
	v21 objv21=null;
	v22 objv22=null;
	v23 objv23=null;
	v24 objv24=null;
	v25 objv25=null;
	v26 objv26=null;
	v31 objv31=null;
	v32 objv32=null;
	v33 objv33=null;
	v34 objv34=null;
	int newID=1000;
	public cotrolador(vistaMenu vM, vistaMl vMl, vistaMu vMu, modelo m,v21 v21,v22 v22,v23 v23,v24 v24, v25 v25,v26 v26,v31 v31, v32 v32, v33 v33, v34 v34) 
	{
		this.objVistaM=vM;
		this.objVistaMl=vMl;
		this.objVistaMu=vMu;
		this.objModelo=m;
		this.objv21=v21;
		this.objv22=v22;
		this.objv23=v23;
		this.objv24=v24;
		this.objv25=v25;
		this.objv26=v26;
		this.objv31=v31;
		this.objv32=v32;
		this.objv33=v33;
		this.objv34=v34;
		
		objVistaM.BMl.addActionListener(this);
		objVistaM.BMu.addActionListener(this);
		objVistaM.Bexit.addActionListener(this);
		
		objVistaMl.BMladd.addActionListener(this);
		objVistaMl.BMlview.addActionListener(this);
		objVistaMl.BMldel.addActionListener(this);
		objVistaMl.BMlmod.addActionListener(this);
		objVistaMl.BMlget.addActionListener(this);
		objVistaMl.BMlback.addActionListener(this);
		objVistaMl.Blreturn.addActionListener(this);
		objv21.BMlaceptar1.addActionListener(this);
		objv21.Tl1.addActionListener(this);
		objv21.Tl2.addActionListener(this);
		objv22.Tle.addActionListener(this);
		objv22.BMlaceptar1.addActionListener(this);
		objv22.Tl1.addActionListener(this);
		objv22.Tl2.addActionListener(this);
		objv22.Tl3.addActionListener(this);
		objv22.Tl4.addActionListener(this);
		objv23.Tle.addActionListener(this);
		objv23.BMlaceptar1.addActionListener(this);
		objv23.Tl1.addActionListener(this);
		objv23.Tl2.addActionListener(this);
		objv23.Tl3.addActionListener(this);
		objv23.Tl4.addActionListener(this);
		objv23.BMlaceptar2.addActionListener(this);
		objv24.Tle.addActionListener(this);
		objv24.BMlaceptar1.addActionListener(this);
		objv24.Tl1.addActionListener(this);
		objv24.Tl2.addActionListener(this);
		objv24.BMlaceptar2.addActionListener(this);
		objv25.Tle.addActionListener(this);
		objv25.BMlaceptar1.addActionListener(this);
		objv25.Tl1.addActionListener(this);
		objv25.Tl2.addActionListener(this);
		objv25.Tl3.addActionListener(this);
		objv25.Tl4.addActionListener(this);
		objv25.BMlaceptar2.addActionListener(this);
		objv26.Tle.addActionListener(this);
		objv26.BMlaceptar1.addActionListener(this);
		objv26.Tl1.addActionListener(this);
		objv26.Tl2.addActionListener(this);
		objv26.BMlaceptar2.addActionListener(this);
		//:::::::::::::::::::::::::::::::::::::::::::
		objVistaMu.BMuadd.addActionListener(this);
		objVistaMu.BMuview.addActionListener(this);
		objVistaMu.BMudel.addActionListener(this);
		objVistaMu.BMumod.addActionListener(this);
		objVistaMu.Bureturn.addActionListener(this);
		objv31.Tl1.addActionListener(this);
		objv31.Tl2.addActionListener(this);
		objv31.BMlaceptar1.addActionListener(this);
		objv32.Tle.addActionListener(this);
		objv32.BMlaceptar1.addActionListener(this);
		objv32.Tl1.addActionListener(this);
		objv32.Tl2.addActionListener(this);
		objv32.Tl3.addActionListener(this);
		objv32.Tl4.addActionListener(this);
		objv33.Tle.addActionListener(this);
		objv33.BMlaceptar1.addActionListener(this);
		objv33.Tl1.addActionListener(this);
		objv33.Tl2.addActionListener(this);
		objv33.Tl3.addActionListener(this);
		objv33.Tl4.addActionListener(this);
		objv34.Tle.addActionListener(this);
		objv34.BMlaceptar1.addActionListener(this);
		objv34.Tl1.addActionListener(this);
		objv34.Tl2.addActionListener(this);
		objv34.Tl3.addActionListener(this);
		objv34.Tl4.addActionListener(this);
				
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// TODO Auto-generated method stub
		if (e.getSource()==objVistaM.BMl) 
		{
			objVistaM.setVisible(false);
			objVistaMl.setVisible(true);
		}
		if (e.getSource()==objVistaM.BMu) 
		{
			objVistaM.setVisible(false);
			objVistaMu.setVisible(true);
		}
		if (e.getSource()==objVistaM.Bexit) 
		{
			System.exit(0); 
		}	
		//::::::::::::::::::::::::::::::::::::::::::::::::::::::
				
		if (e.getSource()==objVistaMl.BMladd) 
		{
			objVistaMl.setVisible(false);
			objv21.setVisible(true);
		}
		
		if (e.getSource()==objv21.BMlaceptar1) {
			String BMladd=objv21.Tl1.getText();
			//llamo al modelo y le paso el string bmladd
			//traigo a una varialbe y lo muestro en pantalla
			newID=newID+1;
			String ID = Integer.toString(newID);
//			objModelo.BMlaceptar1(BMladd,ID);
			objv21.Tl2.setText(ID);
			objModelo.BMlaceptar1();
			
		}
		if (e.getSource()==objVistaMl.BMlview) 
		{
			objVistaMl.setVisible(false);
			objv22.setVisible(true);
		}
		if (e.getSource()==objv22.BMlaceptar1) {
			String BMlaceptar1=objv22.Tle.getText();
			//llamo al modelo y le paso el string BMlaceptar1
			//traigo a una varialbe y lo muestro en pantalla
			//llamadita al modelo
//			objv22.Tl1.setText();
//			//llamadita al modelo
//			objv22.Tl2.setText();
//			//llamadita al modelo
//			objv22.Tl3.setText();
//			//llamadita al modelo
//			objv22.Tl4.setText();
		}
		if (e.getSource()==objVistaMl.BMldel) 
		{
			objVistaMl.setVisible(false);
			objv25.setVisible(true);
		}
		if (e.getSource()==objv25.BMlaceptar1) {
			String BMlaceptar1=objv25.Tle.getText();
			//llamo al modelo y le paso el string BMlaceptar1
			//traigo a una varialbe y lo muestro en pantalla
			//llamadita al modelo
//			objv25.Tl1.setText();
//			//llamadita al modelo
//			objv25.Tl2.setText();
//			//llamadita al modelo
//			objv25.Tl3.setText();
//			//llamadita al modelo
//			objv25.Tl4.setText();
			////String BMlaceptar2;
		}
		if (e.getSource()==objVistaMl.BMlmod) 
		{
			objVistaMl.setVisible(false);
			objv23.setVisible(true);
		}
		if (e.getSource()==objv23.BMlaceptar1) {
			String BMlaceptar1=objv23.Tle.getText();
			//llamo al modelo y le paso el string BMlaceptar1
			//traigo a una varialbe y lo muestro en pantalla
			//llamadita al modelo
//			objv23.Tl1.setText();
//			//llamadita al modelo
//			objv23.Tl2.setText();
//			//llamadita al modelo
//			objv23.Tl3.setText();
//			//llamadita al modelo
//			objv23.Tl4.setText();
			
		}
		if (e.getSource()==objv23.BMlaceptar1) {
			
			//llamadita al modelo
//			objv23.Tl1.setText();
//			//llamadita al modelo
//			objv23.Tl2.setText();
//			//llamadita al modelo
//			objv23.Tl3.setText();
//			//llamadita al modelo
//			objv23.Tl4.setText();
//			String BMlaceptar2
		}
		if (e.getSource()==objVistaMl.BMlget) 
		{
			objVistaMl.setVisible(false);
			objv24.setVisible(true);
		}
		if (e.getSource()==objv24.BMlaceptar1) 
		{
			String BMlaceptar1=objv24.Tle.getText();
			//llamadita al modelo
//			objv24.Tl1.setText();
//			//llamadita al modelo
//			objv24.Tl2.setText();
		//	String BMlaceptar2
			
		}
		if (e.getSource()==objVistaMl.BMlback) 
		{
			objVistaMl.setVisible(false);
			objv26.setVisible(true);
		}
		if (e.getSource()==objv26.BMlaceptar1) 
		{
			String BMlaceptar1=objv26.Tle.getText();
			//llamadita al modelo
//			objv26.Tl1.setText();
//			//llamadita al modelo
//			objv26.Tl2.setText();
		//	String BMlaceptar2
			
		}
		if (e.getSource()==objVistaMl.Blreturn) 
		{
			objVistaMl.setVisible(false);
			objVistaM.setVisible(true);
		}
		
			
		
		//:::::::::::::::::::::::::::::::::::::::::::::::::::::::
		if (e.getSource()==objVistaMu.BMuadd) 
		{
			objVistaMu.setVisible(false);
			objv31.setVisible(true);
		}
		if (e.getSource()==objv31.BMlaceptar1) 
		{
			String BMlaceptar1=objv31.Tl1.getText();
//			//llamadita al modelo
//			objv31.Tl2.setText();
		//	String BMlaceptar2
			System.out.println(BMlaceptar1);
			
		}
		if (e.getSource()==objVistaMu.BMuview) 
		{
			objVistaMu.setVisible(false);
			objv32.setVisible(true);
		}
		if (e.getSource()==objv32.BMlaceptar1) 
		{
			String BMlaceptar1=objv32.Tl1.getText();
//			//llamadita al modelo
//			objv31.Tl2.setText();
		//	String BMlaceptar2
			//llamadita al modelo
//			objv22.Tl1.setText();
//			//llamadita al modelo
//			objv22.Tl2.setText();
//			//llamadita al modelo
//			objv22.Tl3.setText();
//			//llamadita al modelo
//			objv22.Tl4.setText();
		}
		if (e.getSource()==objVistaMu.BMudel) 
		{
			objVistaMu.setVisible(false);
			objv34.setVisible(true);
		}
		if (e.getSource()==objv34.BMlaceptar1) 
		{
			String BMlaceptar1=objv34.Tl1.getText();
//			//llamadita al modelo
//			objv34.Tl2.setText();
		//	String BMlaceptar2
			//llamadita al modelo
//			objv34.Tl1.setText();
//			//llamadita al modelo
//			objv34.Tl2.setText();
//			//llamadita al modelo
//			objv34.Tl3.setText();
//			//llamadita al modelo
//			objv34.Tl4.setText();
		}
		if (e.getSource()==objVistaMu.BMumod) 
		{
			objVistaMu.setVisible(false);
			objv33.setVisible(true);
		}
		if (e.getSource()==objv33.BMlaceptar1) 
		{
			String BMlaceptar1=objv33.Tl1.getText();
//			//llamadita al modelo
//			objv33.Tl2.setText();
		//	String BMlaceptar2
			//llamadita al modelo
//			objv33.Tl1.setText();
//			//llamadita al modelo
//			objv33.Tl2.setText();
//			//llamadita al modelo
//			objv33.Tl3.setText();
//			//llamadita al modelo
//			objv33.Tl4.setText();
		}
		if (e.getSource()==objVistaMu.Bureturn) 
		{
			objVistaMu.setVisible(false);
			objVistaM.setVisible(true);
		}
	}

}
