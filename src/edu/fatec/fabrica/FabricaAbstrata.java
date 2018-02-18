package edu.fatec.fabrica;

import edu.fatec.produtos.Botao;
import edu.fatec.produtos.Texto;

public abstract class FabricaAbstrata {

   public static FabricaAbstrata gerarFabrica(String tipo) {
	FabricaAbstrata fab = null;
	
	if("Metal".equalsIgnoreCase(tipo)) {
		fab = new FabricaMetal();
	} else if ("Jeans".equalsIgnoreCase(tipo)) {
		fab = new FabricaJeans();		
	} 
	return fab;
   }
   
   public abstract Botao criarBotao();   
   public abstract Texto criarTexto();
}
