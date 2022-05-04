
public class Magaza extends NormalKonum {

	public Magaza(Oyuncu player) {
		super(player, "Maðaza");
	}


	@Override
	public boolean konum() {
		System.out.println("	HOÞGELDÝN!Satýn almak icin secim yapin!!");
		System.out.println("1 - Silahlar");
		System.out.println("2 - Zýrhlar");
		System.out.println("3 - Çýkýþ yap");
		System.out.print("Seçimin: ");
		int sec = Oyun.scan.nextInt();
		
		while(sec < 1 || sec > 3) {
			System.out.print("Geçersiz iþlem Tekrar iþlem seçiniz: ");
			sec = Oyun.scan.nextInt();
		}
		
		switch(sec) {
			case 1:
				silahBilgisi();
				break;
			case 2:
				zirhBilgisi();
				break;
			default:
				return true;
		}
		
		return true;
	}

	private void zirhBilgisi() {
		System.out.println();
		this.getOyuncu().printInfo();
		System.out.println();
		System.out.println("------ Zýrhlar ------");
		System.out.println("0 - Geri");
		for (Zirh a : Zirh.getZirhlar()) {
			a.bilgiyiYazdir();
		}
		
		System.out.print("Bir zýrh seçebilirsin: ");
		int zirhSec = Oyun.scan.nextInt();
		
		if(zirhSec != 0) {
			System.out.println();
			while(zirhSec < 1 || zirhSec > Silah.getSilahlar().length) {
				System.out.print("Geçersiz deðer, lütfen tekrar silah seç: ");
				zirhSec = Oyun.scan.nextInt();
			}
			
			Zirh secilenZirh= Zirh.getZirhId(zirhSec);
			if(secilenZirh != null) {
				this.getOyuncu().zirhSatinAl(secilenZirh);
			}
		}
	}

	private void silahBilgisi() {
		System.out.println();
		this.getOyuncu().printInfo();
		System.out.println();
		System.out.println("***********************Silahlar*********************");
		System.out.println("0 - GeriDön");
		for (Silah weapon : Silah.getSilahlar()) {
			weapon.printInfo();
		}
		
		System.out.print("**********Silah Seçebilirsin*****************: ");
		int silahSec = Oyun.scan.nextInt();
		
		if(silahSec != 0) {
			System.out.println();
			while(silahSec < 1 || silahSec > Silah.getSilahlar().length) {
				System.out.print("Tekrar SÝLAH Seçin: ");
				silahSec = Oyun.scan.nextInt();
			}
			
			Silah secilenSilah = Silah.getSecilenSilahId(silahSec);
			if(secilenSilah != null) {
				this.getOyuncu().silahSatinAl(secilenSilah);
			}
		}
	}
}
