package kendiProjelerim;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class listelerFonksiyon4 {

	public static void main(String[] args) {
		
	}

	public static void menu() {
		System.out.println("1-Kayıt\n2-Listeleme\n3-Fatura Bilgisi\n4-Ortalama\n5-Minimum\n6-Maksimum\n7-Arama\n8-Silme\n9-Düzeltme\n10-Çıkış");
	}

	public static void kayıt(List<String> ad, List<Byte> dk, List<Byte> sms, List<Byte> net, List<Double> tl) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen ad giriniz: ");
		ad.add(scan.next());
		System.out.println("Lütfen kullandığınız dakikayı miktarını giriniz: ");
		byte xdk=scan.nextByte();			//direkt değişkene eşitleyemiyosun kullanıcıdan aldığın veriyi araya bi değişken daha sokmalasın
		dk.add(xdk);
		System.out.println("Lütfen kullandığınız sms miktarını giriniz: ");
		byte xsms=scan.nextByte();			//direkt değişkene eşitleyemiyosun kullanıcıdan aldığın veriyi araya bi değişken daha sokmalasın
		sms.add(xsms);
		System.out.println("Lütfen kullandığınız internet miktarını giriniz: ");
		byte xnet=scan.nextByte();			//direkt değişkene eşitleyemiyosun kullanıcıdan aldığın veriyi araya bi değişken daha sokmalasın								
		net.add(xnet);
		tl.add((double)(xdk*0.5+xsms*0.5+xnet*10));//ara değişkenide bu işlemde kullanıyosun
	}

	public static void listeleme(List<String> ad, List<Byte> dk, List<Byte> sms, List<Byte> net) {
		for (int i = 0; i < ad.size(); i++) {
			System.out.println("Ad: "+ad.get(i));
			System.out.println("Kullanılan dakika: "+dk.get(i));
			System.out.println("Kullanılan sms: "+sms.get(i));
			System.out.println("Kullanılan internet: "+net.get(i));
		}
	}

	public static List<Double> faturaBilgisi(List<String> ad,List<Double> tl) {
		for (int i = 0; i < ad.size(); i++) {
		}
		return tl;
	}

	public static int ortalama(List<Byte> genel) {
		int toplam=0;
		for (Byte gn:genel) {
			toplam+=gn;
		}
		return (toplam/genel.size());
	}

	public static int min(List<Byte> genel) {
		int enk=0;
		for (int i = 1; i < genel.size(); i++) {
			if(genel.get(i)<enk)
				enk=genel.get(i);
		}
		
		return enk;
	}

	public static int max(List<Byte> genel) {
		int enb=0;
		for (int i = 1; i < genel.size(); i++) {
			if(genel.get(i)<enb)
				enb=genel.get(i);
		}
		return enb;
	}

	public static void adArama(List<String> ad, List<Byte> dk, List<Byte> sms, List<Byte> net, String arananAd) {
		int index=ad.indexOf(arananAd);
		if(index>=0) {
			System.out.println("Ad: "+ad.get(index));
			System.out.println("Kullanılan dakika: "+dk.get(index));
			System.out.println("Kullanılan sms: "+sms.get(index));
			System.out.println("Kullanılan internet: "+net.get(index));
		}else System.out.println("Aramak istediğiniz ad listede yok!");
	}

	public static void adSilme(List<String> ad, List<Byte> dk, List<Byte> sms, List<Byte> net, String silinenAd) {
		int index=ad.indexOf(silinenAd);
		if(index>=0) {
			ad.remove(index);
			dk.remove(index);
			sms.remove(index);
			net.remove(index);
		}else System.out.println("Silmek istediğiniz ad listede yok!");
	}

	public static void adDüzeltme(List<String> ad, List<Byte> dk, List<Byte> sms, List<Byte> net,List<Double> tl, String düzeltilenAd) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Yeni adı giriniz: ");
		ad.add(scan.next());
		System.out.println("Yeni dakika miktarını giriniz: ");
		int xdk=scan.nextInt();
		dk.add((byte) xdk);
		System.out.println("Yeni sms miktarını giriniz: ");
		int xsms=scan.nextInt();
		sms.add((byte) xsms);
		System.out.println("Yeni internet miktarını giriniz: ");
		int xnet=scan.nextInt();
		net.add((byte) xnet);
		tl.add((double)(xdk*0.5+xsms*0.5+xnet*10));
	}

}
