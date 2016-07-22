package br.com.indra.model;

import java.util.Date;

public class Carro {

	private String chassi;
	private String modelo;
	private Date ano;
	private String cor;
	private String ano_mod;
	private String placa;
	private int oleokm;

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Date getAno() {
		return ano;
	}

	public void setAno(Date ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAno_mod() {
		return ano_mod;
	}

	public void setAno_mod(String ano_mod) {
		this.ano_mod = ano_mod;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getOleokm() {
		return oleokm;
	}

	public void setOleokm(int oleokm) {
		this.oleokm = oleokm;
	}

}
