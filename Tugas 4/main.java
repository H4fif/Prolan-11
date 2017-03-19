public class main {
	public static void main (String[] args) {
		galon galon1 = new galon();

		botol botol1 = new botol();
		
		galon1.merk = "aqua galon";
		
		botol1.merk = "aqua botol";
		
		System.out.println (galon1.merk);
		
		System.out.println (botol1.merk);
		
		galon1.tampung_air();
		
		botol1.tampung_air();
	}
}