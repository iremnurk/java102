
public abstract class Konum {
	private Oyuncu oyuncu;
	private String isim;
	
	public Konum(Oyuncu player, String name) {
		this.oyuncu = player;
		this.isim = name;
	}

	public abstract boolean konum();
		
	public Oyuncu getOyuncu() {
		return oyuncu;
	}

	public void setOyuncu(Oyuncu player) {
		this.oyuncu = player;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

}
