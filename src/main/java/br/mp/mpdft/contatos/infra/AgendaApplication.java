package br.mp.mpdft.contatos.infra;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import br.mp.mpdft.contatos.service.ContatoService;
import br.mp.mpdft.contatos.service.OperadoraService;

public class AgendaApplication extends Application {
	
	//Armazena todos os WebServices da aplicação
	private Set<Object> services = new HashSet<>();
	
	
	public AgendaApplication() {
		services.add(new ContatoService());
		services.add(new OperadoraService());
	}


	@Override
	public Set<Object> getSingletons() {
		return services;
	}
	
}
