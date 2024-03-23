package sınıflar;

public class MathSınıfı {

	public static void main(String[] args) {
		System.out.println(Math.PI);//Pi
		System.out.println(Math.sqrt(25));//Kare
		System.out.println(Math.ceil(2.6));//Tavana yuvarlama
		System.out.println(Math.floor(3.5));//Tabana yuvarlama
		System.out.println(Math.round(3.5));//Yuvarlama
		System.out.println(Math.min(2, 4));//Min
		System.out.println(Math.max(4, 3));//Max
		
		System.out.println(benimCeil(2.6));
		System.out.println(benimFloor(3.5));//Tabana yuvarlama
		System.out.println(benimRound(3.5));//Yuvarlama
		System.out.println(benimMin(2, 4));//Min
		System.out.println(benimMax(4, 3));//Max

	}

	private static int benimMax(int i, int j) {
		int max;
		if(i<j) max=j;
		else max =i;
		return max;
	}

	private static int benimMin(int i, int j) {
		int min;
		if(i<j) min=i;
		else min=j;
		return min;
	}

	private static int[] benimRound(double d) {
		double ondalik=d-(int)d;
		int yuvarlanmış;
		if(ondalik<0.5) yuvarlanmış=(int)d;
		else yuvarlanmış=(int)++d;
		return null;
	}

	private static int benimFloor(double d) {
		
		return (int)d;
	}

	private static int benimCeil(double d) {
		
		return (int)++d;
	}

}
