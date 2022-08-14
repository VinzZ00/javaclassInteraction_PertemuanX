package pembuatan_Composition_danPengenalan_callBack;

public class kepiting extends animal implements mencapit {

	mencapit functMencapit = new mencapitCallBack();
	
	public kepiting() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bernafas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mencapit() {
		// TODO Auto-generated method stub
		System.out.println("Clap-clap");
	}

}
