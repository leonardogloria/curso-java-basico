package br.com.oportunidade.aula2.args;

public class Turma {
	Aluno[] alunos;
	public Turma(Aluno[] alunos){
		this.alunos = alunos;
	}
	public void calculaMediaDaTurma(){
		double media = 0.0;
		for(Aluno aluno : alunos){
			media += aluno.getNota();
			
		}
		System.out.println("A Media desta turma é :" + ( media / alunos.length));
	}
	
	
}
