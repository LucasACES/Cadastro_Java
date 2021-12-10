package com.wb.negocio;

import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.Cliente;
import com.wb.modelo.Telefone;

public class EditarCliente extends Editar {
	private List<Cliente> clientes;
	private Entrada entrada;
	
	public EditarCliente(List<Cliente> clientes) {
		this.clientes = clientes;
		this.entrada = new Entrada();
	}
	private boolean x = true;
	@Override
	public void editar() {
		System.out.println("Digite o cpf do cliente que deseja alterar:");
		String valorcp = entrada.receberTexto();
		
		for(int i = 0;i<clientes.size(); i++) {
			
			Cliente p = clientes.get(i);


			if(p.getCpf().getValor().equals(valorcp)) {
				System.out.println("Alteração do cliente");
				System.out.println("Por favor informe o nome do cliente:");
				p.nome = entrada.receberTexto();
				System.out.println("Por favor informe o nome social do cliente:");
				p.nomeSocial = entrada.receberTexto();
				System.out.println("Por gavor informe seu genero: ");
				p.genero = entrada.receberTexto();
				while (x) {
					System.out.println("Por favor informe o DDD: ");
					String ddd = entrada.receberTexto();
					System.out.println("Por favor informe o numero: ");
					String numero = entrada.receberTexto();
					Telefone telefone = new Telefone(ddd, numero);
					p.getTelefones().add(telefone);
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
	}
}


