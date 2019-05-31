package com.agenda.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.agenda.model.Pessoa;
import com.agenda.service.CadastraUsuarioService;

public class CadastraUsuarioServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome(request.getParameter("name"));
		pessoa.setTel(request.getParameter("tel"));
		pessoa.setEmail(request.getParameter("email"));
		pessoa.setEnd(request.getParameter("end"));
		CadastraUsuarioService service = new CadastraUsuarioService();
			
		if(null != request.getParameter("id") && !request.getParameter("id").equals("")) {
			pessoa.setId(Integer.parseInt(request.getParameter("id")));
			
		}	
			
		service.cadastrarOuAlterar(pessoa);
		
		response.sendRedirect("busca-contato");
		
	}
}
