import java.util.Scanner;

class InputOutput {

  String jenis_kelamin(char gender) {
    String str_kelamin = "Laki-laki";
    if (gender == 'P') {
      str_kelamin = "Perempuan";
    }
    return str_kelamin;
  }

  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    InputOutput kasus = new InputOutput();
    String nama;
    char gender;
    int tinggi;
	
    System.out.print("   INPUT/OUTPUT   \n");
    System.out.print("\n");

    System.out.print("\nNama                : ");
    nama = input.nextLine();
    while (true) {
	  System.out.print("\nJenis Kelamin (L/P) : ");
      gender = input.next().charAt(0);
      if (gender == 'L' || gender == 'P') {
        break;
      }
      System.out.print("Input salah!");
    }
    String get_gender = kasus.jenis_kelamin(gender);
    System.out.print("\nTinggi (cm)         : ");
    tinggi = input.nextInt();

    //System.out.print("\nHalo " + nama + ",\n");
	System.out.print("\nNama                : "+nama);
    //System.out.print("\nSelamat datang di program Input/Output sederhana.");
    //System.out.print("\nBerdasarkan data yang anda masukkan berikut adalah hasil analisis kami.");
    //System.out.print("\nJenis kelamin anda adalah " +  get_kelamin + " dan tinggi badan anda adalah " + tinggi + "cm.\n\n");
	System.out.print("\nJenis Kelamin (L/P) : "+get_gender);
	System.out.print("\nTinggi (cm)         : "+tinggi);
  }
}