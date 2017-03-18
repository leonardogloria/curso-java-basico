package br.com.oportunidade.aula2.args;

public class Array {

	public static void main(String[]args){
		//Instanciando Array
		int tamanhoDoArray = 3;
		double[] notas = new double[tamanhoDoArray];
		
		
		String[] nomes = new String[3];
		
		nomes[0] = "Leonardo";
		nomes[1] = "Elberth";
		nomes[1] = "Ze";

		
		for(String nome : nomes){
			System.out.println(nome);
		}
				
		
		//Groovy - Ruby - Python - Scala
	
		
//		//0 -> n-1
//		
//		//Populando o Array
//		notas[0] = 5.3;
//		notas[1] = 7.5;
//		//notas[2] = 8.9;	
//		//notas[3]=  9.0;
//		
////		for(double nota : notas){
////			System.out.println(nota);
////		}
//		
//		
////		
//		
//		for(int i = 0;i < 3;i++){
//			if(notas[i] > 0.0){
//				System.out.println("notas : " + notas[i]);
//
//			}else{
//				System.out.println("notas invalida  ");
//
//			}
//		}
		
		
	}
	public void calculaMedias(int[] notas){
		double media = 0;
		for(int i = 1;i<= notas.length  ;i++){
			media += notas[i -1];
			
		}
	}
	
	

}
