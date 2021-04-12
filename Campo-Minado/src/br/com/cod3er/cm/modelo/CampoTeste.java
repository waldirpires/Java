package br.com.cod3er.cm.modelo;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CampoTeste {
	private Campo campo;
	
	
	@BeforeEach
	void iniciarTeste() {
		campo = new Campo(3,3);
	}
	@Test
	void testeVizinhoReal1Esquerda() {
		Campo vizinho = new Campo(3,2);
		boolean resultEsquerda = campo.adicionarVizinho(vizinho);
		assertTrue(resultEsquerda);	
	}
	@Test
	void testeVizinhoReal1Direita() {
		Campo vizinho = new Campo(3,4);
		boolean resultEsquerda = campo.adicionarVizinho(vizinho);
		assertTrue(resultEsquerda);	
	}
	@Test
	void testeVizinhoReal1Baixo() {
		Campo vizinho = new Campo(4,3);
		boolean resultEsquerda = campo.adicionarVizinho(vizinho);
		assertTrue(resultEsquerda);	
	}
	@Test
	void testeVizinhoReal1Cima() {
		Campo vizinho = new Campo(2,3);
		boolean resultEsquerda = campo.adicionarVizinho(vizinho);
		assertTrue(resultEsquerda);	
	}
	
	@Test
	void testeVizinhoReal2() {
		Campo vizinho = new Campo(2,2);
		boolean resultEsquerda = campo.adicionarVizinho(vizinho);
		assertTrue(resultEsquerda);	
	}
	
	@Test
	void testeNaoVizinho() {
		Campo vizinho = new Campo(1,1);
		boolean resultEsquerda = campo.adicionarVizinho(vizinho);
		assertFalse(resultEsquerda);	
	}
	@Test
	void testevalMarc() {	
		assertFalse(campo.isMarcado());	
	}
	@Test
	void testAlternarMarc() {	
		campo.alternarMarcacao();
		assertTrue(campo.isMarcado());	
	}
	@Test
	void testAlternarMarc2() {	
		campo.alternarMarcacao();
		campo.alternarMarcacao();
		assertFalse(campo.isMarcado());	
	}
	
}


