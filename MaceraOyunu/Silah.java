
public class Silah implements Odul {
	private int id;
	private String name;
	private int damage;
	private int price;


	public Silah(int id, String name, int damage, int price) {
		this.id = id;
		this.name = name;
		this.damage = damage;
		this.price = price;
	}

	public static Silah[] getSilahlar() {
		Silah[] weaponList = new Silah[3];
		weaponList[0] = new Silah(1, "Tabanca", 2, 25);
		weaponList[1] = new Silah(2, "Kýlýç", 3, 35);
		weaponList[2] = new Silah(3, "Tüfek", 7, 45);
		return weaponList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHasar() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getIsim() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static Silah getSecilenSilahId(int id) {
		for (Silah w : Silah.getSilahlar()) {
			if(w.getId() == id)
				return w;
		}
		return null;
	}
	
	public void printInfo() {
		System.out.println(this.getId() + " - " + this.getIsim() + " <Fiyat : " + this.getPrice() + ", Hasar : " + this.getHasar() + ">");
	}
	
	public Silah getRandomWeapon() {
		int rand = (int)( Math.random()*10)+1;
		
		if(rand == 1 || rand == 2)
			return Silah.getSilahlar()[2];
		else if(rand >= 3 && rand <= 5)
			return Silah.getSilahlar()[1];
		else 
			return Silah.getSilahlar()[0];
	}

	@Override
	public void claim(Oyuncu player) {
		player.getEnvanter().setSilah(getRandomWeapon());
	}
}
