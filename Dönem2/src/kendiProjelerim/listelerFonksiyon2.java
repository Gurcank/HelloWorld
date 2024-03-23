package kendiProjelerim;

import java.util.List;
import java.util.Scanner;

public class listelerFonksiyon2 {

	public static void main(String[] args) {
		
	}

	public static void Menu(List<String> ad, List<String> cesit, List<Double> miktar, List<Integer> fiyat) {
		System.out.println("1-Veri Girişi\n2-Listeleme\n3-Çeşit ile arama\n4-Toplam Fiyat\n5-Ürün adı ile satış\n6-En düşük miktarlı ürün bilgisi\n7-Düzenleme\n8-Silme\n9-Çıkış");
	}

	public static void kayıt(List<String> ad, List<String> cesit, List<Double> miktar, List<Integer> fiyat) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ürünün adını giriniz:");
		ad.add(scan.next());
		System.out.println("Ürünün çeşidini giriniz:");
		cesit.add(scan.next());
		System.out.println("Ürünün miktarını giriniz:");
		miktar.add(scan.nextDouble());
		System.out.println("Ürünün fiyatını giriniz:");
		fiyat.add(scan.nextInt());
	}

	public static void listeleme(List<String> ad, List<String> cesit, List<Double> miktar, List<Integer> fiyat) {
		for (int i = 0; i < ad.size(); i++) {
			System.out.println("Ürünün adı: "+ad.get(i));
			System.out.println("Ürünün çeşidi: "+cesit.get(i));
			System.out.println("Ürünün miktarı: "+miktar.get(i));
			System.out.println("Ürünün fiyatı: "+fiyat.get(i));
		}
	}

	public static void cesitArama(List<String> ad, List<String> cesit, List<Double> miktar, List<Integer> fiyat,String arananCesit) {
		int index=cesit.indexOf(arananCesit);
		if(index>=0) {
			System.out.println("Ürünün adı: "+ad.get(index));
			System.out.println("Ürünün çeşidi: "+cesit.get(index));
			System.out.println("Ürünün miktarı: "+miktar.get(index));
			System.out.println("Ürünün fiyatı: "+fiyat.get(index));
		}else System.out.println("Aranan çeşit listede yok!");
	}

	public static double toplamFiyat(List<Double> miktar, List<Integer> fiyat) {
		double toplam=0;
		for (int i = 0; i < miktar.size(); i++) {
			toplam=fiyat.get(i)*miktar.get(i);			//basit bir problem toplam fiyatı bulmak için fiyat * miktar
		}
		return 0;
	}

	public static void EnD(List<String> ad, List<String> cesit, List<Double> miktar, List<Integer> fiyat) {
		Double enk=(double) 0;
		for (int i = 1; i < ad.size(); i++) {			//burda neden ad kullandık bilmiyorum ben miktar kullandım ama hata vermedi sınavdada bişi olmaz
			if(enk>miktar.get(i))						//klasik min bulma tek fark get(i) ler var
				enk=miktar.get(i);
		}
		for (int i = 1; i < ad.size(); i++) {
			if(miktar.get(i)==enk) {
				System.out.println("Ürünün adı: "+ad.get(i));
				System.out.println("Ürünün çeşidi: "+cesit.get(i));
				System.out.println("Ürünün miktarı: "+miktar.get(i));
				System.out.println("Ürünün fiyatı: "+fiyat.get(i));
			}
	}
	}
	public static void adDüzeltme(List<String> ad, List<String> cesit, List<Double> miktar, List<Integer> fiyat,String düzeltAd) {
		int index = ad.indexOf(düzeltAd);
		if(index>=0) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Yeni ad giriniz:");
			ad.set(index,scan.next());
			System.out.println("Yeni çeşit giriniz:");
			cesit.set(index, scan.next());
			System.out.println("Yeni miktar giriniz:");
			miktar.set(index, scan.nextDouble());
			System.out.println("Yeni fiyat giriniz:");
			fiyat.set(index, scan.nextInt());
		}else System.out.println("Düzeltilecek ad listede yok!");
	}

	public static void adSilme(List<String> ad, List<String> cesit, List<Double> miktar, List<Integer> fiyat,String silAd) {
		int index =ad.indexOf(silAd);
		if(index>=0) {
			ad.remove(index);
			cesit.remove(index);
			miktar.remove(index);
			fiyat.remove(index);
			
		}else System.out.println("Silinecek ad listede yok!");
	}

}
