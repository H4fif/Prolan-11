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
}