package com.wb.negocio;

import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.Cliente;

public class RemoveCliente extends Editar {
	private List<Cliente> clientes;
	private Entrada entrada;

	public RemoveCliente(List<Cliente> clientes) {
		this.clientes = clientes;
		this.entrada = new Entrada();
	}
	@Override
	public void editar() {
		System.out.println("Digite o cpf do cliente que deseja remover:");
		String valorcp = entrada.receberTexto();

		for(int i = 0;i<clientes.size(); i++) {

			Cliente p = clientes.get(i);


			if(p.getCpf().getValor().equals(valorcp)) {

				clientes.remove(p);
				break;
			}
		}
	}
}
