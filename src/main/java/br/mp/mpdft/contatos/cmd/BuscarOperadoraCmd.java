package br.mp.mpdft.contatos.cmd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.mp.mpdft.contatos.dao.OperadoraDAO;
import br.mp.mpdft.contatos.vo.Operadora;

@Component
public class BuscarOperadoraCmd {

	@Autowired
	private OperadoraDAO operadoraDAO;
	
	public BuscarOperadoraCmd() {
	}
	
	
	public List<Operadora> buscarTodasOperadoras(){
		return operadoraDAO.buscarTodasOperadoras();
	}
	
	
}
