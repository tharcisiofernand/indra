package br.com.indra.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import br.com.indra.controller.EnderecoCtrl;
import br.com.indra.model.Endereco;

@ManagedBean
public class EnderecoBean {

	private Endereco e;
	private EnderecoCtrl endereco;
	private List<Endereco> lista;
	
	@PostConstruct
	public void endereco(){
		e = new Endereco();
		endereco = new EnderecoCtrl();
		lista = new ArrayList<Endereco>();
	}
	
	
	public Endereco getE() {
		return e;
	}


	public void setE(Endereco e) {
		this.e = e;
	}


	public List<Endereco> getLista() {
		return endereco.listar();
	}


	public void setLista(List<Endereco> lista) {
		this.lista = lista;
	}


	public EnderecoCtrl getEndereco() {
		return endereco;
	}


	public void setEndereco(EnderecoCtrl endereco) {
		this.endereco = endereco;
	}

}
