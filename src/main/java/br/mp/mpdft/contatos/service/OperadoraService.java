package br.mp.mpdft.contatos.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.mp.mpdft.contatos.cmd.BuscarOperadoraCmd;
import br.mp.mpdft.contatos.vo.Operadora;

@Component
@Path("operadora")
public class OperadoraService {

	@Autowired
	private BuscarOperadoraCmd buscarOperadoraCmd;
	
	@GET
	@Path("")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Operadora> buscarOperadoraCmd(){
		return buscarOperadoraCmd.buscarTodasOperadoras();
	}
	
}
