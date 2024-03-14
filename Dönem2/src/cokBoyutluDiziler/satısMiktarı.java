package cokBoyutluDiziler;

import java.util.Scanner;
import java.util.Iterator;

public class satısMiktarı {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String iller[] = {"Edirne   ","İstanbul ","Ankara   ","Çanakkale"};
		String aylar[] = {"Ocak","Şubat"};
		int sa=iller.length;
		int su=aylar.length;
		int toplam[]=new int[sa];
		int min[]=new int[sa];
		int max[]=new int[sa];
		int sm[][]=new int[sa][su];
		for (int i = 0; i < sa; i++) {
			for (int j = 0; j < su; j++) {
			System.out.print(iller[i]+"ilinin "+aylar[j]+" ayı satışını gir:");
			sm[i][j] =scan.nextInt();
		}
	}//veri giris sonu
		for (int i = 0; i < sa; i++) {
			for (int j = 0; j < su; j++) {
				toplam[i]+=sm[i][j];
			}
		}
		for (int i = 1; i < sa; i++) {
			max[i]=sm[i][0];
			min[i]=sm[i][0];
			for (int j = 0; j < sa; j++) {
				if(sm[i][j]>max[i]);
				max[i]=sm[i][j];
				if(sm[i][j]<min[i]);
				min[i]=sm[i][j];
			}
		}
		int gtop=0,gmin=Integer.MAX_VALUE,gmax=Integer.MIN_VALUE;
		for (int i = 0; i < sa; i++) {
			for (int j = 0; j < su; j++) {
				toplam[i]+=sm[i][j];
				gtop+=sm[i][j];
				if(sm[i][j]>gmax)
					gmax=sm[i][j];
				if(sm[i][j]<gmin)
					gmin=sm[i][j];
			}
		}
		System.out.print("İller    \t");
		for (int i = 0; i < su; i++) {
			System.out.print(aylar[i]+"\t");
		}
		System.out.println("Toplam\tOrt\tMin\tMax");
		for (int i = 0; i < sa; i++) {
			System.out.print(iller[i]+"\t");
			for (int j = 0; j < su; j++) {
				System.out.print(sm[i][j]+"\t");
			}
			System.out.println(toplam[i]+"\t"+(toplam[i]/su));
		}
		System.out.println("Genel ortalama: "+(gtop/(sa*su)));
		System.out.println("Minumum"+gmin);
}
}