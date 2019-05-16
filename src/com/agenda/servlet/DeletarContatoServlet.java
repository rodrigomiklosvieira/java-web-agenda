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

                CadastraUsuarioService service = new CadastraUsuarioService();

		int id = Integer.parseInt(req.getParameter("id"));

		Pessoa pessoa = new Pessoa();
		pessoa.setId(id);

		service.removeContato(pessoa);
		
		resp.sendRedirect("busca-contato");

	}
	
}
