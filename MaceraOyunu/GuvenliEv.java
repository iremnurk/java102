
public class GuvenliEv extends NormalKonum {

	public GuvenliEv(Oyuncu oyuncu) {
		super(oyuncu, "Güvenli ev");
	}

	@Override
	public boolean konum() {
		if(this.getOyuncu().getEnvanter().getOduller().size() == 3) {
			System.out.println("Tebrikler!!! "+this.getOyuncu().getIsim()+" TEBRÝKLER! ");
			System.exit(0);

		}
			
		System.out.println("Güvenli evdesin burada düþman yok!");
		this.getOyuncu().getKarakter().fullSaglik();
		System.out.println("Canýn tazelendi !");
		System.out.println("Can durumun : " + this.getOyuncu().getKarakter().getSaglik());
		return true;
	}
}
