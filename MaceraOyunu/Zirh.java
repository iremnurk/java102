
public class Zirh implements Odul {
	private int id;
	private String isim;
	private int blok;
	private int fiyat;
	
	public Zirh(int id, String isim, int blok, int fiyat) {
		this.isim = isim;
		this.id = id;
		this.blok = blok;
		this.fiyat = fiyat;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getBlok() {
		return blok;
	}

	public void setBlok(int blok) {
		this.blok = blok;
	}

	public int getFiyat() {
		return fiyat;
	}

	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}
	
	public static Zirh[] getZirhlar() {
		Zirh[] zirhlar = new Zirh[3];
		zirhlar[0] = new Zirh(1,"Düþük Zýrh",1,15);
		zirhlar[1] = new Zirh(2,"OrtaSeviye Zýrh",3,25);
		zirhlar[2] = new Zirh(3,"Eniyi Zýrh",5,40);
		return zirhlar;
	}
	
	public void bilgiyiYazdir() {
		System.out.println(this.getId() + " - " + this.getIsim() + " <Fiyat : " + this.getFiyat() + ", Koruma : " + this.getBlok() + ">");
	}

	public static Zirh getZirhId(int selectArmor) {
		for (Zirh z : Zirh.getZirhlar()) {
			if(selectArmor == z.getId())
				return z;
		}
		return null;
	}

	public Zirh getRandomArmor() {
		int rand = (int)( Math.random()*10)+1;
		
		if(rand == 1 || rand == 2)
			return Zirh.getZirhlar()[2];
		else if(rand >= 3 && rand <= 5)
			return Zirh.getZirhlar()[1];
		else 
			return Zirh.getZirhlar()[0];
	}
	
	@Override
	public void claim(Oyuncu player) {
		player.getEnvanter().setZirh(getRandomArmor());
	}
}
