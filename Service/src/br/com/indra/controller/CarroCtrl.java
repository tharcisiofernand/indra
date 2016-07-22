package br.com.indra.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.omg.CORBA.PERSIST_STORE;

import com.carmanager.server.Car;

import br.com.indra.model.Carro;
import br.com.indra.model.Pessoa;
import br.com.indra.util.conexao;

public class CarroCtrl {
	public List<Carro> listar() {
		List<Carro> resultado = new ArrayList<Carro>();
		String sql = "select * from carro";
		try {
			PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Carro c = new Carro();
				c.setChassi(rs.getString("chassi"));
				c.setModelo(rs.getString("modelo"));
				c.setAno(rs.getDate("ano"));
				c.setCor(rs.getString("cor"));
				c.setAno_mod(rs.getString("ano_mod"));
				c.setPlaca(rs.getString("placa"));
				c.setOleokm(rs.getInt("oleokm"));
				resultado.add(c);
			}
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultado;
	}

	public Carro listaOne() {
		Pessoa pessoa = new Pessoa();
		List<Carro> carros = new CarroCtrl().listar();
		Carro carro = new Carro();
		for (Carro car : carros) {
			if (carro.getChassi().equals(pessoa.getChassi())) {
				carro = car;
			}else{
				break;
			}
		}
		return carro;
	}
}
