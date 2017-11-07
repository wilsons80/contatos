package br.mp.mpdft.contatos.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.stereotype.Component;

import br.mp.mpdft.contatos.vo.Contato;
import br.mp.mpdft.contatos.vo.Operadora;

@Component
public class ContatoDAO {

	private static Integer id = 1;
	private static List<Contato> contatos = new ArrayList<>();
	
	public ContatoDAO() {
		contatos.add(new Contato(id++, "Bruno","9999-2222", "01/11/2017", "yellow", new Operadora("Oi", 14, "Celular", 1d)));
		contatos.add(new Contato(id++,"Sandra","9999-3333","02/11/2017", "red", new Operadora("Vivo", 15, "Celular", 2d)));
		contatos.add(new Contato(id++,"Mariana","9999-9999", "03/11/2017", "blue", new Operadora("Tim", 41, "Celular", 3d)));
	}
	
	public List<Contato> buscarTodosContatos(){
		return contatos;
	}
	
	public Contato buscarContato(Integer id){
		for (Contato c : contatos) {
			if(c.getId().intValue() == id.intValue()){return c;}
		}
		return null;
		
	}
	
	
	
	public void addContato(Contato contato){
		if(Objects.isNull(contato.getId())){contato.setId(id++);}
		contatos.add(contato);
	}
}
