package br.mp.mpdft.contatos.cmd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.mp.mpdft.contatos.dao.ContatoDAO;
import br.mp.mpdft.contatos.vo.Contato;

@Component
public class BuscarContatoCmd {

	@Autowired
	private ContatoDAO contatoDAO;
	
	public BuscarContatoCmd() {
	}
	
	
	public List<Contato> buscarTodosContatos(){
		return contatoDAO.buscarTodosContatos();
	}
	
	public Contato buscarContato(Integer id){
		return contatoDAO.buscarContato(id);
	}
	
}
