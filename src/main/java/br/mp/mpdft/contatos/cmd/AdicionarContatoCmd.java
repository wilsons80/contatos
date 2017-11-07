package br.mp.mpdft.contatos.cmd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.mp.mpdft.contatos.dao.ContatoDAO;
import br.mp.mpdft.contatos.vo.Contato;

@Component
public class AdicionarContatoCmd {

	@Autowired
	private ContatoDAO contatoDAO;
	
	public AdicionarContatoCmd() {
	}
	
	public void addContatos(Contato contato){
		contatoDAO.addContato(contato);
	}
	
	
}
