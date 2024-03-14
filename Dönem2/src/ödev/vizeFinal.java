package ödev;

import java.util.Scanner;

public class vizeFinal {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String notlar[] = {"Vize"};
		String notlarF[] = {"Final"};
		String kisiler[] = {"Ali","Efe","Ece"};
		int sa = kisiler.length;
		int su = notlar.length;
		int toplam[] = new int[sa];
		int min[] = new int[sa];
        int max[] = new int[sa];
		int not[][]=new int[sa][su];
		int notF[][]=new int[sa][su];
		int bn[]= new int[sa];
		int vn[]= new int[sa];
		int fn[]=new int[sa];
		for (int i = 0; i < sa; i++) {
			for (int j = 0; j < su; j++) {
				System.out.println(kisiler[i]+" kişisinin "+notlar[j]+" notunu giriniz: ");
				not[i][j]= scan.nextInt();
				System.out.println(kisiler[i]+" kişisinin "+notlarF[j]+" notunu giriniz: ");
				notF[i][j]= scan.nextInt();

			}
		}//veri giriş sonu
		for (int i = 0; i < sa; i++) {
			min[i] = Integer.MAX_VALUE;
            for (int j = 0; j < su; j++) {
                toplam[i] += not[i][j];
                if (not[i][j] > max[i]) {
                    max[i] = not[i][j]; }
                if (not[i][j] < min[i]) {
                    min[i] = not[i][j];}
            
			}
		}
		for (int i = 0; i < sa; i++) {
			min[i] = Integer.MAX_VALUE;
            for (int j = 0; j < su; j++) {
                toplam[i] += notF[i][j];
                if (notF[i][j] > max[i]) {
                    max[i] = notF[i][j]; }
                if (notF[i][j] < min[i]) {
                    min[i] = notF[i][j];}
            
			}
		}

		System.out.print("     \t");
		for (int i = 0; i < su; i++) {
			System.out.print(notlar[i]+"\t");
			System.out.print(notlarF[i]+"\t");
		}
		System.out.println("BN\tOrt\tMin\tMax");
		for (int i = 0; i < sa; i++) {
		System.out.print(kisiler[i]+"\t");
		for (int j = 0 ; j < su; j++) {
			System.out.print(not[i][j]+"\t");
			System.out.print(notF[i][j]+"\t");
		}
		int j = 0;
		System.out.println(((not[i][j]*0.4+notF[i][j]*0.6))+"\t"+((toplam[i]/su)/2)+"\t"+min[i]+"\t"+max[i]);

		
		
	}
		System.out.println();
		
	}
}
