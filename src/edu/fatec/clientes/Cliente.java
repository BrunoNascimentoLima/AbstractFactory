package edu.fatec.clientes;

import edu.fatec.fabrica.FabricaAbstrata;
import edu.fatec.produtos.Botao;
import edu.fatec.produtos.Texto;

public class Cliente {

	public void gerarTela(){
		//FabricaAbstrata fabricaJeans = fab.gerarFabrica("Jeans");
		FabricaAbstrata fabricaJeans = FabricaAbstrata.gerarFabrica("Jeans");
		Botao b1 = fabricaJeans.criarBotao();
		Texto t1 = fabricaJeans.criarTexto();
		b1.apertarBotao();
		t1.escreverTexto();
		
		
		//FabricaAbstrata fabricaMetal=fab.gerarFabrica("Metal");
		FabricaAbstrata fabricaMetal = FabricaAbstrata.gerarFabrica("Metal");
		Botao b2 = fabricaMetal.criarBotao();
		Texto t2 = fabricaMetal.criarTexto();
		b2.apertarBotao();
		t2.escreverTexto();
		
		
	}
	public static void main(String[] args) {
		Cliente c = new Cliente();
		c.gerarTela();

	}

}
