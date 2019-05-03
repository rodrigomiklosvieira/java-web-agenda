package com.agenda.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.agenda.model.Pessoa;
import com.agenda.util.ConnectionFactory;
import com.mysql.jdbc.Connection;


public class PessoaDAO {
	
	private Connection connection;
	
	public void adiciona(Pessoa pessoa) {
		
		
		String SQL = "insert into pessoas (nome, email, endereco, telefone) values (?,?,?,?)";
		
		
		
		try {
			
			this.connection = new ConnectionFactory().getConnection();
			PreparedStatement stmt = this.connection.prepareStatement(SQL);
			
			stmt.setString(1, pessoa.getNome());
			stmt.setString(2, pessoa.getEmail());
			stmt.setString(3, pessoa.getEnd());
			stmt.setString(4, pessoa.getTel());
			
			stmt.execute();
			stmt.close();
			
		
			
		}catch (SQLException e) {
			
			throw new RuntimeException(e);
		}
		
	}
	
	
	public List<Pessoa> buscaPessoas(){
		
		String SQL = "Select * from pessoas";
		
		try {
			
			this.connection = new ConnectionFactory().getConnection();
			PreparedStatement stmt = this.connection.prepareStatement(SQL);
			
			List<Pessoa> pessoas = new ArrayList<Pessoa>();
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				
				Pessoa pessoa = new Pessoa();
				
				pessoa.setId(rs.getInt("id"));
				pessoa.setNome(rs.getString("nome"));
				pessoa.setEnd(rs.getString("endereco"));
				pessoa.setEmail(rs.getString("email"));
				pessoa.setTel(rs.getString("telefone"));
				pessoas.add(pessoa);
			}
			
			stmt.close();
			this.connection.close();
			return pessoas;
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
	
	public void deletar(Pessoa pessoa) {
		
	System.out.println("teste");
		
	}

}
