public class galon extends methodGalon {
	//public String brand, jenis_air, harga;
	
	public void tampung_air () {
		System.out.println ("Galon tampung air");
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
        
	public String get_jenis_air(int in_air){
		switch(in_air){
			case 1 : 	jenis_air = "Biasa";
						harga = "Rp6.000,00";
						break;
			case 2 : 	jenis_air = "Medium";
						harga = "Rp8.000,00";
						break;
			case 3 : 	jenis_air = "Original";
						harga = "Rp16.000,00";
						break;
			default : 	System.out.println("Input salah!");
						//break;
		}
		return jenis_air;
	}
	
	public void tanya_brand(){
		System.out.println("     GALON\n");
		System.out.println();
		System.out.println("  BRAND GALON :");
		System.out.println("1. AQUA | 2. AQSA | 3. GUWAYA");
		System.out.println();
		//System.out.print("Brand galon yang dipilih         : ");
	}
	
	public void tanya_air(){
		System.out.println("  JENIS AIR  |    HARGA");
		System.out.println("1. Biasa     | Rp6.000,00");
		System.out.println("2. Medium    | Rp8.000,00");
		System.out.println("3. Original  | Rp16.000,00");
		System.out.println();
		//System.out.print("Jenis air yang ingin dipilih    : ");
	}
}