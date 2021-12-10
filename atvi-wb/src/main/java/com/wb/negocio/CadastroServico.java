package com.wb.negocio;

import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.Servico;

public class CadastroServico extends Cadastro {
	private List<Servico> servico;
	private Entrada entrada;
	
	public CadastroServico(List<Servico> servicos) {
		this.servico = servicos;
		this.entrada = new Entrada();
	}
	
	@Override
	public void cadastrar() {
		System.out.println("Início do Cadastro do Serviço");
		System.out.println("Por favor informe o nome do Serviço: ");
		String nome = entrada.receberTexto();
		Servico servico = new Servico(nome);
		servico.nome = nome;
		this.servico.add(servico);
	}

}
