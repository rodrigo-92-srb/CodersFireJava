package SuaStack;

public class Tecnologia {

	String nome;
	Categoria categoria;
	
	
	public Tecnologia(String nome, Categoria categoria){
		this.nome = nome;
		this.categoria = categoria;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void ImprimirInfo() {
		System.out.println(this.nome + " tecnologia " + this.categoria);
	}
	
	
}
