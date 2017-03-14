package com.empresaxpto;

public class Funcionario {
	private String nome;
	private double salario;
	private double desconto;
	public Funcionario(String nome,double salario, double desconto) {
		this.salario = salario;
		this.desconto = desconto;
		this.nome = nome;
	} 
	public void imprimeSalarioDescontado(){
		double valor = salario - desconto;
		System.out.println("O salário do funcionário: " + this.nome + " é " + valor);
	}
	
	
}
