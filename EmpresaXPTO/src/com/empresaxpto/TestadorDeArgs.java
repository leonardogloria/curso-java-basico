package com.empresaxpto;

public class TestadorDeArgs {
	public static void main(String ... args){
		double salario = Double.parseDouble(args[1]);
		double desconto = Double.parseDouble(args[2]);
		Funcionario funcionario = new Funcionario(args[0],salario,desconto);
		funcionario.imprimeSalarioDescontado();
	}

}
