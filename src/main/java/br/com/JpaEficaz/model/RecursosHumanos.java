package br.com.JpaEficaz.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RecursosHumanos extends Departamento {
	@Id
	private long id;

	public void calcularDespesasDoMes() {
		// realiza os cálculos
	}
}
