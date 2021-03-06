package br.com.indra.controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.xml.ws.Endpoint;

import br.com.indra.util.WebServiceImpl;

@ManagedBean
public class PublicarCtrl {

	private String mensagem;

	public void chamar() {
		try {
			Endpoint endpoint = Endpoint.publish("http://localhost:8081/service", new WebServiceImpl());
			mensagem = String.valueOf(endpoint.isPublished());
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, new FacesMessage("Conex�o com sucesso!", "Estados da Conex�o: " + mensagem));

		} catch (Exception e) {
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, new FacesMessage("Conex�o ja Aberta", "Estados da Conex�o: " + mensagem));
		}

	}
}
