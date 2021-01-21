package br.com.andradinho.cm;

import br.com.andradinho.cm.modelo.Tabuleiro;
import br.com.andradinho.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		new TabuleiroConsole(tabuleiro);
	}
}
