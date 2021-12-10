package com.wb.negocio;

import java.util.List;

import com.wb.modelo.Cliente;
import com.wb.modelo.Telefone;

public class ListarClienteGenero extends Listagem {
	private List<Cliente> clientes;

	public ListarClienteGenero(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	@Override
	public void listar() {
		System.out.println("Lista de Clientes Masculinos:");
		for (Cliente cliente : clientes) {
			if (cliente.genero.equals("Masculino")) {
				System.out.println("Nome: " + cliente.nome);
				System.out.println("Nome social: " + cliente.nomeSocial);
				System.out.println("Genero:" + cliente.genero);
				System.out.println("CPF: " + cliente.getCpf().getValor());
				System.out.println("RG:" + cliente.getRgs().getValor());
				for (Telefone telefone : cliente.getTelefones()) {
					
					System.out.println("Telefone: " + telefone.getDdd() + " " + telefone.getNumero());
				}
				System.out.println("--------------------------------------");
			}
		}
		System.out.println("Lista de Clientes Femininos:");
		for (Cliente cliente : clientes) {
			if (cliente.genero.equals("Feminino")) {
				System.out.println("Nome: " + cliente.nome);
				System.out.println("Nome social: " + cliente.nomeSocial);
				System.out.println("Genero:" + cliente.genero);
				System.out.println("CPF: " + cliente.getCpf().getValor());
				System.out.println("RG:" + cliente.getRgs().getValor());
				for (Telefone telefone : cliente.getTelefones()) {
					
					System.out.println("Telefone: " + telefone.getDdd() + " " + telefone.getNumero());
				}
				System.out.println("--------------------------------------");
			}
		}
	}
}
