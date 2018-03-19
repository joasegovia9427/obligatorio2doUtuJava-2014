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
		objv21..addActionListener(this);
		objv21..addActionListener(this);
		objv21..addActionListener(this);
		objv21..addActionListener(this);
		objv21..addActionListener(this);
		objv22..addActionListener(this);
		objv22..addActionListener(this);
		objv22..addActionListener(this);
		objv22..addActionListener(this);
		objv22..addActionListener(this);
		objv22..addActionListener(this);
		objv22..addActionListener(this);
		objv23..addActionListener(this);
		objv23..addActionListener(this);
		objv23..addActionListener(this);
		objv23..addActionListener(this);
		objv23..addActionListener(this);
		objv23..addActionListener(this);
		objv23..addActionListener(this);
		objv23..addActionListener(this);
		objv23..addActionListener(this);
		objv24..addActionListener(this);
		objv24..addActionListener(this);
		objv24..addActionListener(this);
		objv24..addActionListener(this);
		objv24..addActionListener(this);
		objv24..addActionListener(this);
		objv25..addActionListener(this);
		objv25..addActionListener(this);
		objv25..addActionListener(this);
		objv25..addActionListener(this);
		objv25..addActionListener(this);
		objv25..addActionListener(this);
		objv25..addActionListener(this);
		objv25..addActionListener(this);
		objv25..addActionListener(this);
		objv26..addActionListener(this);
		objv26..addActionListener(this);
		objv26..addActionListener(this);
		objv26..addActionListener(this);
		objv26..addActionListener(this);
		objv26..addActionListener(this);
		//:::::::::::::::::::::::::::::::::::::::::::
		objVistaMu..addActionListener(this);
		objVistaMu..addActionListener(this);
		objVistaMu..addActionListener(this);
		objVistaMu..addActionListener(this);
		objVistaMu.Bureturn.addActionListener(this);
		objv31..addActionListener(this);
		objv31..addActionListener(this);
		objv31..addActionListener(this);
		objv31..addActionListener(this);
		objv31..addActionListener(this);
		objv31..addActionListener(this);
		objv32..addActionListener(this);
		objv32..addActionListener(this);
		objv32..addActionListener(this);
		objv32..addActionListener(this);
		objv32..addActionListener(this);
		objv32..addActionListener(this);
		objv32..addActionListener(this);
		objv33..addActionListener(this);
		objv33..addActionListener(this);
		objv33..addActionListener(this);
		objv33..addActionListener(this);
		objv33..addActionListener(this);
		objv33..addActionListener(this);
		objv33..addActionListener(this);
		objv34..addActionListener(this);
		objv34..addActionListener(this);
		objv34..addActionListener(this);
		objv34..addActionListener(this);
		objv34..addActionListener(this);
		objv34..addActionListener(this);
				
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
		if (e.getSource()==objVistaMl.Blreturn) 
		{
			objVistaMl.setVisible(false);
			objVistaM.setVisible(true);
		}
		if (e.getSource()==objVistaMu.Bureturn) 
		{
			objVistaMu.setVisible(false);
			objVistaM.setVisible(true);
		}
	}

}
