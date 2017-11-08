package br.mp.mpdft.contatos.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.mp.mpdft.contatos.cmd.AdicionarContatoCmd;
import br.mp.mpdft.contatos.cmd.BuscarContatoCmd;
import br.mp.mpdft.contatos.vo.Contato;

@Component
@Path("/contato")
public class ContatoService {

	@Autowired
	private BuscarContatoCmd buscarContatoCmd;
	@Autowired
	private AdicionarContatoCmd adicionarContatoCmd;
	
	@GET
	@Path("")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Contato> buscarTodosContatos(){
		return buscarContatoCmd.buscarTodosContatos();
	}
	
	/*
	@GET
	@Path("/detalheContato/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseEntity<Contato> buscarContato(@PathParam("id") Integer id){
		Contato contato = buscarContatoCmd.buscarContato(id); 
		System.out.println(contato);
		return Objects.nonNull(contato) ? new ResponseEntity<>(contato, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	*/
	
	@GET
	@Path("/detalheContato/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Contato buscarContato(@PathParam("id") Integer id){
		return buscarContatoCmd.buscarContato(id); 
	}
	
	@POST
	@Path("")
	@Consumes(MediaType.APPLICATION_JSON)
	public void addContato(Contato contato){
		adicionarContatoCmd.addContatos(contato);
	}
	
}
