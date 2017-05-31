package br.com.JpaEficaz.model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Departamento {
	private String nome;

	public abstract void calcularDespesasDoMes();
	// get e set
}