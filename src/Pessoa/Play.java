package Pessoa;

import SuaStack.Categoria;
import SuaStack.Computador;
import SuaStack.JavaScript;
import SuaStack.Tecnologia;

public class Play {

	public static void main(String[] args) {
		
		Computador pc1 = new Computador(true, "Netbeans");
		
		Tecnologia MySQL = new Tecnologia("MySQL", Categoria.DataBase);
		Tecnologia NodeJS = new Tecnologia("Node", Categoria.Backend); 
		JavaScript ReactJS = new JavaScript("React", Categoria.Frontend);
		JavaScript AngularJS = new JavaScript("Angular10", Categoria.Frontend); 
		Tecnologia Java = new Tecnologia("Java", Categoria.Backend);
		Tecnologia Flutter = new Tecnologia("Flutter", Categoria.Frontend);
		Tecnologia Python = new Tecnologia("Python", Categoria.Backend);
		Tecnologia PHP = new Tecnologia("PHP", Categoria.Backend);
		Tecnologia AWS = new Tecnologia("Amazon AWS", Categoria.Cloud);
		
		Tecnologia AjaxSkill[] = { Java, MySQL, AngularJS };
		Tecnologia LeleSkill[] = { MySQL, NodeJS, AWS } ;
		
		ReactJS.ImprimirInfo();
		NodeJS.ImprimirInfo();
		
		Pessoa Gibas = new Pessoa("Gibas", pc1);
		Pessoa Bijay = new Pessoa("Bijay", pc1);
		Pessoa Pamis = new Pessoa("Pamis", pc1);
		Pessoa Nenem = new Pessoa("Nenem", pc1);
		Pessoa Lele = new Pessoa("Lele", pc1);
		Pessoa Ajax = new Pessoa("Ajax", pc1);
		
		System.out.println();
		Ajax.mostrarPC(pc1);
		System.out.println();
		
		Ajax.mostrarSkills(AjaxSkill);
		Lele.mostrarSkills(LeleSkill);
		
		Ajax.ativarUltimate(PHP);
		Lele.ativarUltimate(Python);
		Pamis.ativarUltimate(Flutter);
		Nenem.ativarUltimate(ReactJS);
		Bijay.ativarUltimate(Java);
		Gibas.ativarUltimate(AngularJS);
		
		
		
	}
}
