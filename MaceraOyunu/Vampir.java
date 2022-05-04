
public class Vampir extends Dusman {

	public Vampir() {
		super(2, "Vampir", 4, 14, new Para(7));
	}

	@Override
	public Dusman yenile() {
		return new Vampir();
	}


}
