import java.util.Scanner;

public class Lat_Kasus2 {
	
	public void pilihanA(int n){
		int in_bil, min=0, jml=0, x=0;
		
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print("Input nilai : ");
			in_bil = input.nextInt();
			if (x == 0){
				min = in_bil;
			}
			else {
				if (in_bil < min) {
					jml=1;
					if (in_bil == min){
						jml++;
					}
					min = in_bil;
				}
			}
			x++;
		} while (x < n);
		System.out.println("Nilai minimum = " + min);
		System.out.println("Banyaknya kemunculan nilai minimum = " + jml);
	}
	
	public void pilihanB(int n){
		int in_bil, max=0, jml=0, x=0;
		
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print("Input nilai : ");
			in_bil = input.nextInt();
			if (x == 0){
				max = in_bil;
			}
			else {
				if (in_bil > max) {
					jml=1;
					
					if (in_bil == max){
						jml++;
					}
					
					max = in_bil;
				}
			}
			x++;
		} while (x < n);
		System.out.println("Nilai maksimum = " + max);
		System.out.println("Banyaknya kemunculan nilai maksimum = " + jml);
	}
	
	public static void main (String[] args){
		int N, x = 0;
		char op;
	
		Scanner input = new Scanner(System.in);
		Lat_Kasus2 call = new Lat_Kasus2();
		
		System.out.print("N = ");
		N = input.nextInt();
		System.out.println();
		System.out.println("A. Nilai Minimum");
		System.out.println("B. Nilai Maksimum");
		System.out.print("Pilihan = ");
		op = input.next().charAt(0);
		
		if (op == 'A'){
			call.pilihanA(N);
		}
		else if (op == 'B'){
			call.pilihanB(N);
		}
		else {
			System.out.println("Input salah!");
		}
	}	
}