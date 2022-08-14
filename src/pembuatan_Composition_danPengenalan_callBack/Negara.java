package pembuatan_Composition_danPengenalan_callBack;

import java.util.ArrayList;

public class Negara {

	private String kodeNegara;
	private String namaNegara;
	private kota ibuKotaNegara;
	private ArrayList<kota> listKota;
	
	public Negara(String kodeNegara, String namaNegara, kota ibuKotaNegara, kota... ibuKotaProvinsi) {
		listKota = new ArrayList<kota>();
		
		for (kota kota : ibuKotaProvinsi) {
			listKota.add(kota);
		}
		
		this.kodeNegara = kodeNegara;
		this.namaNegara = namaNegara;
		this.ibuKotaNegara = ibuKotaNegara;
	}

	public String getKodeNegara() {
		return kodeNegara;
	}

	public void setKodeNegara(String kodeNegara) {
		this.kodeNegara = kodeNegara;
	}

	public String getNamaNegara() {
		return namaNegara;
	}

	public void setNamaNegara(String namaNegara) {
		this.namaNegara = namaNegara;
	}

	public kota getIbuKotaNegara() {
		return ibuKotaNegara;
	}

	public void setIbuKotaNegara(kota ibuKotaNegara) {
		this.ibuKotaNegara = ibuKotaNegara;
	}

	public ArrayList<kota> getListKota() {
		return listKota;
	}

	public void setListKota(ArrayList<kota> listKota) {
		this.listKota = listKota;
	}
	
	

}
