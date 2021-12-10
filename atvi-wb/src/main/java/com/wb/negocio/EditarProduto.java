package com.wb.negocio;

import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.Produto;

public class EditarProduto extends Editar {
	private List<Produto> produtos;
	private Entrada entrada;
	
	public EditarProduto(List<Produto> produtos) {
		this.produtos = produtos;
		this.entrada = new Entrada();
	}
	
	@Override
	public void editar() {
		System.out.println("Digite o nome do produto que deseja editar:");
		String nomeproduto = entrada.receberTexto();
		
		for(int i = 0;i<produtos.size(); i++) {
			
			Produto prod = produtos.get(i);
			
			if(prod.nome.equals(nomeproduto)) {
				System.out.println("Alteração do Produto");
				System.out.println("Por favor informe o nome do produto:");
				prod.nome = entrada.receberTexto();
				System.out.println("Por favor informe o novo valor:");
				prod.valor = entrada.receberNumeroDouble();
				System.out.println("---------------------------------------");
				
			}
		}
	}
}
