package genelTekrar1.Dönem;

import java.util.Scanner;

public class fonksiyonlar {

	public static void MenuYarat() {
		System.out.println("1-Listeleme\n2-Arama\n3-En düşük sayfa\n4-Ortalamalar\n5-Çıkış");
	}

	public static void listeleme(String[] kitapad, String[] yazarad, String[] yayıneviad, int[] fiyat,int[] sayfasayisi) {
		for (int i = 0; i < fiyat.length; i++) {
			System.out.println("Kitap adı: "+kitapad[i]);
			System.out.println("Yazar adı: "+yazarad[i]);
			System.out.println("Yayınevi adı: "+yayıneviad[i]);
			System.out.println("Fiyatı: "+fiyat[i]);
			System.out.println("Sayfa sayısı: "+sayfasayisi[i]);
			}
		}

	public static void Arama(String[] kitapad, String[] yazarad, String[] yayıneviad, int[] fiyat, int[] sayfasayisi,String arananKitapAdi) {
		for (int i = 0; i < fiyat.length; i++) {
			if(arananKitapAdi.equalsIgnoreCase(kitapad[i])) {
				System.out.println("Kitap adı: "+kitapad[i]);
				System.out.println("Yazar adı: "+yazarad[i]);
				System.out.println("Yayınevi adı: "+yayıneviad[i]);
				System.out.println("Fiyatı: "+fiyat[i]);
				System.out.println("Sayfa sayısı: "+sayfasayisi[i]);
			}
			
		}
		
	}

	public static void EnKucuk(String[] kitapad, String[] yazarad, String[] yayıneviad, int[] fiyat,int[] sayfasayisi) {
		int enk=sayfasayisi[0];
		for (int i = 1; i< sayfasayisi.length; i++) {
			if(sayfasayisi[i]<enk) 
				sayfasayisi[i] = enk;
			}
			for (int i = 0; i < fiyat.length; i++) {
				if(enk==sayfasayisi[i]) {
					System.out.println("Kitap adı: "+kitapad[i]);
					System.out.println("Yazar adı: "+yazarad[i]);
					System.out.println("Yayınevi adı: "+yayıneviad[i]);
					System.out.println("Fiyatı: "+fiyat[i]);
					System.out.println("Sayfa sayısı: "+sayfasayisi[i]);
				}
				
			}
			
		}

	public static int ortalama(int[] sayilar) {
		int toplam =0;
		for (int i = 0; i < sayilar.length; i++) {
			toplam += sayilar[i];
		}
		return toplam/=sayilar.length;
	}
	
	
	}
		
	
	
	


