package pembuatan_Composition_danPengenalan_callBack;

public class kepiting extends animal implements mencapit {

	mencapit capit = () -> {
		System.out.println("Clap - clap");
	};

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
