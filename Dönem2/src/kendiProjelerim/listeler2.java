package kendiProjelerim;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listeler2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List <String> ad = new ArrayList<String>();
		List <String> cesit = new ArrayList<String>();
		List <Double> miktar = new ArrayList<Double>();
		List <Integer> fiyat = new ArrayList<Integer>();
		byte menu;
		for(;;) {
			listelerFonksiyon2.Menu(ad,cesit,miktar,fiyat);
			menu = scan.nextByte();
		switch (menu) {
		case 1:
			listelerFonksiyon2.kayıt(ad,cesit,miktar,fiyat);
			break;
		case 2:
			listelerFonksiyon2.listeleme(ad,cesit,miktar,fiyat);
			break;
		case 3:
			System.out.println("Aranacak çeşidi giriniz: ");			//Arama silme düzeltme aynı şablonda sadece isimler değişiyor!
			String arananCesit = scan.next();
			listelerFonksiyon2.cesitArama(ad,cesit,miktar,fiyat,arananCesit);
			break;
		case 4:
			double toplamFiyat=listelerFonksiyon2.toplamFiyat(miktar,fiyat);
			System.out.println("Depodaki toplam fiyat: "+toplamFiyat);
			break;
		case 5:
			
			break;
		case 6:
			listelerFonksiyon2.EnD(ad,cesit,miktar,fiyat);
			break;
		case 7:
			System.out.println("Düzeltmek istediğiniz ürünün adını giriniz:");
			String düzeltAd = scan.next();
			listelerFonksiyon2.adDüzeltme(ad,cesit,miktar,fiyat,düzeltAd);
			break;
		case 8:
			System.out.println("Silmek istediğiniz ürünün adını giriniz:");
			String silAd = scan.next();
			listelerFonksiyon2.adSilme(ad,cesit,miktar,fiyat,silAd);
		case 9:
			System.out.println("Çıkış yapılıyor...");
			System.out.println("Çıkış yapıldı!");
			System.exit(0);
		default:
			System.out.println("Yanlış menü değeri lütfen tekrar deneyiniz!");
		}
			
		}
		
	}

}
