package paket_fungsi;

public abstract class methodGalon {
	public String brand;
	public String jenis_air;
	public double harga;
	
	public abstract void tampung_air();
	public abstract String get_brand(int  in_brand);
    public abstract String get_jenis_air(int in_air);
	public abstract void tanya_brand();
	public abstract void tanya_air();
}