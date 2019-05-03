package com.agenda.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.agenda.model.Pessoa;
import com.agenda.service.CadastraUsuarioService;


@WebServlet("/busca-contato")
public class ListarContatoServlet extends HttpServlet {

	private CadastraUsuarioService service;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		service = new CadastraUsuarioService();

		List<Pessoa> pessoas = this.service.buscaPessoas();

		request.setAttribute("pessoas", pessoas);
		request.getRequestDispatcher("listar.jsp").forward(request, response);
		}
		
	}