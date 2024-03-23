package kendiProjelerim;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listeler3 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		List<String> ad= new ArrayList<String>();
		List<String> yazar= new ArrayList<String>();
		List<String> tur= new ArrayList<String>();
		List<Byte> fiyat= new ArrayList<Byte>();
		List<Byte> sayfa= new ArrayList<Byte>();
		List<Byte> tarih= new ArrayList<Byte>();
		byte menu;
		for(;;) {
			listelerFonksiyon3.Menu();
			menu=scan.nextByte();
		switch(menu) {
		case 1:
			listelerFonksiyon3.kayıt(ad,yazar,tur,fiyat,sayfa,tarih);
			break;
		case 2:
			listelerFonksiyon3.listeleme(ad,yazar,tur,fiyat,sayfa,tarih);
			break;
		case 3:
			System.out.println("Ortalama fiyat: "+listelerFonksiyon3.ortalama(fiyat));
			System.out.println("Ortalama sayfa sayısı: "+listelerFonksiyon3.ortalama(sayfa));
			System.out.println("Ortalama tarih: "+listelerFonksiyon3.ortalama(tarih));
			break;
		case 4:
			System.out.println("Minimum fiyat: "+listelerFonksiyon3.min(fiyat));
			System.out.println("Minimum sayfa sayısı: "+listelerFonksiyon3.min(sayfa));
			System.out.println("Minimum tarih: "+listelerFonksiyon3.min(tarih));
			break;
		case 5:
			System.out.println("Maksimum fiyat: "+listelerFonksiyon3.max(fiyat));
			System.out.println("Maksimum sayfa sayısı: "+listelerFonksiyon3.max(sayfa));
			System.out.println("Maksimum tarih: "+listelerFonksiyon3.max(tarih));
			break;
		case 6:
			System.out.println("Aramak istediğiniz kitabın adını giriniz: ");
			String araAd=scan.next();
			listelerFonksiyon3.adArama(ad,yazar,tur,fiyat,sayfa,tarih,araAd);
			break;
		case 7:
			System.out.println("Silmek istediğiniz kitabın adını giriniz: ");
			String silAd=scan.next();
			listelerFonksiyon3.adSilme(ad,yazar,tur,fiyat,sayfa,tarih,silAd);
			break;
		case 8:
			System.out.println("Düzeltmek istedğiniz kitabın adını giriniz: ");
			String düzeltAd=scan.next();
			listelerFonksiyon3.adDüzeltme(ad,yazar,tur,fiyat,sayfa,tarih,düzeltAd);
			break;
		case 9:
			System.out.println("Çıkış yapılıyor...");
			System.out.println("Çıkış yapıldı!");
			System.exit(0);
		default:
			System.out.println("Yanlış menü değeri!");

		}
		}
	}

}
