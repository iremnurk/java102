
public class Para implements Odul {
	private String isim;
	private int para;
	
	public Para(int para) {
		this.setPara(para);
		this.isim = "Para";
	}


	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getPara() {
		return para;
	}

	public void setPara(int para) {
		if(para < 0) {
			this.para = 0;
			return;
		}
		this.para = para;
	}

	@Override
	public void claim(Oyuncu player) {
		player.getKarakter().arttirmakPara(this.para);
	}
}
