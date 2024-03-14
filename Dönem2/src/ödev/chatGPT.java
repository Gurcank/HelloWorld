package ödev;

import java.util.Scanner;

public class chatGPT {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String kisiler[] = {"Fatma  ", "Ali    ", "Ayşe   "};
        String aylar[] = {"Ocak", "Şubat"};
        int sa = kisiler.length;
        int su = aylar.length;
        int maas[] = new int[sa];
        int toplam[] = new int[sa];
        int min[] = new int[sa];
        int max[] = new int[sa];
        int harcama[][] = new int[sa][su];
        for (int i = 0; i < sa; i++) {
            System.out.print(kisiler[i] + " kişisinin maaşını giriniz: ");
            maas[i] = scan.nextInt();
            for (int j = 0; j < su; j++) {
                System.out.print(kisiler[i] + " kişisinin " + aylar[j] + " ayı harcamasını giriniz: ");
                harcama[i][j] = scan.nextInt();
            }
        }//veri giris sonu
        for (int i = 0; i < sa; i++) {
            for (int j = 0; j < su; j++) {
                toplam[i] += harcama[i][j];
                if (harcama[i][j] > max[i])
                    max[i] = harcama[i][j]; 
                if (harcama[i][j] < min[i])
                    min[i] = harcama[i][j]; 
            }
        }
        int gtop = 0, gmin = Integer.MAX_VALUE, gmax = Integer.MIN_VALUE;
        for (int i = 0; i < sa; i++) {
            gtop += toplam[i]; 
            if (toplam[i] > gmax)
                gmax = toplam[i]; 
            if (toplam[i] < gmin)
                gmin = toplam[i]; 
        }
        System.out.println("Kişiler\t");
        for (int i = 0; i < su; i++) {
            System.out.print(aylar[i] + "\t");
        }
        System.out.println("\nToplam\tOrt\tMin\tMax");
        for (int i = 0; i < sa; i++) {
            System.out.print(kisiler[i] + "\t");
            for (int j = 0; j < su; j++) {
                System.out.print(harcama[i][j] + "\t");
            }
            System.out.println(toplam[i] + "\t" + (toplam[i] / su) + "\t" + min[i] + "\t" + max[i]);
        }
        System.out.println("Genel ortalama: " + (gtop / (sa * su)));
        System.out.println("Minimum: " + gmin);
        System.out.println("Maximum: " + gmax);
    }

}
