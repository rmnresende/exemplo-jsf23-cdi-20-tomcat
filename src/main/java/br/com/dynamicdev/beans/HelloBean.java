package br.com.dynamicdev.beans;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ViewScoped
public class HelloBean implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private TesteService service;

	@Inject
	private FacesContext context;

	private Map<String, String> mapaCursos;
	private Map<String, String> mapaLivros;

	public String testeInjectServico() {
		return service.getStringTeste();
	}

	public String testeInjectContexto() {
		return context.toString();
	}

	public Map<String, String> getMapaLivros() {
		mapaLivros = new HashMap<String, String>();
		mapaLivros.put("Livro 1", "Effective Java Third Edition");
		mapaLivros.put("Livro 2", "Google Android");
		mapaLivros.put("Livro 3", "Matering JPA");
		mapaLivros.put("Livro 4", "Pro Git");

		return mapaLivros;
	}

	public void setMapaLivros(Map<String, String> mapaLivros) {
		this.mapaLivros = mapaLivros;
	}

	public Map<String, String> getMapaCursos() {

		mapaCursos = new HashMap<String, String>();
		mapaCursos.put("Curso 1", "Orientação a objeto com Java");
		mapaCursos.put("Curso 2", "API Rest com Spring Boot");
		mapaCursos.put("Curso 3", "Java Web com JSF e Primefaces");
		mapaCursos.put("Curso 4", "Git passao a passo");

		return mapaCursos;
	}

	public void setMapaCursos(Map<String, String> mapaCursos) {
		this.mapaCursos = mapaCursos;
	}

}
