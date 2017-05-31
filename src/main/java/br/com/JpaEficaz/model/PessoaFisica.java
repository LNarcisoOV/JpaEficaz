package br.com.JpaEficaz.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("PessoaFisica")
public class PessoaFisica extends PessoaHeranca{
	private String CPF;
	// outras coisas

	/**
	 * @return the cPF
	 */
	public String getCPF() {
		return CPF;
	}

	/**
	 * @param cPF the cPF to set
	 */
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	
}
