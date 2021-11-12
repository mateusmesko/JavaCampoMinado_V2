package com.projeto.cm.visao;

import javax.swing.JFrame;

import com.projeto.cm.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame{
	public TelaPrincipal() {
		Tabuleiro tabuleiro = new Tabuleiro(16,30,5);
		PainelTabuleiro painelTabuleiro = new PainelTabuleiro(tabuleiro);
		
		add(painelTabuleiro);
		
		setTitle("Campo Minado");
		setSize(690,438);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TelaPrincipal();
	}
}
