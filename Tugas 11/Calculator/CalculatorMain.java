import java.util.Scanner;

public class CalculatorMain extends Calculator{
	
	public double hasilTambah(double x, double y){
		return x+y;
	}
	
	public double hasilKurang(double x, double y){
		return x-y;
	}
	
	public double hasilKali(double x, double y){
		return x*y;
	}
	
	public double hasilBagi(double x, double y){
		return x/y;
	}
	
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args){
		double operan1, operan2;
		CalculatorMain cal = new CalculatorMain();
		
		System.out.print("Operan1= ");
		operan1 = input.nextDouble();
		System.out.print("Operan2= ");
		operan2 = input.nextDouble();
		
		System.out.println("Hasil pertambahan adalah:" + cal.hasilTambah(operan1, operan2));
		System.out.println("Hasil pengurangan adalah:" + cal.hasilKurang(operan1, operan2));
		System.out.println("Hasil perkalian adalah:" + cal.hasilKali(operan1, operan2));
		System.out.println("Hasil pembagian adalah:" + cal.hasilBagi(operan1, operan2));
	}
}