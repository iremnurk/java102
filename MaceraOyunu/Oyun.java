import java.util.Scanner;

public class Oyun {
	public Oyuncu player;
	public Konum konum;
	public static Scanner scan = new Scanner(System.in);

	public void start() {
		System.out.println("Macera Oyununa Hoþgeldiniz!");
		System.out.print("Ýsiminizi girin : ");
		this.player = new Oyuncu(scan.nextLine());
		System.out.println("Merhabalar " + this.player.getIsim() + ", bu karanlýk ve sisli adaya hoþgeldin. Burada yaþananlarýn hepsi gerçek!");
		
		System.out.println("Bu maceradaki rolün nedir?");
		player.selectCharacter();
		System.out.println();
		
		while(true) {
			Konum location = null;
			System.out.println("Bölgeler");
			System.out.println("0 - Oyunu Sonlandýr");
			System.out.println("1 - Güvenli Ev");
			System.out.println("2 - Eþya Dükkaný");
			System.out.println("3 - Maðara");
			System.out.println("4 - Orman");
			System.out.println("5 - Nehir");
			System.out.println("6 - Maden");
			System.out.print("Gitmek istediðin bölgeyi seç: ");
			int selectionLoc = Oyun.scan.nextInt();
			switch(selectionLoc) {
				case 0:
					break;
				case 1:
					location = new GuvenliEv(player);
					break;
				case 2:
					location = new Magaza(player);
					break;
				case 3:
					if(this.player.getEnvanter().getOduller().contains("Yemek")) {
						System.out.println();
						System.out.println("MAGARA TEMÝZ GÝRÝS YOK!");
						System.out.println();
						continue;
					}else {
						location = new Magara(player);
						break;
					}
				case 4:
					if(this.player.getEnvanter().getOduller().contains("Odun")) {
						System.out.println();
						System.out.println("ORMAN TEMÝZ GÝRÝS YOK!");
						System.out.println();
						continue;
					}else {
						location = new Orman(player);
						break;
					}
				case 5:
					if(this.player.getEnvanter().getOduller().contains("Su")) {
						System.out.println();
						System.out.println("NEHÝR TEMÝZLENDÝ GÝRÝS YOK");
						System.out.println();
						continue;
					}else {
						location = new Nehir(player);
						break;
					}
				case 6:
					location = new Maden(player);
					break;
				default:
					location = new GuvenliEv(player);
			}
			
			if(location == null) {
				System.out.println();
				System.out.println("PES ETTÝN!!!");
				break;
			}
			
			System.out.println();
			if (!location.konum()) {
				System.out.println("OYUN BÝTTÝ  !!!");
				break;
			}
			System.out.println();
		}
	}
}
