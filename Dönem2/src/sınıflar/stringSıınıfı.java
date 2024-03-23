package sınıflar;

import java.util.Arrays;

public class stringSıınıfı {

	public static void main(String[] args) {
		String ad1="Ali",ad2="ali",ad3="Ece";
		
		System.out.println(ad1.compareTo(ad3));
		System.out.println(ad1.compareToIgnoreCase(ad2));
		System.out.println(ad3.toLowerCase());
		System.out.println(ad3.toUpperCase());
		
		String veri ="    Deneme     ";
		System.out.println("|"+veri+"|");
		System.out.println("|"+veri.trim()+"|");
		System.out.println(ad3.charAt(1));
		System.out.println(ad3.codePointAt(1));//aski kodu
		System.out.println(ad3.codePointBefore(1));//seçilen harfin bir önücekinin aski kodunu söyler
		
		System.out.println(ad3.contains("Ec"));
		System.out.println(ad3.contains("cE"));
		
		String birlesenisim=ad1+""+ad3;
		System.out.println(birlesenisim);
		String birlesen =ad1.concat("");
		System.out.println(birlesenisim.concat(ad3));
		
		String isim = "Nurşen";
		System.out.println(isim.startsWith("Nu"));
		System.out.println(isim.startsWith("en"));
		System.out.println(isim.endsWith("en"));
		System.out.println(isim.endsWith("ur"));
		System.out.println(isim.indexOf("e"));
		
		String sehir = "ankara";
		System.out.println(sehir.indexOf("a"));
		System.out.println(sehir.lastIndexOf("a"));
		System.out.println(sehir.indexOf("i",1));
		System.out.println(sehir.replace("a", "A"));
		
		String iller ="edirne İstanbul Ankara Bursa";
		String illerDizi[]=iller.split("");
		System.out.println("----------------------");
		for (String ilAdi : illerDizi) {
			System.out.println(ilAdi);
		}
		System.out.println(iller.length());
		Arrays.sort(illerDizi);
		System.out.println("----------------------");
		for (String ilAdi : illerDizi) {
			System.out.println(ilAdi);
		}
		int sayilar[]= {3,6,73,63};
		Arrays.sort(sayilar);
		System.out.println("----------------------");
		for (int i : sayilar) {
			System.out.println(i);
		}
		System.out.println(isim.isEmpty());
		String ad5="";
		System.out.println(ad5.isEmpty());
				
	}

}
