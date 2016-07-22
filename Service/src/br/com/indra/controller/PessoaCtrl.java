package br.com.indra.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.indra.model.Endereco;
import br.com.indra.model.Pessoa;
import br.com.indra.util.conexao;

public class PessoaCtrl {
	public List<Pessoa> listar() {
		List<Pessoa> resultado = new ArrayList<Pessoa>();
		String sql = "select * from pessoa";
		try {
			PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Pessoa p = new Pessoa();
				p.setNome(rs.getString("nome"));
				p.setCidade(rs.getString("cidade"));
				p.setFone(rs.getString("fone"));
				p.setCpf(rs.getString("cpf"));
				p.setChassi(rs.getString("chassi"));
				resultado.add(p);
			}
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultado;
	}

	public Pessoa listaum(Pessoa e) {
		String sql = "select * from pessoa where chassi = ?";
		List<Pessoa> resultado = new ArrayList<Pessoa>();
		try {
			PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Pessoa p = new Pessoa();
				ps.setString(1, e.getChassi());
				p.setNome(rs.getString("nome"));
				p.setCidade(rs.getString("cidade"));
				p.setFone(rs.getString("fone"));
				p.setCpf(rs.getString("cpf"));
				p.setChassi(rs.getString("chassi"));
				resultado.add(p);
			}
			ps.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return (Pessoa) resultado;
	}
}
