public class Hafif extends Mahasiswa{
	public void kuliah(String nama){
		System.out.println("Kuliah");
		System.out.println(nama + " belajar dikelas");
		System.out.println(nama + " mengerjakan tugas");
		System.out.println(nama + " mengikuti ujian");
	}
	
	public void lulus(){
		System.out.println("Lulus");
		System.out.println("Tidak pernah bolos kuliah");
		System.out.println("Nilai tugas besar");
		System.out.println("Nilai ujian besar");
	}
	
	public void tdkLulus(){
		System.out.println("Tidak Lulus");
		System.out.println("Sering bolos kuliah");
		System.out.println("Nilai tugas kecil");
		System.out.println("Nilai ujian kecil");
	}
}