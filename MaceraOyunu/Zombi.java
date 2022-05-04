
public class Zombi extends Dusman {

	public Zombi() {
		super(1, "Zombi", 3, 10, new Para(4));
	}

	@Override
	public Dusman yenile() {
		return new Zombi();
	}

}
