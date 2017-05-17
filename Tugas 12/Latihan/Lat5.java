public class Lat5 {
	private int Age;
	private int BirthDate;
	private String Name;
	
	public int getBirthDate(){
		return BirthDate;
	}
	
	public void setBirthDate(int BirthDate){
		this.BirthDate = BirthDate;
	}
	
	public int countAge(){
		Age = 2017-BirthDate;
		return Age;
	}
	
	public String getName(){
		return Name;
	}
	
	public void setName(String Name){
		this.Name = Name;
	}
	
	public static void main(String[] args){
		Lat5 x = new Lat5();
		x.setBirthDate(1997);
		x.setName("Hafif");
		System.out.println("Name = "+x.getName());
		System.out.println("Tahun Lahir = "+x.getBirthDate());
		System.out.println("Usia = "+x.countAge());
	}
}