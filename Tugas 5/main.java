import java.util.Scanner;

public class main {
	public static Scanner input = new Scanner(System.in);
	
	public static void main (String[] args) {
		int brand_galon, jair_galon, brand_botol, ukur_botol, pil;
		
		//Scanner input = new Scanner(System.in);
		
		galon galon1 = new galon();
		botol botol1 = new botol();
		
		System.out.println("1. Galon");
		System.out.println("2. Botol");
		System.out.print("Pilihan : ");
		pil = input.nextInt();
		
		if (pil == 1){
			galon1.tanya_brand();
			brand_galon = input.nextInt();
			System.out.println();
			galon1.tanya_air();
			jair_galon = input.nextInt();
		
			galon1.isi_galon(brand_galon, jair_galon);
		
			System.out.println();
			System.out.println("	Pilihan Anda");
			System.out.println("Brand     : " + galon1.brand);
			System.out.println("Jenis Air : " + galon1.jenis_air);
			System.out.println("Harga     : " + galon1.harga);
		}
		else if (pil == 2){
			botol1.tanya_brand();
			brand_botol = input.nextInt();
			System.out.println();
			botol1.brand = botol1.brand_botol(brand_botol);
			botol1.tanya_ukuran();
			ukur_botol = input.nextInt();
			botol1.ukuran = botol1.ukuran_botol(ukur_botol);
			
			System.out.println();
			System.out.println("	Pilihan Anda");
			System.out.println("Brand  : " + botol1.brand);
			System.out.println("Ukuran : " + botol1.ukuran);
			System.out.println("Harga  : " + botol1.harga);
		}
		else {
			System.out.println("Input salah!");
		}
		
		//galon1.tampung_air();
		
		//botol1.tampung_air();
	}
}