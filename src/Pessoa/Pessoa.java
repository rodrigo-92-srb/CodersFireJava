package Pessoa;

import SuaStack.Computador;
import SuaStack.Tecnologia;

public class Pessoa {

	private String nome;
	private Computador pc;
	Tecnologia ultimate;
	Tecnologia skill[] = new Tecnologia[3];
	
	public Pessoa(String nome, Computador pc){
		this.nome = nome;
		this.pc = pc;
	}
	
	void ImprimirInfo() {
		System.out.println(this.nome);
		System.out.println(this.pc);
	}
	
	void ativarUltimate(Tecnologia ult) {
		System.out.println("A habilidade Ultimate de "+this.nome+" foi ativada: "+ult.getNome()+"/"+ult.getCategoria());
	}
	
	void mostrarSkills(Tecnologia habilidade[]) {
		System.out.println(this.nome+" possui habilidades com : ");
		for(int i=0; i < this.skill.length; i++) {
			if(this.skill[i]==null) {
				this.skill[i] = habilidade[i];
			}
			System.out.println(this.skill[i].getNome()+" => "+this.skill[i].getCategoria());	
		}
		System.out.println();
	}
	
	void mostrarPC(Computador pc) {
		System.out.println(this.nome + " utiliza a IDE: "+ this.pc.getIDE());
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


}
