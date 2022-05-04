import java.util.ArrayList;
import java.util.List;

public class Envanter {
	private Silah silah;
	private Zirh zirh;
	private List<String> oduller;

	public Envanter() {
		this.silah = new Silah(0, "Yumruk", 0, 0);
		this.zirh = new Zirh(0, "Paçavra", 0, 0);
		this.oduller = new ArrayList<String>();
	}

	public void addOdul(String odul) {
		this.oduller.add(odul);
	}
	
	public List<String> getOduller() {
		return this.oduller;
	}
	
	public Silah getSilah() {
		return silah;
	}

	public void setSilah(Silah silah) {
		System.out.println(this.silah.getIsim() + " býrakýldý.");
		System.out.println(silah.getIsim() + " kuþanýldý.");
		int yeniHasar = silah.getHasar() - this.silah.getHasar();
		if(yeniHasar > 0)
			System.out.println("Hasar --> +" + yeniHasar);
		else if(yeniHasar < 0)
			System.out.println("Hasar --> " + yeniHasar);
		
		this.silah = silah;
	}

	public Zirh getZirh() {
		return zirh;
	}

	public void setZirh(Zirh zirh) {
		System.out.println(this.zirh.getIsim() + " býrakýldý.");
		System.out.println(zirh.getIsim() + " kuþndý.");
		int yeniBlok = zirh.getBlok() - this.zirh.getBlok();
		if(yeniBlok > 0)
			System.out.println("Koruma: +" + yeniBlok);
		else if(yeniBlok < 0)
			System.out.println("Koruma: " + yeniBlok);
		
		this.zirh = zirh;
	}
}
