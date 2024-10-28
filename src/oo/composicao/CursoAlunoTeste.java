package oo.composicao;

public class CursoAlunoTeste {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("William");
		Aluno aluno2 = new Aluno("Nininha");
		Aluno aluno3 = new Aluno("Iully");
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Web 2023");
		Curso curso3 = new Curso("React Native");
		
		curso1.adcionarAluno(aluno1);
		curso1.adcionarAluno(aluno2);
		
		curso2.adcionarAluno(aluno1);
		curso2.adcionarAluno(aluno3);
		
		aluno1.adcionarCruso(curso3);
		aluno2.adcionarCruso(curso3);
		aluno3.adcionarCruso(curso3);
		
		for(Aluno aluno: curso3.alunos) {
			System.out.println("Estou matriculado no curso " + curso3.nome);
			System.out.println("Meu nome é: " + aluno.nome);
			System.out.println();
		}
		
		System.out.println(aluno1.cursos.get(0).alunos);
		
	Curso cursoEncontrado =aluno1.obterCursoPorNome("Java Completo");
	
	if( cursoEncontrado  != null) {
		System.out.println(cursoEncontrado.nome);
		System.out.println(cursoEncontrado.alunos);
	}
		
		
	}

}
