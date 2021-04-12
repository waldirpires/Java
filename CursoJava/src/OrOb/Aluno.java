package OrOb;

import java.util.ArrayList;

public class Aluno {
	final String nome;
	final ArrayList<Curso> cursos = new ArrayList<>();
	
	Aluno(String nome){
		this.nome = nome;
	}
	//Liga Aluno com Curso
	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	Curso obterCursoProNome(String nome) {
		for(Curso curso : this.cursos) {
			if(curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		return null;
	}
	public String toString() {
		return nome;
	}
}
