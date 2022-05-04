

public abstract class Dusman {
	private int id;
	private String isim;
	private int hasar;
	private int saglik;
	private Odul odul;
	
	public Dusman(int id, String isim, int hasar, int saglik, Odul odul) {
		this.id = id;
		this.isim = isim;
		this.hasar = hasar;
		this.saglik = saglik;
		this.odul = odul;
	}
	public int getId() {
		return id;
	}
	public int getHasar() {
		return hasar;
	}
	public void setHasar(int hasar) {
		this.hasar = hasar;
	}
	public int getSaglik() {
		return saglik;
	}
	public void setSaglik(int saglik) {
		if (saglik < 0) {
			this.saglik = 0;
			return;
		}
		
		this.saglik = saglik;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	public Odul getOdul() {
		return odul;
	}
	
	public void setOdul(Odul odul) {
		this.odul = odul;
	}
	
	public void bilgiyiYazdir() {
		System.out.println(this.isim + " Sağlığı: " + this.saglik);
	}
	public void saldiri(Oyuncu oyuncu) {
		if(this.saglik > 0) {
			System.out.println(this.isim + " saldırıyor..." );
			if(this.hasar - oyuncu.getEnvanter().getZirh().getBlok() > 0)
				oyuncu.getKarakter().saglikDurumu(this.hasar - oyuncu.getEnvanter().getZirh().getBlok());
			else
				System.out.println(oyuncu.getEnvanter().getZirh().getIsim() + " hasardan korudu!");
			
			System.out.println(oyuncu.getKarakter().getIsim() +" "+ oyuncu.getIsim() + " Kalan Sağlık: " + oyuncu.getKarakter().getSaglik());
			System.out.println();
		}
	}
	public abstract Dusman yenile();
}
