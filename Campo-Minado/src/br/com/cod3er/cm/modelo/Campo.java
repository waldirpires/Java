package br.com.cod3er.cm.modelo;

import java.util.ArrayList;
import java.util.List;

import br.com.cod3er.cm.excecao.ExplosaoException;

@SuppressWarnings("unused")
public class Campo {
	private final int linha;
	private final int coluna;
	
	private boolean minado = false;
	private boolean aberto = false;
	private boolean marcado = false;
	
	private List<Campo> vizinhos = new ArrayList<Campo>();
	public Campo(int linha, int coluna) {
	this.linha = linha;
	this.coluna = coluna;
	}
	
	boolean adicionarVizinho(Campo vizinho) {
		boolean linhaDiferente = this.linha != vizinho.linha; 
		boolean	colunaDiferente = this.coluna != vizinho.coluna; 
		boolean diagonal = linhaDiferente && colunaDiferente; 
		
		int delLinha = Math.abs(this.linha - vizinho.linha);
		int delcoluna = Math.abs(this.coluna - vizinho.coluna);
		int delGeral = delcoluna + delLinha;
		
		if(delGeral == 1 && !diagonal ) {
			vizinhos.add(vizinho);
			return true;
		}
		if(delGeral == 2 && diagonal) {
			vizinhos.add(vizinho);
			return true;
		}
		else
		return false;	
	}
	void alternarMarcacao() {
		if(!aberto) {
			marcado = !marcado;
		}
	}
	
	boolean abri() {
		if(!aberto && !marcado) {
			aberto = true;
			if(minado) {
				throw new ExplosaoException();
			}
			if(vizinhacaSegura()){
				vizinhos.forEach(v -> v.abri());
			}
			return true;
		}
		else {		
		return false;
		}
	}
	
	boolean vizinhacaSegura() {
		
		return vizinhos.stream().noneMatch(v -> v.minado);
	}
	
	public boolean isMarcado() {
		return marcado;
	}
}
