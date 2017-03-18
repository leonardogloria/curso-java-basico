package br.com.oportunidade.aula2.args;

public class CalculaMedia {
	public static void main(String[] args){
		Aluno aluno1 = new Aluno("Leonardo",3.5);
		Aluno aluno2 = new Aluno("Elberth",9.5);
		
		Aluno[] alunos = new Aluno[2];
		alunos[0] = aluno1;
		alunos[1] = aluno2;
		
		Turma turma1 = new Turma(alunos);
		turma1.calculaMediaDaTurma();
		

		
	}

}
