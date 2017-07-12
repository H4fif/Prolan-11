package paket_utama;

import paket_fungsi.getValue;

import paket_fungsi.setValue;

import java.util.Scanner;

public class member implements getValue, setValue{
	private String IdMember;
	private String Name;
	private String Email;
	private int BirthDate;
	private int Age;
	
	public String getName(){
		return Name;
	}
	
	public void setName(String newName){
		Name = newName;
	}
	
	public String getEmail(){
		return Email;
	}
	
	public void setEmail(String newEmail){
		Email = newEmail;
	}
	
	public int getBirthDate(){
		return BirthDate;
	}
	
	public void setBirthDate(int newBirthDate){
		BirthDate = newBirthDate;
	}
	
	public int countAge(){
		Age = 2017-BirthDate;
		return Age;
	}
	
	public String createIdMember(){
		IdMember = Name+Age;
		return IdMember;
	}
	
	public void RegistMember(){
		String teks;
		int numb, error;
		
		Scanner input = new Scanner(System.in);
                
		System.out.println();
                System.out.println("MENU REGISTRASI MEMBER");
                System.out.println();
            do {
                error = 0;
		System.out.print("Nama : ");
		teks = input.next();
                if (teks.length() == 0) {
                    System.out.println("Nama tidak boleh kosong!");
                    error = 1;
                }
            } while (error == 1);
		setName(teks);
            
                System.out.print("Email : ");
		teks = input.next();
                if (teks.length() == 0) {
                    teks = "-";
                }
            
		setEmail(teks);
            do {
                error = 0;
		System.out.print("Tahun Lahir : ");
		numb = input.nextInt();
                if ((numb < 1900) && (numb > 2013)) {
                    System.out.println("Input error!");
                    System.out.println("Usia tidak dapat diterima!");
                    error = 1;
                }
            } while (error == 1);
		setBirthDate(numb);
			
        System.out.println();
        System.out.println("Akun berhasil dibuat!");
        System.out.println();
                        
		System.out.println("  Akun Anda :");
		System.out.println("Nama : "+getName());
		System.out.println("Email : "+getEmail());
		System.out.println("Tahun Lahir : "+getBirthDate());
		System.out.println("Usia : "+countAge());
		System.out.println("ID Member : "+createIdMember());
	}
}