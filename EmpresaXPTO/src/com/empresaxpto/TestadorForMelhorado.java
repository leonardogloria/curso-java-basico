package com.empresaxpto;

public class TestadorForMelhorado {
	public static void main(String [] args){
		Funcionario[] funcionarios = new Funcionario[3];
		funcionarios[0] = new Funcionario("Z� da Silva", 3000.0, 500.0);
		funcionarios[1] =  new Funcionario("Z� Oliveira", 1000.0, 300.0);
		funcionarios[2] =  new Funcionario("Z� Silveira", 12000.0, 5000.0);
		
		for(Funcionario i : funcionarios){
			i.imprimeSalarioDescontado();
			
		}
		
	}

}
