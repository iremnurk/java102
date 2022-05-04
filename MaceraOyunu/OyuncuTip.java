
public abstract class OyuncuTip {

	private int id;
	private String isim;
	private int hasar;
	private int saglik;
	private int para;


	public OyuncuTip(int id, String isim, int hasar, int saglik, int para) {
		this.id = id;
		this.isim = isim;
		this.hasar = hasar;
		this.saglik = saglik;
		this.para = para;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getHasar() {
		return hasar;
	}

	public void setHasar(int hasar) {
		if (hasar < 0) {
			this.hasar = 0;
			return;
		}

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

	public int getPara() {
		return para;
	}

	public void setPara(int para) {
		if (para < 0) {
			this.para = 0;
			return;
		}
		
		this.para = para;
	}

	public int getId() {
		return id;
	}

	public abstract void fullSaglik();

	public void buyItem(int miktar) {
		this.para -= miktar;
		System.out.println("Kasadaki Para --> -" + miktar);
	}

	public void saglikDurumu(int saglik) {
		this.saglik -= saglik;
		if(this.saglik < 0)
			this.saglik = 0;
		System.out.println("Sağlık Durumu --> -" + saglik);
	}

	public void saglikDurum(int saglik) {
		this.saglik += saglik;
		System.out.println("Sağlık Durumu--> +" + saglik);
	}

	public void arttirmakPara(int para) {
		this.para += para;
		System.out.println("Para Durumu --> +" + para);
	}
}
