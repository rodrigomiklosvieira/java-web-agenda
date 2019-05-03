package com.agenda.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.agenda.model.Pessoa;
import com.agenda.service.CadastraUsuarioService;



@WebServlet("/remover-contato")
public class DeletarContatoServlet extends HttpServlet{
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		Pessoa pessoa = new Pessoa();
		
		CadastraUsuarioService service = new CadastraUsuarioService();
		service.removeContato(pessoa);
		
		
		

	}
	
	

}
