package com.wb.negocio;

import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.Servico;

public class RemoveServico extends Editar {
	private List<Servico> servico;
	private Entrada entrada;

	public RemoveServico(List<Servico> servicos) {
		this.servico = servicos;
		this.entrada = new Entrada();
	}
	@Override
	public void editar() {
		System.out.println("Digite o nome do serviço que quer alterar:");
		String nomeserv = entrada.receberTexto();

		for(int i = 0;i<servico.size(); i++) {

			Servico s = servico.get(i);


			if(s.nome.equals(nomeserv)) {
				servico.remove(s);
				break;
			}
		}
	}
}
