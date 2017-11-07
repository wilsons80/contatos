package br.mp.mpdft.contatos.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.mp.mpdft.contatos.vo.Operadora;

@Component
public class OperadoraDAO {

	private static List<Operadora> operadoras = new ArrayList<>();;
	
	public OperadoraDAO() {
		operadoras.add(new Operadora("Oi", 14, "Celular", 1d));
		operadoras.add(new Operadora("Vivo", 15, "Celular", 2d));
		operadoras.add(new Operadora("Tim", 41, "Celular", 3d));
		operadoras.add(new Operadora("Embratel", 21, "Fixo", 1d));
		operadoras.add(new Operadora("GVT", 25, "Fixo", 2d));
	}
	
	public List<Operadora> buscarTodasOperadoras(){
		return operadoras;
	}
	
	
}
