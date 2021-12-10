package com.wb;

import com.wb.io.Entrada;
import com.wb.modelo.Empresa;
import com.wb.negocio.Cadastro;
import com.wb.negocio.CadastroCliente;
import com.wb.negocio.CadastroProduto;
import com.wb.negocio.CadastroServico;
import com.wb.negocio.Editar;
import com.wb.negocio.EditarCliente;
import com.wb.negocio.EditarProduto;
import com.wb.negocio.EditarServico;
import com.wb.negocio.Listagem;
import com.wb.negocio.ListarClienteGenero;
import com.wb.negocio.ListarTodosClientes;
import com.wb.negocio.ListarTodosProdutos;
import com.wb.negocio.ListarTodosServicos;
import com.wb.negocio.RemoveCliente;
import com.wb.negocio.RemoveProduto;
import com.wb.negocio.RemoveServico;

public class App {
	public static void main(String[] args) {
		System.out.println("Bem-vindo ao cadastro de clientes do Grupo World Beauty");
		Empresa empresa = new Empresa();
		boolean execucao = true;
		while (execucao) {
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("Que tipo de operação você deseja fazer:");
			System.out.println("1  - Cadastrar Cliente");
			System.out.println("2  - Cadastrar Produtos");
			System.out.println("3  - Cadastrar Serviços");
			System.out.println("");
			System.out.println("----------------------------------");
			System.out.println("");
			System.out.println("4  - Listar Clientes");
			System.out.println("5  - Listar Produtos");
			System.out.println("6  - Listar Serviços");
			System.out.println("7  - Listar Clientes por genero");
			System.out.println("");
			System.out.println("----------------------------------");
			System.out.println("");
			System.out.println("8  - Editar Cliente");
			System.out.println("9  - Editar Produtos");
			System.out.println("10 - Editar Serviços");
			System.out.println("");
			System.out.println("----------------------------------");
			System.out.println("");
			System.out.println("11 - Remover Cliente");
			System.out.println("12 - Remover Produto");
			System.out.println("13 - Remover Serviço");
			System.out.println("");
			System.out.println("----------------------------------");
			System.out.println("");
			System.out.println("0  - Sair");
			System.out.println("");
			System.out.println("");

			Entrada entrada = new Entrada();
			int operacao = entrada.receberNumeroInteiro();

			switch (operacao) {
			case 0:
				execucao = false;
				System.out.println("Até mais!\n");
				break;
			case 1:
				Cadastro cadastro = new CadastroCliente(empresa.getClientes());
				cadastro.cadastrar();
				break;
			case 2:
				cadastro = new CadastroProduto(empresa.getProdutos());
				cadastro.cadastrar();
				break;
			case 3:
				cadastro = new CadastroServico(empresa.getServicos());
				cadastro.cadastrar();
			case 4:
				Listagem listagem = new ListarTodosClientes(empresa.getClientes());
				listagem.listar();
				break;
			case 5:
				listagem = new ListarTodosProdutos(empresa.getProdutos());
				listagem.listar();
				break;
			case 6:
				listagem = new ListarTodosServicos(empresa.getServicos());
				listagem.listar();
				break;
			case 7:
				listagem = new ListarClienteGenero(empresa.getClientes());
				listagem.listar();
				break;
			case 8:
				Editar editar = new EditarCliente(empresa.getClientes());
				editar.editar();
				break;
			case 9:
				editar = new EditarProduto(empresa.getProdutos());
				editar.editar();
				break;
			case 10:
				editar = new EditarServico(empresa.getServicos());
				editar.editar();
				break;
			case 11:
				editar = new RemoveCliente(empresa.getClientes());
				editar.editar();
				break;
			case 12:
				editar = new RemoveProduto(empresa.getProdutos());
				editar.editar();
				break;
			case 13:
				editar = new RemoveServico(empresa.getServicos());
				editar.editar();
				break;
			default:
				System.out.println("Operação não entendida");
			}
		}
	}
}