package OrOb;

public class CursoTeste {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Melo");
		Aluno aluno2 = new Aluno("Kaylane");
		Aluno aluno3 = new Aluno("gui");
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Web 2023");
		Curso curso3 = new Curso("Java Script");
		
		//Como foi um relacionamento interligado entre as duas classes, Aluno e Curso
		//Você pode adicionar tanto em Array de Aluno quanto no Array de Curso 
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		curso2.adicionarAluno(aluno3);
		curso2.adicionarAluno(aluno1);
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		for(Aluno aluno: curso1.alunos) {
			System.out.println("Estou matriculado no curso 1: " + aluno.nome);
			System.out.println();
		}
		for(Aluno aluno: curso3.alunos) {
			System.out.println("Estou matriculado no curso 3: " + aluno.nome);
			System.out.println();
		}
		for(Aluno aluno: curso2.alunos) {
			System.out.println("Estou matriculado no curso 2: " + aluno.nome);
			System.out.println();
		}
		
		System.out.println(aluno1.cursos.get(0).alunos);
		Curso cursoEncontrado = aluno1.obterCursoProNome("Java Completo");
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}

	}

}
