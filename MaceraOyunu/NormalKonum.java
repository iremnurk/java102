
public abstract class NormalKonum extends Konum {

	public NormalKonum(Oyuncu oyuncu, String isim) {
		super(oyuncu,isim);
		
	}

	@Override
	public boolean konum() {
		return true;
	}

}
