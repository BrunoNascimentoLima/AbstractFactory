package edu.fatec.fabrica;

import edu.fatec.produtos.Botao;
import edu.fatec.produtos.BotaoMetal;
import edu.fatec.produtos.Texto;
import edu.fatec.produtos.TextoMetal;

public class FabricaMetal extends FabricaAbstrata {

	public Botao criarBotao() {
		return new BotaoMetal();
	}
	
	public Texto criarTexto() {
		return new TextoMetal();
	}
	
}
