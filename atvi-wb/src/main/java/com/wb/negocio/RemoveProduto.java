package com.wb.negocio;

import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.Produto;

public class RemoveProduto extends Editar {
	private List<Produto> produtos;
	private Entrada entrada;
	
	public RemoveProduto(List<Produto> produtos) {
		this.produtos = produtos;
		this.entrada = new Entrada();
	}
	@Override
	public void editar() {
		System.out.println("Digite o nome do produto que deseja remover:");
		String nomeproduto = entrada.receberTexto();
		
		for(int i = 0;i<produtos.size(); i++) {
			
			Produto prod = produtos.get(i);
			
			if(prod.nome.equals(nomeproduto)) {
				produtos.remove(prod);
				break;
				
			}
		}

	}

}
