package com.wb.negocio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.CPF;
import com.wb.modelo.Cliente;
import com.wb.modelo.RG;
import com.wb.modelo.Telefone;

public class CadastroCliente extends Cadastro {
	private List<Cliente> clientes;
	private Entrada entrada;

	public CadastroCliente(List<Cliente> clientes) {
		this.clientes = clientes;
		this.entrada = new Entrada();
	}
	private boolean x = true;
	@Override
	public void cadastrar() {
		System.out.println("Início do cadastro do cliente");
		System.out.println("Por favor informe o nome do cliente:");
		String nome = entrada.receberTexto();
		System.out.println("Por favor informe o nome social do cliente:");
		String nomeSocial = entrada.receberTexto();
		System.out.println("Por gavor informe seu genero: ");
		String genero = entrada.receberTexto();
		System.out.println("Por favor informe o número do cpf:");
		String valor = entrada.receberTexto();
		System.out.println("Por favor informe a data de emissão do cpf, no padrão dd/mm/yyyy:");
		String data = entrada.receberTexto();
		System.out.println("Por favor informe seu RG: ");
		String valorg = entrada.receberTexto();
		System.out.println("Por favor informe a data de emissão do RG, no padrão dd/mm/yyyy:");
		String datarg = entrada.receberTexto();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataEmissao = LocalDate.parse(data, formato);
		LocalDate dataEmissaoRg = LocalDate.parse(datarg, formato);
		CPF cpf = new CPF(dataEmissao, valor);
		RG rgs = new RG(dataEmissaoRg, valorg);
		Cliente cliente = new Cliente(nome, nomeSocial, genero, cpf, rgs);
		this.clientes.add(cliente);
		while (x) {
			System.out.println("Por favor informe o DDD: ");
			String ddd = entrada.receberTexto();
			System.out.println("Por favor informe o numero: ");
			String numero = entrada.receberTexto();
			Telefone telefone = new Telefone(ddd, numero);
			cliente.getTelefones().add(telefone);
			System.out.println("Deseja inserir outro numero?");
			System.out.println("1 - Sim");
			System.out.println("2 - Não");
			String continua = entrada.receberTexto();

			if (continua.equals("1")) {
				x = true;
			}
			else{
				x = false;
			}
		}
	}
}