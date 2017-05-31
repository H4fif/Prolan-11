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
		int numb;
		
		Scanner input = new Scanner(System.in);
		System.out.println();
		
		boolean passed;
		passed = false;
		do {
			System.out.print("Nama : ");
			teks = input.nextLine();
			
			if (teks.length() == 0){
				System.out.println("Nama tidak boleh kosong!");
			}
			else if(teks.length() <3){
				System.out.println("Nama terlalu pendek!");
			}
			else {
				passed = true;
				setName(teks);
			}
		} while (passed != true);
		
		teks = "";
		passed = false;
		
		do {
			System.out.print("Email : ");
			teks = input.nextLine();
			
			if (teks.length() == 0){
				System.out.println("Email tidak boleh kosong!");
			}
			else if((teks.indexOf('@')<0) || (teks.indexOf('.')<0)){
					System.out.println("Format email tidak valid!");
					System.out.println("Contoh: user@subdomain.domain");
			}
			else {
				passed = true;
				setEmail(teks);
			}
			
		} while (passed != true);
		
		System.out.print("Tahun Lahir : ");
		numb = input.nextInt();
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