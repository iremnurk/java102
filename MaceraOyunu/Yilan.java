
public class Yilan extends Dusman {

	public Yilan() {
		super(4, "Yılan", (int)(Math.random() * 4) + 3, 12, null);
		this.setOdul(randomOdul());


	}

	@Override
	public Dusman yenile() {
		return new Yilan();
	}
	
	public int randomMiktar() {
		int rand = (int)( Math.random()*10)+1;
		
		if(rand == 1 || rand == 2)
			return 10;
		else if(rand >= 3 && rand <= 5)
			return 5;
		else
			return 1;
	}
	
	public Odul randomOdul() {
		int rand = (int)( Math.random()*100)+1;
		
		if(rand >= 1 && rand <= 15)
			return new Silah(0,"Silah",0,0);
		else if(rand >= 16 && rand <= 30)
			return new Zirh(0,"Zırh",0,0);
		else if(rand >= 31 && rand <= 55)
			return new Para(randomMiktar());
		
		return null;
	}
}
