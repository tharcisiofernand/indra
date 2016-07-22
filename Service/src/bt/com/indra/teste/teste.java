package bt.com.indra.teste;

import java.util.List;

import org.junit.Test;

import br.com.indra.controller.PessoaCtrl;
import br.com.indra.model.Pessoa;

public class teste {
	
	public PessoaCtrl p;
	public List<Pessoa> pessoas;
	
	@Test
	public void listar(){
		if ( p == null){
			p = new PessoaCtrl();
		}
		p.listar();
		pessoas = p.listar();
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getNome());
		}
	}

}
