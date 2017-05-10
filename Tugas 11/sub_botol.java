public class sub_botol extends botol {
    
        public sub_botol(){
            super();
            System.out.println(super.brand);
            System.out.println("Modifikasi konstruktor");
            System.out.println();
            System.out.println("----------------------------------");
            System.out.println();
        }
    
        /*public void sub_botol(){
			System.out.println("Sub_Botol tampung air");
		}*/
	
        //@Override
        public void tampung_air(){
            System.out.println("Override method tampung air");
            System.out.println("Memanggil method asal dari class botol");
            super.tampung_air();
            System.out.println();
            System.out.println("----------------------------------");
            System.out.println();
        }
        
        //@Override
        public void tanya_brand(){
            System.out.println("Override method tanya_brand botol");
            System.out.println("Memanggil method asal dari class botol");
            super.tanya_brand();
            System.out.println();
            System.out.println("----------------------------------");
            System.out.println();
        }
        
        //@Override
        public void tanya_ukuran(){
            System.out.println("Override method tanya_ukuran dari class botol");
            System.out.println("Memanggil method asal dari class botol");
            super.tanya_ukuran();
            System.out.println();
            System.out.println("----------------------------------");
            System.out.println();
        }
        
    public static void main (String argd[]){
		sub_botol x = new sub_botol();
		x.tampung_air();
        //x.sub_botol();
        x.tanya_brand();
        x.tanya_ukuran();
    }
}