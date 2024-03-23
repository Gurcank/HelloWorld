package kendiProjelerim;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listeler4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List <String>ad=new ArrayList<String>();
		List <Byte>dk=new ArrayList<Byte>();
		List <Byte>sms= new ArrayList<Byte>();
		List <Byte>net=new ArrayList<Byte>();
		List <Double>tl=new ArrayList<Double>();
	
		for(;;) {
			listelerFonksiyon4.menu();
			byte menu=scan.nextByte();
			
		switch(menu){
		case 1:
			listelerFonksiyon4.kayıt(ad,dk,sms,net,tl);
			break;
		case 2:
			listelerFonksiyon4.listeleme(ad,dk,sms,net);
			break;
		case 3:
			System.out.println("Fatura tutarınız: "+listelerFonksiyon4.faturaBilgisi(ad,tl));
			break;
		case 4:
			System.out.println("Dakika ortalaması: "+listelerFonksiyon4.ortalama(dk));
			System.out.println("SMS ortalaması: "+listelerFonksiyon4.ortalama(sms));
			System.out.println("İnternet ortalaması: "+listelerFonksiyon4.ortalama(net));
			break;
		case 5:
			System.out.println("Dakika minimum: "+listelerFonksiyon4.min(dk));
			System.out.println("SMS minimum: "+listelerFonksiyon4.min(sms));
			System.out.println("İnternet minimum: "+listelerFonksiyon4.min(net));
			break;
		case 6:
			System.out.println("Dakika maksimum: "+listelerFonksiyon4.max(dk));
			System.out.println("SMS maksimum: "+listelerFonksiyon4.max(sms));
			System.out.println("İnternet maksimum: "+listelerFonksiyon4.max(net));
			break;
		case 7:
			System.out.println("Aramak istediğiniz adı giriniz: ");
			String arananAd=scan.next();
			listelerFonksiyon4.adArama(ad,dk,sms,net,arananAd);
			break;
		case 8:
			System.out.println("Silmek istediğiniz adı giriniz: ");
			String silinenAd=scan.next();
			listelerFonksiyon4.adSilme(ad,dk,sms,net,silinenAd);
			break;
		case 9:
			System.out.println("Düzeltmek istediğiniz adı giriniz: ");
			String düzeltilenAd=scan.next();
			listelerFonksiyon4.adDüzeltme(ad,dk,sms,net,tl, düzeltilenAd);
			break;
		case 10:
			System.out.println("Çıkış yapılıyor...");
			System.out.println("Çıkış yapıldı!");
			System.exit(0);
			break;
		default:
			System.out.println("Lütfen geçerli menü numarası giriniz!");

		}
					
			
		}
			
		
		
	}

}
