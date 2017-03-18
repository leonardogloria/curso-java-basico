package br.com.oportunidade.aula2.args;

public class TestaArgs {
	public static void main(String[] args){
		System.out.println(args[0]);
		TestaArgs.recebeNotas(2 , 3);
		int[][] supresa = new int[2][9];
	}
	
	public static void recebeNotas(int ... notas ){
		double media = 0;
		for(int i = 0; i < notas.length;i++){
			media += notas[i];
		}
		if(notas.length == 0){
			System.out.println("Voce deve informar notas");
		}else{
			media = media / notas.length;

		}
		
	}
}
