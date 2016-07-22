package br.com.indra.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.indra.controller.PessoaCtrl;
import br.com.indra.model.Carro;
import br.com.indra.model.Pessoa;

@ManagedBean
public class PessoaBean {

	private Pessoa pessoa;
	private List<Pessoa> lista;

	public PessoaBean() {
	}

	public Pessoa getPessoa() {
		if(pessoa==null){
			pessoa = new Pessoa();
		}
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public List<Pessoa> getLista() {
		if(lista==null){
			lista = new PessoaCtrl().listar();
		}
		return lista;
	}

	public void setLista(List<Pessoa> lista) {
		this.lista = lista;
	}


}
