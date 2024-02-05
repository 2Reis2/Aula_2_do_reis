package Aula_2;

public class Cachorro {
	public String Nome;
	public String Raça;
	public int Idade;
	public String Cor;
	
	
  public void latir() {
	System.out.println("O Cachorro: " + Nome + "latiu");
	
}
  
  public void GetCachorro () {
	  System.out.println(
			"Nome: " + Nome +
			"\nRaça: " + Raça +
			"\nIdade: " + Idade +
			"\nCor: " + Cor
			);
  }
}
