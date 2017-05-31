package br.com.JpaEficaz.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("PessoaJuridica")
public class PessoaJuridica extends PessoaHeranca {
	private String CNPJ;
	// outras coisas

	/**
	 * @return the cNPJ
	 */
	public String getCNPJ() {
		return CNPJ;
	}

	/**
	 * @param cNPJ the cNPJ to set
	 */
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	
	
}
