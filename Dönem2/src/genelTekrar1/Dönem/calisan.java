package genelTekrar1.Dönem;

import java.util.Scanner;

public class calisan {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Kaç kişi için yapılacak ?");
		int ks =scan.nextInt();
		String kitapad[]= new String[ks];
		String yazarad[]= new String[ks];
		String yayıneviad[]= new String[ks];
		int fiyat[]= new int[ks];
		int sayfasayisi[]= new int[ks];
		byte menu;
		for (int i = 0; i < ks; i++) {
			System.out.println("Kitap adı: ");
			kitapad[i] = scan.next();
			System.out.println("Yazar adı: ");
			yazarad[i] = scan.next();
			System.out.println("Yayınevi adı: ");
			yayıneviad[i] = scan.next();
			System.out.println("Kitabın fiyatı: ");
			fiyat[i] = scan.nextInt();
			System.out.println("Kitabın sayfa sayısı: ");
			sayfasayisi[i] = scan.nextInt();	
		}
		for(;;) {
			fonksiyonlar.MenuYarat();
			menu= scan.nextByte();
			switch(menu) {
			case 1:
				fonksiyonlar.listeleme(kitapad,yazarad,yayıneviad,fiyat,sayfasayisi);
				break;
			case 2:
				System.out.println("Aranacak kitap adı: ");
				String arananKitapAdi = scan.next();
				fonksiyonlar.Arama(kitapad,yazarad,yayıneviad,fiyat,sayfasayisi,arananKitapAdi);
			case 3:
				fonksiyonlar.EnKucuk(kitapad,yazarad,yayıneviad,fiyat,sayfasayisi);
			case 4:
				int sayfaort=fonksiyonlar.ortalama(sayfasayisi);
				System.out.println("Sayfa sayısı ortalaması: "+sayfaort);
				int fiyatort=fonksiyonlar.ortalama(fiyat);
				System.out.println("Fiyat ortalaması: "+fiyatort);
			case 5: 
				System.out.println("Program bitti!");
				System.exit(0);
				break;
			case 6:
				System.out.println("Yanlış menü değeri!");
				break;
			}
		}
	}

}
