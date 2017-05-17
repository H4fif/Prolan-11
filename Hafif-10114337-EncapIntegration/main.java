import java.util.Scanner;

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
		
		System.out.println("1. Beli Air");
		System.out.println("2. Registrasi Member");
		System.out.println("0. Batal");
		System.out.print("Pilihan : ");
		pil = input.nextInt();
		
		if(pil == 1)  {
			galon galon1 = new galon();
			botol botol1 = new botol();
		
			System.out.println("1. Galon");
			System.out.println("2. Botol");
			System.out.println("0. Batal");
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
			else if (pil == 0){
				//Do nothing
			}
			else {
				System.out.println("Input salah!");
			}
		}
		else if (pil == 2){
			member ob = new member();
			String teks;
			int numb;
			
			System.out.println();
			System.out.print("Nama : ");
			teks = input.next();
			ob.setName(teks);
			System.out.print("Email : ");
			teks = input.next();
			ob.setEmail(teks);
			System.out.print("Tahun Lahir : ");
			numb = input.nextInt();
			ob.setBirthDate(numb);
			
			System.out.println();
			System.out.println("Output:");
			System.out.println("Nama : "+ob.getName());
			System.out.println("Email : "+ob.getEmail());
			System.out.println("Tahun Lahir : "+ob.getBirthDate());
			System.out.println("Usia : "+ob.countAge());
			System.out.println("ID Member : "+ob.createIdMember());
			
		}
		else if (pil == 0){
			//Do nothing
		}
		else {
			System.out.println("Input salah!");
		}
	}
}