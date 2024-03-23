package kendiProjelerim;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listeler1 {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		List<String> ad = new ArrayList<String>();
		List<Byte> vn = new ArrayList<Byte>();
		List<Byte> fn = new ArrayList<Byte>();
		List<Byte> bn = new ArrayList<Byte>();
		byte menu ;
		for(;;) {
			listelerFonksiyon1.Menu();
			menu=scan.nextByte();
			switch (menu) {
			case 1: 
				listelerFonksiyon1.kayıt(ad,vn,fn,bn);
				break;
			case 2:
				listelerFonksiyon1.listeleme(ad,vn,fn,bn);
				break;
			case 3: 
				System.out.println("Vize notu ortalaması: "+listelerFonksiyon1.ortalama(vn));
				System.out.println("Final notu ortalaması: "+listelerFonksiyon1.ortalama(fn));
				System.out.println("Başarı notu ortalaması: "+listelerFonksiyon1.ortalama(bn));
				break;
			case 4: 
				System.out.println("Vize notu minimumu: "+listelerFonksiyon1.min(vn));
				System.out.println("Final notu minimumu: "+listelerFonksiyon1.min(fn));
				System.out.println("Başarı notu notu minimumu: "+listelerFonksiyon1.min(bn));
				break;
			case 5:
				System.out.println("Vize notu maksimumu: "+listelerFonksiyon1.max(vn));
				System.out.println("Final notu maksimumu: "+listelerFonksiyon1.max(fn));
				System.out.println("Başarı notu maksimumu: "+listelerFonksiyon1.max(bn));
				break;
			case 6:
				System.out.println("Aranacak adı giriniz:");
				String arananAd=scan.next();
				listelerFonksiyon1.adArama(ad,vn,fn,bn,arananAd);
				break;
			case 7:
				System.out.println("Silinecek adı giriniz:");
				String silinenAd = scan.next();
				listelerFonksiyon1.adSilme(ad,vn,fn,bn,silinenAd);
				break;
			case 8:
				System.out.println("Düzeltilecek adı giriniz:");
				String düzeltilenAd = scan.next();
				listelerFonksiyon1.adDüzeltme(ad,vn,fn,bn,düzeltilenAd);
				break;
			case 9:
				System.out.println("Çıkış yapılıyor...");
				System.out.println("Çıkış yapıldı!");
				System.exit(0);
				break;
			default:
				System.out.println("Yanlış menü değeri!");
				break;
			}		
		}
	}
}
