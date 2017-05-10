public abstract class Mahasiswa{
	protected String nama;
	protected String nim;
	
	protected abstract void kuliah(String nama);
	protected abstract void lulus();
	protected abstract void tdkLulus();
	
	protected void organisasi(){
		System.out.println("Mahasiswa ada yang berorganisasi");
	}
}