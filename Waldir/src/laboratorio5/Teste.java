package Laboratorio5;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class Teste {
    DaoAluno criAluno = new DaoAluno();
	@Test
	void update() {
		var aluno = new Aluno();
		assertEquals(criAluno.update(aluno), true);
		
	}
	
	@Test
	void save() {
		var aluno = new Aluno();
		criAluno.update(aluno);
		assertEquals(criAluno.save(aluno), true);
	}
	@Test
	void delete() {
		var aluno = new Aluno();
		criAluno.update(aluno);
		assertEquals(criAluno.delete(aluno), true);
	}
	
    
}
