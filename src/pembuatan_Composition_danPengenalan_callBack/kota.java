package pembuatan_Composition_danPengenalan_callBack;

public class kota {

	private String namaKota;
	private String kodePos;
	private String destinasiWisata;
	private int jumlahPopulasi;
	
	public kota(String namaKota, String kodePos, String destinasiWisata, int jumlahPopulasi) {
		super();
		this.namaKota = namaKota;
		this.kodePos = kodePos;
		this.destinasiWisata = destinasiWisata;
		this.jumlahPopulasi = jumlahPopulasi;
	}

	public String getNamaKota() {
		return namaKota;
	}

	public void setNamaKota(String namaKota) {
		this.namaKota = namaKota;
	}

	public String getKodePos() {
		return kodePos;
	}

	public void setKodePos(String kodePos) {
		this.kodePos = kodePos;
	}

	public String getDestinasiWisata() {
		return destinasiWisata;
	}

	public void setDestinasiWisata(String destinasiWisata) {
		this.destinasiWisata = destinasiWisata;
	}

	public int getJumlahPopulasi() {
		return jumlahPopulasi;
	}

	public void setJumlahPopulasi(int jumlahPopulasi) {
		this.jumlahPopulasi = jumlahPopulasi;
	}
	
	
	
	

}
