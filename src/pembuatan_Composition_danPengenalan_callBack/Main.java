package pembuatan_Composition_danPengenalan_callBack;

import java.util.ArrayList;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		ArrayList<kota> kota = new ArrayList<kota>();
		ArrayList<Negara> negara = new ArrayList<Negara>();
		
//		kota.add(new kota("Selatpanjang", "28753", "Pantai Dorak", 10000));
//		kota.add(new kota("Palembang", "25478", "Destinasi Palembang", 20000));
		kota.add(new kota("palangkaraya", "12345", "Destinasi Palangka raya", 10000));
		Negara Indonesia = new Negara("ID", "Indonesia", new kota("Jakarta", "24578", "Monas", 10_000_000), new kota("Selatpanjang", "28753", "Pantai Dorak", 10000), new kota("Palembang", "25478", "Destinasi Palembang", 20000));
		
		negara.add(Indonesia);
		
		System.out.println("ibu kota negara adalah " + negara.get(0).getIbuKotaNegara().getNamaKota());
		
		negara.remove(0);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
		ikan ikanMas = new ikan();
		kepiting kepitingLaut = new kepiting();
		kepitingLaut.mencapit();
		kepitingLaut.capit.mencapit();

	}

}
