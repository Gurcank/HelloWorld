package kendiProjelerim;

import java.nio.file.spi.FileSystemProvider;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class listelerFonksiyon3 {

	public static void main(String[] args) {
		
	}

	public static void Menu() {
		System.out.println("1-Veri Girişi\n2-Listeleme\n3-Ortalama\n4-Minimum\n5-Maksimum\n6-Ad arama\n7-Ad silme\n8-Ad düzeltme\n9-Çıkış");
	}

	public static void kayıt(List<String> ad, List<String> yazar, List<String> tur, List<Byte> fiyat,List<Byte> sayfa, List<Byte> tarih) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Kitabın adını giriniz: ");
			ad.add(scan.next());
			System.out.println("Kitabın yazarını giriniz: ");
			yazar.add(scan.next());
			System.out.println("Kitabın türünü giriniz: ");
			tur.add(scan.next());
			System.out.println("Kitabın fiyatını giriniz: ");
			fiyat.add(scan.nextByte());
			System.out.println("Kitabın sayfa sayısını giriniz: ");
			sayfa.add(scan.nextByte());
			System.out.println("Kitabın tarihini giriniz: ");
			tarih.add(scan.nextByte());
			
	}

	public static void listeleme(List<String> ad, List<String> yazar, List<String> tur, List<Byte> fiyat,List<Byte> sayfa, List<Byte> tarih) {
		for (int i = 0; i < ad.size(); i++) {
			System.out.println("Kitabın adı: "+ad.get(i));
			System.out.println("Kitabın yazarı: "+yazar.get(i));
			System.out.println("Kitabın türü: "+tur.get(i));
			System.out.println("Kitabın fiyatı: "+fiyat.get(i));
			System.out.println("Kitabın sayfa sayısı: "+sayfa.get(i));
			System.out.println("Kitabın tarihi: "+tarih.get(i));
		}
	}

	public static byte ortalama(List<Byte> genel) {				    //buraya mesela bu örnekte için fiyat sayfa sayısı ve tarihin ortalamsında kullnamk için ortak bir değişken ata
		byte toplam=0;												//toplam standart her ortalamada tanımlanır
		for (Byte gn:genel) { 										//bu şema kalsik tanımladığın ortak değişkenin 2 harflisini yaz
			toplam+=gn; 											//toplama 2 harfli olanı eşitle
		}
		return  (byte) (toplam/genel.size());
	}

	public static byte min(List<Byte> fiyat) {
		int enk=0;
		for (int i = 1; i < fiyat.size(); i++) {
		if(enk>fiyat.get(i))	
			enk=fiyat.get(i);
		}
		return (byte) enk ;
	}

	public static byte max(List<Byte> fiyat) {
		int enb=0;
		for (int i = 1; i < fiyat.size(); i++) {
		if(enb<fiyat.get(i))	
			enb=fiyat.get(i);
		}
		return (byte) enb;
	}

	public static void adArama(List<String> ad, List<String> yazar, List<String> tur, List<Byte> fiyat, List<Byte> sayfa, List<Byte> tarih, String araAd) {
		int index=ad.indexOf(araAd);
		if(index>=0) {
			System.out.println("Kitabın adı: "+ad.get(index));
			System.out.println("Kitabın yazarı: "+yazar.get(index));
			System.out.println("Kitabın türü: "+tur.get(index));
			System.out.println("Kitabın fiyatı: "+fiyat.get(index));
			System.out.println("Kitabın sayfa sayısı: "+sayfa.get(index));
			System.out.println("Kitabın tarihi: "+tarih.get(index));
		}else System.out.println("Aramak istediğiniz ad listede yok!");
	}

	public static void adSilme(List<String> ad, List<String> yazar, List<String> tur, List<Byte> fiyat,List<Byte> sayfa, List<Byte> tarih, String silAd) {
		int index=ad.indexOf(silAd);
		if(index>=0) {
			ad.remove(index);
			yazar.remove(index);
			tur.remove(index);
			fiyat.remove(index);
			sayfa.remove(index);
			tarih.remove(index);
		}else System.out.println("Silmek istediğiniz ad listede yok!");
	}

	public static void adDüzeltme(List<String> ad, List<String> yazar, List<String> tur, List<Byte> fiyat,List<Byte> sayfa, List<Byte> tarih, String düzeltAd) {
		int index=ad.indexOf(düzeltAd);
		if(index>=0) {
			Scanner scan= new Scanner(System.in);
			System.out.println("Yeni adı giriniz: ");
			ad.set(index, scan.next());
			System.out.println("Yeni yazarı giriniz: ");
			yazar.set(index, scan.next());
			System.out.println("Yeni türü giriniz: ");
			tur.set(index, scan.next());
			System.out.println("Yeni fiyatı giriniz: ");
			fiyat.set(index, scan.nextByte());
			System.out.println("Yeni sayfa sayısını giriniz: ");
			sayfa.set(index, scan.nextByte());
			System.out.println("Yeni tarihi giriniz: ");
			tarih.set(index, scan.nextByte());
		}
	}
	

}
