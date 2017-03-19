public class botol {
	public String brand, harga;
	public double ukuran;
	
	public void tampung_air () {
		System.out.println ("Botol tampung air");
	}
	
	public String brand_botol(int in_brand){
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
	
	public double ukuran_botol(int in_ukuran){
		switch(in_ukuran){
			case 1 : 	ukuran = 330;
						harga = "Rp2.000,00";
						break;
			case 2 : 	ukuran = 600;
						harga = "Rp4.000,00";
						break;
			case 3 : 	ukuran = 1.2;
						harga = "Rp8.000,00";
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
		System.out.println("1. 330 ml  | Rp2.000,00");
		System.out.println("2. 600 ml  | Rp4.000,00");
		System.out.println("3. 1.2 L   | Rp8.000,00");
		System.out.println();
		System.out.print("Ukuran     : ");
	}
}