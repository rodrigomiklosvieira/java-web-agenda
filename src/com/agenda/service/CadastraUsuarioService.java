package com.agenda.service;

import java.util.List;

import com.agenda.dao.PessoaDAO;
import com.agenda.model.Pessoa;

public class CadastraUsuarioService {
	
	PessoaDAO dao = new PessoaDAO();
	
	public void cadastra(Pessoa pessoa) {

		this.dao.adiciona(pessoa);
	
		
		
		
	}
	
	public List<Pessoa>buscaPessoas() {
		
		return this.dao.buscaPessoas();
		
	}
	
	public void removeContato(Pessoa pessoa){
		
		dao.deletar(pessoa);
	}
	
	public void alterarContato(Pessoa pessoa) {
		
		dao.alterar(pessoa);
	}
	
	
	

}
