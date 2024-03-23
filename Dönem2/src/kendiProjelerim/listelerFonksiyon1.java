package kendiProjelerim;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class listelerFonksiyon1 {

	public static void main(String[] args) {
	}

	public static void Menu() {
		System.out.println("1-Kayıt\n2-Listeleme\n3-Ortalama\n4-Minimum\n5-Maksimum\n6-Ad arama\n7-İsimden silme\n8-İsimden düzeltme\n9-Çıkış");
	}
	
	public static void kayıt(List<String> ad, List<Byte> vn, List<Byte> fn, List<Byte> bn) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Ad giriniz: ");
		ad.add(scan.next());
		System.out.println("Vize notu giriniz: ");
		byte vNot = scan.nextByte();
		vn.add(vNot);										//kullanıcıdan alınan verileri vNot a aldık ordan vNotu vn ye ekledik
		System.out.println("Final notunu giriniz: ");
		byte fNot = scan.nextByte();
		fn.add(fNot);
		bn.add((byte)(vNot*0.4+fNot*0.6));
	}

	public static void listeleme(List<String> ad, List<Byte> vn, List<Byte> fn, List<Byte> bn) {
		for (int i = 0; i < ad.size(); i++) {				//listelemede hep for döngüsü//listelerde büyüklük size()
			System.out.println("Ad: "+ad.get(i));
			System.out.println("Vize notu: "+vn.get(i));
			System.out.println("Final notu: "+fn.get(i));
			System.out.println("Başarı notu: "+bn.get(i));
		}
	}

	public static byte ortalama(List<Byte> sinavNotu) {		//Buraya byte yerine int yazsaydım
		int toplam=0;
		for(byte sn: sinavNotu) {
			toplam+=sn;
		}
		
		return (byte) (toplam/sinavNotu.size());			//buraya parantez içinde byte yazmama gerek yoktu
	}

	public static byte min(List<Byte> sinavNotu) {
		byte enk=0;
		for (int i = 1; i < sinavNotu.size(); i++) {
			if(enk>sinavNotu.get(i))						//en lerde get(i) olmak zorunda
			    enk=sinavNotu.get(i);
		}
		return enk;
	}

	public static byte max(List<Byte> sinavNotu) {
		byte enb=0;
		for (int i = 1; i < sinavNotu.size(); i++) {
			if(enb<sinavNotu.get(i))
				enb=sinavNotu.get(i);
		}	
		return enb;
	}

	public static void adArama(List<String> ad, List<Byte> vn, List<Byte> fn, List<Byte> bn, String arananAd) {
		int index=ad.indexOf(arananAd); 					//burası 
		if(index>=0) {										//ve burası düzeltme arama ve silmede aynı 
			System.out.println("Ad: "+ad.get(index));
			System.out.println("Vize notu: "+vn.get(index));
			System.out.println("Final notu: "+fn.get(index));
			System.out.println("Başarı notu: "+bn.get(index));
		}else System.out.println("Aranan ad listede yok!");
	}

	public static void adSilme(List<String> ad, List<Byte> vn, List<Byte> fn, List<Byte> bn, String silinenAd) {
		int index=ad.indexOf(silinenAd);
		if(index>=0) {
			ad.remove(index);
			vn.remove(index);
			fn.remove(index);
			bn.remove(index);
		}else System.out.println("Silinecek ad listede yok!");
				
	}

	public static void adDüzeltme(List<String> ad, List<Byte> vn, List<Byte> fn, List<Byte> bn, String düzeltilenAd) {
		int index=ad.indexOf(düzeltilenAd);
		if(index>=0) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Yeni adı giriniz: ");
			ad.set(index, scan.next());
			System.out.println("Yeni vize notunu giriniz: ");
			byte vNot = scan.nextByte();
			vn.set(index,vNot);
			System.out.println("Yeni final notunu giriniz: ");
			byte fNot = scan.nextByte();
			fn.set(index,fNot);
			bn.set(index,(byte)(vNot*0.4+fNot*0.6));
		}else System.out.println("Düzeltilecek ad listede yok!");
				
	}
	

}
