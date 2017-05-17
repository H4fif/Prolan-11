public class Enkapsulasi {
	private int var1;
	private String var2;
	
	public int getVar1(){
		return var1;
	}
	
	public void setVar1(int var1){
		this.var1 = var1;
	}
	
	public String getVar2(){
		return var2;
	}
	
	public void setVar2(String var2){
		this.var2 = var2;
	}
	
	public static void main(String[] args){
		Enkapsulasi x = new Enkapsulasi();
		x.setVar1(2);
		x.setVar2("Tes");
		System.out.println("Var1 = "+x.getVar1());
		System.out.println("Var2 = "+x.getVar2());
	}
}