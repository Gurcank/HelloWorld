package kendiProjelerim;

import java.util.Scanner;

public class değişkeniHesaplama {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Vize notunuzu giriniz: ");
		int vnot=scan.nextInt();
		System.out.println("Final notunuzu giriniz: ");
		int fnot=scan.nextInt();
		double bnot=(vnot*0.4+fnot*0.6);
		System.out.println("Başarı notunuz: "+bnot);
	}

}
