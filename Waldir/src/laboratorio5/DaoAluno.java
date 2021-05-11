package Laboratorio5;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DaoAluno implements Dao<Aluno>{
	private List<Aluno> alunos = new ArrayList<Aluno>();

	@Override
	public Optional<Aluno> get(long id) {
		return Optional.ofNullable(alunos.get((int) id));
	}

	@Override
	public List<Aluno> getAll() {
		return alunos;
	}

	@Override
	public boolean save(Aluno t) {
		boolean res = alunos.add(t);
		return res; 
	}

	@Override
	public boolean update(Aluno t) {
		for(Aluno a : alunos) {
			if(a == t)
				a = t;
			return true;
		}	
		return false;
	}

	@Override
	public boolean delete(Aluno t) {
		boolean res = alunos.remove(t);
		return res; 
		
	}
	
}
