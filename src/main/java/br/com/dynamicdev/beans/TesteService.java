package br.com.dynamicdev.beans;

import java.io.Serializable;

public class TesteService implements Serializable {

	private static final long serialVersionUID = 1L;


	public String getStringTeste() {
		return "string localizada no serviço mas que foi injetada no bean";
	}
}
