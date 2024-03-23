şıpackage ödev;

import java.util.List;
import java.util.Scanner;

public class kitaplıkFonksiyon {

	public static void main(String[] args) {
		
	}

	public static void Menu() {
		System.out.println("1-Veri Girişi\n2-Listeleme\n3-Ortalama sayfa sayısı\n4-En küçük sayfa sayısı\n5-En büyük sayfa sayısı\n6-Aranacak ad\n7-Silinecek ad\n8-Düzeltilecek ad\n9-Çıkış");
	}

	public static void veriGiris(List<String> ad, List<String> yazar, List<String> tur, List<Byte> fiyat,List<Byte> sayfa, List<Byte> tarih) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Kitap adını giriniz: ");
		ad.add(scan.next());
		System.out.println("Kitap yazarını giriniz: ");
		yazar.add(scan.next());
		System.out.println("Kitap türünü giriniz: ");
		tur.add(scan.next());
		System.out.println("Kitap fiyatını giriniz: ");
		fiyat.add((byte) scan.nextInt());
		System.out.println("Kitap sayfa sayısını giriniz: ");
		sayfa.add((byte) scan.nextInt());
		System.out.println("Kitap basım tarihini giriniz: ");
		tarih.add((byte) scan.nextInt());
	}
	public static void Listeleme(List<String> ad, List<String> yazar, List<String> tur, List<Byte> fiyat,List<Byte> sayfa, List<Byte> tarih) {
		for (int i = 0; i < ad.size(); i++) {
			System.out.println("Adı: "+ad.get(i));
			System.out.println("Yazarı: "+yazar.get(i));
			System.out.println("Türü: "+tur.get(i));
			System.out.println("Fiyatı: "+fiyat.get(i));
			System.out.println("Sayfa sayısı "+sayfa.get(i));
			System.out.println("Tarihi: "+sayfa.get(i));
		}
	}
	public static Byte Ortalama(List<Byte> sayfa) {
		byte toplam=0;
		for(Byte ort : sayfa) {
			toplam +=ort;
		}
		return (byte) (toplam/sayfa.size());
	}

	public static byte Enk(List<Byte> sayfa) {
		byte Enk=sayfa.get(0);
		for (int i = 0; i < sayfa.size(); i++) {
			if(sayfa.get(i)<Enk)
				Enk=sayfa.get(i);
		}
		return Enk;
	}

	public static byte Enb(List<Byte> sayfa) {
		byte Enb=sayfa.get(0);
		for (int i = 0; i < sayfa.size(); i++) {
			if(sayfa.get(i)<Enb)
				Enb=sayfa.get(i);
		}
		return Enb;
	}

	public static void arananAd(List<String> ad, List<String> yazar, List<String> tur, List<Byte> fiyat,List<Byte> sayfa, List<Byte> tarih, String arananAd) {
		 for (int i = 0; i < ad.size(); i++) {
				if (ad.get(i).equalsIgnoreCase(arananAd)) {
		            System.out.println("Adı: " + ad.get(i));
		            System.out.println("Yazarı: " + yazar.get(i));
		            System.out.println("Türü: " + tur.get(i));
		            System.out.println("Fiyatı: " + fiyat.get(i));
		            System.out.println("Sayfa sayısı: " + sayfa.get(i));
		            System.out.println("Tarihi: " + tarih.get(i));
		        }
		    }
	}

	public static void silinenAd(List<String> ad, List<String> yazar, List<String> tur, List<Byte> fiyat,List<Byte> sayfa, List<Byte> tarih, String silinenAd) {
		int indis = ad.indexOf(silinenAd);
		if(indis>=0) {
			ad.remove(indis);
			yazar.remove(indis);
			tur.remove(indis);
			fiyat.remove(indis);
			sayfa.remove(indis);
			tarih.remove(indis);
		}
		else
			System.out.println("Yanlış isim seçimi!");
	}

	public static void düzeltilenAd(List<String> ad, List<String> yazar, List<String> tur, List<Byte> fiyat,List<Byte> sayfa, List<Byte> tarih, String düzeltAd) {
		int indis =ad.indexOf(düzeltAd);
		if(indis>=0) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Yeni ad giriniz: ");
			ad.set(indis,scan.next());
			System.out.println("Yeni yazar adı giriniz: ");
			yazar.set(indis,scan.next());
			System.out.println("Yeni tür giriniz: ");
			tur.set(indis,scan.next());
			System.out.println("Yeni fiyat giriniz: ");
			fiyat.set(indis,scan.nextByte());
			System.out.println("Yeni sayfa sayısı giriniz: ");
			sayfa.set(indis,scan.nextByte());
			System.out.println("Yeni basım tarihi giriniz: ");
			tarih.set(indis,scan.nextByte());
		}
	}

}
