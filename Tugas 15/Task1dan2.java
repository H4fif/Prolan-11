public class Task1dan2 <T,N>{
	public N a;
	public T b;
	public T c;
	
	public N nilaiA(N inputA){
		return a;
	}
	
	public T objekB(T inputB){
		return b;
	}
	
	public <S, N> void sout (S c, N a){
		System.out.println(a);
	}
	
	public void nilaiX(String x){
		System.out.println(x);
	}
}