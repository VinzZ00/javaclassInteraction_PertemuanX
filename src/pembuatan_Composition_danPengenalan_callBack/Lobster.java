package pembuatan_Composition_danPengenalan_callBack;

public class Lobster extends animal implements mencapit {

	//callback function
	mencapit mencapit = new mencapitCallBack();
	
	public Lobster() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mencapit() {
		// TODO Auto-generated method stub
		System.out.println("clap-clap");
	}

	@Override
	public void bernafas() {
		// TODO Auto-generated method stub
		System.out.println("LOBSTER BERNAFAS TANPA SUARA");
	}

}
