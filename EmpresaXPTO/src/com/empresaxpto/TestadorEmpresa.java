package com.empresaxpto;

public class TestadorEmpresa {
	public static void main(String[] args){
		Funcionario funcionario = new Funcionario("Zé da Silva", 3000.0, 500.0);
		Funcionario funcionario2 = new Funcionario("Zé Oliveira", 1000.0, 300.0);
		Funcionario funcionario3 = new Funcionario("Zé Silveira", 12000.0, 5000.0);

		funcionario.imprimeSalarioDescontado();
		funcionario2.imprimeSalarioDescontado();
		funcionario3.imprimeSalarioDescontado();
		
		
	}
}
