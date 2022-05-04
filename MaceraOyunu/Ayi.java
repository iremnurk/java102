
public class Ayi extends Dusman {

	public Ayi() {
		super(3, "Ayı", 7, 20, new Para(12));
	}

	@Override
	public Dusman yenile() {
		return new Ayi();
	}
}