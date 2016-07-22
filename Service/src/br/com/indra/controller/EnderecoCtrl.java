package br.com.indra.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.indra.model.Endereco;
import br.com.indra.util.conexao;

public class EnderecoCtrl {

	public void salvar(Endereco e) {
		String sql = "insert into endereco (rua, complemento, cep, bairro) values (?, ?, ?, ?)";
		try {
			PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
			ps.setString(1, e.getRua());
			ps.setString(2, e.getComplemento());
			ps.setInt(3, e.getCep());
			ps.setString(4, e.getBairro());
			ps.execute();
			ps.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void exclui(Endereco e) {
		String sql = "delete from endereco where id = ?";
		try {
			PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
			ps.setInt(1, e.getId());
			ps.execute();
			ps.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

	public void editar(Endereco e) {
		String sql = "update endereco set rua = ?, complemento = ?, cep = ?, bairro = ? where id = ?";

		try {
			PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
			ps.setString(1, e.getRua());
			ps.setString(2, e.getComplemento());
			ps.setInt(3, e.getCep());
			ps.setString(4, e.getBairro());
			ps.setInt(5, e.getId());
			ps.execute();
			ps.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

	public List<Endereco> listar(){
		List<Endereco> resultado = new ArrayList<Endereco>();
		String sql = "select * from endereco";
		try {
			PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				Endereco e = new Endereco();
				e.setRua(rs.getString("rua"));
				e.setComplemento(rs.getString("complemento"));
				e.setCep(rs.getInt("cep"));
				e.setBairro(rs.getString("bairro"));
				resultado.add(e);
			}
			ps.close();
			} catch (Exception e) {
			e.printStackTrace();
		}
		return resultado;
	}
}