import java.util.Random;

public class SavasKonumu extends Konum {
	private Dusman dusman;
	private String odul;
	private int maxDusman;

	public SavasKonumu(Oyuncu player, String name, Dusman dusman, String odul, int maxDusman) {
		super(player, name);
		this.dusman = dusman;
		this.odul = odul;
		this.maxDusman = maxDusman;
	}

	@Override
	public boolean konum() {
		int dusmanNo = randomDusmanNo();
		System.out.println("Şuan Bulunduğun Konum " + this.getIsim());
		System.out.println(" Burada " + dusmanNo + " tane " + this.dusman.getIsim() + " var!!!");
		System.out.print("<S>avaş veya <K>aç: ");
		Oyun.scan.nextLine();
		String secimIslemi = Oyun.scan.nextLine().toUpperCase();
		if (secimIslemi.equals("S")) {
			int sonuc = savas(dusmanNo);
			if (sonuc == 0)
				return false;
			else if (sonuc == 1)
				return true;
			else {
				System.out.println("Tebrikler " + this.getIsim() + " temizlendi!!!");
				if (this.odul != null) {
					System.out.println(this.odul + " KAZANILDI!!!");
					this.getOyuncu().getEnvanter().addOdul(this.odul);
				}

				System.out.println();
					System.out.print("Ödüllerin: ");
				for (int i = 0; i < this.getOyuncu().getEnvanter().getOduller().size(); i++) {
					System.out.print(this.getOyuncu().getEnvanter().getOduller().get(i) + " ");
				}
				System.out.println();
			}
		}
		return true;
	}

	public int savas(int dusmanNo) {
		int rand;
		for (int i = 1; i <= dusmanNo; i++) {
			getOyuncu().printInfo();
			while (this.getOyuncu().getKarakter().getSaglik() > 0 && this.getDusman().getSaglik() > 0) {
				System.out.println();
				System.out.print("<S>aldir veya <K>aç: ");
				String selectSavas = Oyun.scan.nextLine().toUpperCase();
				if (selectSavas.equals("S")) {
					rand = (int) (Math.random() * 2) + 1;
					if (rand == 1) {
						this.getOyuncu().saldiri(dusman);
						this.dusman.saldiri(this.getOyuncu());
					} else {
						this.dusman.saldiri(this.getOyuncu());
						this.getOyuncu().saldiri(dusman);
					}
				} else {
					break;
				}
			}

			if (this.getOyuncu().getKarakter().getSaglik() <= 0) {
				System.out.println();
				System.out.println("!");
				return 0;
			} else if (this.getDusman().getSaglik() <= 0) {
				System.out.println("Tebrikler " + this.getDusman().getIsim() + " öldü!");
				if (this.dusman.getOdul() != null) {
					if (this.dusman.getIsim().equals("Yılan")) {
						System.out.println("Bu yılandan " + this.dusman.getOdul().getIsim() + " geldi" +
								"!");
					}
					this.dusman.getOdul().claim(this.getOyuncu());
				} else {
					System.out.println("Bu yılan ödül gelmedi :(");
				}

				if (i != dusmanNo) {
					System.out.println(i + 1 + ". " + this.getDusman().getIsim() + " geliyoooor.");
				}
				this.setDusman(this.getDusman().yenile());
			} else {
				return 1;
			}

			System.out.println();
		}
		return 2;
	}

	public int randomDusmanNo() {
		Random rand = new Random();
		return rand.nextInt(this.maxDusman) + 1;
	}

	public Dusman getDusman() {
		return dusman;
	}

	public void setDusman(Dusman dusman) {
		this.dusman = dusman;
	}

	public String getOdul() {
		return odul;
	}

	public void setOdul(String odul) {
		this.odul = odul;
	}

}
