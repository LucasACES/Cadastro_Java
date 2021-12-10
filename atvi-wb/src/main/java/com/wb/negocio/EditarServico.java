package com.wb.negocio;

import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.Servico;

public class EditarServico extends Editar {
	private List<Servico> servico;
	private Entrada entrada;
	
	public EditarServico(List<Servico> servicos) {
		this.servico = servicos;
		this.entrada = new Entrada();
	}
	@Override
	public void editar() {
		System.out.println("Digite o nome do servi�o que quer alterar:");
		String nomeserv = entrada.receberTexto();
		
		for(int i = 0;i<servico.size(); i++) {
					
			Servico s = servico.get(i);
			
			
			if(s.nome.equals(nomeserv)) {
				System.out.println("Altera��o do Servi�o");
				System.out.println("Por favor informe o nome do Servi�o:");
				s.nome = entrada.receberTexto();
			}
			
		
		}
	}

}
