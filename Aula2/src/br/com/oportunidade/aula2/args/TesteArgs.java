package br.com.oportunidade.aula2.args;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class TesteArgs {
	public static void main(String[] args){
		int[] valores = new int[5];
		valores[0] = 3;
		valores[1] = 2;
		valores[2] = 1;
		valores[3] = 9;
		valores[4] = 8;
		
		int total = 0;
//		for(int i = 0;i< valores.length;i++ ){
//			total += valores[i];
//		}
		for(int i : valores){
			total += i;
		}
		System.out.println(total / 5);
 
		
		//System.out.println(valores[7]);

		
	}

}
