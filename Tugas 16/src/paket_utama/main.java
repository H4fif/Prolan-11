package paket_utama;

import java.util.Scanner;
import paket_fungsi.DiskonMember;

public class main {
	String header;
	
	public static Scanner input = new Scanner(System.in);
	
	public main(){
		this.header = "\n-----     Pemrograman Lanjut   -----\n\n";           
	}
	
	private void sambut(String namadpn){
		System.out.println("Hi " + namadpn + "!");
	}
	
	private void sambut(String namadpn, String namablk){
		System.out.println("Hi " + namadpn + " " + namablk + "!");
	}
	
	public static void main (String[] args) {
		int brand_galon, jair_galon, brand_botol, ukur_botol, pil;
		
		main head = new main();
		System.out.println(head.header);
		
		main sambut_ob = new main();
		
		System.out.print("Nama Depan 	: ");
		String in_namadpn = input.nextLine();
		
		System.out.print("Nama Belakang : ");
		String in_namablk = input.nextLine();
		
		if (in_namablk.length() == 0){
			sambut_ob.sambut(in_namadpn);
		}
		else if (in_namablk.length() != 0){
			sambut_ob.sambut(in_namadpn,in_namablk);
		}
		
		System.out.println();
		System.out.println();
		
        System.out.println("    MENU");
		System.out.println("1. Beli Air");
		System.out.println("2. Registrasi Member");
		System.out.println("0. Batal");
		System.out.print("Pilihan : ");
		pil = input.nextInt();
		System.out.println();
                
		if(pil == 1)  {
			DiskonMember<Character, Double> aa = new DiskonMember<>();
			
			System.out.print("Status member [y/n] : ");
			char stat = input.next().charAt(0);
			if ((stat == 'Y') || (stat == 'y')){
				aa.a = stat;
				System.out.println("Anda mendapatkan diskon 10%!");
			}
			else if ((stat == 'N') || (stat == 'n')){
				System.out.println("Anda tidak mendapat diskon.");
				//Continue the flow
			}
			else{
				System.out.println("Input error!");
				System.exit(1);
			}
			System.out.println();
			
			galon galon1 = new galon();
			botol botol1 = new botol();
		
			System.out.println("1. Galon");
			System.out.println("2. Botol");
			System.out.println("0. Batal");
			System.out.print("Pilihan : ");
			pil = input.nextInt();
			System.out.println();
                        
			if (pil == 1){
				galon1.tanya_brand();
				brand_galon = input.nextInt();
				System.out.println();
				galon1.tanya_air();
				jair_galon = input.nextInt();
		
				galon1.get_brand(brand_galon);
                galon1.get_jenis_air(jair_galon);
				
				if ((stat == 'Y') || (stat == 'y')){
					double x = galon1.harga - (galon1.harga * 0.1);
					aa.set_b(x); 
				}
				
				System.out.println();
				System.out.println("	PILIHAN ANDA");
				System.out.println("Brand     : " + galon1.brand);
				System.out.println("Jenis Air : " + galon1.jenis_air);
				System.out.println("Harga     : Rp." + aa.get_b());
			}
			else if (pil == 2){
				botol1.tanya_brand();
				brand_botol = input.nextInt();
				System.out.println();
				botol1.brand = botol1.get_brand(brand_botol);
				botol1.tanya_ukuran();
				ukur_botol = input.nextInt();
				botol1.ukuran = botol1.get_ukuran(ukur_botol);
				
				if ((stat == 'Y') || (stat == 'y')){
					double x = botol1.harga - (botol1.harga * 0.1);
					aa.set_b(x); 
				}
				
				System.out.println();
				System.out.println("	PILIHAN ANDA");
				System.out.println("Brand  : " + botol1.brand);
				System.out.println("Ukuran : " + botol1.ukuran);
				System.out.println("Harga  : Rp." + botol1.harga);
			}
			else if (pil == 0){
				System.exit(1);
			}
			else {
				System.out.println("Input salah!");
			}
		}
		else if (pil == 2){
			member ob = new member();
			ob.RegistMember();
		}
		else if (pil == 0){
			//Do nothing
		}
		else {
			System.out.println("Input salah!");
		}
	}
}