package edu.fatec.fabrica;

import edu.fatec.produtos.Botao;
import edu.fatec.produtos.BotaoJeans;
import edu.fatec.produtos.Texto;
import edu.fatec.produtos.TextoJeans;

public class FabricaJeans extends FabricaAbstrata {
 
	public Botao criarBotao() {
		return new BotaoJeans();
	}
	public Texto criarTexto() {
		return new TextoJeans();
	}
}
