public class principal 
{

	
	public static void main(String[] args) 
	{
		vistaMenu vM = new vistaMenu();
		vistaMl vMl = new vistaMl();
		vistaMu vMu = new vistaMu();
		modelo m=new modelo();
		v21 v21=new v21();
		v22 v22=new v22();
		v23 v23=new v23();
		v24 v24=new v24();
		v25 v25=new v25();
		v26 v26=new v26();
		v31 v31=new v31();
		v32 v32=new v32();
		v33 v33=new v33();
		v34 v34=new v34();
		
		new cotrolador(vM,vMl,vMu,m,v21,v22,v23,v24,v25,v26,v31,v32,v33,v34);
		
		modelo dao = new modelo();
		    dao.BMlaceptar1();
		
	}

}
