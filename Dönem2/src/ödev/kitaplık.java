package ödev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class kitaplık {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		List<String> ad=new ArrayList<String>();
		List<String> yazar=new ArrayList<String>();
		List<String> tur=new ArrayList<String>();
		List<Byte> sayfa=new ArrayList<Byte>();
		List<Byte> tarih=new ArrayList<Byte>();
		List<Byte> fiyat=new ArrayList<Byte>();
		int menu;
		for(;;) {
			kitaplıkFonksiyon.Menu();
			menu=scan.nextByte();
			switch(menu) {
			case 1:
				kitaplıkFonksiyon.veriGiris(ad,yazar,tur,fiyat,sayfa,tarih);
			break;
			case 2: 
				kitaplıkFonksiyon.Listeleme(ad,yazar,tur,fiyat,sayfa,tarih);
			break;
			case 3:
				System.out.println("Ortalama sayfa sayısı : "+kitaplıkFonksiyon.Ortalama(sayfa));
				System.out.println("Ortalama tarih: "+kitaplıkFonksiyon.Ortalama(tarih));
				System.out.println("Ortalama fiyat: "+kitaplıkFonksiyon.Ortalama(fiyat));
			break;
			case 4:
				System.out.println("En küçük sayfa sayısı: "+kitaplıkFonksiyon.Enk(sayfa));
				System.out.println("En küçük tarih: "+kitaplıkFonksiyon.Enk(tarih));
				System.out.println("En küçük fiyat: "+kitaplıkFonksiyon.Enk(fiyat));
			break;
			case 5:
				System.out.println("En büyük sayfa sayısı: "+kitaplıkFonksiyon.Enb(sayfa));
				System.out.println("En büyük sayfa sayısı: "+kitaplıkFonksiyon.Enb(sayfa));
				System.out.println("En büyük sayfa sayısı: "+kitaplıkFonksiyon.Enb(sayfa));
			break;
			case 6:
				System.out.println("Aranacak adı giriniz: ");
				String arananAd=scan.next();
				kitaplıkFonksiyon.arananAd(ad,yazar,tur,fiyat,sayfa,tarih);
			break;
			case 7:
				System.out.println("Silinecek adı giriniz: ");
				String silinenAd=scan.next();
				kitaplıkFonksiyon.silinenAd(ad,yazar,tur,fiyat,sayfa,tarih);
			break;
			case 8:
				System.out.println("Düzeltilecek adı giriniz: ");
				String düzeltilenAd=scan.next();
				kitaplıkFonksiyon.düzeltilenAd(ad,yazar,tur,fiyat,sayfa,tarih);
			break;
			case 9:
				System.out.println("Çıkış yapılıyor...");
				System.out.println("Çıkış yapıldı!");
				System.exit(0);
				break;
			default:
				System.out.println("Geçersiz menü işlemi lütfen geçerli bir işlem seçiniz!");
			}
			
		}
	}

}
