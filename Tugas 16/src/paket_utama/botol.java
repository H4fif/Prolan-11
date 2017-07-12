package paket_utama;

import paket_fungsi.methodBotol;

public class botol extends methodBotol {
	public String brand;
	public double ukuran, harga;
	    		
	public botol(){
		this.brand = "konstruktor asal";
    }
        
	public void tampung_air () {
		System.out.println ("Botol tampung air");
	}
	
	public String get_brand(int in_brand){
		switch(in_brand){
			case 1 : 	brand = "AQUA";
						break;
			case 2 : 	brand = "AQSA";
						break;
			case 3 : 	brand = "GUWAYA";
						break;
			default : 	System.out.println("Input salah!");
						//break;
		}
		return brand;
	}
	
	public double get_ukuran(int in_ukuran){
		switch(in_ukuran){
			case 1 : 	ukuran = 330;
						harga = 2000;
						break;
			case 2 : 	ukuran = 600;
						harga = 4000;
						break;
			case 3 : 	ukuran = 1.2;
						harga = 8000;
						break;
			default : 	System.out.println("Input salah!");
						//break;
		}
		return ukuran;
	}
	
	public void tanya_brand(){
		System.out.println("     Isi Botol\n");
		System.out.println();
		System.out.println("Brand Botol :");
		System.out.println("1. AQUA | 2. AQSA | 3. GUWAYA");
		System.out.println();
		System.out.print("Brand       : ");
	}
	
	public void tanya_ukuran(){
		System.out.println("Ukuran     :");
		System.out.println("1. 330 ml  | Rp"+2000);
		System.out.println("2. 600 ml  | Rp"+4000);
		System.out.println("3. 1.2 L   | Rp"+8000);
		System.out.println();
		System.out.print("Ukuran     : ");
	}
}